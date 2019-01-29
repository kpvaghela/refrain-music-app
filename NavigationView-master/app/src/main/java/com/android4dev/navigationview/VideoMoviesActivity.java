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
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class VideoMoviesActivity extends AppCompatActivity{


        private Button btnSeeAll;
        private LinearLayout layoutMovie;
        private ArrayList<String> strURL1, strSongName,strURL2, strSongName2,strURL3, strSongName3,strURL4, strSongName4,strURL5,strSongName5;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_videomovie);
            initToolbar();
            initializeComponent1();
            initializeComponent2();
          initializeComponent3();
            initializeComponent4();
            initializeComponent5();
        }

        private void initializeComponent1() {
            btnSeeAll = (Button) findViewById(R.id.activity_download_btn_movie1);
            btnSeeAll.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });


            strURL1 = new ArrayList<>();
            strSongName = new ArrayList<>();

            strURL1.add("https://upload.wikimedia.org/wikipedia/en/thumb/8/88/Badrinath_ki_Dulhania.jpg/220px-Badrinath_ki_Dulhania.jpg");
            strURL1.add("https://upload.wikimedia.org/wikipedia/en/thumb/e/ef/Kong33promo.jpg/280px-Kong33promo.jpg");
            strURL1.add("https://upload.wikimedia.org/wikipedia/en/d/dd/Machine_%282017_film%29_Poster.jpg");
            strURL1.add("https://upload.wikimedia.org/wikipedia/en/0/05/Aa_Gaya_Hero_Poster.jpg");
            strURL1.add("https://upload.wikimedia.org/wikipedia/en/thumb/4/4e/Phillauri_Cover.jpg/220px-Phillauri_Cover.jpg");
            strURL1.add("https://upload.wikimedia.org/wikipedia/en/8/87/Jolly_LLB_2_Cover.jpg");
            strURL1.add("https://images-na.ssl-images-amazon.com/images/M/MV5BYTM5Njc4MDktM2NjOC00M2E3LTkwYzgtMDdjMGNhMDE2OWMxL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMjM1NjkwMDI@._V1_.jpg");
            strURL1.add("https://upload.wikimedia.org/wikipedia/en/thumb/b/b3/RangoonPoster.jpg/220px-RangoonPoster.jpg");
            strURL1.add("http://vipsongspk.net/wp-content/uploads/2016/11/Commando-2-Comando-2017-Hindi-Movie-Mp3-Songs-Download.jpg");
            strURL1.add("https://upload.wikimedia.org/wikipedia/en/e/e7/The_Ghazi_Attack_Poster.jpg");

            strSongName.add("Badrinath ki Dulhaniya");
            strSongName.add("Kong");
            strSongName.add("Machine");
            strSongName.add("AA gaya hero");
            strSongName.add("Phillauri");
            strSongName.add("Jolley LLB2");
            strSongName.add("Naam Shabana");
            strSongName.add("Rangoon");
            strSongName.add("Commando 2");
            strSongName.add("The Gaazi Attack");



            layoutMovie = (LinearLayout) findViewById(R.id.layout_allotted_movie1);
            for (int i = 0; i < strURL1.size(); i++) {
                layoutMovie.addView(addMyCourses(i, strURL1.get(i), strSongName.get(i)));
            }
        }

    private void initializeComponent2() {
        btnSeeAll = (Button) findViewById(R.id.activity_download_btn_movie2);
        btnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        strURL2 = new ArrayList<>();
        strSongName2 = new ArrayList<>();

        strURL2.add("https://i.ytimg.com/vi/84WIaK3bl_s/maxresdefault.jpg");
        strURL2.add("https://i.ytimg.com/vi/DnpO_RTSNmQ/maxresdefault.jpg");
        strURL2.add("https://i.ytimg.com/vi/LdfMKnJ1y2o/maxresdefault.jpg");
        strURL2.add("https://i.ytimg.com/vi/P8V_bx0L4RY/maxresdefault.jpg");
        strURL2.add("http://cdn01.cdn.justjared.com/wp-content/uploads/headlines/2016/09/grace-vanderwaal-fallon-tonight-show-performance-bmi-visit-jj.jpg");
        strURL2.add("https://i.ytimg.com/vi/scWpXEYZEGk/maxresdefault.jpg");
        strURL2.add("https://i.ytimg.com/vi/1pyfMnF6j_g/maxresdefault.jpg");
        strURL2.add("https://media.timeout.com/images/103530970/630/472/image.jpg");
        strURL2.add("https://i.ytimg.com/vi/Nck6BZga7TQ/hqdefault.jpg");
        strURL2.add("http://a.abcnews.com/images/GMA/160413_gma_strahan_0748_33x16_1600.jpg");

        strSongName2.add("The $21,000 first class airplane seat");
        strSongName2.add("Donald Trump: Last Week Tonight with John Oliver (HBO)");
        strSongName2.add("Channing Tatum & Beyonce’s ‘Run The World (Girls)’ vs. Jenna Dewan-Tatum’s ‘Pony’ | Lip Sync Battle");
        strSongName2.add("Water Bottle Flip Edition ");
        strSongName2.add("Grace VanderWaal:");
        strSongName2.add("“Nike Football");
        strSongName2.add("What’s inside a Rattlesnake Rattle?");
        strSongName2.add("Pen-Pineapple-Apple-Pen");
        strSongName2.add("Adele Carpool Karaoke");
        strSongName2.add("Brothers Convince Little Sister of Zombie Apocalypse");



        layoutMovie = (LinearLayout) findViewById(R.id.layout_allotted_movie2);
        for (int i = 0; i < strURL2.size(); i++) {
            layoutMovie.addView(addMyCourses(i, strURL2.get(i), strSongName2.get(i)));
        }
    }

    private void initializeComponent3() {
        btnSeeAll = (Button) findViewById(R.id.activity_download_btn_movie3);
        btnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        strURL3 = new ArrayList<>();
        strSongName3 = new ArrayList<>();

        strURL3.add("https://upload.wikimedia.org/wikipedia/en/thumb/8/88/Badrinath_ki_Dulhania.jpg/220px-Badrinath_ki_Dulhania.jpg");
        strURL3.add("https://upload.wikimedia.org/wikipedia/en/thumb/e/ef/Kong33promo.jpg/280px-Kong33promo.jpg");
        strURL3.add("https://upload.wikimedia.org/wikipedia/en/d/dd/Machine_%282017_film%29_Poster.jpg");
        strURL3.add("https://upload.wikimedia.org/wikipedia/en/0/05/Aa_Gaya_Hero_Poster.jpg");
        strURL3.add("https://upload.wikimedia.org/wikipedia/en/thumb/4/4e/Phillauri_Cover.jpg/220px-Phillauri_Cover.jpg");
        strURL3.add("https://upload.wikimedia.org/wikipedia/en/8/87/Jolly_LLB_2_Cover.jpg");
        strURL3.add("https://images-na.ssl-images-amazon.com/images/M/MV5BYTM5Njc4MDktM2NjOC00M2E3LTkwYzgtMDdjMGNhMDE2OWMxL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMjM1NjkwMDI@._V1_.jpg");
        strURL3.add("https://upload.wikimedia.org/wikipedia/en/thumb/b/b3/RangoonPoster.jpg/220px-RangoonPoster.jpg");
        strURL3.add("http://vipsongspk.net/wp-content/uploads/2016/11/Commando-2-Comando-2017-Hindi-Movie-Mp3-Songs-Download.jpg");
        strURL3.add("https://upload.wikimedia.org/wikipedia/en/e/e7/The_Ghazi_Attack_Poster.jpg");

        strSongName3.add("Badrinath ki Dulhaniya");
        strSongName3.add("Kong");
        strSongName3.add("Machine");
        strSongName3.add("AA gaya hero");
        strSongName3.add("Phillauri");
        strSongName3.add("Jolley LLB2");
        strSongName3.add("Naam Shabana");
        strSongName3.add("Rangoon");
        strSongName3.add("Commando 2");
        strSongName3.add("The Gaazi Attack");



        layoutMovie = (LinearLayout) findViewById(R.id.layout_allotted_movie3);
        for (int i = 0; i < strURL3.size(); i++) {
            layoutMovie.addView(addMyCourses(i, strURL3.get(i), strSongName3.get(i)));
        }
    }


    private void initializeComponent4() {
        btnSeeAll = (Button) findViewById(R.id.activity_download_btn_movie4);
        btnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        strURL4 = new ArrayList<>();
        strSongName4 = new ArrayList<>();

        strURL4.add("https://upload.wikimedia.org/wikipedia/en/thumb/8/88/Badrinath_ki_Dulhania.jpg/220px-Badrinath_ki_Dulhania.jpg");
        strURL4.add("https://upload.wikimedia.org/wikipedia/en/thumb/e/ef/Kong33promo.jpg/280px-Kong33promo.jpg");
        strURL4.add("https://upload.wikimedia.org/wikipedia/en/d/dd/Machine_%282017_film%29_Poster.jpg");
        strURL4.add("https://upload.wikimedia.org/wikipedia/en/0/05/Aa_Gaya_Hero_Poster.jpg");
        strURL4.add("https://upload.wikimedia.org/wikipedia/en/thumb/4/4e/Phillauri_Cover.jpg/220px-Phillauri_Cover.jpg");
        strURL4.add("https://upload.wikimedia.org/wikipedia/en/8/87/Jolly_LLB_2_Cover.jpg");
        strURL4.add("https://images-na.ssl-images-amazon.com/images/M/MV5BYTM5Njc4MDktM2NjOC00M2E3LTkwYzgtMDdjMGNhMDE2OWMxL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMjM1NjkwMDI@._V1_.jpg");
        strURL4.add("https://upload.wikimedia.org/wikipedia/en/thumb/b/b3/RangoonPoster.jpg/220px-RangoonPoster.jpg");
        strURL4.add("http://vipsongspk.net/wp-content/uploads/2016/11/Commando-2-Comando-2017-Hindi-Movie-Mp3-Songs-Download.jpg");
        strURL4.add("https://upload.wikimedia.org/wikipedia/en/e/e7/The_Ghazi_Attack_Poster.jpg");

        strSongName4.add("Badrinath ki Dulhaniya");
        strSongName4.add("Kong");
        strSongName4.add("Machine");
        strSongName4.add("AA gaya hero");
        strSongName4.add("Phillauri");
        strSongName4.add("Jolley LLB2");
        strSongName4.add("Naam Shabana");
        strSongName4.add("Rangoon");
        strSongName4.add("Commando 2");
        strSongName4.add("The Gaazi Attack");



        layoutMovie = (LinearLayout) findViewById(R.id.layout_allotted_movie4);
        for (int i = 0; i < strURL4.size(); i++) {
            layoutMovie.addView(addMyCourses(i, strURL4.get(i), strSongName4.get(i)));
        }
    }


    private void initializeComponent5() {
        btnSeeAll = (Button) findViewById(R.id.activity_download_btn_movie5);
        btnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        strURL5 = new ArrayList<>();
        strSongName5 = new ArrayList<>();

        strURL5.add("https://upload.wikimedia.org/wikipedia/en/thumb/8/88/Badrinath_ki_Dulhania.jpg/220px-Badrinath_ki_Dulhania.jpg");
        strURL5.add("https://upload.wikimedia.org/wikipedia/en/thumb/e/ef/Kong33promo.jpg/280px-Kong33promo.jpg");
        strURL5.add("https://upload.wikimedia.org/wikipedia/en/d/dd/Machine_%282017_film%29_Poster.jpg");
        strURL5.add("https://upload.wikimedia.org/wikipedia/en/0/05/Aa_Gaya_Hero_Poster.jpg");
        strURL5.add("https://upload.wikimedia.org/wikipedia/en/thumb/4/4e/Phillauri_Cover.jpg/220px-Phillauri_Cover.jpg");
        strURL5.add("https://upload.wikimedia.org/wikipedia/en/8/87/Jolly_LLB_2_Cover.jpg");
        strURL5.add("https://images-na.ssl-images-amazon.com/images/M/MV5BYTM5Njc4MDktM2NjOC00M2E3LTkwYzgtMDdjMGNhMDE2OWMxL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMjM1NjkwMDI@._V1_.jpg");
        strURL5.add("https://upload.wikimedia.org/wikipedia/en/thumb/b/b3/RangoonPoster.jpg/220px-RangoonPoster.jpg");
        strURL5.add("http://vipsongspk.net/wp-content/uploads/2016/11/Commando-2-Comando-2017-Hindi-Movie-Mp3-Songs-Download.jpg");
        strURL5.add("https://upload.wikimedia.org/wikipedia/en/e/e7/The_Ghazi_Attack_Poster.jpg");

        strSongName5.add("Badrinath ki Dulhaniya");
        strSongName5.add("Kong");
        strSongName5.add("Machine");
        strSongName5.add("AA gaya hero");
        strSongName5.add("Phillauri");
        strSongName5.add("Jolley LLB2");
        strSongName5.add("Naam Shabana");
        strSongName5.add("Rangoon");
        strSongName5.add("Commando 2");
        strSongName5.add("The Gaazi Attack");



        layoutMovie = (LinearLayout) findViewById(R.id.layout_allotted_movie5);
        for (int i = 0; i < strURL5.size(); i++) {
            layoutMovie.addView(addMyCourses(i, strURL5.get(i), strSongName5.get(i)));
        }
    }
    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar_movie);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
            actionBar.setTitle("Movies & Videos");
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
        final View view = LayoutInflater.from(VideoMoviesActivity.this).inflate(R.layout.row_movie, null);

        final LinearLayout layout_mycource = (LinearLayout) view.findViewById(R.id.layout_my_coursemovie);

        TextView desc_home = (TextView) view.findViewById(R.id.row_recently_view_txt_descmovie);
        desc_home.setText(home_page_desc);
        ImageView imgProfilePic = (ImageView) view.findViewById(R.id.row_recently_view_img_iconmovie);
        Picasso.with(VideoMoviesActivity.this).
                load(url).fit().error(R.mipmap.ic_launcher).placeholder(R.mipmap.ic_launcher).into(imgProfilePic);
        layout_mycource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VideoMoviesActivity.this,VideoViewActivity.class));
            }
        });
        return view;
    }

}
