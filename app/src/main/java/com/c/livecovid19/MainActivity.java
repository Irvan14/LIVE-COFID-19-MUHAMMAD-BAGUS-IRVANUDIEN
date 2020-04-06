package com.c.livecovid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btLive);
        Button button1 = findViewById(R.id.btTentang);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
    }

            @Override
            public void onClick(View view){
                switch (view.getId()){

                    case R.id.btLive:
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=rkZzubzUpAM"));
                startActivity(intent);
                break;

                    case R.id.btTentang:
                Intent intent1 =new Intent(MainActivity.this, Tentang.class);
                startActivity(intent1);
                break;
                }
            }

    }
