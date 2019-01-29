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

public class VideoMoviesActivity extends AppCompatActivity {


    private Button btnSeeAll;
    private LinearLayout layoutMovie;
    private ArrayList<String> strURL1, strSongName, strURL2, strSongName2, strURL3, strSongName3, strURL4, strSongName4, strURL5, strSongName5, strVideoName,strVideoName2,strVideoName3,strVideoName4,strVideoName5;;
    private Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videomovie);
        context = this;
        initToolbar();
        strURL1 = new ArrayList<>();
        strSongName = new ArrayList<>();
        strVideoName = new ArrayList<>();
        videoList();

//        initializeComponent1();
        initializeComponent2();
        initializeComponent3();
        initializeComponent4();
        initializeComponent5();
    }

    private void initializeComponent1() {



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


    }

    private void initializeComponent2() {



        strURL2 = new ArrayList<>();
        strSongName2 = new ArrayList<>();
        strVideoName2 =new ArrayList<>();

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


        strVideoName2.add("29.mp4");
        strVideoName2.add("28.mp4");
        strVideoName2.add("27.mp4");
        strVideoName2.add("26.mp4");
        strVideoName2.add("30.mp4");
        strVideoName2.add("25.mp4");
        strVideoName2.add("24.mp4");
        strVideoName2.add("23.mp4");
        strVideoName2.add("22.mp4");
        strVideoName2.add("21.mp4");


        layoutMovie = (LinearLayout) findViewById(R.id.layout_allotted_movie2);
        for (int i = 0; i < strURL2.size(); i++) {
            layoutMovie.addView(addMyCourses(i, strURL2.get(i), strSongName2.get(i), strVideoName2.get(i)));
        }
    }

    private void initializeComponent3() {



        strURL3 = new ArrayList<>();
        strSongName3 = new ArrayList<>();
        strVideoName3 =new ArrayList<>();

        strURL3.add("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIALcAeAMBIgACEQEDEQH/xAAcAAABBQEBAQAAAAAAAAAAAAAFAAMEBgcCAQj/xAA6EAACAQIEBAQEAwcEAwEAAAABAgMEEQAFEiEGMUFREyJhcRQygZGhsfAHFSNCwdHhQ1KC8RYzYiT/xAAaAQADAQEBAQAAAAAAAAAAAAACAwQBBQAG/8QAKBEAAwACAwABAwQCAwAAAAAAAAECAxESITEEIkFRMmGR4TOBBRMj/9oADAMBAAIRAxEAPwCqS00hnZRawUt625fXEKWNXZtMVrsbb37dcX6jyelqII5ZqWokLX1PGbDmdvw/LAni+gp8qyCpr6WjqEmi02aTdBeRV32HMMccOcs1ahenfr/kMEty0ykTU63AHXmO3X+uOqCjh+MUzoGiXchuR98Oz6lqHhnzLK45E2PlYX2v39MGeHaZJaoAtFMDGfOm6tYsLj7DFlK4XZmPPgzZPpRqtbxVPw3w/kHw9CkkU9A7uN7xaETTt2uwv6YstNm8sucUVEY0EdRQfFMwvcNcCw9N8Fmo6ZwoeCNgilFDKDZSBcexsMd/Dwh1kEaB1XSG0i4Ha/bFqVL7nJvJjpdTp9/1/BU8k4jrMzmr6ero0hbL4ylURexm1NYL6aVB/wCQxmWY8QVea0ZnqFiUlVYLGNjt13xtWaBIIZDFGokmO+kWLHue+2Kh/wCO0a1LzGGKzXBiVNrEW6e18T5pp9F3xcuKd05/H9/yUHLEnfKanMyqf/mcCzHSNyu1+nT3+u42pqW+HEqRgOCQdzZDc7j+1+vpjYK7LEoMqZIkhFyDIpAs45b7b4yHiAU9RKy0YDg761UabHt2J/XUYQ44vRbjzxada+5CqBEFj0hdDAXRRYe33HPr9MBa4F5R4crurf7gR9/1+WJzOjKDGvkK+RiRvb+/rc7dccqhllVdVhbcWI819j9v1e+Dnpi83G10tAWopg1MJm1eIRf5Rp+a1ie+GGoUFD4wd9Xhh76fLu1rX74J1eX1boJ46WcU7FmRgh0kLzPbax+xx5k+USPVwfvOgrTRzo5i0RyESPoJT5Rcja+3S55XxTG2QZXjTf0/bX9gqppIIqKKUSkTOqtoJ53/ABFsLFg4gynKYMpqZ6WkzSOeKTw0aaJxF842JYeWwvz536EbrDUn+SPLU29ytGlUtZSxyQrUxSGwO6ykXa+x57W/ph6oNJ4YMtLBdtmX94cxqFj6WA5jfAiERV2aplUMh+KeIzbJqUKDuTuLbXN/wOG8/pDleXjMZZSaV5xCZVUOqsSADfay2vuQb2535wRgrjy0jpZc2FZOI/N8AIFnagTQoGpVzJtWkbnYMNzytgblVVBPnbTwQtFGwACs5a1vfHFRAjDU67jbl9/yxEhnFPUKw2sd74RVb6LseJT2j6IyucVOXwTA31ILn15H8cSTIqkAkAnFD4PzpqihqKKNh4ojMsZJ2BFr/wBD98BOJONkjzGGoppCHj3anfYj3/XfFy+QuCZyX8Onkcrw0ySSNpn1MAE+YttiuZ5xHl2XRsKeNJDY6j4gXTb/ALxjvGXHNVnUwFG7QrFKZPJe0h8oUm/LYHbl3vgzl3EmT5nDDloSb43wzcrH5WKqSxvcWFgST6e2MyXTX0oPF8eE92wnmfE65ik0ch1+VCbNv1sfwOxG3XFQMUk9QyU/8JiLnWh7n5tx2533vbfDWY11FUhhHLojI20qYbD0Fre/9MDZxXT04gp5wYhb/wBUp3tfnY+3ToMIX5ZbritToJ1FMYNMQnVn/wBWRFuoPbUOe3TDaGKKEopVnKWuGPuefvhjLcnpKs+GzTCRfMr2CgAc+/f8b4bqIkoG8NJPFA/1Ft09L3/tbGvvw1deoaqc6rYihhqx4MMbIsMiK6lGuCCrAje55i++IMueZnGxRZ4QAFUj4WLzgRmMBvL5gEZgA1+ftjmtU7M40qG2VSOfTf7YhSRbtr2viiHpEOWU34OZjxDmtbSSUdVWF6eRw7xiJFFxvtYC309MLA2ZRfYWthYcmQVOma3ls0+T8VR5mseulmpfAmsRqXzbWvsb39OXsC5xVXrmXDkuS5fUNJT1MkTPJPD4RhjQg7Dmx5bkKD03x1MFC8/YDDNFCkzHxVXw18zDkB35Yjj5LU60dbJ8BVfLfQBzPNKaOQrNUCPtGAWIv0/LAN84hlJUgjtqxK4Xy2kzrxpKiqEFTG4k1mUIb32IvthyfhGSszErSTM8PzTVD3sSd9j19+uB4Y03y9DeTLpOPAzw7nr0bQTwkCWLqf5gbgg/QkYn8YZCaiggziklMlPU3aNdJLKeRU26g3GAlHktPBnEdLSSu5GxBsST9PpjXc8oIaPhmiyoRytKm+mNbuXvuR7knATPrQzJeqlP1nzvVRSRtpYMrX/m2vi28AcPZ1mUNYaSmvR10Xw803UoWGoKTy+XniXxFk8VGoWSBKZy+8MTeJIevnY7Dlew+uL9+yysNHk8yurNRqVXRYExbEX9jt33viiLT6JcuNzul2V3iHh2jyvLqekYIBFEYyq7lvNcknvfGdZllLQSxfDNIGubRvfxEHPfYfh+WN54mFNMiPRxqyuLrJsdrDcXHIen44zhcnerr3kpIJWNw3xLrdBtfl5QdrdrW36nC03NPQ1JZIXL0ZyyiWmy4tPJFfSC76d9XPc8xbud7k2HQjM9Vlf+GhCW1L5QptYbEX/X5mKtRTsR4kv8TVbSpPT1PPlvvyPQ4rObuagIPBSFlA2SFY76t/8AaLj7dffHp7YVNyvBhoS0bSu6RIu243G3e1zgdU+azFAE3sQtx98SqelJjVyxS+2rSQPp+P2xEqKeeKW8lyvVhvfDZ9EZHufCA4Frjf6DCx2VJAtffHmHJkTk1GUuCebeW52+UYcrHMeX1EcB1U7qvnva2wBH3JxLengMUxkvdE6X2Y2IwGu4pnpA38N5A56g79/1zxyj6AOcGZFlcOUtJPQ08lUjeZpFDGxFx7bH74jcQZ6FiakoItFwRrZdIXfoP1zxNyBkgjqGcBAYwXJO2wt39cCa4JV1qxFFMcm6FdWx5cvp641tv0yZS8LP+y7hYGvOb1JLGMalDXuWN7X/AD+2LFxZxDHkMkcWkGtqSxDbAxxjt68v1yNcJUq0GQxNIbF7uxtbbp+A/HGdZ7BVcQcSXive7KLD5Riv/HjSXrOYv/bPTf6UCHzGlmqPDn0pG8g5KSxF+RNuexPvjRqHLBTfxaYosEqgIF3B54oma8NDLooonkIdh5bEkjfmeYtf2sDi1fswzOZ4HyXMXLSw/wASnduZU3unqV/rjMSXLTD+S3w5T4XHLctiiolgdQ8YJsr77E3tvip8YZlBRK8FMqLYWJBtv9PTF6qHEMLEWFhjF+J6sy5hLYjzEBTcW/Xvg/kNStIT8KHdun4gW7s8jGOR7vYqRbUp5X7DbYf0wO/d0UcwFiTL8o0t0XmdxcW/P64K2j0gSERxna7jzLt23NzbmSMN+BDHvojWS10aSQncsDyHoR0ufpczS2jpWkwD8KmksPDl0g+ZUP8AU4EV/UybswuA1jt74ttY+skFy2jmQbWHK5G1vbfpviq5qWD6yVJvzU8/qNvxw6fSe/0g4oGj9ybb3x7jmFbIWNySL8ri2Fh2ybSaL6tdIolaCOxI/iKw2NyBsBsORvz37Y7pquKdw9LDodEeRg/mU2Fz098e5vTJCQXj/iWGhlPzHv6/n7YGURZMwg0OqxnkzsFAB5hidhtfnjnnWCyVcqvLHSB18K4kCbE7dr++Fw94M9fuNTqCSnRdtj69b7Yez/Kp8mmWsiZ3SZrMNvKAOd+d7AduvfEPKaqOLMzMmpGYldG2rrtb3/PHjDbc+mjy3Ir3sEVUH5YqlDmKUEFQYYzJVsUUWW4A5nfpzPP+uCFVWf8AkuQ08tLMvipYTJtcMP8Aq4OM444zmfK4EyzLfEeqlHmkC7xjnsQOZv8ATFV03a0c7BjSxPl7s94m4roaSuMlbMZ6m4PhIAShHK56ff6DfEWDicQrT5pQraeA64/GO42IItfsSOtgTiiVGTT08QkqVsW3C8ziO1Y6roXZRyHbGrGvZYTy0trItL7H0y3EtNnPD8dfQNeOVbgE7qRsQexGM1zOn+NWWNEuXAZb8gL2226Hnio8G8Wvks8kFTqegnsJANzGf9wH54u1cANNTHOrwP54ZkYn09Ra23LCs/Ll2O+KoU/Sc5f4dPl6HUqp1Aa243+a/wBdrcuYvuw4indoqcUyk3uLfym25YMAeu2395fg6F8SIyMoRdF2NyLm/Lmd+t/bkMdNPHHHoYSRgtpVLnbfn1v07bg4WNAlQvhiRJJQ7r/6/E0xqx3A2Xf8/wAcVbPEbx7TEO3NtCEb/UXGLVmVYl5Skr6htrAsB6Acj36Yq9ehkjWXZApKq11F/oMOx0KzS2iAkdkWwa5HIR4WO4rvHIka3BsxFzYfTCw7ZLxTN0zTIYJ4mUIQTvdfril1eWilrGiqi9yyi9rh1sNiva4H2HriZmH7S3B0UmWp/tBmlub322XmPbA+v4ygzDK/impPCq2bQIg9ydj1tysf6YlqPui6Ka6omZvVT0k9JSspeBYwVS11by73N/Q9MAqmnFLU1EM0ZXVGXjlBINhe3oel+uLNVQz10dFJNTqJhGFeIMQEUkX3/HAeqrIn+GjqQjGAaTfqhFj69tsL2NB1NnNTTyNJE7QseRjJHa97YMZFm02aZhDDUNJIC4Gq3mG+3uPtiuVB8NtlZowdnYcxjnLphHUAI5BYEsbcudr409o0TivLqWvofDSniZtIZZES7CwFztuR6n1xjGcULUtVKrR6FB2F76fS/XGzU/EOVLlUUc7NLKYmRiOajYfW/wCNvbAxuD//ACmpnly4QPoYFg5tpBvb3+U/fFUWk+jm5MVa+vr9zG2Uo1sWngziX92TfB17saCQ+W+/hN3F+WJmdfs+zigad2pyyRMdQj82gHcfTFQqKR4Wsw3HPblhrc39LEqcmJ8ka9WXgl8SKYpq/nUWv+B5/TAvNcxkWQLru6gjWGPLbpftb7YrfCXEBhC5ZXm8B2jY/wApPT2OLBXUah9ZJN979cQ3Lh6Z08VzknkgeJvFRYCgQHd3Z7X/AFbETN/JAId2vaxNyOXMfT9c8E6Sm1TamTWb281uf4WwxmNE0tSQPk6MGuHPK1wNjty/6xsvvoO9aKxThxOCpA1Ajlf8LYWCVVTeGsgUMoJAKypYjt779u45YWKfSFzoiSlql2lQM7sdwqX0m+wFsaHwhwTLrXMM3TStg8dOLgA22bfrvfF9yDhvKeGcmggdkadVBklewLt/a/IYjZvGtXe2YMkKizRROPmv9/S18Bf0rQyKVvorHEdbOZaj4GJEPkiWUsDqXrt2G/PFUljeSpieRgHiYrqIvqFiRf6jFwq8mysr4TSTBxJr1M53J5C52t6YZbhbKwrSFpi5vp851An6788TFiKWaacZQJ5PKrPbfoMC2uzDe/riyZ1TzMIaCn8Wd/5gi6icDmyurhiZpaKpQAc2ha2/ra3XGrw1oHtI8QFntbnjUeCuJ6PJYnefzK0fmCkXuDt9OeMskDg3K7jrhrWbW1FR2Bwc7T2hWRKk4rw2PO+Olr3YZDEgcIQ4qY7mUf8AyAem/vf3xl1XWrJIUzaHxA5JaeJQr/VdgfwwzQVDFgpO43vgnxDTfE5bT16+Z5dSSj/7Ujf6gqfcnHndOuwFjmI1ICzPJGFOtbSCOeBraZIySrACxv2N7bHcYL8N5yxhXLq43kQeRieY7H6YFcKZt+6M+p/imJy+WQR1cV/KUO2r3F739MHM9ylqLNJo1VWkpWKNdOx+YfT8Bh+RbnTJ8L1e5/2HqaNEsAdIvc3ta19zy35fTe9uvVTTxmnkkCouwYNqBUjqSOnvcg/XELLsxT4RZHZ18w1+ENYQ97DcHly9OfLEipnjdtCVPhyC6oSQDfmPLfv0B+m5smJKbpFZzSlqZSANJjD3ZgxOnYC9yNuW/O98LE1oSGYGJQEJJWMaQh5G222zW9gL9DhYY60LUJ9m1V2W5dUI880YcSgE6xcHlb6dcV3MMnoZYoxCirpk8XSNvN6974PSSxsrRneM359AeYxBnoaR9cgOhmK3YMbm3LA3p+A4eU+sp2a5VLJUSSeNVRqAAAktrb/UH6jrtjxS9NGiSVcko5arbm/p1t6YO5jTompxWPYD5Cw0/wB8Z9nDQSXaGcugv5kf5fqOX+MILfUaHOlTl+WJUZRTSVcrNqMSKSZRYkXNxv6b/YDFMyLjG9bJ49LMK1tbrI9iSdJvqHS23ftiLl/GTvB8LNJLDUBvEFRGGk8QqDpBUWIHQ2B5nptjpoqXiiKqqvgaBJo/mEEgXUe5GxN+9unvilrXqOfPb+p9kzirMoXydKeKAK0k+tn0DmF3IJOKRo1bdu+LBxPw1leU0ENTl07SVYfw6qIx7KbbFTzINiP1vXgbW3262wNIfiex6CQmrDsbk8zi7ZfRfF8L5xHbemaKpQDruyvt7EfbFDBKyA9b3xs/7L6WOSWdpQGElOUKnkwNrg4CVu0vyblrjjdfgy7JOCK/PquWZongy6NWL1LobEgcl7m/9cWbi8FOJswU6dcZW97G5Ki/9cbTPQ0NNliwugSkp0vpDEABd97c8YLX1ZzLPK+uI0ieUm3O2GZ54ykxHxMiyXVJaQOrC1Mvj0xKn5bFgPufYsPriAlWsVUVkRHaEkK+rUtjs2r2B/DByKNJJPDl0adNwJRtsCex7Yr1ZTtCsUzRmFZLMVJ1bg7C365Y3E1SCzJyw1FOq0NS0jFZiG5i5DOyke5AK/8Ad8LFerq7VAVYnWQoI1WNwBz67AAX9MLDFDYDzJdGk5PxzBVARVIeOQ8zba9z29LYl1+eGMi0jb7rZjvivRZBTLDG0sepgPN4ZYXPcWNx9Ol8TY6DIWpRZZ5D8x8OWTe/L22OJePLtFVZFHTIubZ3BJG50xPr5kCz+hv0xV56xEqYpA1kEi7ub7ahck+2LlScO5BVuy1dLVPKxuoEzrZfYd/XBWPgjLYFmemoljPIfFq8yAA9yCNV7bjblseWGRjXrE5Pk+pIflanrpJcv8O9K+lVmicDUrG1tS9xcbd8VzIuEZOH83GY1TzywRBygWFtOk+UhibE8yOQ3F+mDWXiDKKqVylNTOTY+Ny1bXUcyoAIYkDkCSMHKnOZpMvy+aqiRUmiYTiS7NE1xZSNNizAlhqtyPbDUmSvIU39p2d0U9HHRRohr5HVnIa5WJRcA7bb/wBcZ6s402PTrjVaPIaWtqZWhoaNVd9beJCXUllBGnY7lT/g8sQc04JyimSR1y6qEYsTK0zrYHuD29BbGUloPHbnozsEMpaxIHUdMafwBxFBQSRSS7INnud7frfEJeH+FRStJDSVLXFwzTyadud7fhgFmUOV5cpeFSjMp0Rl3uT6AnC+L3uR6yTUuaNm4uziOq4dkTLJkl+JGlXQ3Fr4yyShWlYrIwuvbe5wI4fzGpM4BmZDfcA8/wC+NnybKspzrLUqPh0Eo8sijoef2P8AjGNVmv8Ac9PD4mP9jJjHdwrA/NcEi9j+vyx3Nlt4y0I8wbWbHbboe4vbf740fNOGKSFgyKFS/m2vYYCT00NMkkJsw8tjyIuTyP2wCVQxvOM09GQZnRGOrlV42WVmuFYW1dwPXcc8LFlzylgeQyzDXubea23Mg97XA9h9B7ilZVomr4730ywRVCqlhYemG5ZBJJZmi0nYlluwPK17/nhZe61WRwSNA8gZXYGNSGazNyIjPt832wEqa2KVXal1aBuqsQxt2vbfEunJXtZNot2X5PJQTR1kUkdo2VgVuStrcxc9vX8cEKbNsyOWVNNXPHVOy313spNxa255eY3H+30xU8h4qjpEgpDSI4ksI5LKAo7crjnba99vfE3xpK+uYxyRwzSjS138igXvaw2Btc9DY4olkGSG39SOK+qp3qpqcziOqnVjEvIRjSwFz679N9vbDc71EHws2ZZhUz0MqMyFpfLshVSLb/zAeYndhgRwzHDJm08Gb0vxFVTyEmcysGLhrb797EHBl4surKfLJDFUSJVU+p0eo1fDbBguwBbUVB58wD2sfJa7CrC5pJdhXhis0VUNUoUxNLcXYDQAGUketyDc8rYcravM88WopKioWKOoCl4mFlQghtjcncjoPyxV6B6h6isko4YaCGnsghErMNRuBcndidJvy22w/TV60qyTqWdYmAUFwZBcgBVBsP5idj3wKraNy4FF9EzN6H920c0lU1OqKvkbSb36AHV1JI2HXFOM5zCpMtURttpA2AwQz+olzmdauSJY0iTRElhqA3uSQAL79PTAqKGSMm4sSPltv+v74TVLWkU4sb6dEoLHT6ZUJDA8vfbGkfs+z6Okqlhlk0086hWY9GF9J/MfXGVyFhJcWYDvibl9ZJC17sS3bC5blpjckLJLln0LmbDwCNieYv164zTiaSUTIlmXXHY7Hfe+Hsp408OlFLWgSadkcbsB2PccsQ8yzumzGZEplSVr7oxIAH2vhmXIr8EfHw1j6ZV6+hqamVI08R3YhWjFyWJ2H1P9sLGoZPRUlNRislRTUsCVZh8vTb3H4YWPJ6XoTXJ9IzXI24abhyBq+ozA15jl/g04mIvqYLbSNPIKfqSelh2e19BU1CHJcrqqGmjjERSWIglgTu253sVub4l8M108mT0UMUPERMCs5NHTRNG6hiSAzG53I/K3Ui2zLjKld2AzGNJ2LgSUw1MAQtyNO3QYsrGmtHNj5FKtkCRpIwqyIwIJK61IB7+/TDtHmdVS1cc3iyTKj30l73779yMdZ0/EE0tOmcU9V4oaTwUeG172LaQBuOXfESty+sy+NP3hSzUzy3KCTYm2x8v1GF8dD/8As5rsvtLDRR18+a1FbBBFVRKVJbylgfKx2tY6b274aaqoly/L6Zc0ovFpadEeRJrFmChRpPa4PO2xGAGRZ7FSwvl2Yrry6Ug8gfCub2PpffbcHcYOQpwrkFO2YJmP7wq7j4WBdLG21zYHpv5ja1jYXwOn5oPlH6qemhjMKr4DLqiKKoU1MszSM8a/L5rnY8iAAP8AkbE4DwiTw7vIx0fKpO1z6DDWY5i+YF6iVVVnsNI3Cre9h+Pve+GIqshvKvl62wqm/EUQku79CFLI7yatXlvp3/X6tiZWrGsh8IC3XSP1ywHWqVEKR8xzOOVrCgILXXlv0H+cK4sdyRKjiErHQPUjHh0xEX27Y5hnVHYx6gbAAHDFTVoTzAPPcjlj3Fm8kOySh0JTXfqRg9wnSkTeJMpN9ztsBiJw5n3wNGlKs6qTKWsaXV4VyFLBgf8AYX+1uuLDHxM8BWWSoDFomD6oRY+XYC21ri3T+zKhSkhE5apvSDtZmEiqV3jRdiSOXphYq+a8SRTUdRFHWvMzmMj+BpDWte59LfjhYW1+Bs3+UZ7Q5pRU1GqeHmPxAQgtHWaEvvaygctx16YemzXLnOtUzcyhSA7197b8+X6sMLCx1WfOpDrZrlMgjMsObyyR/LI9dci/O2230x6cyyycxfFwZnLpUAlq0MeXS67C9j/jCwsCxsHHj5KWLmirSg+VfiVufc6fytjl58naQGOkr1U/NeoTUT0sdO3+B63WFgN9DX6SJKrKWYLHRVqLqJcGoUm3QA6dh9+WJNJnWX0LO1DBmMLOtiVqU6f8OWPMLA9DXvXpLPFUMi/xUzFlVht8Su/Q38uGpuJ0lhiErZj4i316ZYwpO41AaNj5m25cse4WNBfg4vF6iZHvmZH+pepTfY8vL7c+2Gp+KafUzwDM0kZgTeWIjaw6oeg9uWPcLGoBjlFxWi6ndszZ2K3czxXsCTa2i3U4UnF8RiMLx17ILaP/ANCXFiCL+W3MA4WFgdJsYm1IMzXiZKugenUVt2dSBLMrIoHQAAYWFhYZxRO8tp+n/9k=");
        strURL3.add("https://i.ytimg.com/vi/BSTSUlIhIns/hqdefault.jpg");
        strURL3.add("https://i0.wp.com/www.moviescut.com/wp-content/uploads/2017/02/Poorna-Movie-Poster-India-Release-2017.jpg");
        strURL3.add("http://data1.ibtimes.co.in/en/full/632439/vijay-bairavaa.jpg");
        strURL3.add("http://www.tollywood.net/Topstoriespics/khaidi-no-150-trailer-chiru-rules-supreme.gif");
        strURL3.add("https://c.saavncdn.com/258/Katamarayudu-FA-Telugu-2017-500x500.jpg");
        strURL3.add("https://images-na.ssl-images-amazon.com/images/M/MV5BYTM5Njc4MDktM2NjOC00M2E3LTkwYzgtMDdjMGNhMDE2OWMxL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMjM1NjkwMDI@._V1_.jpg");
        strURL3.add("https://upload.wikimedia.org/wikipedia/en/thumb/b/b3/RangoonPoster.jpg/220px-RangoonPoster.jpg");
        strURL3.add("http://vipsongspk.net/wp-content/uploads/2016/11/Commando-2-Comando-2017-Hindi-Movie-Mp3-Songs-Download.jpg");
        strURL3.add("https://upload.wikimedia.org/wikipedia/en/e/e7/The_Ghazi_Attack_Poster.jpg");

        strSongName3.add("Si3");
        strSongName3.add("Reloaded");
        strSongName3.add("Poorna");
        strSongName3.add("Bairavaa");
        strSongName3.add("Khiladi No.150");
        strSongName3.add("Katamarayudu");
        strSongName3.add("Naam Shabana");
        strSongName3.add("Rangoon");
        strSongName3.add("Commando 2");
        strSongName3.add("The Gaazi Attack");


        strVideoName3.add("31.3gpp");
        strVideoName3.add("31.3gpp");
        strVideoName3.add("32.3gp");
        strVideoName3.add("32.3gp");
        strVideoName3.add("21.mp4");
        strVideoName3.add("22.mp4");
        strVideoName3.add("23.mp4");
        strVideoName3.add("24.mp4");
        strVideoName3.add("25.mp4");
        strVideoName3.add("26.mp4");


        layoutMovie = (LinearLayout) findViewById(R.id.layout_allotted_movie3);
        for (int i = 0; i < strURL3.size(); i++) {
            layoutMovie.addView(addMyCourses(i, strURL3.get(i), strSongName3.get(i), strVideoName3.get(i)));
        }
    }


    private void initializeComponent4() {



        strURL4 = new ArrayList<>();
        strSongName4 = new ArrayList<>();
        strVideoName4 =new ArrayList<>();

        strURL4.add("https://media.licdn.com/mpr/mpr/AAEAAQAAAAAAAAsqAAAAJGFmZmY5YTgyLTMzZGItNDg5Ny1hYTYwLWU4NzViOTZmOTBlYQ.jpg");
        strURL4.add("https://i.ytimg.com/vi/h9y6oPka3us/maxresdefault.jpg");
        strURL4.add("https://images-na.ssl-images-amazon.com/images/M/MV5BMjMxODI2NDM5Nl5BMl5BanBnXkFtZTgwNjgzOTk1MTI@._V1_UX182_CR0,0,182,268_AL_.jpg");
        strURL4.add("https://i.ytimg.com/vi/gUFgJ8f9slo/maxresdefault.jpg");
        strURL4.add("http://cdn-static.denofgeek.com/sites/denofgeek/files/styles/main_wide/public/2017/02/rings_ukquad_feb3_l.jpg?itok=lNR4wUhU");
        strURL4.add("http://operationkino.net/wp-content/uploads/2017/02/trite-hiksa-otnovo-v-igrata-bg-poster-790x1119.jpg");
        strURL4.add("https://upload.wikimedia.org/wikipedia/en/a/a2/The_Mummy_%282017%29.jpg");
        strURL4.add("https://pisces.bbystatic.com/image2/BestBuy_US/images/products/1525/1525177_sa.jpg");
        strURL4.add("https://images-na.ssl-images-amazon.com/images/M/MV5BMTUxMTYzMzEwMl5BMl5BanBnXkFtZTgwNzYyNzU2MTI@._CR303,165,821,821_UX402_UY402._SY201_SX201_AL_.jpg");
        strURL4.add("https://www.flickeringmyth.com/wp-content/uploads/2017/03/ghost-in-the-shell-600x450.jpg");

        strSongName4.add("Logan");
        strSongName4.add("Kong");
        strSongName4.add("FF8");
        strSongName4.add("Baywatch");
        strSongName4.add("Rings");
        strSongName4.add("XXX");
        strSongName4.add("Mummy");
        strSongName4.add("Jhon Wick");
        strSongName4.add("Wonder women");
        strSongName4.add("Ghost");


        strVideoName4.add("31.3gpp");
        strVideoName4.add("31.3gpp");
        strVideoName4.add("32.3gp");
        strVideoName4.add("32.3gp");
        strVideoName4.add("21.mp4");
        strVideoName4.add("22.mp4");
        strVideoName4.add("23.mp4");
        strVideoName4.add("24.mp4");
        strVideoName4.add("25.mp4");
        strVideoName4.add("26.mp4");


        layoutMovie = (LinearLayout) findViewById(R.id.layout_allotted_movie4);
        for (int i = 0; i < strURL4.size(); i++) {
            layoutMovie.addView(addMyCourses(i, strURL4.get(i), strSongName4.get(i), strVideoName4.get(i)));
        }
    }


    private void initializeComponent5() {



        strURL5 = new ArrayList<>();
        strSongName5 = new ArrayList<>();
        strVideoName5 =new ArrayList<>();

        strURL5.add("http://s2.dmcdn.net/C8f3W/1280x720-W6Q.jpg");
        strURL5.add("http://www.filmapia.com/sites/default/files/filmapia/pub/scene/scene/silsila02.jpg");
        strURL5.add("https://i.ytimg.com/vi/NbqCWwlNKrA/hqdefault.jpg");
        strURL5.add("https://i.ytimg.com/vi/IRPCMEJpQaw/hqdefault.jpg");
        strURL5.add("https://i.ytimg.com/vi/ZiQT44E9hLM/maxresdefault.jpg");
        strURL5.add("https://1.bp.blogspot.com/-_jWSXigg5Fc/V6OGBtMVPuI/AAAAAAAAMOg/5HjrNW-0FT0TfB-FowW40GMimCi5z4nfACLcB/s1600/aandhi-is-mod-se-jaate-hain%2Besmn.jpg");
        strURL5.add("https://i.ytimg.com/vi/l_q_d8zgfto/maxresdefault.jpg");
        strURL5.add("http://1.bp.blogspot.com/-Tzu1SWrmTtE/VR5BNsa2rLI/AAAAAAAABNI/Ks1wcmjSHSk/s1600/Ajeeb-Dastan-Hai-Ye%2BDil-Apna-Aur-Preet-Parai%2BRaj-Kumar%2BMeena-Kumari%2BNadira.jpg");
        strURL5.add("https://i.ytimg.com/vi/A6GexUsySdw/hqdefault.jpg");
        strURL5.add("https://s-media-cache-ak0.pinimg.com/originals/2e/9c/c9/2e9cc977cad1c406acd0b89a47698e8d.jpg");

        strSongName5.add("Sil Sila");
        strSongName5.add("Dulari");
        strSongName5.add("Awara");
        strSongName5.add("Shree 420");
        strSongName5.add("Mother india");
        strSongName5.add("Pyasa");
        strSongName5.add("Nadiya ke paar");
        strSongName5.add("Sangam");
        strSongName5.add("Guide");
        strSongName5.add("Waqt");

        strVideoName5.add("31.3gpp");
        strVideoName5.add("31.3gpp");
        strVideoName5.add("32.3gp");
        strVideoName5.add("32.3gp");
        strVideoName5.add("21.mp4");
        strVideoName5.add("22.mp4");
        strVideoName5.add("23.mp4");
        strVideoName5.add("24.mp4");
        strVideoName5.add("25.mp4");
        strVideoName5.add("26.mp4");

        layoutMovie = (LinearLayout) findViewById(R.id.layout_allotted_movie5);
        for (int i = 0; i < strURL5.size(); i++) {
            layoutMovie.addView(addMyCourses(i, strURL5.get(i), strSongName5.get(i), strVideoName5.get(i)));
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

    private View addMyCourses(final int position, String url, final String home_page_desc, final String videoName) {
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
                startActivity(new Intent(VideoMoviesActivity.this, VideoViewActivity.class).putExtra("video", videoName));
            }
        });
        return view;
    }

    private void videoList() {

        // Tag used to cancel the request
        String tag_json_obj = "json_login_req";
        final ProgressDialog pbDialog = new ProgressDialog(context);
        pbDialog.setMessage("Loading Data...");
        pbDialog.setCancelable(true);
        pbDialog.show();
        //mPbLoading.setVisibility(View.VISIBLE);
        final StringRequest jsonObjReq = new StringRequest(Request.Method.POST,
                "http://refrain.electrotouch.in/json_video.php",
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        if (Utility.isNotNull(response)) {
                            JSONObject jsonResponse;

                            try {
                                jsonResponse = new JSONObject(response);


                                if (1 == jsonResponse.optInt("success")) {
                                    pbDialog.dismiss();
                                    JSONArray jsonLoginData = jsonResponse.optJSONArray("video");
                                    for (int i = 0; i < jsonLoginData.length(); i++) {
                                        JSONObject jsonObject = jsonLoginData.optJSONObject(i);
                                        strURL1.add("http://refrain.electrotouch.in/upload/" + jsonObject.optString("selectbannerforvideo"));
                                        strSongName.add(jsonObject.optString("uploadvideoname"));
                                        strVideoName.add(jsonObject.optString("selectvideo"));
                                    }
                                    layoutMovie = (LinearLayout) findViewById(R.id.layout_allotted_movie1);
                                    for (int i = 0; i < strURL1.size(); i++) {
                                        layoutMovie.addView(addMyCourses(i, strURL1.get(i), strSongName.get(i), strVideoName.get(i)));
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