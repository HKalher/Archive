package com.kalher.henu.archive;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kalher.henu.archive.Activity.ConstraintLayoutActivity;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private Button constraintLayoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setView();
    }

    private void initView(){
        constraintLayoutButton = (Button) findViewById(R.id.constraint_layout_button);
    }

    private void setToolbar(){

    }

    private void setView(){
        constraintLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent constraintLayoutActivityIntent = new Intent(mContext, ConstraintLayoutActivity.class);
                startActivity(constraintLayoutActivityIntent);
            }
        });
    }

}
