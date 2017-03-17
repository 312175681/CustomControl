package com.example.lxd.customcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
private ImageView icon_home;
    private ImageView icon_menu;
    private RelativeLayout icon_level1;
    private RelativeLayout icon_level2;
    private RelativeLayout icon_level3;

    private boolean isshowlevel1;
    private boolean isshowlevel2;
    private boolean isshowlevel3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        icon_home=(ImageView)findViewById(R.id.icon_home);
        icon_menu=(ImageView)findViewById(R.id.icon_menu);
        icon_level1=(RelativeLayout)findViewById(R.id.level1);
        icon_level2=(RelativeLayout)findViewById(R.id.level2);
        icon_level3=(RelativeLayout)findViewById(R.id.level3);


    }

    class MyOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.icon_home:
                    break;

                case R.id.icon_menu:
                    if (isshowlevel3) {
                        isshowlevel3=false;
                        Tools.hideView(icon_level3);
                    }else {
                        isshowlevel3=true;
                        Tools.showView(icon_level2,200);
                    }
                break;


            }
        }
    }
}
