package com.example.stree.areatriangulo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_Triangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity__triangulo);

        CalcularArea();
    }

    private  void CalcularArea()
    {
        final Triangulo OBTriangulo = new Triangulo();
        final TestTriangulo OBTest = new TestTriangulo();

        final EditText txtLadoA = (EditText)findViewById(R.id.txtLadoA);
        final EditText txtLadoB = (EditText)findViewById(R.id.txtLadoB);
        final EditText txtLadoC = (EditText)findViewById(R.id.txtLadoC);
        final TextView lblResultado = (TextView)findViewById(R.id.lblResultado);
        Button btnCalcular = (Button)findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    OBTriangulo.setA(Double.parseDouble(txtLadoA.getText().toString()));
                    OBTriangulo.setB(Double.parseDouble(txtLadoB.getText().toString()));
                    OBTriangulo.setC(Double.parseDouble(txtLadoC.getText().toString()));

                    lblResultado.setText(OBTest.Area(OBTriangulo));
                }
                catch(Exception e)
                {
                    String Mensaje = "Verifica los Datos Ingresados";
                    Toast.makeText(MainActivity_Triangulo.this, Mensaje, Toast.LENGTH_SHORT).show();

                    lblResultado.setText("-----");
                }
            }
        });
    }
}