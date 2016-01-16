package com.godjaku.android20160117;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.godjaku.android20160117.fragment.MainFragment;

public class MainActivity extends FragmentActivity {
    private MainFragment mMain= null;
    private FragmentTransaction mFrgTransaction= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onResume(){
        super.onResume();

        makeView();
        moveFragment(Contants.MAIN);
    }
    @Override
    public void onPause(){
        super.onPause();
    }

    private void makeView(){
        mMain= new MainFragment();
    }

    public void moveFragment(int type){
        mFrgTransaction= getSupportFragmentManager().beginTransaction();
        switch (type){
            case Contants.MAIN: mFrgTransaction.add(R.id.container, mMain); break;
        }
        mFrgTransaction.commit();
    }
}
