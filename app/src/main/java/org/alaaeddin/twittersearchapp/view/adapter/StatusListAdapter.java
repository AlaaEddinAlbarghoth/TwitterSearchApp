package org.alaaeddin.twittersearchapp.view.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;

import org.alaaeddin.twittersearchapp.R;
import org.alaaeddin.twittersearchapp.service.model.Status;
import org.alaaeddin.twittersearchapp.viewmodel.ListViewModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StatusListAdapter  extends RecyclerView.Adapter<StatusListAdapter.StatusViewHolder> {

    Context context;
    private final List<Status> data = new ArrayList<>();

    // 'lifecycleOwner'for observe the viewModel and be able to unbind from that observer once the lifecycle
    // owner is destroyed.
    public StatusListAdapter(ListViewModel viewModel, LifecycleOwner lifecycleOwner, String query, Context context) {
        this.context = context;
        viewModel.getStatusList(query).observe(lifecycleOwner, statuses -> {
            data.clear(); // clear old data.
            if (statuses != null) {
                data.addAll(statuses);
            }
            notifyDataSetChanged(); // Notifies the attached observers that the data set should refresh itself.
        });
        setHasStableIds(true); // To make to each item a unique identifier.
    }

    @NonNull
    @Override
    public StatusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_tweet_list_item, parent, false);
        return new StatusViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusViewHolder holder, int position) {
        Glide.with(context)
                .load(data.get(position).getUser().getProfileImageUrl())
                .apply(new RequestOptions()
                        .centerCrop() // to make the image in centerCrop of the image view.
                        .diskCacheStrategy(DiskCacheStrategy.DATA) // caches only the original full-resolution image.
                        .override(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL))
                .into(holder.profileIV);
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public long getItemId(int position) {
        return data.get(position).getId();
    }

    static final class StatusViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_name)
        TextView nameTV;
        @BindView(R.id.tv_screenName)
        TextView screenNameTV;
        @BindView(R.id.tv_tweetText)
        TextView tweetTextTV;
        @BindView(R.id.iv_profile_image)
        ImageView profileIV;

        StatusViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        void bind(Status status) {
            nameTV.setText(status.getUser().getName());
            screenNameTV.setText(status.getUser().getScreenName());
            tweetTextTV.setText(status.getText());
        }
    }
}
