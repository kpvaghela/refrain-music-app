package com.android4dev.navigationview;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

import com.android4dev.navigationview.common.Utility;

import java.io.IOException;

/**
 * Created by kartvyasinh vaghela on 5/16/2017.
 */

public class SongsActivity extends AppCompatActivity {

    Button buttonStop, buttonStart, btnDownload;

    String AudioURL = "http://www.android-examples.com/wp-content/uploads/2016/04/Thunder-rumble.mp3";

    MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        if (TextUtils.isEmpty(getIntent().getStringExtra("video")))
            AudioURL = "http://refrain.electrotouch.in/upload/Aazaadiyan.mp3";
        else
            AudioURL = "http://refrain.electrotouch.in/upload/" + getIntent().getStringExtra("video").replaceAll(" ", "%20");

        buttonStart = (Button) findViewById(R.id.button1);
        buttonStop = (Button) findViewById(R.id.button2);
        btnDownload = (Button) findViewById(R.id.download);

        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String SDCardRoot = Environment.getExternalStorageDirectory()
                        .toString();
                Utility.downloadFile(AudioURL, getIntent().getStringExtra("name") + ".mp3",
                        SDCardRoot + "/Refrain");
            }
        });
        btnDownload = (Button) findViewById(R.id.download);

        mediaplayer = new MediaPlayer();
        mediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

        buttonStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                try {

                    mediaplayer.setDataSource(AudioURL);
                    mediaplayer.prepare();


                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SecurityException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalStateException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                mediaplayer.start();


            }
        });

        buttonStop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub


                mediaplayer.stop();


            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mediaplayer.stop();
    }


}
