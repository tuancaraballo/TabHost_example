package com.tuananhcaraballo.tabhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       TabHost tabs = (TabHost)findViewById(R.id.tabHost);
        tabs.setup();
//
       TabHost.TabSpec tab1 = tabs.newTabSpec("Tab1");
        tab1.setContent(R.id.layout1);
        tab1.setIndicator("TAB 1");
        tabs.addTab(tab1);


       TabHost.TabSpec tab2 = tabs.newTabSpec("Tab2");
        tab2.setContent(R.id.layout2);
        tab2.setIndicator("",getResources().getDrawable(android.R.drawable.btn_star));
        tabs.addTab(tab2);
     //   tabs.setCurrentTab(0);
////
//      tabs.addTab(tab1);
//        tabs.addTab(tab2);

  //      tabs.setCurrentTab(0);




    }
}
