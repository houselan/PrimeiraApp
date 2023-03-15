package furtado.rocha.cezar.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity { /*A Classe NextActivity herda os elementos da Classe AddCompatActivy*/

    @Override
    protected void onCreate(Bundle savedInstanceState) { //O Metodo onCreate inicia assim que a tela e criada
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent i = getIntent(); // Pega uma intencao e coloca na variavel i
        String text = i.getStringExtra("texto"); // Pega o valor referente a chave "texto"
        TextView tv = findViewById(R.id.tvExibir); //Declara a variavel do tipo TextView (tv) e busca o valor na interface referente ao id dessa variavel
        tv.setText(text); // Coloca o valor buscado da intencao no TextView
    }
}