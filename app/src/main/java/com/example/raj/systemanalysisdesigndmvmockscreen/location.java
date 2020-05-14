package com.example.raj.systemanalysisdesigndmvmockscreen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class location extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);


        Button locationButt;
        Button plainEdgeView;


        plainEdgeView = (Button) findViewById(R.id.plainEdgeButton);
        locationButt = (Button) findViewById(R.id.locationButton);



        locationButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://dmv.ny.gov/offices"));
                startActivity(intent);
            }
        });


        plainEdgeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), plainEdge.class);
                startActivity(intent);
            }
        });
    }
}
