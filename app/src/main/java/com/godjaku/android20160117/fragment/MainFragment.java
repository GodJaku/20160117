package com.godjaku.android20160117.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.godjaku.android20160117.R;
import com.godjaku.android20160117.adapter.MyAdapter;
import com.godjaku.android20160117.listitem.MyItem;

import java.util.ArrayList;

/**
 * Created by noirCynical on 2016-01-17.
 */
public class MainFragment extends Fragment {
    private View wholeView= null;

    private ListView mList= null;
    private MyAdapter mAdapter= null;
    private ArrayList<MyItem> mContent= null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle data){
        wholeView= inflater.inflate(R.layout.fragment_main, null);
        return wholeView;
    }

    @Override
    public void onResume(){
        super.onResume();
        makeView();
    }
    @Override
    public void onPause(){
        super.onPause();
    }

    private void makeView(){
        mList= (ListView)wholeView.findViewById(R.id.listFragmentList);
        if(mAdapter == null){
            mContent= new ArrayList<MyItem>();
            for(int i=0; i<10; i++) mContent.add(new MyItem("Title #"+i, "my content is "+i));
            mAdapter= new MyAdapter(getActivity(), R.layout.listiem_fragment_main, mContent);
        }
        mList.setAdapter(mAdapter);
    }
}
