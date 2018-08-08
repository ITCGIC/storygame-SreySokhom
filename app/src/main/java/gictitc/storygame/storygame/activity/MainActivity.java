package gictitc.storygame.storygame.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

import gictitc.storygame.storygame.R;
import gictitc.storygame.storygame.activity.Ghost;
import gictitc.storygame.storygame.activity.Love;
import gictitc.storygame.storygame.activity.Sad;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView ghost, love, sad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ghost = findViewById(R.id.ghost);
        love = findViewById(R.id.love);
        sad = findViewById(R.id.sad);

        ghost.setOnClickListener(this);
        love.setOnClickListener(this);
        sad.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v==ghost){
            startActivity(new Intent(this, Ghost.class));
            finish();
        }if (v==love){
            startActivity(new Intent(this, Love.class));
            finish();
        }if (v==sad){
            startActivity(new Intent(this, Sad.class));
            finish();
        }

    }
}
