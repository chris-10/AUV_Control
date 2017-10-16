package com.hydra.christendsouza.auvcontrol;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class start extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout mDraweLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        mDraweLayout=(DrawerLayout)findViewById(R.id.drawer);
        mToggle=new ActionBarDrawerToggle(this,mDraweLayout,R.string.open,R.string.close);
        mDraweLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setNavigationViewListner();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.cb:
                Intent i1 = new Intent (this, NavigateAUV.class);
                startActivity(i1);
                break;
            case R.id.imu:
                Intent i2 = new Intent (this, IMUActivity.class);
                startActivity(i2);
                break;
            case R.id.cc:
                //Intent i3 = new Intent (this, tutorials.class);
                //startActivity(i3);
                break;
            case R.id.uc:
                //Intent i4 = new Intent (this, tutorials.class);
                //startActivity(i4);
                break;
            case R.id.settings:
                Intent i5 = new Intent (this, SettingsActivity.class);
                startActivity(i5);
                break;
            case R.id.exit:
                this.finish();
                System.exit(0);
                break;
        }
        mDraweLayout.closeDrawer(GravityCompat.START);
        return true;
    }
    private void setNavigationViewListner() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }
}

