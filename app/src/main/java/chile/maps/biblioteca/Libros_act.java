package chile.maps.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Libros_act extends AppCompatActivity {

    private Spinner spn;
    private TextView tv;
    private EditText et1, et2;
    private String[] precioslibros = new String[]{"5000", "12000", "25000","50000","85000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libros_act);

        spn = (Spinner)findViewById(R.id.spinner);
        tv = (TextView)findViewById(R.id.resultado);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);

        Bundle dat = getIntent().getExtras();
        String[] lista = dat.getStringArray("libros");

        ArrayAdapter adapt = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, lista);

        spn.setAdapter(adapt);

    }

    public void Calcular(View v)
    {
        if(spn.getSelectedItem().equals("Farenheit"))
        {
            String precio = precioslibros[0];
            int st = Integer.parseInt(et1.getText().toString());
            int cp = Integer.parseInt(et2.getText().toString());
            int pc = Integer.parseInt(precio);
            int resultado = pc * st + cp;

            tv.setText("Stock disponible: "+ st + "\n"
                     + "Precio final: "+ resultado);
        }

        if(spn.getSelectedItem().equals("Revival"))
        {
            String precioRevival = precioslibros[1];

            int stock = Integer.parseInt(et1.getText().toString());
            int costo = Integer.parseInt(et2.getText().toString());
            int precioLibro = Integer.parseInt(precioRevival);

            int resultado = precioLibro*stock+costo;

            tv.setText("Stock disponible: " +stock+ "\n"
            +"el precio final es: "+ resultado);
        }

        if(spn.getSelectedItem().equals("Tesla"))
        {

            String precioTesla = precioslibros[2];

            int stock = Integer.parseInt(et1.getText().toString());
            int costo = Integer.parseInt(et2.getText().toString());
            int precioLibro = Integer.parseInt(precioTesla);

            int resultado = precioLibro*stock+costo;

            tv.setText("Stock disponible: " +stock+ "\n"
                    +"el precio final es: "+ resultado);
        }
    }

}
