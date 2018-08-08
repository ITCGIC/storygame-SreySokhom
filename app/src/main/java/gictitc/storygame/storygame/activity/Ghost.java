package gictitc.storygame.storygame.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import gictitc.storygame.storygame.ghost.Page1;
import gictitc.storygame.storygame.R;

public class Ghost extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button start,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghost);

        textView = findViewById(R.id.setText);
        start = findViewById(R.id.startBtn);
        back = findViewById(R.id.backBtn);


        start.setOnClickListener(this);
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==start){
        startActivity(new Intent(this, Page1.class));
        finish();
        }
        if(v==back){
            startActivity(new Intent(this,MainActivity.class));
        }
    }
}



