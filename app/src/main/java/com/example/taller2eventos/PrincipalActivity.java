package com.example.taller2eventos;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        EditText nameInput = findViewById(R.id.nameInput);
        Button saveButton = findViewById(R.id.saveButton);
        TextView displayName = findViewById(R.id.displayName);
        Button asyncButton = findViewById(R.id.asyncButton);

        // Guardar el nombre ingresado y mostrarlo
        saveButton.setOnClickListener(v -> {
            String name = nameInput.getText().toString();
            displayName.setText("Hola, " + name);
        });

        // Ejecutar una tarea en segundo plano
        asyncButton.setOnClickListener(v -> new NetworkTask().execute());
    }

    // Clase interna para simular una tarea en segundo plano
    private class NetworkTask extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... voids) {
            try {
                // Simulación de tarea de red que dura 3 segundos
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Tarea completada";
        }

        @Override
        protected void onPostExecute(String result) {
            TextView displayName = findViewById(R.id.displayName);
            displayName.setText(result);
        }
    }
}
