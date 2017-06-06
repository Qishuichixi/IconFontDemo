package com.example.zhou.iconfontdemo;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.view.LayoutInflaterFactory;
import android.support.v7.app.AppCompatDelegate;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class IconFontLayoutFactory implements LayoutInflaterFactory{

    private static Typeface mTypeface;
    private AppCompatDelegate mAppCompatDelegate;

    public IconFontLayoutFactory(Context context ,AppCompatDelegate appCompatDelegate){

        if(mTypeface==null) mTypeface=Typeface.createFromAsset(context.getAssets(),"fonts/fontawesome-webfont.ttf");
        mAppCompatDelegate=appCompatDelegate;
    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {

        View view=mAppCompatDelegate.createView(parent,name,context,attrs);

        if(view instanceof TextView){

            ((TextView)view).setTypeface(mTypeface);
        }

        return view;
    }




}
