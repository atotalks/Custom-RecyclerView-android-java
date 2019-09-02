package com.example.custom_recyclerview;

import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private ArrayList<ListItem> mList;

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        protected TextView listName;



        public CustomViewHolder(View view) {
            super(view);
            this.listName = (TextView) view.findViewById(R.id.id_listitem);

        }
    }


    public CustomAdapter(ArrayList<ListItem> list) {
        this.mList = list;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);

        CustomViewHolder viewHolder = new CustomViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder viewholder, int position) {

        viewholder.listName.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);

        viewholder.listName.setGravity(Gravity.CENTER);

        viewholder.listName.setText(mList.get(position).getListName());

    }

    @Override
    public int getItemCount() {
        return (null != mList ? mList.size() : 0);
    }
}
