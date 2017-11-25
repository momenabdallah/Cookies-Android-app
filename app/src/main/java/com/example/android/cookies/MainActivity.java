package com.example.android.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void changeText (View view){
        String message = "I'm so full";
        displayText(message);
        ImageView newImg = findViewById(R.id.image_view);
        newImg.setImageResource(R.drawable.after_cookie);
    }

    private void displayText (String hungry) {
        TextView changText = findViewById(R.id.text_view);
        changText.setText(hungry);
    }
    
}

