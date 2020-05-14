package com.example.raj.systemanalysisdesigndmvmockscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class plainEdge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plain_edge);

        Button queButton;
        Button serve;

        queButton = (Button) findViewById(R.id.queButton);
        serve = (Button) findViewById(R.id.servingButton);

        serve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(plainEdge.this, "Serving number A10",Toast.LENGTH_LONG).show();
            }
        });

        queButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(plainEdge.this, "You've been added as number A65",Toast.LENGTH_LONG).show();
            }
        });
    }
}
