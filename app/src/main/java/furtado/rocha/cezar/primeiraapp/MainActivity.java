package furtado.rocha.cezar.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity { //A Classe MainActivity herda os elementos da Classe AddCompatActivy
    @Override
    protected void onCreate(Bundle savedInstanceState) { //O Metodo onCreate inicia assim que a tela e criada
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnviar = findViewById(R.id.btnEnviar); //Declara a variavel do tipo Button (btnEnviar) e busca o valor na interface referente ao id dessa variavel
        btnEnviar.setOnClickListener(new View.OnClickListener() { //Metodo no qual atribui um comando ao botao que percebe clicks
            @Override
            public void onClick(View view) { //Metodo que aciona assim que o Metodo setOnClickListener "ouve" um click
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui); //Declara a variavel do tipo EditText (etDigiteAqui) e busca o valor na interface referente ao id dessa variavel
                String texto = etDigiteAqui.getText().toString(); //Declara a variavel do tipo String (texto) e pega o texto escrito na variavel etDigiteAqui, convertendo para String
                Intent intent = new Intent(MainActivity.this,NextActivity.class); // Declara uma Intecao (intent) que tem o objetivo de ir da MainActivity para a NextActivity
                intent.putExtra("texto", texto); // Um metodo que além de ir para uma outra activity leva consigo os elementos citados no dicionario
                startActivity(intent); //Inicia a intencao intent
            }
        });
    }
}   