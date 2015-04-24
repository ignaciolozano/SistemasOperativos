package com.example.edgar.sistemasoperativos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class VentanaInformacion2 extends ActionBarActivity {

    private ImageView imageSi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_informacion2);
        imageSi = (ImageView) findViewById(R.id.imageS);

        TextView mostrarWindowsxp = (TextView) findViewById(R.id.idWindowsxp);
        String recuperarTextoWindowsxp;
        recuperarTextoWindowsxp = getIntent().getStringExtra("textoWindowsxp");
        mostrarWindowsxp.setText(recuperarTextoWindowsxp);

        TextView mostrarWindowsxpfc = (TextView) findViewById(R.id.idFechaCreacion);
        String recuperarTextoWindowsxpfc;
        recuperarTextoWindowsxpfc = getIntent().getStringExtra("textoWindowsxpfc");
        mostrarWindowsxpfc.setText(recuperarTextoWindowsxpfc);

        TextView mostrarWindowsxpfd = (TextView) findViewById(R.id.idDesconti);
        String recuperarTextoWindowsxpfd;
        recuperarTextoWindowsxpfd = getIntent().getStringExtra("textoWindowsxpfd");
        mostrarWindowsxpfd.setText(recuperarTextoWindowsxpfd);

        recuperar();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ventana_informacion2, menu);
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

        return super.onOptionsItemSelected(item);
    }


    public void recuperar() {
        String recupera = getIntent().getStringExtra("tipoS");


        if (recupera.equals("Windowsxp")) {


            imageSi.setImageResource(R.drawable.xplogo);


        } else if (recupera.equals("Windows 7")) {


            imageSi.setImageResource(R.drawable.windowssiete);


        }
    }
}
