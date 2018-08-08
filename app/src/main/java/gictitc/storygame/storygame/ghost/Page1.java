package gictitc.storygame.storygame.ghost;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import gictitc.storygame.storygame.help.BassActivity;
import gictitc.storygame.storygame.R;

public class Page1 extends BassActivity implements View.OnClickListener {
    Button stay,go_on;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        stay=findViewById(R.id.stay);
        go_on=findViewById(R.id.goOn);

        stay.setOnClickListener(this);
        go_on.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v==stay){
            startActivity(new Intent(this,StayActivity.class));
            finish();
        }
        if(v==go_on){
            startActivity(new Intent(this,GoOnActivity.class));
            finish();
        }
    }

}
