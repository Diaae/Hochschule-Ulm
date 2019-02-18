package com.example.diaaebakri.hochschuleulm;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class home_activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    static DrawerLayout drawer;
    RecyclerView newsView;
    static SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activity);
        sp = getSharedPreferences("hsulm", MODE_PRIVATE);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        newsView = findViewById(R.id.newsfeed_view);
        newsView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        NewsFeedAdapter newsAdapter = new NewsFeedAdapter(this, NewsContent.ncList);
        newsView.setAdapter(newsAdapter);

    }
    //End of OnCreate

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

/*        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }






    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.news) {
            drawer.closeDrawers();
            return true;

        } else if (id == R.id.my_studies) {
            Intent myStudies = new Intent(getApplicationContext(),MyStudies.class);
            startActivity(myStudies);
            this.finish();

        } else if (id == R.id.library) {
            Intent Libraries = new Intent(getApplicationContext(),LibraryActivity.class);
            startActivity(Libraries);
            this.finish();

        } else if (id == R.id.mensa) {
            Intent Mensa = new Intent(getApplicationContext(),Mensa.class);
            startActivity(Mensa);
            this.finish();

        } else if (id == R.id.infos) {
            Intent Profile = new Intent(getApplicationContext(), Profile.class);
            startActivity(Profile);
            this.finish();

        } else if (id == R.id.logout) {
            sp.edit().putBoolean("logged", false).apply();
            Intent logout = new Intent(getApplicationContext(),LoginActivity.class);
            logout.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(logout);
            this.finish();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
