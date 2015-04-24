package com.example.edgar.sistemasoperativos;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity  {

    Spinner spinner1;
    Button btn;
    EditText ed;

   ToggleButton toggle;
   // private ToggleButton toggleButton1, toggleButton2;
    private Button btnDisplay;
    private String selec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    spinner1 = (Spinner) findViewById(R.id.spinner1);
                    String []opciones={"Lista de Sistemas Op.","Windows","Linux","SOX"};
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item, opciones);
                    spinner1.setAdapter(adapter);

                } else {
                    spinner1 = (Spinner) findViewById(R.id.spinner1);
                    String []opciones={"Lista de Opciones","Android", "windows", "OS"};
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item, opciones);
                    spinner1.setAdapter(adapter);
                }
            }
        });

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;



        }
        if(id == R.id.action_VersionOS)
        {
            String selec=spinner1.getSelectedItem().toString();
            if(selec.equals("Windows"))
            {

            windows();

            }
            else
                if(selec.equals("Linux"))
                {
                   linux();
                }
                else
                    if(selec.equals("OSX"))
                    {
                      osx();
                    }
                        else
                            if (selec.equals("Android"));
                             {
                               android();
                             }







        }

        return super.onOptionsItemSelected(item);
    }




    public void windows(){
        String textoWindow;
        String textoDescripcion;

        Intent i = new Intent(this, VentanaInformcion1.class );
        textoWindow = "Windows";
        textoDescripcion = "Windows Sistema Operativo para computadoras";
        i.putExtra("textoWindows", textoWindow);
        i.putExtra("textoDescripcion", textoDescripcion);
        startActivity(i);




    }

    public void linux(){
        String textoLinux;
        textoLinux = "Linux";
        Intent i = new Intent(this, VentanaInformcion1.class );
        i.putExtra("textoWindows", textoLinux);
        startActivity(i);
        //Ventana Linux

    }
    public void osx(){
        String textoOSX;
        textoOSX = "OSX";
        Intent i = new Intent(this, VentanaInformcion1.class );
        i.putExtra("textoOSX", textoOSX);
        startActivity(i);

    }
    public void android(){
        String textoAndroid;
        textoAndroid = "Android";
        Intent i = new Intent(this, VentanaInformcion1.class );
        i.putExtra("textoAndroid", textoAndroid);
        startActivity(i);

    }
}
