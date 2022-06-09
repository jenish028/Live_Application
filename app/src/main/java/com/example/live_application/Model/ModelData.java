package com.example.live_application.Model;

public class ModelData {
    String amount,data,radio;

    public ModelData(String amount, String radio, String data) {
        this.amount=amount;
        this.data=data;
        this.radio=radio;
    }


    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {


        this.data = data;

    }

}
