package com.example.vignesh.test;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vignesh on 11/12/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private ArrayList<DataProvider> arrayList=new ArrayList<DataProvider>();

    public RecyclerAdapter(ArrayList<DataProvider> arrayList){
        this.arrayList=arrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        RecyclerViewHolder recyclerViewHolder=new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        DataProvider dataProvider=arrayList.get(position);
        holder.imageView.setImageResource(dataProvider.getImg());
        holder.fname.setText(dataProvider.getFname());
        holder.dname.setText(dataProvider.getDname());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView fname,dname;

        public RecyclerViewHolder(View view){
            super(view);
            imageView=(ImageView)view.findViewById(R.id.img);
            fname=(TextView)view.findViewById(R.id.t1);
            dname=(TextView)view.findViewById(R.id.t2);

        }
    }
}
