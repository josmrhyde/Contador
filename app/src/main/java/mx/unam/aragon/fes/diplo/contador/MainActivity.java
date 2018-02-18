package mx.unam.aragon.fes.diplo.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int i;
    private TextView textContador;
    private Button botonAumentar, botonRestar, botonResetear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i=0;
        botonAumentar = findViewById(R.id.button);
        botonRestar = findViewById(R.id.button2);
        botonResetear = findViewById(R.id.button3);
        textContador = findViewById(R.id.textView3);

        botonAumentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=i+1;
                textContador.setText(String.valueOf(i));
                //num = (String) textContador.toString();
                Toast.makeText(MainActivity.this,"Se aumentó 1 al contador", Toast.LENGTH_SHORT).show();
            }
        });

        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=i-1;
                textContador.setText(String.valueOf(i));
                Toast.makeText(MainActivity.this, "se restó 1 al contador", Toast.LENGTH_SHORT).show();
            }
        });

        botonResetear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=0;
                textContador.setText(String.valueOf(i));
                Toast.makeText(MainActivity.this,"Se reseteó el contador", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
