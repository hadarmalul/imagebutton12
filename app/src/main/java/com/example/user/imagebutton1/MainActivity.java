package com.example.user.imagebutton1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton imgb;
    ImageView imgv;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                imgv=(ImageView)findViewById(R.id.imgv);
                imgb=(ImageButton)findViewById(R.id.imgb);

    }

    public void click(View view) {
        Random rnd = new Random();
        x = rnd.nextInt(3) + 1;
        if (x == 1) {
            imgv.setImageResource(R.drawable.spongebob);
            imgb.setImageResource(R.drawable.one);
        }
        if(x==2){
            imgv.setImageResource(R.drawable.patrickstar);
            imgb.setImageResource(R.drawable.two);

        }
        if(x==3){
            imgv.setImageResource(R.drawable.squidward);
            imgb.setImageResource(R.drawable.three);
        }

    }
}


