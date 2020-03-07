package com.example.soma;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSomar(View view) {
        // Obter valor 1
        EditText v1 = (EditText) findViewById(R.id.n1);
        // Obter valor 2
        EditText v2 = (EditText) findViewById(R.id.n2);

        // Converte para float e soma
        float r = Float.parseFloat(v1.getText().toString()) + Float.parseFloat(v2.getText().toString());

        // Obter Resultado
        TextView resultado = (TextView) findViewById(R.id.resultado);

        // Exibe o resultado
        resultado.setText("Resultado: " + r);
    }
}
