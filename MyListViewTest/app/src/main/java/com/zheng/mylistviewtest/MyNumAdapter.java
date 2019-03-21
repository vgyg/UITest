package com.zheng.mylistviewtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by zheng on 3/20/19.
 */

public class MyNumAdapter extends ArrayAdapter<Num> {
    private int resource;

    public MyNumAdapter(@NonNull Context context, int resource, ArrayList<Num> list) {
        super(context, resource, list);
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView;
        ViewHoder viewHoder;

        Num num = getItem(position);
        if(convertView==null){
            listView = LayoutInflater.from(getContext()).inflate(resource, parent, false);
            viewHoder = new ViewHoder();
            viewHoder.numberImage = (ImageView) listView.findViewById(R.id.num_image);
            viewHoder.numName = (TextView) listView.findViewById(R.id.num_name);
            listView.setTag(viewHoder);

        }else {
            listView=convertView;
            viewHoder = (ViewHoder) listView.getTag();
        }
        viewHoder.numberImage.setImageResource(num.getImageId());
        viewHoder.numName.setText(num.getNumName());
        return listView;
    }

    private class ViewHoder {
        private ImageView numberImage;
        private TextView numName;


    }
}
