package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spSocialNet;

    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = (TextView) findViewById(R.id.tvResultado);

        //configuraSpinner_1();
        configuraSpinner_2();

    }

    //Fuente: fichero strings.xml
    private void configuraSpinner_1() {
        spSocialNet = findViewById(R.id.spinner);

        //Creamos un arrayAdapter tomando los valores desde un resource creado en el fichero Strings
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.social_networks_array, R.layout.spinner_item_tallas);

        spSocialNet.setAdapter(adapter);
    }

    //Fuente: un array de Strings
    private void configuraSpinner_2() {
        spSocialNet = findViewById(R.id.spinner);

        String [] tallas = {"XS","S","M","L","XL"};

        ArrayAdapter<String> tallas_adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_tallas,tallas);

        spSocialNet.setAdapter(tallas_adapter);
    }



    public void muestraTalla(View v){
        String tallaSeleccionada = spSocialNet.getSelectedItem().toString();

        tvResultado.setText(tallaSeleccionada);
    }
}