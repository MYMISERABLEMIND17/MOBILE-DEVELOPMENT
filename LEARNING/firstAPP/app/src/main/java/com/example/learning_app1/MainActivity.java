package com.example.learning_app1;

import android.os.Bundle;
import android.widget.Toast;

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

        var uploadbutton = findViewById(R.id.uploadbutton);
        var downloadbutton = findViewById(R.id.downloadbutton) ;

        uploadbutton.setOnClickListener(v -> {
            Toast.makeText(this, "Uploading .....", Toast.LENGTH_SHORT).show();
        });

        downloadbutton.setOnClickListener(v -> {
            Toast.makeText(this, " DOWNLOADING......", Toast.LENGTH_SHORT).show();
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });





    }





}