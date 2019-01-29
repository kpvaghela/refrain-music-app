package com.android4dev.navigationview.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.android4dev.navigationview.R;
import com.android4dev.navigationview.common.Utility;
import com.android4dev.navigationview.model.MyPagerModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class MyPagerAdapter extends PagerAdapter {
    Context context;
    ArrayList<MyPagerModel> myPagerModels;

    public MyPagerAdapter(Context context, ArrayList<MyPagerModel> myPagerModels) {
        this.context = context;
        this.myPagerModels = myPagerModels;
    }


    int[] res = {
            R.drawable.slider1,
            R.drawable.slider2,
            R.drawable.slider3,
            R.drawable.slider4,
            R.drawable.slider5};
    String[] resGoogle = {
            "https://i.ytimg.com/vi/GOZuiqPgwLI/maxresdefault.jpg",
            "https://i.ytimg.com/vi/YQSo0Vcwa6c/maxresdefault.jpg",
            "https://i.ytimg.com/vi/SVjZ3dzpu1g/maxresdefault.jpg",
            "https://i.ytimg.com/vi/tmXW6Zj1c8s/maxresdefault.jpg",
            "https://i.ytimg.com/vi/01e-Yv9WqGM/maxresdefault.jpg"};

    @Override
    public int getCount() {
        if (Utility.isOnline(context))
            return resGoogle.length;
        else
            return resGoogle.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {


        ImageView imageView = new ImageView(context);
        if (Utility.isOnline(context))
            Picasso.with(context).
                    load(resGoogle[position]).error(R.drawable.error).placeholder(R.drawable.error)
                    .into(imageView);
        else
            Picasso.with(context).
                    load(resGoogle[position]).error(R.drawable.error).placeholder(R.drawable.error)
                    .into(imageView);

        ViewGroup.LayoutParams imageParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        imageView.setLayoutParams(imageParams);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        LinearLayout layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.VERTICAL);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        layout.setBackgroundColor(0xFF101010);
        layout.setLayoutParams(layoutParams);
        layout.addView(imageView);

        final int page = position;
        layout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });

        container.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
