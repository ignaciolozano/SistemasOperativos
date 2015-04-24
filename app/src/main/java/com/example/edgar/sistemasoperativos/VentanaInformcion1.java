package com.example.edgar.sistemasoperativos;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class VentanaInformcion1 extends ActionBarActivity {
    private Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_informcion1);

///////////////////////////////Titulo Windows
        TextView mostrarWindows = (TextView) findViewById(R.id.idsistemas);
        String recuperarTexto;
        recuperarTexto = getIntent().getStringExtra("textoWindows");
        mostrarWindows.setText(recuperarTexto);
/////Descripcion del sistema
        TextView mostrarDescripcionW = (TextView) findViewById(R.id.idDescripcion);
        String recuperarTextoW;
        recuperarTextoW = getIntent().getStringExtra("textoDescripcion");
        mostrarDescripcionW.setText(recuperarTextoW);

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        String []opciones= {"Windows XP","Windows Vista","Windows 7", "Windows 8", "Windows 8.1"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        spinner2.setAdapter(adapter);


////////////////////////////////
        /*TextView mostrarLinux = (TextView) findViewById(R.id.idsistemas);
        String recuperarTexto1;
        recuperarTexto1 = getIntent().getStringExtra("textoLinux");
        mostrarLinux.setText(recuperarTexto1);*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ventana_informcion1, menu);
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

        if(id == R.id.action_verciones)
        {
            String selec=spinner2.getSelectedItem().toString();
            if(selec.equals("Windows XP"))
            {

                windowsxp();

            }else
                if (selec.equals("Windows 7"))
                {
                windows7();
                }

        }

        return super.onOptionsItemSelected(item);
    }
    public void windowsxp()
    {
        String textoWindowsxp;
        String textoWindowsxpfc;
        String textoWindowsxpfd;
        String tipoS;


        textoWindowsxp = "(cuyo nombre clave inicial fue Whistler) es una versión de Microsoft Windows," +
                " línea de sistemas operativos desarrollado por Microsoft. " +
                "Lanzado al mercado el 25 de octubre de 2001, en diciembre de " +
                "2013, tenía una cuota de mercado de 500 millones de ordenadores." +
                " Las letras \"XP\" provienen de la palabra eXPeriencia (eXPerience en inglés)";
        textoWindowsxpfc ="agosto de 2001";
        textoWindowsxpfd ="8 abril de 2014";
        tipoS = "Windowsxp";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("textoWindowsxp", textoWindowsxp);
        i.putExtra("textoWindowsxpfc",textoWindowsxpfc);
        i.putExtra("textoWindowsxpfd",textoWindowsxpfd);
        i.putExtra("tipoS", tipoS);
        startActivity(i);
    }

    public void windows7()
    {
        String textoWindows7;
        String textoWindows7fc;
        String textoWindows7fd;
        String tipoS;


        textoWindows7 = "Windows 7 Starter";
        textoWindows7fc ="agosto de 2001";
        textoWindows7fd ="8 abril de 2014";
        tipoS = "Windows 7";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("textoWindows7", textoWindows7);
        i.putExtra("textoWindows7fc",textoWindows7fc);
        i.putExtra("textoWindows7fd",textoWindows7fd);
        i.putExtra("tipoS", tipoS);
        startActivity(i);
    }
}
