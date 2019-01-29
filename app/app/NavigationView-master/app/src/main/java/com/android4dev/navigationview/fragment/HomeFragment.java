package com.android4dev.navigationview.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.android4dev.navigationview.AboutusActivity;
import com.android4dev.navigationview.ArtistActivity;
import com.android4dev.navigationview.LiveStreamActivity;
import com.android4dev.navigationview.MainActivity;
import com.android4dev.navigationview.MyDownloadsActivity;
import com.android4dev.navigationview.R;

import com.android4dev.navigationview.SongAlbumsActivity;
import com.android4dev.navigationview.VideoMoviesActivity;
import com.android4dev.navigationview.adapter.MyPagerAdapter;
import com.android4dev.navigationview.common.AutoScrollViewPager;
import com.android4dev.navigationview.common.CircleIndicator;
import com.android4dev.navigationview.common.Utility;
import com.android4dev.navigationview.model.MyPagerModel;

import java.util.ArrayList;


/**
 * Created by kartvyasinh vaghela on 3/15/2017.
 */

public class HomeFragment extends Fragment implements View.OnClickListener {

    private Context mContext;
    private MainActivity homeActivity;
    private AutoScrollViewPager viewpager;
    private CircleIndicator indicator;
    private MyPagerAdapter myPagerAdapter;
    private ArrayList<MyPagerModel> myPagerModels;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_home, container, false);
        mContext = getActivity();
        initializeComponent(view);
        homeActivity = (MainActivity) getActivity();

        viewpager = (AutoScrollViewPager) view.findViewById(R.id.viewpager);
        indicator = (CircleIndicator) view.findViewById(R.id.indicator);
        myPagerModels = new ArrayList<>();


        if (Utility.isOnline(mContext)) {
            myPagerAdapter = new MyPagerAdapter(mContext, myPagerModels);
            viewpager.setAdapter(myPagerAdapter);
            indicator.setViewPager(viewpager);
            viewpager.startAutoScroll();
            viewpager.setInterval(4000);
            viewpager.setBorderAnimation(true);
            viewpager.setStopScrollWhenTouch(true);
        } else {
            myPagerAdapter = new MyPagerAdapter(mContext, myPagerModels);
            viewpager.setAdapter(myPagerAdapter);
            indicator.setViewPager(viewpager);
            viewpager.startAutoScroll();
            viewpager.setInterval(4000);
            viewpager.setBorderAnimation(true);
            viewpager.setStopScrollWhenTouch(true);
        }
        return view;
    }

    private Button MyDownloads, LiveStream, SongAlbums, VideoMovies, Artist, Aboutus;

    private void initializeComponent(View view) {

        MyDownloads = (Button) view.findViewById(R.id.MyDownloads);
        LiveStream = (Button) view.findViewById(R.id.LiveStream);
        SongAlbums = (Button) view.findViewById(R.id.SongAlbums);
        VideoMovies = (Button) view.findViewById(R.id.VideoMovies);
        Artist = (Button) view.findViewById(R.id.Artist);
        Aboutus = (Button) view.findViewById(R.id.Aboutus);


        MyDownloads.setOnClickListener(this);
        LiveStream.setOnClickListener(this);
        SongAlbums.setOnClickListener(this);
        VideoMovies.setOnClickListener(this);
        Artist.setOnClickListener(this);
        Aboutus.setOnClickListener(this);

        MyDownloads.setVisibility(View.INVISIBLE);
        LiveStream.setVisibility(View.INVISIBLE);
        SongAlbums.setVisibility(View.INVISIBLE);
        VideoMovies.setVisibility(View.INVISIBLE);
        Artist.setVisibility(View.INVISIBLE);
        Aboutus.setVisibility(View.INVISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                MyDownloads.setVisibility(View.VISIBLE);
                Utility.scaleAnimation(MyDownloads, 900);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        LiveStream.setVisibility(View.VISIBLE);
                        Utility.scaleAnimation(LiveStream, 900);
                    }
                }, 900);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        SongAlbums.setVisibility(View.VISIBLE);
                        Utility.scaleAnimation(SongAlbums, 500);
                    }
                }, 800);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        VideoMovies.setVisibility(View.VISIBLE);
                        Utility.scaleAnimation(VideoMovies, 700);
                    }
                }, 600);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Artist.setVisibility(View.VISIBLE);
                        Utility.scaleAnimation(Artist, 500);
                    }
                }, 900);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Aboutus.setVisibility(View.VISIBLE);
                        Utility.scaleAnimation(Aboutus, 500);
                    }
                }, 700);

            }
        }, 900);
    }

    @Override
    public void onClick(View v) {
        if (v == MyDownloads) {
            startActivity(new Intent(getActivity(), MyDownloadsActivity.class));
        } else if (v == LiveStream) {
            mContext.startActivity(new Intent(getActivity(), LiveStreamActivity.class));
        } else if (v == SongAlbums) {
            startActivity(new Intent(getActivity(), SongAlbumsActivity.class));
        } else if (v == VideoMovies) {
            if (Utility.isOnline(getActivity()))
                startActivity(new Intent(getActivity(), VideoMoviesActivity.class));
            else
                Utility.alertDialogShow(getActivity(), getString(R.string.msg_no_internet));
        } else if (v == Artist) {
            startActivity(new Intent(getActivity(), ArtistActivity.class));
        } else if (v == Aboutus) {
            startActivity(new Intent(getActivity(), AboutusActivity.class));
        }
    }
}
