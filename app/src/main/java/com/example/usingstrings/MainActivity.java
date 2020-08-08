package com.example.usingstrings;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i( "Lifecycle",   "onCreate() invoked" );

        TextView txtView2;

        txtView2 = findViewById(R.id.TvMsg2);
        txtView2.setText(R.string.Msg2);
    }
    @Override
    public void onStart()
    {
        super.onStart();
        Log.i("LifeCycle", "onStart() invoked");
    }
    @Override
    public void onRestart()
    {
        super.onRestart();
        Log.i("LifeCycle", "onRestart() invoked");
    }
    @Override
    public void onResume()
    {
        super.onResume();
        Log.i("LifeCycle", "onResume() invoked");
    }
    @Override
    public void onPause()
    {
        super.onPause();
        Log.i("LifeCycle", "onPause() invoked");
    }
    @Override
    public void onStop()
    {
        super.onStop();
        Log.i("LifeCycle", "onStop() invoked");
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.i("LifeCycle", "onDestroy() invoked");
    }
}