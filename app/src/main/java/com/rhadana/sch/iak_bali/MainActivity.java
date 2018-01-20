package com.rhadana.sch.iak_bali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox cbVisible;
    Button btDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbVisible = (CheckBox)findViewById(R.id.cbAgree);
        btDaftar = (Button)findViewById(R.id.btDaftar);

        cbVisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cbVisible.isChecked()){
                    btDaftar.setVisibility(View.VISIBLE);
                }else {
                    btDaftar.setVisibility(View.GONE);
                }

            }
        });

    }
}
