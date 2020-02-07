package co.furnirent.hp.furnirent;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager md=getFragmentManager();
        FragmentTransaction t=md.beginTransaction();
        home obj=new home();
        t.replace(R.id.line,obj);
        t.commit();
    }

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
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if(id == R.id.nav_home){
            FragmentManager md=getFragmentManager();
            FragmentTransaction t=md.beginTransaction();
            home obj=new home();
            t.replace(R.id.line,obj);
            t.commit();
        }
        else if(id == R.id.about){
            FragmentManager md=getFragmentManager();
            FragmentTransaction t=md.beginTransaction();
            aboutus obj=new aboutus();
            t.replace(R.id.line,obj);
            t.commit();
        }
        else if(id == R.id.gallery){
            FragmentManager md=getFragmentManager();
            FragmentTransaction t=md.beginTransaction();
            gallery obj=new gallery();
            t.replace(R.id.line,obj);
            t.commit();
        }
        else if(id == R.id.products){
            FragmentManager md=getFragmentManager();
            FragmentTransaction t=md.beginTransaction();
            products obj=new products();
            t.replace(R.id.line,obj);
            t.commit();
        }
        else if(id == R.id.chairs){
            FragmentManager md=getFragmentManager();
            FragmentTransaction t=md.beginTransaction();
            chairs obj=new chairs();
            t.replace(R.id.line,obj);
            t.commit();
        }
        else if(id == R.id.beds){
            FragmentManager md=getFragmentManager();
            FragmentTransaction t=md.beginTransaction();
            beds obj=new beds();
            t.replace(R.id.line,obj);
            t.commit();
        }
        else if(id == R.id.couches){
            FragmentManager md=getFragmentManager();
            FragmentTransaction t=md.beginTransaction();
            couches obj=new couches();
            t.replace(R.id.line,obj);
            t.commit();
        }
        else if(id == R.id.tables){
            FragmentManager md=getFragmentManager();
            FragmentTransaction t=md.beginTransaction();
            tables obj=new tables();
            t.replace(R.id.line,obj);
            t.commit();
        }
        else if(id == R.id.purchase){
            FragmentManager md=getFragmentManager();
            FragmentTransaction t=md.beginTransaction();
            query obj=new query();
            t.replace(R.id.line,obj);
            t.commit();
        }
        else if(id == R.id.nav_reachus){
            FragmentManager md=getFragmentManager();
            FragmentTransaction t=md.beginTransaction();
            contact obj=new contact();
            t.replace(R.id.line,obj);
            t.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
