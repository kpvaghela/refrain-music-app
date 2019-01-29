package com.android4dev.navigationview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by kartvyasinh vaghela on 3/18/2017.
 */

public class MyDownloadsActivity extends AppCompatActivity {
    private Button btnSeeAll;
    private LinearLayout layoutMyDownload;
    private ArrayList<String> strURL, strMovieName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
        initToolbar();
        initializeComponent();
    }

    private void initializeComponent() {
        btnSeeAll = (Button) findViewById(R.id.activity_download_btn_see_all);
        btnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        strURL = new ArrayList<>();
        strMovieName = new ArrayList<>();

        strURL.add("https://upload.wikimedia.org/wikipedia/en/d/d8/King_Kong_2017.jpg");
        strURL.add("https://i.ytimg.com/vi/Bme-XHo-AA4/movieposter.jpg");
        strURL.add("http://best-newmovies.net/wp-content/uploads/2016/03/Bigfoot-Vs.-Zombies-2016-HDRip-423x600.jpg");
        strURL.add("http://www.heyuguys.com/images/2012/12/G.I.-Joe-Retaliation-Poster.jpg");

        strMovieName.add("Kong");
        strMovieName.add("Movie Poster");
        strMovieName.add("zombies");
        strMovieName.add("Joe");


        layoutMyDownload = (LinearLayout) findViewById(R.id.layout_allotted);
        for (int i = 0; i < strURL.size(); i++) {
            layoutMyDownload.addView(addMyCourses(i, strURL.get(i), strMovieName.get(i)));
        }
    }


    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
            actionBar.setTitle("My Download");
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private View addMyCourses(final int position, String url, final String home_page_desc) {
        final View view = LayoutInflater.from(MyDownloadsActivity.this).inflate(R.layout.row_my, null);

        final LinearLayout layout_mycource = (LinearLayout) view.findViewById(R.id.layout_my_course);

        TextView desc_home = (TextView) view.findViewById(R.id.row_recently_view_txt_desc);
        desc_home.setText(home_page_desc);
        ImageView imgProfilePic = (ImageView) view.findViewById(R.id.row_recently_view_img_icon);
        Picasso.with(MyDownloadsActivity.this).
                load(url).fit().error(R.mipmap.ic_launcher).placeholder(R.mipmap.ic_launcher).into(imgProfilePic);
        layout_mycource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return view;
    }
}
