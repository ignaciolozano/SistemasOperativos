package com.example.edgar.sistemasoperativos;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class VentanaInformacion2 extends ActionBarActivity {

    private ImageView imageSi;
    private MediaPlayer wxp,w7,w8,i1,i2,i3,i4,m1,m2,m3,m4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_informacion2);
        imageSi = (ImageView) findViewById(R.id.imageS);
        wxp = MediaPlayer.create(this,R.raw.sonidowxp);w7 = MediaPlayer.create(this,R.raw.win7);w8 = MediaPlayer.create(this,R.raw.win8);
        i1= MediaPlayer.create(this,R.raw.iphone1);i2= MediaPlayer.create(this,R.raw.iphone2);i3= MediaPlayer.create(this,R.raw.iphone3);i4= MediaPlayer.create(this,R.raw.iphone4);
        m1= MediaPlayer.create(this,R.raw.macuno);m2= MediaPlayer.create(this,R.raw.macdos);m3= MediaPlayer.create(this,R.raw.mactres);m1= MediaPlayer.create(this,R.raw.maccuatro);
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
        if (id == R.id.action_Regresar) {
            Intent i = new Intent(this, VentanaInformcion1.class );
            startActivity(i);
            return true;



        }

        return super.onOptionsItemSelected(item);
    }





    public void recuperar() {
        String recupera = getIntent().getStringExtra("tipoS");


        if (recupera.equals("Windowsxp")) {

            wxp.start();
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
            imageSi.setImageResource(R.drawable.xplogo);
        }

        if(recupera.equals("Windows Vista")){
            TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
            String rw;
            rw = getIntent().getStringExtra("twv");
            mwv.setText(rw);

            TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
            String rwfc;
            rwfc = getIntent().getStringExtra("twvfc");
            mwfc.setText(rwfc);

            TextView mfd = (TextView) findViewById(R.id.idDesconti);
            String rwfd;
            rwfd = getIntent().getStringExtra("twfd");
            mfd.setText(rwfd);


            imageSi.setImageResource(R.drawable.windowsvista);

        }else
        if (recupera.equals("Windows 7")) {
            w7.start();
            TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
            String rw;
            rw = getIntent().getStringExtra("W7");
            mwv.setText(rw);

            TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
            String rwfc;
            rwfc = getIntent().getStringExtra("W7fc");
            mwfc.setText(rwfc);

            TextView mfd = (TextView) findViewById(R.id.idDesconti);
            String rwfd;
            rwfd = getIntent().getStringExtra("W7dc");
            mfd.setText(rwfd);

            imageSi.setImageResource(R.drawable.windowssiete);


        }
        else
        if(recupera.equals("Windows 8"))
        {   w8.start();
            TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
            String rw;
            rw = getIntent().getStringExtra("w8");
            mwv.setText(rw);

            TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
            String rwfc;
            rwfc = getIntent().getStringExtra("w8fc");
            mwfc.setText(rwfc);

            TextView mfd = (TextView) findViewById(R.id.idDesconti);
            String rwfd;
            rwfd = getIntent().getStringExtra("w8dc");
            mfd.setText(rwfd);
            imageSi.setImageResource(R.drawable.windows8);
        }else

        if(recupera.equals("Windows 10"))
        {
            TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
            String rw;
            rw = getIntent().getStringExtra("w10");
            mwv.setText(rw);

            TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
            String rwfc;
            rwfc = getIntent().getStringExtra("w10fc");
            mwfc.setText(rwfc);

            TextView mfd = (TextView) findViewById(R.id.idDesconti);
            String rwfd;
            rwfd = getIntent().getStringExtra("w10dc");
            mfd.setText(rwfd);
            imageSi.setImageResource(R.drawable.windows10);
        }else
        ///////////////////////////////////////////Android//////////////////////////////
            if (recupera.equals("Froyo"))
            {
                TextView mwv = (TextView) findViewById(R.id.idWindowsxp); String rw;
                rw = getIntent().getStringExtra("an");
                mwv.setText(rw);

                TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
                String rwfc;
                rwfc = getIntent().getStringExtra("anfc");
                mwfc.setText(rwfc);

                TextView mfd = (TextView) findViewById(R.id.idDesconti);
                String rwfd;
                rwfd = getIntent().getStringExtra("andc");
                mfd.setText(rwfd);
                imageSi.setImageResource(R.drawable.androidfroyo);
            }else
            if (recupera.equals("Jelly Bean"))
            {
                TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
                String rw;
                rw = getIntent().getStringExtra("an");
                mwv.setText(rw);

                TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
                String rwfc;
                rwfc = getIntent().getStringExtra("anfc");
                mwfc.setText(rwfc);

                TextView mfd = (TextView) findViewById(R.id.idDesconti);
                String rwfd;
                rwfd = getIntent().getStringExtra("anfd");
                mfd.setText(rwfd);
                imageSi.setImageResource(R.drawable.jeanandroid);
            }else
            if (recupera.equals("Kit Kat")) {
                TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
                String rw;
                rw = getIntent().getStringExtra("an");
                mwv.setText(rw);

                TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
                String rwfc;
                rwfc = getIntent().getStringExtra("anfc");
                mwfc.setText(rwfc);

                TextView mfd = (TextView) findViewById(R.id.idDesconti);
                String rwfd;
                rwfd = getIntent().getStringExtra("anfd");
                mfd.setText(rwfd);
                imageSi.setImageResource(R.drawable.kitkatandroid);
            }else
            if (recupera.equals("Lillipop")) {
                TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
                String rw;
                rw = getIntent().getStringExtra("an");
                mwv.setText(rw);

                TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
                String rwfc;
                rwfc = getIntent().getStringExtra("anfc");
                mwfc.setText(rwfc);

                TextView mfd = (TextView) findViewById(R.id.idDesconti);
                String rwfd;
                rwfd = getIntent().getStringExtra("anfd");
                mfd.setText(rwfd);
                imageSi.setImageResource(R.drawable.lillipopandroid);
            }else
        ///////////////////////////////////////////////////////////OS X/////////////////////////////////////////////////////////////////
                if (recupera.equals("Leopardo")) {
                    m1.start();
                    TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
                    String rw;
                    rw = getIntent().getStringExtra("osn");
                    mwv.setText(rw);

                    TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
                    String rwfc;
                    rwfc = getIntent().getStringExtra("osfc");
                    mwfc.setText(rwfc);

                    TextView mfd = (TextView) findViewById(R.id.idDesconti);
                    String rwfd;
                    rwfd = getIntent().getStringExtra("osfd");
                    mfd.setText(rwfd);
                    imageSi.setImageResource(R.drawable.ioxleopar);
                }else
                if (recupera.equals("Lion")) {
                    m2.start();
                    TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
                    String rw;
                    rw = getIntent().getStringExtra("osn");
                    mwv.setText(rw);

                    TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
                    String rwfc;
                    rwfc = getIntent().getStringExtra("osfc");
                    mwfc.setText(rwfc);

                    TextView mfd = (TextView) findViewById(R.id.idDesconti);
                    String rwfd;
                    rwfd = getIntent().getStringExtra("osfd");
                    mfd.setText(rwfd);
                    imageSi.setImageResource(R.drawable.lioniox);
                }
        else if (recupera.equals("Mountain Lion")) {
                    m3.start();
                    TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
                    String rw;
                    rw = getIntent().getStringExtra("osn");
                    mwv.setText(rw);

                    TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
                    String rwfc;
                    rwfc = getIntent().getStringExtra("osfc");
                    mwfc.setText(rwfc);

                    TextView mfd = (TextView) findViewById(R.id.idDesconti);
                    String rwfd;
                    rwfd = getIntent().getStringExtra("osfd");
                    mfd.setText(rwfd);
                    imageSi.setImageResource(R.drawable.lionioxlionherp);
                }
        else if (recupera.equals("Yosemite")) {
                    m4.start();
                    TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
                    String rw;
                    rw = getIntent().getStringExtra("osn");
                    mwv.setText(rw);

                    TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
                    String rwfc;
                    rwfc = getIntent().getStringExtra("osfc");
                    mwfc.setText(rwfc);

                    TextView mfd = (TextView) findViewById(R.id.idDesconti);
                    String rwfd;
                    rwfd = getIntent().getStringExtra("osfd");
                    mfd.setText(rwfd);
                    imageSi.setImageResource(R.drawable.yosemite);

                }
 ////////////////////////////////////////////////////////////Linux////////////////////////////////////////////////////////////////////////////////
                else if (recupera.equals("Ubuntu")) {
                    TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
                    String rw;
                    rw = getIntent().getStringExtra("ln");
                    mwv.setText(rw);

                    TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
                    String rwfc;
                    rwfc = getIntent().getStringExtra("lfc");
                    mwfc.setText(rwfc);

                    TextView mfd = (TextView) findViewById(R.id.idDesconti);
                    String rwfd;
                    rwfd = getIntent().getStringExtra("lfd");
                    mfd.setText(rwfd);
                    imageSi.setImageResource(R.drawable.ubuntu);
                }else if (recupera.equals("Debian")) {
                    TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
                    String rw;
                    rw = getIntent().getStringExtra("ln");
                    mwv.setText(rw);

                    TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
                    String rwfc;
                    rwfc = getIntent().getStringExtra("lfc");
                    mwfc.setText(rwfc);

                    TextView mfd = (TextView) findViewById(R.id.idDesconti);
                    String rwfd;
                    rwfd = getIntent().getStringExtra("lfd");
                    mfd.setText(rwfd);
                    imageSi.setImageResource(R.drawable.debian);
                }else if (recupera.equals("Linux Mint")) {
                    TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
                    String rw;
                    rw = getIntent().getStringExtra("ln");
                    mwv.setText(rw);

                    TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
                    String rwfc;
                    rwfc = getIntent().getStringExtra("lfc");
                    mwfc.setText(rwfc);

                    TextView mfd = (TextView) findViewById(R.id.idDesconti);
                    String rwfd;
                    rwfd = getIntent().getStringExtra("lfd");
                    mfd.setText(rwfd);
                    imageSi.setImageResource(R.drawable.linuxmint);

                }else if (recupera.equals("Fedora")) {
                    TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
                    String rw;
                    rw = getIntent().getStringExtra("ln");
                    mwv.setText(rw);

                    TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
                    String rwfc;
                    rwfc = getIntent().getStringExtra("lfc");
                    mwfc.setText(rwfc);

                    TextView mfd = (TextView) findViewById(R.id.idDesconti);
                    String rwfd;
                    rwfd = getIntent().getStringExtra("lfd");
                    mfd.setText(rwfd);
                    imageSi.setImageResource(R.drawable.fedora);
                }
        //////////////////////////////////////////////////Iphone///////////////////////////////////////
                else if (recupera.equals("iPhone")) {
                    i1.start();
                    TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
                    String rw;
                    rw = getIntent().getStringExtra("in");
                    mwv.setText(rw);

                    TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
                    String rwfc;
                    rwfc = getIntent().getStringExtra("ifc");
                    mwfc.setText(rwfc);

                    TextView mfd = (TextView) findViewById(R.id.idDesconti);
                    String rwfd;
                    rwfd = getIntent().getStringExtra("ifd");
                    mfd.setText(rwfd);
                    imageSi.setImageResource(R.drawable.mac);
                }
                else if (recupera.equals("iPhone 3G")) {
                    i2.start();
                    TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
                    String rw;
                    rw = getIntent().getStringExtra("in");
                    mwv.setText(rw);

                    TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
                    String rwfc;
                    rwfc = getIntent().getStringExtra("ifc");
                    mwfc.setText(rwfc);

                    TextView mfd = (TextView) findViewById(R.id.idDesconti);
                    String rwfd;
                    rwfd = getIntent().getStringExtra("ifd");
                    mfd.setText(rwfd);
                    imageSi.setImageResource(R.drawable.mac2);
                } else if (recupera.equals("iPhone 3GS")) {
                    i3.start();
                    TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
                    String rw;
                    rw = getIntent().getStringExtra("in");
                    mwv.setText(rw);

                    TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
                    String rwfc;
                    rwfc = getIntent().getStringExtra("ifc");
                    mwfc.setText(rwfc);

                    TextView mfd = (TextView) findViewById(R.id.idDesconti);
                    String rwfd;
                    rwfd = getIntent().getStringExtra("ifd");
                    mfd.setText(rwfd);
                    imageSi.setImageResource(R.drawable.mac3);
                } else if (recupera.equals("iPhone 4")) {
                    i3.start();
                    TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
                    String rw;
                    rw = getIntent().getStringExtra("in");
                    mwv.setText(rw);

                    TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
                    String rwfc;
                    rwfc = getIntent().getStringExtra("ifc");
                    mwfc.setText(rwfc);

                    TextView mfd = (TextView) findViewById(R.id.idDesconti);
                    String rwfd;
                    rwfd = getIntent().getStringExtra("ifd");
                    mfd.setText(rwfd);
                    imageSi.setImageResource(R.drawable.mac3);
                } else if (recupera.equals("iPhone 5")) {
                    i4.start();
                    TextView mwv = (TextView) findViewById(R.id.idWindowsxp);
                    String rw;
                    rw = getIntent().getStringExtra("in");
                    mwv.setText(rw);

                    TextView mwfc = (TextView) findViewById(R.id.idFechaCreacion);
                    String rwfc;
                    rwfc = getIntent().getStringExtra("ifc");
                    mwfc.setText(rwfc);

                    TextView mfd = (TextView) findViewById(R.id.idDesconti);
                    String rwfd;
                    rwfd = getIntent().getStringExtra("ifd");
                    mfd.setText(rwfd);
                    imageSi.setImageResource(R.drawable.mac4);
                }

    }
}
