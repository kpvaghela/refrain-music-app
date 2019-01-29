package com.android4dev.navigationview;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android4dev.navigationview.fragment.HomeFragment;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    //Defining Variables
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private CircleImageView imgProfilec;
    private TextView txtName, txtEmail;
    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing Toolbar and setting it as the actionbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imgProfilec = (CircleImageView) findViewById(R.id.profile_image);
        txtName = (TextView) findViewById(R.id.username);
        txtEmail = (TextView) findViewById(R.id.email);

        txtName.setText(getIntent().getStringExtra("name"));
        txtEmail.setText(getIntent().getStringExtra("email"));

        Picasso.with(this)
                .load(getIntent().getStringExtra("image"))
                .fit()
                .centerCrop()
                .into(imgProfilec, new Callback() {
                    @Override
                    public void onSuccess() {

                    }

                    @Override
                    public void onError() {

                    }
                });

        //Initializing NavigationView
        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {


                //Checking if the item is in checked state or not, if not make it in checked state
                if (menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);

                //Closing drawer on item click
                drawerLayout.closeDrawers();

                //Check to see which item was being clicked and perform appropriate action
                switch (menuItem.getItemId()) {


                    //Replacing the main content with ContentFragment Which is our Inbox View;
                    case R.id.inbox:
                        Toast.makeText(getApplicationContext(), "Home Selected", Toast.LENGTH_SHORT).show();
                        HomeFragment fragment = new HomeFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.frame_container, fragment);
                        fragmentTransaction.commit();
                        return true;

                    // For rest of the options we just show a toast on click

                    case R.id.starred:
                        Toast.makeText(getApplicationContext(), "MyDownloads Selected", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, MyDownloadsActivity.class));
                        return true;
                    case R.id.sent_mail:
                        Toast.makeText(getApplicationContext(), "Songs and Albums Selected", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this,SongAlbumsActivity.class));
                        return true;
                    case R.id.drafts:
                        Toast.makeText(getApplicationContext(), "Videos and Movies Selected", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, VideoMoviesActivity.class));
                        return true;
                    case R.id.allmail:
                        Toast.makeText(getApplicationContext(), "Artist Selected", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, ArtistActivity.class));
                        return true;
                    case R.id.trash:
                        Toast.makeText(getApplicationContext(), "Live Stream Selected", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, LiveStreamActivity.class));
                        return true;
                    case R.id.spam:
                        Toast.makeText(getApplicationContext(), "About us Selected", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, AboutusActivity.class));
                        return true;
                    case R.id.logout:
                        Toast.makeText(getApplicationContext(), "Logout Successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, Login.class));
                        return true;
                    default:
                        Toast.makeText(getApplicationContext(), "Somethings Wrong", Toast.LENGTH_SHORT).show();
                        return true;

                }
            }
        });

        // Initializing Drawer Layout and ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.openDrawer, R.string.closeDrawer) {

            @Override
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank

                super.onDrawerOpened(drawerView);
            }
        };

        //Setting the actionbarToggle to drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        //calling sync state is necessay or else your hamburger icon wont show up
        actionBarDrawerToggle.syncState();


        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();


        mFragmentTransaction.replace(R.id.frame_container, new HomeFragment()).commit();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
