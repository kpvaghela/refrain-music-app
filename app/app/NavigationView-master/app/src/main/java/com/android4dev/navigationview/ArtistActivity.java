package com.android4dev.navigationview;

import android.app.ProgressDialog;
import android.content.Context;
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

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android4dev.navigationview.common.Analytics;
import com.android4dev.navigationview.common.AppResources;
import com.android4dev.navigationview.common.Utility;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kartvyasinh vaghela on 3/18/2017.
 */

public class ArtistActivity extends AppCompatActivity {

    private Button btnSeeAll;
    private LinearLayout layoutArtist;
    private ArrayList<String> strURL1, strSongName, strURL2, strSongName2, strURL3, strSongName3, strURL4, strSongName4, strURL5, strSongName5, strSongNameFinal;
    private ArrayList<String> strURL2Song,strURL3Song,strURL4Song,strURL5Song;
    private Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;

        setContentView(R.layout.activity_artist);
        initToolbar();
        strSongNameFinal = new ArrayList<>();
        strURL1 = new ArrayList<>();
        strSongName = new ArrayList<>();
        /*initializeComponent1();*/
        songList();

        initializeComponent2();
        initializeComponent3();
        initializeComponent4();
        initializeComponent5();
    }

    private void initializeComponent1() {

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


    }

    private void initializeComponent2() {


        strURL2 = new ArrayList<>();
        strSongName2 = new ArrayList<>();
        strURL2Song =new ArrayList<>();

        strURL2.add("http://images.desimartini.com/media/uploads/atif-star.jpg");
        strURL2.add("https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Mohit_Chauhan_at_the_59th_Idea_Filmfare_Awards.jpg/220px-Mohit_Chauhan_at_the_59th_Idea_Filmfare_Awards.jpg");
        strURL2.add("http://image3.mouthshut.com/images/imagesp/925733114s.jpg");
        strURL2.add("http://static.dnaindia.com/sites/default/files/2015/04/15/315191-kanika-kapoor-fb.jpg");
        strURL2.add("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Ankit_Tiwari_Filmfare.jpg/220px-Ankit_Tiwari_Filmfare.jpg");
        strURL2.add("http://www.partyowl.in/images/artist/62654981.jpg");
        strURL2.add("https://upload.wikimedia.org/wikipedia/commons/5/53/Shreya_Ghoshal_at_Carvaan-E-Ghazal.jpg");
        strURL2.add("http://timesofindia.indiatimes.com/thumb/msid-34637857,width-400,resizemode-4/34637857.jpg");
        strURL2.add("http://movies.dosthana.com/sites/default/files/image-gallery/Divya%20Kumar-Hot-Stills.jpg");
        strURL2.add("http://www.ticketline.co.uk/images/artist/ustad-rahat-fateh-ali-khan/ustad-rahat-fateh-ali-khan.jpg");

        strSongName2.add("Atif Aslam");
        strSongName2.add("Mohit Chauhan");
        strSongName2.add("ARIJIT SINGH");
        strSongName2.add("KANIKA KAPOOR");
        strSongName2.add("ANKIT TIWARI");
        strSongName2.add("NEHA KAKKAR");
        strSongName2.add(" SHREYA GHOSHAL");
        strSongName2.add("YO YO HONEY SINGH");
        strSongName2.add("DIVYA KUMAR");
        strSongName2.add("RAHAT FATEH ALI KHAN");


        strURL2Song.add("1.mp3");
        strURL2Song.add("2.mp3");
        strURL2Song.add("3.mp3");
        strURL2Song.add("4.mp3");
        strURL2Song.add("5.mp3");
        strURL2Song.add("6.mp3");
        strURL2Song.add("7.mp3");
        strURL2Song.add("9.mp3");
        strURL2Song.add("10.mp3");
        strURL2Song.add("10.mp3");


        layoutArtist = (LinearLayout) findViewById(R.id.layout_allotted_artist1);
        for (int i = 0; i < strURL2.size(); i++) {
            layoutArtist.addView(addMyCourses(i, strURL2.get(i), strSongName2.get(i), strURL2Song.get(i)));
        }
    }


    private void initializeComponent3() {


        strURL3 = new ArrayList<>();
        strSongName3 = new ArrayList<>();
        strURL3Song =new ArrayList<>();

        strURL3.add("http://photos.filmibeat.com/ph-big/2011/09/131599589433825.jpg");
        strURL3.add("http://images.indianexpress.com/2015/12/shankarmahadevan759.jpg");
        strURL3.add("http://pakhungama.com/pakhungama.com/wp-content/uploads/2016/03/Alka-Yagnik-Superhit-Songs-Mp3-Download.jpg");
        strURL3.add("http://www.bollykings.com/wp-content/uploads//2011/05/shaan.jpg");
        strURL3.add("https://bollyspice.com/wp-content/uploads/2014/05/14may_ARRahman.jpg");
        strURL3.add("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/Sunidhi_Chauhan_Voice_India.jpg/220px-Sunidhi_Chauhan_Voice_India.jpg");
        strURL3.add("http://s.saregama.com/image/c/m/7/dd/77/kumar-sanu_1410255411.jpg");
        strURL3.add("https://bro4u.com/blog/wp-content/uploads/2015/07/sonu11.jpg");
        strURL3.add("https://upload.wikimedia.org/wikipedia/commons/b/bb/KK_(124).jpg");
        strURL3.add("http://c.saavncdn.com/artists/Sukhwinder_Singh.jpg");


        strSongName3.add("Himesh Reshmiya");
        strSongName3.add("Shanker");
        strSongName3.add("Alka Yagnik");
        strSongName3.add("Shan");
        strSongName3.add("A.R.Rahman");
        strSongName3.add("Sunidhi Chauhan");
        strSongName3.add("Kumar shanu");
        strSongName3.add("Sonu Nigam");
        strSongName3.add("KK");
        strSongName3.add("Sukhvinder singh");

        strURL3Song.add("11.mp3");
        strURL3Song.add("12.mp3");
        strURL3Song.add("13.mp3");
        strURL3Song.add("14.mp3");
        strURL3Song.add("15.mp3");
        strURL3Song.add("16.mp3");
        strURL3Song.add("17.mp3");
        strURL3Song.add("18.mp3");
        strURL3Song.add("19.mp3");
        strURL3Song.add("20.mp3");


        layoutArtist = (LinearLayout) findViewById(R.id.layout_allotted_artist2);
        for (int i = 0; i < strURL3.size(); i++) {
            layoutArtist.addView(addMyCourses(i, strURL3.get(i), strSongName3.get(i), strURL3Song.get(i)));
        }
    }


    private void initializeComponent4() {


        strURL4 = new ArrayList<>();
        strSongName4 = new ArrayList<>();
        strURL4Song =new ArrayList<>();

        strURL4.add("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Katy_Perry_-_Part_Of_Me_Australian_Premiere_-_June_2012_%283%29_%28headshot%29.jpg/220px-Katy_Perry_-_Part_Of_Me_Australian_Premiere_-_June_2012_%283%29_%28headshot%29.jpg");
        strURL4.add("http://hookedoneverything.com/wp-content/uploads/2015/12/MTE4MDAzNDEwNzQ4NjA1OTY2.jpg");
        strURL4.add("http://www.rap-up.com/app/uploads/2014/12/bruno-mars.jpg");
        strURL4.add("http://70mack.co/wp-content/uploads/2017/03/Chris-Breezy.jpeg");
        strURL4.add("https://specials-images.forbesimg.com/imageserve/558bffb6e4b0425fd034f87e/320x486.jpg?fit=scale&background=000000");
        strURL4.add("http://media.salon.com/2015/12/justin-bieber-adult-male-fans.jpeg.jpg");
        strURL4.add("https://studybreaks.com/wp-content/uploads/2016/11/1235529-taylor-swift-woman-of-the-year-617-409.jpg");
        strURL4.add("https://cdn.theatlantic.com/assets/media/img/mt/2015/12/RTR2XQXL/lead_960.jpg?1450509814");
        strURL4.add("http://factmag-images.s3.amazonaws.com/wp-content/uploads/2013/12/beyonce-121313.jpg");
        strURL4.add("http://rihannadaily.com/uploads/monthly_2017_01/rihanna.jpg.48dda935f307fb3b7e2b193d7d6fc5aa.jpg");

        strSongName4.add("Katy Perry");
        strSongName4.add("Jennifer Lopez");
        strSongName4.add("Bruno Mars");
        strSongName4.add("Chris Brown");
        strSongName4.add("Lady Gaga");
        strSongName4.add("Justin Bieber");
        strSongName4.add("Taylor Swift");
        strSongName4.add("Adele");
        strSongName4.add("Beyonce");
        strSongName4.add("Rihanna");


        strURL4Song.add("1.mp3");
        strURL4Song.add("2.mp3");
        strURL4Song.add("3.mp3");
        strURL4Song.add("4.mp3");
        strURL4Song.add("5.mp3");
        strURL4Song.add("6.mp3");
        strURL4Song.add("7.mp3");
        strURL4Song.add("9.mp3");
        strURL4Song.add("10.mp3");
        strURL4Song.add("10.mp3");


        layoutArtist = (LinearLayout) findViewById(R.id.layout_allotted_artist3);
        for (int i = 0; i < strURL4.size(); i++) {
            layoutArtist.addView(addMyCourses(i, strURL4.get(i), strSongName4.get(i), strURL4Song.get(i)));
        }
    }


    private void initializeComponent5() {


        strURL5 = new ArrayList<>();
        strSongName5 = new ArrayList<>();
        strURL5Song =new ArrayList<>();

        strURL5.add("https://i.ytimg.com/vi/Bme-XHo-AA4/movieposter.jpg");
        strURL5.add("https://4.bp.blogspot.com/-EO12uJT1jvQ/WL1qwzJGpKI/AAAAAAAAE3o/z87EpyJdf3EvS0Fe0JyMKA92AJGBPe0mwCLcB/s450/cheez-badi-machine.jpg");
        strURL5.add("http://images.hearthis.at/1/4/8/_/uploads/2286231/image_track/1237305/tamma-tamma-again-bkd-domestik-dew-amp-dj-sam-club-mix----w520_h520_q70_m1488715677----1488715677.jpg");
        strURL5.add("http://www.ursongspk.com/wp-content/uploads/naughty-billo-phillauri-300x300.jpg");
        strURL5.add("https://i.ytimg.com/vi/jIqRbFQl-ds/mqdefault.jpg");
        strURL5.add("http://cover.mp3mad.net/orignal/52419/Uff%20Yeh%20Noor%20Armaan%20Malik.jpg");
        strURL5.add("https://2.bp.blogspot.com/-93av-ppE_L8/WJgZQkb8GOI/AAAAAAAAFKg/l3vN8uKNqt8tykl1VMJPJi7SeQ-uLk3VgCLcB/s1600/Phillauri.jpg");
        strURL5.add("http://best-newmovies.net/wp-content/uploads/2016/03/Bigfoot-Vs.-Zombies-2016-HDRip-423x600.jpg");
        strURL5.add("http://www.clickmaza.com/wp-content/uploads/2017/03/Pop-the-Bottle-Vishal-Badshah-Vishal-Dadlani-Akasa-Singh-Shekhar-Free-Download-Audio-Mp3-Song-2017.jpg");
        strURL5.add("https://upload.wikimedia.org/wikipedia/en/thumb/8/88/Badrinath_ki_Dulhania.jpg/220px-Badrinath_ki_Dulhania.jpg");



        strSongName5.add("cheeze badi");
        strSongName5.add("tamma tamma");
        strSongName5.add("naughty billow");
        strSongName5.add("humsafar");
        strSongName5.add("sahiba");
        strSongName5.add("Uff yeh noor");
        strSongName5.add("dum dum ");
        strSongName5.add("pop the bottle");
        strSongName5.add("Badri ki dulhania");
        strSongName5.add("yunhi");


        strURL5Song.add("1.mp3");
        strURL5Song.add("12.mp3");
        strURL5Song.add("3.mp3");
        strURL5Song.add("14.mp3");
        strURL5Song.add("5.mp3");
        strURL5Song.add("16.mp3");
        strURL5Song.add("7.mp3");
        strURL5Song.add("18.mp3");
        strURL5Song.add("9.mp3");
        strURL5Song.add("10.mp3");

        layoutArtist = (LinearLayout) findViewById(R.id.layout_allotted_artist4);
        for (int i = 0; i < strURL5.size(); i++) {
            layoutArtist.addView(addMyCourses(i, strURL5.get(i), strSongName5.get(i), strURL5Song.get(i)));
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

    private View addMyCourses(final int position, String url, final String home_page_desc, final String songName) {
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
                startActivity(new Intent(ArtistActivity.this, SongsActivity.class).putExtra("video", songName).putExtra("name", home_page_desc));
            }
        });
        return view;
    }

    private void songList() {

        // Tag used to cancel the request
        String tag_json_obj = "json_login_req";
        final ProgressDialog pbDialog = new ProgressDialog(context);
        pbDialog.setMessage("Loading Data...");
        pbDialog.setCancelable(true);
        pbDialog.show();
        //mPbLoading.setVisibility(View.VISIBLE);
        final StringRequest jsonObjReq = new StringRequest(Request.Method.POST,
                "http://refrain.electrotouch.in/json_song.php",
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        if (Utility.isNotNull(response)) {
                            JSONObject jsonResponse;

                            try {
                                jsonResponse = new JSONObject(response);


                                if (1 == jsonResponse.optInt("success")) {
                                    pbDialog.dismiss();
                                    JSONArray jsonLoginData = jsonResponse.optJSONArray("song");
                                    for (int i = 0; i < jsonLoginData.length(); i++) {
                                        JSONObject jsonObject = jsonLoginData.optJSONObject(i);
                                        strURL1.add("http://refrain.electrotouch.in/upload/" + jsonObject.optString("banner"));
                                        strSongName.add(jsonObject.optString("songname"));
                                        strSongNameFinal.add(jsonObject.optString("selectsong"));
                                    }
                                    layoutArtist = (LinearLayout) findViewById(R.id.layout_allotted_artist5);
                                    for (int i = 0; i < strURL1.size(); i++) {
                                        layoutArtist.addView(addMyCourses(i, strURL1.get(i), strSongName.get(i), strSongNameFinal.get(i)));
                                    }
                                } else {
                                    Utility.alertDialogShow(context, jsonResponse.optString("message"));
                                    pbDialog.dismiss();
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Utility.alertDialogShow(context, "Your Number is not valid for verification.");
                pbDialog.dismiss();
            }


        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();

                return params;
            }
        };

        jsonObjReq.setRetryPolicy(new DefaultRetryPolicy(AppResources.CONNECTION_TIMEOUT, DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));

        // Adding request to request queue
        Analytics.getInstance().addToRequestQueue(jsonObjReq, tag_json_obj);

    }
}


