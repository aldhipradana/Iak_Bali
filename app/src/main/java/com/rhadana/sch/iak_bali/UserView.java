package com.rhadana.sch.iak_bali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserView extends AppCompatActivity {

    TextView tvNama, tvUsname, tvPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_view);

        tvNama = (TextView)findViewById(R.id.tvNama);
        tvUsname = (TextView)findViewById(R.id.tvUsname);
        tvPwd = (TextView)findViewById(R.id.tvPwd);

        String nama = getIntent().getExtras().getString("Nama");
        String username = getIntent().getExtras().getString("Usname");
        String password = getIntent().getExtras().getString("Pwd");

        tvNama.setText(nama);
        tvUsname.setText(username);
        tvPwd.setText(password);
    }
}
