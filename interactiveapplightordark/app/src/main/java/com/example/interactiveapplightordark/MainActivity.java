package com.example.interactiveapplightordark;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);




        var layout = findViewById(R.id.mainLayout);
        var darkBtn  = findViewById(R.id.darkbtn) ;
        var readBtn = findViewById(R.id.readbtn) ;

        readBtn.setOnClickListener( v -> {
            // change to light mode
            layout.setBackgroundResource(R.color.yelow) ;
        });
        darkBtn.setOnClickListener( v-> {
            layout.setBackgroundResource(R.color.black);
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);




            return insets;



        });


    }
}