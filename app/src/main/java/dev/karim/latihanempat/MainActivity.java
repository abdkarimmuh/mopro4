package dev.karim.latihanempat;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Karim on 10/13/2017.
 */

public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tiga = (Button) findViewById(R.id.btn3);
        Button empat = (Button) findViewById(R.id.btn4);
        Button lima = (Button) findViewById(R.id.btn5);
        Button enam = (Button) findViewById(R.id.btn6);

        tiga.setOnClickListener(tekan);
        empat.setOnClickListener(tekan);
        lima.setOnClickListener(tekan);
        enam.setOnClickListener(tekan);
    }

    View.OnClickListener tekan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("Status: "," menggunakan anonnymous inner class");
        }
    };

    //this method is using for pencet in layout class

    public void pencet(View v){
        //cast v Button and get in label
        String label = ((Button)v).getText().toString();

        //only show log in logcat
        Log.i("Status: ",label+ " Terpencet");
    }

    @Override
    public void onClick(View v) {
        Log.i("Status: "," menggunakan Activity Listener class");
    }
}