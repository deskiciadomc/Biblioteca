package chile.maps.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class seg_act extends AppCompatActivity {

    private TextView tv;
    private Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seg_act);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        tv = (TextView)findViewById(R.id.tv);


    }

    public void mostrar_uno(View v){

        tv.setText("SQL Injection");
    }

    public void mostrar_dos(View v){

        tv.setText("Buffer Overflow");
    }
}
