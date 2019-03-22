package com.zheng.recycleviewtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by zheng on 3/21/19.
 */

public class MainActivity extends AppCompatActivity {
    ArrayList<Num> nums = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        initNum();
        RecyclerView view = findViewById(R.id.recyclerview);
        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(nums);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        view.setLayoutManager(linearLayoutManager);
        view.setAdapter(adapter);

    }

    private void initNum() {
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
