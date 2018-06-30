package com.example.andrewzhao.realjunglehelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Clock;
import java.util.Timer;

public class MainPageActivity extends AppCompatActivity {
    // Declare our View variables
    public static final String TAG = MainPageActivity.class.getSimpleName();
    private TextView JungleView;
    private ImageButton showFactButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        //Assign Views from XML Layout to view variables in java doc
        JungleView = findViewById(R.id.jungle);
        showFactButton = findViewById(R.id.imageButton);
        View.OnClickListener Listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //the button is clicked, so update
            }
        };

        showFactButton.setOnClickListener(Listener);
        Toast.makeText(this, "Yay!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "This is from the main page yeet");
    }


}
