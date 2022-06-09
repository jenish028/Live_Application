package com.example.live_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.live_application.Model.ModelData;
import com.example.live_application.controller.DetailAdapter;
import com.example.live_application.controller.My_Rv_Adpter;

import java.util.List;

public class Detail extends AppCompatActivity {

    private RecyclerView deta_view;
List<ModelData> l2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        blinding();


        DetailAdapter adapter=new DetailAdapter(Detail.this,l2);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        deta_view.setLayoutManager(layoutManager);
        deta_view.setAdapter(adapter);


    }

    private void blinding() {

         deta_view = findViewById(R.id.deta_view);
    }
}