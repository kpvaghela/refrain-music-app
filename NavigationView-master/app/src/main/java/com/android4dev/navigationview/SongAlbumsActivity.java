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

public class SongAlbumsActivity extends AppCompatActivity {
    private Button btnSeeAll;
    private LinearLayout layoutSongAlbums;
    private ArrayList<String> strURL1, strSongName, strURL2, strSongName2, strURL3, strSongName3, strURL4, strSongName4, strURL5, strSongName5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songalbum);
        initToolbar();
        initializeComponent1();
        initializeComponent2();
        initializeComponent3();
        initializeComponent4();
        initializeComponent5();
    }

    private void initializeComponent1() {
        btnSeeAll = (Button) findViewById(R.id.activity_download_btn_song1);
        btnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        strURL1 = new ArrayList<>();
        strSongName = new ArrayList<>();

        strURL1.add("http://cover.mp3mad.net/orignal/52419/Uff%20Yeh%20Noor%20Armaan%20Malik.jpg");
        strURL1.add("https://2.bp.blogspot.com/-93av-ppE_L8/WJgZQkb8GOI/AAAAAAAAFKg/l3vN8uKNqt8tykl1VMJPJi7SeQ-uLk3VgCLcB/s1600/Phillauri.jpg");
        strURL1.add("http://www.clickmaza.com/wp-content/uploads/2017/03/Pop-the-Bottle-Vishal-Badshah-Vishal-Dadlani-Akasa-Singh-Shekhar-Free-Download-Audio-Mp3-Song-2017.jpg");
        strURL1.add("https://upload.wikimedia.org/wikipedia/en/thumb/8/88/Badrinath_ki_Dulhania.jpg/220px-Badrinath_ki_Dulhania.jpg");
        strURL1.add("https://i.ytimg.com/vi/Bme-XHo-AA4/movieposter.jpg");
        strURL1.add("https://4.bp.blogspot.com/-EO12uJT1jvQ/WL1qwzJGpKI/AAAAAAAAE3o/z87EpyJdf3EvS0Fe0JyMKA92AJGBPe0mwCLcB/s450/cheez-badi-machine.jpg");
        strURL1.add("http://images.hearthis.at/1/4/8/_/uploads/2286231/image_track/1237305/tamma-tamma-again-bkd-domestik-dew-amp-dj-sam-club-mix----w520_h520_q70_m1488715677----1488715677.jpg");
        strURL1.add("http://www.ursongspk.com/wp-content/uploads/naughty-billo-phillauri-300x300.jpg");
        strURL1.add("https://i.ytimg.com/vi/jIqRbFQl-ds/mqdefault.jpg");
        strURL1.add("http://best-newmovies.net/wp-content/uploads/2016/03/Bigfoot-Vs.-Zombies-2016-HDRip-423x600.jpg");


        strSongName.add("Uff yeh noor");
        strSongName.add("dum dum ");
        strSongName.add("pop the bottle");
        strSongName.add("Badri ki dulhania");
        strSongName.add("yunhi");
        strSongName.add("cheeze badi");
        strSongName.add("tamma tamma");
        strSongName.add("naughty billow");
        strSongName.add("humsafar");
        strSongName.add("sahiba");


        layoutSongAlbums = (LinearLayout) findViewById(R.id.layout_allotted);
        for (int i = 0; i < strURL1.size(); i++) {
            layoutSongAlbums.addView(addMyCourses(i, strURL1.get(i), strSongName.get(i)));
        }
    }

    private void initializeComponent2() {
        btnSeeAll = (Button) findViewById(R.id.activity_download_btn_song2);
        btnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        strURL2 = new ArrayList<>();
        strSongName2 = new ArrayList<>();

        strURL2.add("http://data1.ibtimes.co.in/cache-img-0-450/en/full/630063/1481802434_aditya-roy-kapur-shraddha-kapoor-humma-song-ok-jaanu.jpg");
        strURL2.add("http://stat2.bollywoodhungama.in/wp-content/uploads/2016/12/600-720x405.jpg");
        strURL2.add("https://i.ytimg.com/vi/nFc0G7vT288/maxresdefault.jpg");
        strURL2.add("http://songsmp3.co/assets/images/5/27384-gfgd.jpg");
        strURL2.add("http://www.djsmuzik.co.in/wp-content/uploads/2016/03/Kapoor-Sons-Kar-Gayi-Chull-DJ-A.Sen-Fidget-Mix.png");
        strURL2.add("https://static.blugaa.com/thumbs/hmlvi.jpg");
        strURL2.add("https://www.lyricsbogie.com/wp-content/uploads/2016/06/tum-ho-toh-lagta-hai-2016-200x275.jpg");
        strURL2.add("http://songsmp3.co/assets/images/1/56710-kk.jpg");
        strURL2.add("https://i.ytimg.com/vi/aWMTj-rejvc/maxresdefault.jpg");
        strURL2.add("http://static.koimoi.com/wp-content/new-galleries/2016/07/tu-hai-song-stills-from-mohenjo-daro-5.jpg");

        strSongName2.add("The Humma Song");
        strSongName2.add("Halka Halka");
        strSongName2.add("Afreen Afreen");
        strSongName2.add("Dillagi");
        strSongName2.add("Kar Gayi Chull");
        strSongName2.add("Akkad Bakkad");
        strSongName2.add("Tum Ho Toh Lagta Hain");
        strSongName2.add("Love Mashup");
        strSongName2.add("Baby Ko Bass Pasand Hai");
        strSongName2.add("Tu Hai");


        layoutSongAlbums = (LinearLayout) findViewById(R.id.layout_allotted1);
        for (int i = 0; i < strURL2.size(); i++) {
            layoutSongAlbums.addView(addMyCourses(i, strURL2.get(i), strSongName2.get(i)));
        }
    }

    private void initializeComponent3() {
        btnSeeAll = (Button) findViewById(R.id.activity_download_btn_song3);
        btnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        strURL3 = new ArrayList<>();
        strSongName3 = new ArrayList<>();

        strURL3.add("http://cover.mp3mad.net/orignal/52419/Uff%20Yeh%20Noor%20Armaan%20Malik.jpg");
        strURL3.add("https://2.bp.blogspot.com/-93av-ppE_L8/WJgZQkb8GOI/AAAAAAAAFKg/l3vN8uKNqt8tykl1VMJPJi7SeQ-uLk3VgCLcB/s1600/Phillauri.jpg");
        strURL3.add("http://best-newmovies.net/wp-content/uploads/2016/03/Bigfoot-Vs.-Zombies-2016-HDRip-423x600.jpg");
        strURL3.add("http://www.clickmaza.com/wp-content/uploads/2017/03/Pop-the-Bottle-Vishal-Badshah-Vishal-Dadlani-Akasa-Singh-Shekhar-Free-Download-Audio-Mp3-Song-2017.jpg");
        strURL3.add("https://upload.wikimedia.org/wikipedia/en/thumb/8/88/Badrinath_ki_Dulhania.jpg/220px-Badrinath_ki_Dulhania.jpg");
        strURL3.add("https://i.ytimg.com/vi/Bme-XHo-AA4/movieposter.jpg");
        strURL3.add("https://4.bp.blogspot.com/-EO12uJT1jvQ/WL1qwzJGpKI/AAAAAAAAE3o/z87EpyJdf3EvS0Fe0JyMKA92AJGBPe0mwCLcB/s450/cheez-badi-machine.jpg");
        strURL3.add("http://images.hearthis.at/1/4/8/_/uploads/2286231/image_track/1237305/tamma-tamma-again-bkd-domestik-dew-amp-dj-sam-club-mix----w520_h520_q70_m1488715677----1488715677.jpg");
        strURL3.add("http://www.ursongspk.com/wp-content/uploads/naughty-billo-phillauri-300x300.jpg");
        strURL3.add("https://i.ytimg.com/vi/jIqRbFQl-ds/mqdefault.jpg");

        strSongName3.add("Uff yeh noor");
        strSongName3.add("dum dum ");
        strSongName3.add("pop the bottle");
        strSongName3.add("Badri ki dulhania");
        strSongName3.add("yunhi");
        strSongName3.add("cheeze badi");
        strSongName3.add("tamma tamma");
        strSongName3.add("naughty billow");
        strSongName3.add("humsafar");
        strSongName3.add("sahiba");


        layoutSongAlbums = (LinearLayout) findViewById(R.id.layout_allotted3);
        for (int i = 0; i < strURL3.size(); i++) {
            layoutSongAlbums.addView(addMyCourses(i, strURL3.get(i), strSongName3.get(i)));
        }
    }

    private void initializeComponent4() {
        btnSeeAll = (Button) findViewById(R.id.activity_download_btn_song4);
        btnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        strURL4 = new ArrayList<>();
        strSongName4 = new ArrayList<>();

        strURL4.add("http://cover.mp3mad.net/orignal/52419/Uff%20Yeh%20Noor%20Armaan%20Malik.jpg");
        strURL4.add("https://2.bp.blogspot.com/-93av-ppE_L8/WJgZQkb8GOI/AAAAAAAAFKg/l3vN8uKNqt8tykl1VMJPJi7SeQ-uLk3VgCLcB/s1600/Phillauri.jpg");
        strURL4.add("http://best-newmovies.net/wp-content/uploads/2016/03/Bigfoot-Vs.-Zombies-2016-HDRip-423x600.jpg");
        strURL4.add("http://www.clickmaza.com/wp-content/uploads/2017/03/Pop-the-Bottle-Vishal-Badshah-Vishal-Dadlani-Akasa-Singh-Shekhar-Free-Download-Audio-Mp3-Song-2017.jpg");
        strURL4.add("https://upload.wikimedia.org/wikipedia/en/thumb/8/88/Badrinath_ki_Dulhania.jpg/220px-Badrinath_ki_Dulhania.jpg");
        strURL4.add("https://i.ytimg.com/vi/Bme-XHo-AA4/movieposter.jpg");
        strURL4.add("https://4.bp.blogspot.com/-EO12uJT1jvQ/WL1qwzJGpKI/AAAAAAAAE3o/z87EpyJdf3EvS0Fe0JyMKA92AJGBPe0mwCLcB/s450/cheez-badi-machine.jpg");
        strURL4.add("http://images.hearthis.at/1/4/8/_/uploads/2286231/image_track/1237305/tamma-tamma-again-bkd-domestik-dew-amp-dj-sam-club-mix----w520_h520_q70_m1488715677----1488715677.jpg");
        strURL4.add("http://www.ursongspk.com/wp-content/uploads/naughty-billo-phillauri-300x300.jpg");
        strURL4.add("https://i.ytimg.com/vi/jIqRbFQl-ds/mqdefault.jpg");

        strSongName4.add("Uff yeh noor");
        strSongName4.add("dum dum ");
        strSongName4.add("pop the bottle");
        strSongName4.add("Badri ki dulhania");
        strSongName4.add("yunhi");
        strSongName4.add("cheeze badi");
        strSongName4.add("tamma tamma");
        strSongName4.add("naughty billow");
        strSongName4.add("humsafar");
        strSongName4.add("sahiba");


        layoutSongAlbums = (LinearLayout) findViewById(R.id.layout_allotted4);
        for (int i = 0; i < strURL4.size(); i++) {
            layoutSongAlbums.addView(addMyCourses(i, strURL4.get(i), strSongName4.get(i)));
        }
    }


    private void initializeComponent5() {
        btnSeeAll = (Button) findViewById(R.id.activity_download_btn_song5);
        btnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        strURL5 = new ArrayList<>();
        strSongName5 = new ArrayList<>();

        strURL5.add("http://cover.mp3mad.net/orignal/52419/Uff%20Yeh%20Noor%20Armaan%20Malik.jpg");
        strURL5.add("https://2.bp.blogspot.com/-93av-ppE_L8/WJgZQkb8GOI/AAAAAAAAFKg/l3vN8uKNqt8tykl1VMJPJi7SeQ-uLk3VgCLcB/s1600/Phillauri.jpg");
        strURL5.add("http://best-newmovies.net/wp-content/uploads/2016/03/Bigfoot-Vs.-Zombies-2016-HDRip-423x600.jpg");
        strURL5.add("http://www.clickmaza.com/wp-content/uploads/2017/03/Pop-the-Bottle-Vishal-Badshah-Vishal-Dadlani-Akasa-Singh-Shekhar-Free-Download-Audio-Mp3-Song-2017.jpg");
        strURL5.add("https://upload.wikimedia.org/wikipedia/en/thumb/8/88/Badrinath_ki_Dulhania.jpg/220px-Badrinath_ki_Dulhania.jpg");
        strURL5.add("https://i.ytimg.com/vi/Bme-XHo-AA4/movieposter.jpg");
        strURL5.add("https://4.bp.blogspot.com/-EO12uJT1jvQ/WL1qwzJGpKI/AAAAAAAAE3o/z87EpyJdf3EvS0Fe0JyMKA92AJGBPe0mwCLcB/s450/cheez-badi-machine.jpg");
        strURL5.add("http://images.hearthis.at/1/4/8/_/uploads/2286231/image_track/1237305/tamma-tamma-again-bkd-domestik-dew-amp-dj-sam-club-mix----w520_h520_q70_m1488715677----1488715677.jpg");
        strURL5.add("http://www.ursongspk.com/wp-content/uploads/naughty-billo-phillauri-300x300.jpg");
        strURL5.add("https://i.ytimg.com/vi/jIqRbFQl-ds/mqdefault.jpg");

        strSongName5.add("Uff yeh noor");
        strSongName5.add("dum dum ");
        strSongName5.add("pop the bottle");
        strSongName5.add("Badri ki dulhania");
        strSongName5.add("yunhi");
        strSongName5.add("cheeze badi");
        strSongName5.add("tamma tamma");
        strSongName5.add("naughty billow");
        strSongName5.add("humsafar");
        strSongName5.add("sahiba");


        layoutSongAlbums = (LinearLayout) findViewById(R.id.layout_allotted5);
        for (int i = 0; i < strURL5.size(); i++) {
            layoutSongAlbums.addView(addMyCourses(i, strURL5.get(i), strSongName5.get(i)));
        }
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
            actionBar.setTitle("Songs & Albums");
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
        final View view = LayoutInflater.from(SongAlbumsActivity.this).inflate(R.layout.row_song, null);

        final LinearLayout layout_mycource = (LinearLayout) view.findViewById(R.id.layout_my_coursesong);

        TextView desc_home = (TextView) view.findViewById(R.id.row_recently_view_txt_descsong);
        desc_home.setText(home_page_desc);
        ImageView imgProfilePic = (ImageView) view.findViewById(R.id.row_recently_view_img_iconsong);
        Picasso.with(SongAlbumsActivity.this).
                load(url).fit().error(R.mipmap.ic_launcher).placeholder(R.mipmap.ic_launcher).into(imgProfilePic);
        layout_mycource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SongAlbumsActivity.this, AndroidBuildingMusicPlayerActivity.class));
            }
        });
        return view;
    }

}


