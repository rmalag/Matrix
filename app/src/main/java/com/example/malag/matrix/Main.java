package com.example.malag.matrix;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button insMatrix;
        insMatrix = findViewById(R.id.insMatrix);
        insMatrix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup();
            }
        });
    }

    private PopupWindow pw;
    private void showPopup(){
        try {
            LayoutInflater inflater = (LayoutInflater) Main.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup) findViewById(R.id.popup_1));
            pw = new PopupWindow(layout, 300, 370, true);
            pw.showAtLocation(layout, Gravity.CENTER, 0, 0);
            Button closePopup;
            closePopup = (Button) layout.findViewById(R.id.close_popup);
            closePopup.setOnClickListener(doneButt);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private View.OnClickListener doneButt = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            pw.dismiss();
        }
    };
}
