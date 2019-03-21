package com.zheng.mylistviewtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by zheng on 3/20/19.
 */

public class MainActivity extends AppCompatActivity {
    private ArrayList<Num> nums = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        initNums();
        MyNumAdapter adapter = new MyNumAdapter(MainActivity.this, R.layout.layout_liststyle, nums);
        final ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Num num = nums.get(position);
                Toast.makeText(MainActivity.this,"name: "+num.getNumName()+"\n"+"id: "+position+" \n",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initNums() {
        for (int i = 0; i < 100; i++) {
            nums.add(new Num(R.mipmap.numone, "one"));
            nums.add(new Num(R.mipmap.num2, "2"));
            nums.add(new Num(R.mipmap.num3, "3"));
            nums.add(new Num(R.mipmap.num4, "4"));
            nums.add(new Num(R.mipmap.num5, "4"));
            nums.add(new Num(R.mipmap.num6, "5"));
            nums.add(new Num(R.mipmap.num7, "6"));
            nums.add(new Num(R.mipmap.num8, "7"));
            nums.add(new Num(R.mipmap.num9, "8"));
        }

    }
}
