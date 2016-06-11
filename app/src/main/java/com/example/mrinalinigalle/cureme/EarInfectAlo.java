package com.example.mrinalinigalle.cureme;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class EarInfectAlo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ear_infect_alo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        //set adapter to your ViewPager
        viewPager.setAdapter(new EarInfectAloTabPager(getSupportFragmentManager()));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tension, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        Intent g;

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_privacy) {
            g = new Intent(this,Privacy.class);
            startActivity(g);
            return true;
        } else if(id == R.id.action_terms_cond){
            g = new Intent(this,TermsCond.class);
            startActivity(g);
            return true;
        } else if(id == R.id.action_about){
            g = new Intent(this,About.class);
            startActivity(g);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

