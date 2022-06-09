package com.example.live_application.controller;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.live_application.Detail;
import com.example.live_application.Model.ModelData;
import com.example.live_application.R;

import java.util.List;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ViewData> {

    private final List<ModelData> l2;
    Activity activity;


    public DetailAdapter(Detail detail, List<ModelData> l2) {

        activity=detail;
        this.l2=l2;
    }

    @NonNull
    @Override
    public ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.recycleview1, parent, false);
        return new ViewData(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewData holder, int position) {
        holder.txt_amount1.setText(l2.get(position).getAmount());
        holder.txt_redio1.setText(l2.get(position).getRadio());
        holder.txt_data1.setText(l2.get(position).getData());

    }



    @Override
    public int getItemCount() {
        return l2.size();
    }

    class ViewData extends RecyclerView.ViewHolder{
        private final TextView txt_amount1, txt_redio1, txt_data1;
        public ViewData(@NonNull View itemView) {
            super(itemView);


            txt_amount1 = itemView.findViewById(R.id.txt_amount);
            txt_redio1 = itemView.findViewById(R.id.txt_redio);
            txt_data1 = itemView.findViewById(R.id.txt_data);

        }
    }

}
