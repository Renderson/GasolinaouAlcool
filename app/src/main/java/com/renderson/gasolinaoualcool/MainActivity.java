package com.renderson.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView resultadoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recuperar itens da tela
        precoAlcool = (EditText)findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText)findViewById(R.id.precoGasolinaId);
        botaoVerificar = (Button)findViewById(R.id.botaoVerificarId);
        resultadoText = (TextView)findViewById(R.id.resultadoTextId);

        //Adicionar evento clique
        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //recuperar valores digitados
                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                //Converte valores string para numeros
                Double valorAlcool = Double.parseDouble( textoPrecoAlcool );
                Double valorGasolina = Double.parseDouble( textoPrecoGasolina );

                //fazer o calculo
                double resultado = valorAlcool / valorGasolina;

                if ( resultado <= 0.7 ){
                    resultadoText.setText("É melhor utilizar Alcool");
                }else{
                    resultadoText.setText("É melhor utilizar Gasolina");
                }
            }
        });

    }
}
