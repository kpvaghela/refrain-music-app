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

public class SongAlbumsActivity extends AppCompatActivity {
    private Button btnSeeAll;
    private LinearLayout layoutSongAlbums;
    private ArrayList<String> strURL1, strSongName, strURL2, strSongName2, strURL3, strSongName3, strURL4, strSongName4, strURL5, strSongName5, strSongNameFinal;
    private ArrayList<String> strURL2Song,strURL3Song,strURL4Song,strURL5Song;
    private Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;

        setContentView(R.layout.activity_songalbum);
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


        layoutSongAlbums = (LinearLayout) findViewById(R.id.layout_allotted1);
        for (int i = 0; i < strURL2.size(); i++) {
            layoutSongAlbums.addView(addMyCourses(i, strURL2.get(i), strSongName2.get(i), strURL2Song.get(i)));
        }
    }


    private void initializeComponent3() {


        strURL3 = new ArrayList<>();
        strSongName3 = new ArrayList<>();
        strURL3Song =new ArrayList<>();
        strURL3.add("http://s2.dmcdn.net/C8f3W/1280x720-W6Q.jpg");
        strURL3.add("http://www.filmapia.com/sites/default/files/filmapia/pub/scene/scene/silsila02.jpg");
        strURL3.add("https://i.ytimg.com/vi/NbqCWwlNKrA/hqdefault.jpg");
        strURL3.add("https://i.ytimg.com/vi/IRPCMEJpQaw/hqdefault.jpg");
        strURL3.add("https://i.ytimg.com/vi/ZiQT44E9hLM/maxresdefault.jpg");
        strURL3.add("https://1.bp.blogspot.com/-_jWSXigg5Fc/V6OGBtMVPuI/AAAAAAAAMOg/5HjrNW-0FT0TfB-FowW40GMimCi5z4nfACLcB/s1600/aandhi-is-mod-se-jaate-hain%2Besmn.jpg");
        strURL3.add("https://i.ytimg.com/vi/l_q_d8zgfto/maxresdefault.jpg");
        strURL3.add("http://1.bp.blogspot.com/-Tzu1SWrmTtE/VR5BNsa2rLI/AAAAAAAABNI/Ks1wcmjSHSk/s1600/Ajeeb-Dastan-Hai-Ye%2BDil-Apna-Aur-Preet-Parai%2BRaj-Kumar%2BMeena-Kumari%2BNadira.jpg");
        strURL3.add("https://i.ytimg.com/vi/A6GexUsySdw/hqdefault.jpg");
        strURL3.add("https://s-media-cache-ak0.pinimg.com/originals/2e/9c/c9/2e9cc977cad1c406acd0b89a47698e8d.jpg");


        strSongName3.add("Apni Aankhon Mein Basa Kar - Mohammad Rafi");
        strSongName3.add("Dekha Ek Khwab-SilSila ");
        strSongName3.add("Aap ki Ankhon Mein Kuch");
        strSongName3.add("Rim Jhim Gire Saawan");
        strSongName3.add("Dil Dhoondta Hai Phir Wahi Fursat Ke Raat Din");
        strSongName3.add("Is mod se jaate hai");
        strSongName3.add("Aaj se pehle aaj se ziayadha");
        strSongName3.add("Ajeeb dastan hai yeh");
        strSongName3.add("Chand Phir Nikla");
        strSongName3.add("Lootey Koi Man Ka Nagar");

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


        layoutSongAlbums = (LinearLayout) findViewById(R.id.layout_allotted3);
        for (int i = 0; i < strURL3.size(); i++) {
            layoutSongAlbums.addView(addMyCourses(i, strURL3.get(i), strSongName3.get(i), strURL3Song.get(i)));
        }
    }


    private void initializeComponent4() {


        strURL4 = new ArrayList<>();
        strSongName4 = new ArrayList<>();
        strURL4Song =new ArrayList<>();

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


        layoutSongAlbums = (LinearLayout) findViewById(R.id.layout_allotted4);
        for (int i = 0; i < strURL4.size(); i++) {
            layoutSongAlbums.addView(addMyCourses(i, strURL4.get(i), strSongName4.get(i), strURL4Song.get(i)));
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

        layoutSongAlbums = (LinearLayout) findViewById(R.id.layout_allotted5);
        for (int i = 0; i < strURL5.size(); i++) {
            layoutSongAlbums.addView(addMyCourses(i, strURL5.get(i), strSongName5.get(i), strURL5Song.get(i)));
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

    private View addMyCourses(final int position, String url, final String home_page_desc, final String songName) {
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
                startActivity(new Intent(SongAlbumsActivity.this, SongsActivity.class).putExtra("video", songName).putExtra("name", home_page_desc));
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
                                    layoutSongAlbums = (LinearLayout) findViewById(R.id.layout_allotted);
                                    for (int i = 0; i < strURL1.size(); i++) {
                                        layoutSongAlbums.addView(addMyCourses(i, strURL1.get(i), strSongName.get(i), strSongNameFinal.get(i)));
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


