package com.android4dev.navigationview;

import android.app.Activity;
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

/**
 * Created by kartvyasinh vaghela on 3/18/2017.
 */

public class ArtistActivity extends AppCompatActivity {



    private Button btnSeeAll;
    private LinearLayout layoutartist;
    private ArrayList<String> strURL1, strartist1,strURL2, strartist2,strURL3, strartist3,strURL4, strartist4,strURL5,strartist5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        initToolbar();
        initializeComponent1();
        initializeComponent2();
        initializeComponent3();
        initializeComponent4();
        initializeComponent5();
    }

    private void initializeComponent1() {
        btnSeeAll = (Button) findViewById(R.id.activity_download_btn_artist1);
        btnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        strURL1 = new ArrayList<>();
        strartist1 = new ArrayList<>();

        strURL1.add("http://images.desimartini.com/media/uploads/atif-star.jpg");
        strURL1.add("https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Mohit_Chauhan_at_the_59th_Idea_Filmfare_Awards.jpg/220px-Mohit_Chauhan_at_the_59th_Idea_Filmfare_Awards.jpg");
        strURL1.add("http://image3.mouthshut.com/images/imagesp/925733114s.jpg");
        strURL1.add("http://static.dnaindia.com/sites/default/files/2015/04/15/315191-kanika-kapoor-fb.jpg");
        strURL1.add("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Ankit_Tiwari_Filmfare.jpg/220px-Ankit_Tiwari_Filmfare.jpg");
        strURL1.add("http://www.partyowl.in/images/artist/62654981.jpg");
        strURL1.add("https://upload.wikimedia.org/wikipedia/commons/5/53/Shreya_Ghoshal_at_Carvaan-E-Ghazal.jpg");
        strURL1.add("http://timesofindia.indiatimes.com/thumb/msid-34637857,width-400,resizemode-4/34637857.jpg");
        strURL1.add("http://movies.dosthana.com/sites/default/files/image-gallery/Divya%20Kumar-Hot-Stills.jpg");
        strURL1.add("http://www.ticketline.co.uk/images/artist/ustad-rahat-fateh-ali-khan/ustad-rahat-fateh-ali-khan.jpg");

        strartist1.add("Atif Aslam");
        strartist1.add("Mohit Chauhan");
        strartist1.add("ARIJIT SINGH");
        strartist1.add("KANIKA KAPOOR");
        strartist1.add("ANKIT TIWARI");
        strartist1.add("NEHA KAKKAR");
        strartist1.add(" SHREYA GHOSHAL");
        strartist1.add("YO YO HONEY SINGH");
        strartist1.add("DIVYA KUMAR");
        strartist1.add("RAHAT FATEH ALI KHAN");



        layoutartist = (LinearLayout) findViewById(R.id.layout_allotted_artist1);
        for (int i = 0; i < strURL1.size(); i++) {
            layoutartist.addView(addMyCourses(i, strURL1.get(i), strartist1.get(i)));
        }
    }

    private void initializeComponent2() {
        btnSeeAll = (Button) findViewById(R.id.activity_download_btn_artist2);
        btnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        strURL2 = new ArrayList<>();
        strartist2 = new ArrayList<>();

        strURL2.add("http://photos.filmibeat.com/ph-big/2011/09/131599589433825.jpg");
        strURL2.add("http://images.indianexpress.com/2015/12/shankarmahadevan759.jpg");
        strURL2.add("http://pakhungama.com/pakhungama.com/wp-content/uploads/2016/03/Alka-Yagnik-Superhit-Songs-Mp3-Download.jpg");
        strURL2.add("http://www.bollykings.com/wp-content/uploads//2011/05/shaan.jpg");
        strURL2.add("https://bollyspice.com/wp-content/uploads/2014/05/14may_ARRahman.jpg");
        strURL2.add("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/Sunidhi_Chauhan_Voice_India.jpg/220px-Sunidhi_Chauhan_Voice_India.jpg");
        strURL2.add("http://s.saregama.com/image/c/m/7/dd/77/kumar-sanu_1410255411.jpg");
        strURL2.add("https://bro4u.com/blog/wp-content/uploads/2015/07/sonu11.jpg");
        strURL2.add("https://upload.wikimedia.org/wikipedia/commons/b/bb/KK_(124).jpg");
        strURL2.add("http://c.saavncdn.com/artists/Sukhwinder_Singh.jpg");

        strartist2.add("Himesh Reshmiya");
        strartist2.add("Shanker");
        strartist2.add("Alka Yagnik");
        strartist2.add("Shan");
        strartist2.add("A.R.Rahman");
        strartist2.add("Sunidhi Chauhan");
        strartist2.add("Kumar shanu");
        strartist2.add("Sonu Nigam");
        strartist2.add("KK");
        strartist2.add("Sukhvinder singh");



        layoutartist = (LinearLayout) findViewById(R.id.layout_allotted_artist2);
        for (int i = 0; i < strURL2.size(); i++) {
            layoutartist.addView(addMyCourses(i, strURL2.get(i), strartist2.get(i)));
        }
    }

    private void initializeComponent3() {
        btnSeeAll = (Button) findViewById(R.id.activity_download_btn_artist3);
        btnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        strURL3 = new ArrayList<>();
        strartist3 = new ArrayList<>();

        strURL3.add("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Katy_Perry_-_Part_Of_Me_Australian_Premiere_-_June_2012_%283%29_%28headshot%29.jpg/220px-Katy_Perry_-_Part_Of_Me_Australian_Premiere_-_June_2012_%283%29_%28headshot%29.jpg");
        strURL3.add("http://hookedoneverything.com/wp-content/uploads/2015/12/MTE4MDAzNDEwNzQ4NjA1OTY2.jpg");
        strURL3.add("http://www.rap-up.com/app/uploads/2014/12/bruno-mars.jpg");
        strURL3.add("http://70mack.co/wp-content/uploads/2017/03/Chris-Breezy.jpeg");
        strURL3.add("https://specials-images.forbesimg.com/imageserve/558bffb6e4b0425fd034f87e/320x486.jpg?fit=scale&background=000000");
        strURL3.add("http://media.salon.com/2015/12/justin-bieber-adult-male-fans.jpeg.jpg");
        strURL3.add("https://studybreaks.com/wp-content/uploads/2016/11/1235529-taylor-swift-woman-of-the-year-617-409.jpg");
        strURL3.add("https://cdn.theatlantic.com/assets/media/img/mt/2015/12/RTR2XQXL/lead_960.jpg?1450509814");
        strURL3.add("http://factmag-images.s3.amazonaws.com/wp-content/uploads/2013/12/beyonce-121313.jpg");
        strURL3.add("http://rihannadaily.com/uploads/monthly_2017_01/rihanna.jpg.48dda935f307fb3b7e2b193d7d6fc5aa.jpg");


        strartist3.add("Katy Perry");
        strartist3.add("Jennifer Lopez");
        strartist3.add("Bruno Mars");
        strartist3.add("Chris Brown");
        strartist3.add("Lady Gaga");
        strartist3.add("Justin Bieber");
        strartist3.add("Taylor Swift");
        strartist3.add("Adele");
        strartist3.add("Beyonce");
        strartist3.add("Rihanna");



        layoutartist = (LinearLayout) findViewById(R.id.layout_allotted_artist3);
        for (int i = 0; i < strURL3.size(); i++) {
            layoutartist.addView(addMyCourses(i, strURL3.get(i), strartist3.get(i)));
        }
    }


    private void initializeComponent4() {
        btnSeeAll = (Button) findViewById(R.id.activity_download_btn_artist4);
        btnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        strURL4 = new ArrayList<>();
        strartist4 = new ArrayList<>();

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

        strartist4.add("Badrinath ki Dulhaniya");
        strartist4.add("Kong");
        strartist4.add("Machine");
        strartist4.add("AA gaya hero");
        strartist4.add("Phillauri");
        strartist4.add("Jolley LLB2");
        strartist4.add("Naam Shabana");
        strartist4.add("Rangoon");
        strartist4.add("Commando 2");
        strartist4.add("The Gaazi Attack");



        layoutartist = (LinearLayout) findViewById(R.id.layout_allotted_artist4);
        for (int i = 0; i < strURL4.size(); i++) {
            layoutartist.addView(addMyCourses(i, strURL4.get(i), strartist4.get(i)));
        }
    }


    private void initializeComponent5() {
        btnSeeAll = (Button) findViewById(R.id.activity_download_btn_artist5);
        btnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        strURL5 = new ArrayList<>();
        strartist5 = new ArrayList<>();

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

        strartist5.add("Badrinath ki Dulhaniya");
        strartist5.add("Kong");
        strartist5.add("Machine");
        strartist5.add("AA gaya hero");
        strartist5.add("Phillauri");
        strartist5.add("Jolley LLB2");
        strartist5.add("Naam Shabana");
        strartist5.add("Rangoon");
        strartist5.add("Commando 2");
        strartist5.add("The Gaazi Attack");



        layoutartist = (LinearLayout) findViewById(R.id.layout_allotted_artist5);
        for (int i = 0; i < strURL5.size(); i++) {
            layoutartist.addView(addMyCourses(i, strURL5.get(i), strartist5.get(i)));
        }
    }
    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar_artist);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
            actionBar.setTitle("Artists");
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
        final View view = LayoutInflater.from(ArtistActivity.this).inflate(R.layout.row_artist, null);

        final LinearLayout layout_mycource = (LinearLayout) view.findViewById(R.id.layout_my_courseartist);

        TextView desc_home = (TextView) view.findViewById(R.id.row_recently_view_txt_descartist);
        desc_home.setText(home_page_desc);
        ImageView imgProfilePic = (ImageView) view.findViewById(R.id.row_recently_view_img_iconartist);
        Picasso.with(ArtistActivity.this).
                load(url).fit().error(R.mipmap.ic_launcher).placeholder(R.mipmap.ic_launcher).into(imgProfilePic);
        layout_mycource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return view;
    }

}






