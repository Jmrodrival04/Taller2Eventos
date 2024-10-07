package com.example.taller2eventos;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.RelativeLayout;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button changeColorButton = findViewById(R.id.changeColorButton);
        Button goBackButton = findViewById(R.id.goBackButton);
        RelativeLayout layout = findViewById(R.id.settingsLayout);

        // Cambiar el color de fondo
        changeColorButton.setOnClickListener(v -> layout.setBackgroundColor(Color.GREEN));

        // Volver a la pantalla de inicio
        goBackButton.setOnClickListener(v -> finish());
    }
}
