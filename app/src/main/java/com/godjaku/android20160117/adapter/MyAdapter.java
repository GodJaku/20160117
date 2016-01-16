package com.godjaku.android20160117.adapter;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.godjaku.android20160117.R;
import com.godjaku.android20160117.listitem.MyItem;

import java.util.ArrayList;

/**
 * Created by noirCynical on 2016-01-17.
 */
public class MyAdapter extends ArrayAdapter<MyItem> {
    private Context mContext= null;
    private ArrayList<MyItem> mContent= null;

    public MyAdapter(Context context, int resource, ArrayList<MyItem> content){
        super(context, resource, content);
        mContext= context;
        mContent= content;
    }

    @Override
    public View getView(int position, View v, ViewGroup container){
        if(v == null) v = LayoutInflater.from(mContext).inflate(R.layout.listiem_fragment_main, null);
        ((TextView)v.findViewById(R.id.textFragmentListTitle)).setText(mContent.get(position).getTitle());
        ((TextView)v.findViewById(R.id.textFragmentListContent)).setText(mContent.get(position).getContent());
        return v;
    }
    @Override
    public int getCount(){
        if(mContent == null) return 5;
        else return mContent.size();
    }
    @Override
    public MyItem getItem(int position){
        if(mContent == null) return null;
        else return mContent.get(position);
    }
    @Override
    public long getItemId(int position){
        return position;
    }
}
