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

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class ListFragment extends Fragment {
    // Assigned all the views in the View to variables using (Butter Knife lib.) BindView method
    // to shorthand and simplifying the code.
    @BindView(R.id.recycler_view)
    RecyclerView listView;

    @BindView(R.id.tv_error)
    TextView errorTextView;

    @BindView(R.id.loading_view)
    View loadingView;

    // I used (Butter Knife lib.) to bind my view.
    // I need to assign the result of that to an (unbinder) field and
    // then I can use that in destroy view to unbind my view.
    private Unbinder unbinder;

    private static final String ARG_QUERY = "koko";
    private String mQuery;

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

    // Called once the fragment is associated with its activity.
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    // Called immediately prior to the fragment no longer being associated with its activity.
    @Override
    public void onDetach() {
        super.onDetach();
    }

    // This will prevent our views from leaking when the fragment view is destroyed but
    // the fragment itself is still hanging around.
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (unbinder != null) {
            unbinder.unbind();
            unbinder = null;
        }
    }
}
