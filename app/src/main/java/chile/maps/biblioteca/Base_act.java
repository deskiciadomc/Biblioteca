package chile.maps.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Base_act extends AppCompatActivity {

    private EditText et1, et2, et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_act);

        et1 = (EditText)findViewById(R.id.cod);
        et2 = (EditText)findViewById(R.id.nombre);
        et3 = (EditText)findViewById(R.id.precio);
    }


    public void añadirLib(View v){

        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "Biblioteca", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        if(!et1.getText().toString().isEmpty())
        {
            ContentValues registro = new ContentValues();
            registro.put("codigo", et1.getText().toString());
            registro.put("nombre", et2.getText().toString());
            registro.put("precio", et3.getText().toString());

            BaseDeDatos.insert("Libros", null, registro);
            BaseDeDatos.close();

            Toast.makeText(this, "Se ha ingresado un Libro", Toast.LENGTH_LONG).show();
        }


    }

    public void EliminarLib(View v)
    {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "Biblioteca", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String codigo = et1.getText().toString();
        BaseDeDatos.delete("Libros","codigo="+codigo, null );

        Toast.makeText(this,"Se elimino el libro con el codigo: "+codigo, Toast.LENGTH_SHORT).show();
    }

    public void ModificarLib(View v)
    {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "Biblioteca", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String codigo = et1.getText().toString();

        ContentValues cont = new ContentValues();
        cont.put("codigo", et1.getText().toString());
        cont.put("nombre", et2.getText().toString());
        cont.put("precio", et3.getText().toString());


        if(!et1.getText().toString().isEmpty())
        {
            BaseDeDatos.update("Libros", cont, "codigo="+codigo, null);
            Toast.makeText(this,"Se ha actualizado el libro con el codigo: "+codigo, Toast.LENGTH_SHORT).show();
        }
    }

}