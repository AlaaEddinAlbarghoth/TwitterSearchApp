package org.alaaeddin.twittersearchapp.view.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.alaaeddin.twittersearchapp.R;
import org.alaaeddin.twittersearchapp.view.adapter.StatusListAdapter;
import org.alaaeddin.twittersearchapp.viewmodel.ListViewModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class ListFragment extends Fragment {
    // Assigned all the views in the View to variables using (Butter Knife lib.) to shorthand and simplifying the code.
    @BindView(R.id.recycler_view)
    RecyclerView listView;

    @BindView(R.id.tv_error)
    TextView errorTextView;

    @BindView(R.id.loading_view)
    View loadingView;

    // Assign view to an (unbinder) to unbind it in onDestroy.
    private Unbinder unbinder;

    private static final String ARG_QUERY = "koko";
    private String mQuery;
    private ListViewModel viewModel;

    // Default constructor/
    public ListFragment() {
        // Required empty public constructor
    }

    public static ListFragment newInstance(String param) {
        ListFragment fragment = new ListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_QUERY, param);
        fragment.setArguments(args);
        return fragment;
    }

    // Called to do initial creation of the fragment.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mQuery = getArguments().getString(ARG_QUERY);
        }
    }

    // Creates and returns the view hierarchy associated with the fragment.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.screen_list, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    // Getting a reference to the view model.
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        viewModel = ViewModelProviders.of(this).get(ListViewModel.class); // return an instance of ViewModel

        listView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL)); // get some dividers between our items
        listView.setAdapter(new StatusListAdapter(viewModel, this, mQuery, getContext()));
        listView.setLayoutManager(new LinearLayoutManager(getContext()));
        observeViewModel(mQuery);
    }

    // Listen to all of those live data objects exposed by viewModel to observe live data.
    // Called once the fragment is associated with its activity.
    private void observeViewModel(String query) {
        viewModel.getStatusList(query).observe(this, statuses -> {
            if (statuses != null) {
                listView.setVisibility(View.VISIBLE);
            }
        });

        viewModel.getStatusesLoadErrorObservable().observe(this, isError -> {
            //noinspection ConstantConditions
            if (isError) {
                errorTextView.setVisibility(View.VISIBLE);
                listView.setVisibility(View.GONE);
                errorTextView.setText(R.string.api_error_statuses);
            } else {
                errorTextView.setVisibility(View.GONE);
                errorTextView.setText(null);
            }
        });

        viewModel.getLoadingObservable().observe(this, isLoading -> {
            //noinspection ConstantConditions
            loadingView.setVisibility(isLoading ? View.VISIBLE : View.GONE);
            if (isLoading) {
                listView.setVisibility(View.GONE);
                errorTextView.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    // Called immediately prior to the fragment no longer being associated with its activity.
    @Override
    public void onDetach() {
        super.onDetach();
    }

    // Prevent view from leaking when the fragment view is destroyed.
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (unbinder != null) {
            unbinder.unbind();
            unbinder = null;
        }
    }
}
