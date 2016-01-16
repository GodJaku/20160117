package com.godjaku.android20160117.listitem;

/**
 * Created by noirCynical on 2016-01-17.
 */
public class MyItem {
    private String mTitle;
    private String mContent;

    public MyItem(){
        mTitle= "Default Title";
        mContent= "Default description";
    }
    public MyItem(String title, String content){
        mTitle= title;
        mContent= content;
    }

    public void setTitle(String title){ mTitle= title; }
    public void setContent(String content){ mContent= content; }
    public String getTitle(){ return mTitle; }
    public String getContent(){ return mContent; }
}
