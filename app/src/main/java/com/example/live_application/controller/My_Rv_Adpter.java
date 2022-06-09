package com.example.live_application.controller;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.live_application.MainActivity;
import com.example.live_application.Model.ModelData;
import com.example.live_application.R;

import java.util.ArrayList;
import java.util.List;


public class My_Rv_Adpter extends RecyclerView.Adapter<My_Rv_Adpter.ViewData> {

    Activity activity;
    List<ModelData> l1 = new ArrayList<>();


    public My_Rv_Adpter(MainActivity mainActivity, List<ModelData> l1) {

        activity = mainActivity;
        this.l1 = l1;
    }

    @NonNull
    @Override
    public ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(activity).inflate(R.layout.recycleview1, parent, false);
        return new ViewData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewData holder, int position) {
        holder.txt_amount.setText(l1.get(position).getAmount());
        holder.txt_redio.setText(l1.get(position).getRadio());
        holder.txt_data.setText(l1.get(position).getData());


    }

    @Override
    public int getItemCount() {
        return l1.size();
    }

    class ViewData extends RecyclerView.ViewHolder {

        private final TextView txt_amount, txt_redio, txt_data;

        public ViewData(@NonNull View itemView) {
            super(itemView);

            txt_amount = itemView.findViewById(R.id.txt_amount);
            txt_redio = itemView.findViewById(R.id.txt_redio);
            txt_data = itemView.findViewById(R.id.txt_data);

        }
    }
}
