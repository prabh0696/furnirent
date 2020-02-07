package co.furnirent.hp.furnirent;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                try{
                    Intent i=new Intent(getApplication(),login.class);

                    startActivity(i);
                    finish();
                }
                catch(Exception e){

                }
            }
        },2000);
    }
}
