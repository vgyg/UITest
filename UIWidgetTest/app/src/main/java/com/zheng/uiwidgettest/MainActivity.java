package com.zheng.uiwidgettest;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_third);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null) {
            actionBar.hide();
        }
        Button button = findViewById(R.id.bt_ok);
        button.setOnClickListener(this);
        imageView = findViewById(R.id.image_icon);
        progressBar = findViewById(R.id.pb_1);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_ok:
                ProgressDialog dialog = new ProgressDialog(this);
                dialog.setTitle("This is a Title");
                dialog.setMessage("---------");
                dialog.setCancelable(false);
                dialog.show();
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Thread thread = new Thread();

                dialog.dismiss();
                break;
            default:

                break;
        }
    }
}
