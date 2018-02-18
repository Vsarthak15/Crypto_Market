package com.sv15.cryptomarket;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Dell on 03-Feb-18.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<List_Item> listItems;
    private Context context;

    public MyAdapter(List<List_Item> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.inlistview,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        List_Item listItem= listItems.get(position);
        holder.tvcoin_name.setText(listItem.getCoin_name());
        holder.tvcoin_rate.setText(listItem.getCoin_rate());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvcoin_name;
        TextView tvcoin_rate;

        public ViewHolder(View itemView) {
            super(itemView);

            tvcoin_name = itemView.findViewById(R.id.tvcoin_name);
            tvcoin_rate = itemView.findViewById(R.id.tvcoin_rate);

        }
    }
}
