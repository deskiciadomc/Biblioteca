package chile.maps.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class github_act extends AppCompatActivity {


    private Spinner spn;
    private TextView tv;
    private String[] precios = new String[]{"7000", "22000", "45000","88000","156000"};//OscarGonzalez_ev_03

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spn = (Spinner)findViewById(R.id.spn2);
        tv = (TextView)findViewById(R.id.result2);

        Bundle dat = getIntent().getExtras();
        String[] lista = dat.getStringArray("libros");

        ArrayAdapter adapt = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, lista);

        spn.setAdapter(adapt);

    }

    public void Mostrar(View v)
    {
        if(spn.getSelectedItem().equals("Farenheit"))
        {
            String precio = precios[0];

            int pc = Integer.parseInt(precio);
            int resultado = pc;

            tv.setText("El valor de Farenheit es: "+ resultado);
        }

        if(spn.getSelectedItem().equals("Revival"))
        {
            String precio = precios[1];

            int pc = Integer.parseInt(precio);
            int resultado = pc;

            tv.setText("El valor de Revival es: "+ resultado);
        }

        if(spn.getSelectedItem().equals("El Alquimista"))
        {

            String precio = precios[2];


            int pc = Integer.parseInt(precio);
            int resultado = pc;

            tv.setText("El valor de El Alquimista es: "+ resultado);
        }

        if(spn.getSelectedItem().equals("El Poder"))
        {

            String precio = precios[3];


            int pc = Integer.parseInt(precio);
            int resultado = pc;

            tv.setText("El valor de El Poder es: "+ resultado);
        }

        if(spn.getSelectedItem().equals("Despertar"))
        {

            String precio = precios[4];


            int pc = Integer.parseInt(precio);
            int resultado = pc;

            tv.setText("El valor de Despertar es: "+ resultado);
        }



    }
}
