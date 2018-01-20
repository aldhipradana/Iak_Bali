package com.rhadana.sch.iak_bali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText etNama, etPwd, etUsname;
    CheckBox cbAgree;
    Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etNama = (EditText)findViewById(R.id.etNama);
        etPwd = (EditText)findViewById(R.id.etPwd);
        etUsname = (EditText)findViewById(R.id.etUsname);
        btLogin = (Button)findViewById(R.id.btLogin);
        cbAgree = (CheckBox) findViewById(R.id.cbAgree);

        cbAgree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbAgree.isChecked()){
                    btLogin.setVisibility(View.VISIBLE);
                    btLogin.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String nama = etNama.getText().toString();
                            String username = etUsname.getText().toString();
                            String password = etPwd.getText().toString();

                            Intent intent = new Intent(getApplicationContext(),UserView.class);

                            intent.putExtra("Nama", nama);
                            intent.putExtra("Usname", username);
                            intent.putExtra("Pwd", password);

                            startActivity(intent);
                        }
                    });
                }else {
                    btLogin.setVisibility(View.GONE);
                }

            }
        });



    }
}
