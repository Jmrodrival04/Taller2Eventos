package com.example.taller2eventos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView greetingText = findViewById(R.id.greetingText);
        Button startButton = findViewById(R.id.startButton);

        // Obtener la hora actual y cambiar el saludo según la hora del día
        int currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (currentHour < 12) {
            greetingText.setText("Buenos días");
        } else if (currentHour < 18) {
            greetingText.setText("Buenas tardes");
        } else {
            greetingText.setText("Buenas noches");
        }

        // Ir a la actividad principal
        startButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PrincipalActivity.class);
            startActivity(intent);
        });
    }
}
