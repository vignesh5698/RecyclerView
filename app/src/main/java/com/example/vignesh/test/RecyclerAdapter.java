package com.example.vignesh.test;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vignesh on 11/12/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter {


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
