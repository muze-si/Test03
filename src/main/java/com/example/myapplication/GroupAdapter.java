package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.ViewHolder> {
    private List<Group> myGroupList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        private final View view;
        ImageView groupImage;
        TextView groupName;
        TextView groupUse;
        public ViewHolder(View view){
            super(view);
            this.view=view;
            groupImage = (ImageView) view.findViewById(R.id.group_image);
            groupName = (TextView) view.findViewById(R.id.group_name);
            groupUse = (TextView) view.findViewById(R.id.group_use);
        }
    }

    public interface OnItemClickListener {
        void onClick(int position);
    }
    private OnItemClickListener listener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public interface OnItemLongClickListener {
        void onClick(int position);
    }

    private OnItemLongClickListener longClickListener;
    public void setOnItemLongClickListener(OnItemLongClickListener longClickListener) {
        this.longClickListener = longClickListener;
    }

    public GroupAdapter (List<Group> groupList){
        myGroupList = groupList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.group_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        view.setOnClickListener((View.OnClickListener) this);
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        Group group = myGroupList.get(position);
        holder.groupImage.setImageResource(group.getImageId());
        holder.groupName.setText(group.getName());
        holder.groupUse.setText(group.getUse());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onClick(position);
                }
            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (longClickListener != null) {
                    longClickListener.onClick(position);
                }
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }


}




