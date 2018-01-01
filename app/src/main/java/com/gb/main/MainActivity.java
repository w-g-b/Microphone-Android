package com.gb.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.gb.R;

/**
 * Created by Administrator on 2018/1/1.
 */

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate( savedInstanceState );
    setContentView( R.layout.activity_main );
    findViewById( R.id.audio ).setOnClickListener( new View.OnClickListener() {
      @Override public void onClick(View view) {
        startActivity( new Intent( MainActivity.this,AudioActivity.class ) );
      }
    } );
  }
}
