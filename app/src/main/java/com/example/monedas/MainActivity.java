package com.example.monedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variables
    //View viewdolar;
    EditText monto;
    TextView salida;
    Button bds, bsd, bes, bse, bborrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monto = findViewById(R.id.montoET);
        bds = findViewById(R.id.DSbtn);
        bsd = findViewById(R.id.SDbtn);
        bes = findViewById(R.id.ESbtn);
        bse = findViewById(R.id.SEbtn);
        bborrar = findViewById(R.id.BORRARbtn);

        //metodos
        bborrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                monto.setText("");
                salida.setText("");
            }
        });
        bds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Double.parseDouble(monto.getText().toString());
                double cds = num * 3.73;
                salida.setText(num+" dolares equivalen a : "+Double.toString(cds)+" soles");
            }
        });
        bsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Double.parseDouble(monto.getText().toString());
                double csd = num * 0.27;
                salida.setText(num+" soles equivalen a : "+Double.toString(csd)+" dolares");
            }
        });
        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Double.parseDouble(monto.getText().toString());
                double ces = num * 4.03;
                salida.setText(num+" euros equivalen a : "+Double.toString(ces)+" soles");
            }
        });
        bse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Double.parseDouble(monto.getText().toString());
                double cse = num * 0.25;
                salida.setText(num+" soles equivalen a : "+Double.toString(cse)+" euros");
            }
        });
    }
}