package com.example.live_application;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.live_application.Model.ModelData;
import com.example.live_application.controller.My_Rv_Adpter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String radio1;
    private Button button;
    private Button add_btn;
    private ImageView filter;
    private RecyclerView rv_view;
    private String radio;
    List<ModelData> l1 = new ArrayList<>();
  public static   List<ModelData> l2 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blinding();

        My_Rv_Adpter adpter = new My_Rv_Adpter(MainActivity.this, l1);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rv_view.setLayoutManager(layoutManager);
        rv_view.setAdapter(adpter);


        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cus_dialog1();
            }
        });
//        filter.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                cus_dialog2();
//
//
//            }
//        });

    }

    private void blinding() {
        add_btn = findViewById(R.id.add_btn);
        rv_view = findViewById(R.id.rv_view);
        filter = findViewById(R.id.filter);
    }

    void cus_dialog1() {

        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.item);
        dialog.setCancelable(false);

        EditText amount_edt = dialog.findViewById(R.id.amount_edt);
        RadioGroup rd_btn = dialog.findViewById(R.id.rd_btn);
        RadioButton rd_income = dialog.findViewById(R.id.rd_income);
        RadioButton rd_expense = dialog.findViewById(R.id.rd_expense);
        EditText data_edt = dialog.findViewById(R.id.data_edt);
        Button cus_add_btn = dialog.findViewById(R.id.cus_add_btn);

        cus_add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String amount = amount_edt.getText().toString();
                String data = data_edt.getText().toString();


                if (rd_btn.getCheckedRadioButtonId() == R.id.rd_income) {

                    radio = "Income";

                } else if (rd_btn.getCheckedRadioButtonId() == R.id.rd_expense) {
                    radio = "Expense";
                }


                Toast.makeText(MainActivity.this, "" + amount + "\n" + radio + "" + data, Toast.LENGTH_SHORT).show();
                dialog.dismiss();

                for (int i = 0; i < Integer.parseInt(data); i++) {
                    ModelData modelData = new ModelData(amount, radio, data);
                    l1.add(modelData);
                }

            }
        });


        dialog.show();
    }

//    void cus_dialog2() {
//
//        Dialog dialog1 = new Dialog(MainActivity.this);
//        dialog1.setContentView(R.layout.item2);
//        dialog1.setCancelable(false);
//
//        RadioGroup rd_btn = dialog1.findViewById(R.id.rd_btn);
//        RadioButton rd_income = dialog1.findViewById(R.id.rd_income);
//        RadioButton rd_expense = dialog1.findViewById(R.id.rd_expense);
//        Button filter1 = dialog1.findViewById(R.id.filter1);
//
//
//        filter1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                if (rd_btn.getCheckedRadioButtonId() == R.id.rd_income) {
//                    radio1 = "Income";
//                } else if (rd_btn.getCheckedRadioButtonId() == R.id.rd_expense) {
//                    radio1 = "Expend";
//                }
//
//                for (int i = 0; i < l1.size(); i++) {
//                    String pt = l1.get(i).getRadio();
//                    if (pt.equals("Income")) {
//
//
//                        l2.add(l1.get(i));
//                        Intent intent=new Intent(MainActivity.this,Detail.class);
//
//                        startActivity(intent);
//
//                        Toast.makeText(MainActivity.this, "kkk", Toast.LENGTH_SHORT).show();
//                    } else {
//                        Toast.makeText(MainActivity.this, "osrgi", Toast.LENGTH_SHORT).show();
//                    }
//
//                }
//                dialog1.dismiss();
//
//            }
//        });
//        dialog1.show();
//
//
//    }


}
