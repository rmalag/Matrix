package com.example.malag.matrix;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final Button insMatrix = (Button) findViewById(R.id.fatto);
        insMatrix.setEnabled(false);
        final EditText textBoxRighe = (EditText) findViewById(R.id.textBRighe);
        final EditText textBoxColonne = (EditText) findViewById(R.id.textBColonne);
        textBoxRighe.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().equals("")) {
                    insMatrix.setEnabled(false);
                } else if(textBoxColonne.getText().toString().equals("")){
                    insMatrix.setEnabled(false);
                }
                else
                    insMatrix.setEnabled(true);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        textBoxColonne.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().equals("")) {
                    insMatrix.setEnabled(false);
                } else if(textBoxRighe.getText().toString().equals("")){
                    insMatrix.setEnabled(false);
                }
                else
                    insMatrix.setEnabled(true);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        insMatrix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
