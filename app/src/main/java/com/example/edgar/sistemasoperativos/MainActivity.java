package com.example.edgar.sistemasoperativos;

import android.content.Intent;
import android.media.MediaPlayer;
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
    private MediaPlayer wxp;

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
                    String []opciones={"Lista de Sistemas Op.","Windows","Linux","OSX"};
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item, opciones);
                    spinner1.setAdapter(adapter);

                } else {

                        spinner1 = (Spinner) findViewById(R.id.spinner1);
                        String[] opciones = {"Lista de Moviles", "Android", "Windows Phone", "Firefox OS", "iOS"};
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, opciones);
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
        if (id == R.id.action_Acerca) {
            acerca();
            return true;



        }
        if (id == R.id.action_Salir) {
            Intent salida=new Intent( Intent.ACTION_MAIN); //Llamando a la activity principal
            finish();
            return true;



        }
        if(id == R.id.action_VersionOS)
        { ///Sistemas Operativos //////////////////////////////////////////
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
                        else ////Sistemas Moviles//////////////////////////////
                            if (selec.equals("Android"));
                             {
                               android();
                             }
                             if(selec.equals("iOS"))
                                    {
                                    iOS();
                                      }
                                        else if (selec.equals("Windows Phone"))
                                        {
                                         windowsphon();
                                        }
                                        else if (selec.equals("Firefox OS"))
                                        {
                                           firefoxos();
                                        }


        }

        return super.onOptionsItemSelected(item);
    }

public void acerca(){
    Intent i = new Intent(this, ActivityAcerca.class );

    startActivity(i);
}



    public void windows(){
        String nom;
        String tipoSistema;
        Intent i = new Intent(this, VentanaInformcion1.class );
        nom = "Windows";
        tipoSistema = "Windows";
        i.putExtra("nom", nom);
        i.putExtra("tipoSistema", tipoSistema);
        startActivity(i);
    }
     public void linux(){
        String nom;
        String tipoSistema;
        nom = "Linux";
        tipoSistema = "Linux";
        Intent i = new Intent(this, VentanaInformcion1.class );
        i.putExtra("nom", nom);
        i.putExtra("tipoSistema", tipoSistema);
        startActivity(i);
    }
    public void osx(){
        String nom;
        String tipoSistema;
        nom = "OSX";
        tipoSistema = "OSX";
        Intent i = new Intent(this, VentanaInformcion1.class );
        i.putExtra("nom", nom);
        i.putExtra("tipoSistema", tipoSistema);
        startActivity(i);

    }
    public void android() {
        String nom;
        String tipoSistema;
        nom = "Android";
        tipoSistema = "Android";
        Intent i = new Intent(this, VentanaInformcion1.class);
        i.putExtra("nom", nom);i.putExtra("tipoSistema", tipoSistema);
        startActivity(i);
    }
    public void windowsphon()
    {
        String nom;
        String tipoSistema;
        Intent i = new Intent(this, VentanaInformcion1.class );
        nom = "Windows Phone";
        tipoSistema= "Windows Phone";
        i.putExtra("nom", nom);
        i.putExtra("tipoSistema", tipoSistema);
        startActivity(i);
    }


    public void iOS()
    {
        String nom;
        String tipoSistema;
        Intent i = new Intent(this, VentanaInformcion1.class );
        nom = "iOS";
        tipoSistema = "iOS";
        i.putExtra("nom", nom);
        i.putExtra("tipoSistema", tipoSistema);
        startActivity(i);
    }
    public void firefoxos()
    {
        String nom;
        String tipoSistema;
        Intent i = new Intent(this, VentanaInformcion1.class );
        nom = "Firefox OS";
        tipoSistema= "Firefox OS";
        i.putExtra("nom", nom);
        i.putExtra("tipoSistema", tipoSistema);
        startActivity(i);
    }
}
