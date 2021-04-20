package com.arsyiaziz.task4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ComputerRecyclerAdapter extends RecyclerView.Adapter<ComputerRecyclerAdapter.ViewHolder> {
    private List<ComputerModel> models;
    private OnItemClickCallback onItemClickCallback;

    public ComputerRecyclerAdapter(List<ComputerModel> models) {
        this.models = models;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ComputerModel model = models.get(position);
        holder.ivComputerPhoto.setImageResource(model.getPhoto());
        holder.tvComputerDeveloper.setText(model.getDeveloper());
        holder.tvComputerName.setText(model.getName());
        holder.tvComputerSummary.setText(model.getSummary());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(models.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivComputerPhoto;
        TextView tvComputerName;
        TextView tvComputerSummary;
        TextView tvComputerDeveloper;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvComputerName = itemView.findViewById(R.id.tv_computer_name);
            ivComputerPhoto = itemView.findViewById(R.id.iv_computer_photo);
            tvComputerSummary = itemView.findViewById(R.id.tv_computer_summary);
            tvComputerDeveloper = itemView.findViewById(R.id.tv_computer_developer);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(ComputerModel data);
    }

}
