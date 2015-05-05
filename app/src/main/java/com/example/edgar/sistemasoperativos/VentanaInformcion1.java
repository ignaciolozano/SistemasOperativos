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

        // recuperarSis();

///////////////////////////////Titulo Windows



       TextView mn = (TextView) findViewById(R.id.idsistemas);
        String rt;
        rt = getIntent().getStringExtra("nom");
        mn.setText(rt);

        String recupera = getIntent().getStringExtra("tipoSistema");
        ArrayAdapter<String> adapter;
        if (recupera.equals("Windows")) {
            mn = (TextView) findViewById(R.id.idsistemas);
            rt = getIntent().getStringExtra("nom");
            mn.setText(rt);
            spinner2 = (Spinner) findViewById(R.id.spinner2);
            String[] opciones1 = {"Windows XP", "Windows Vista", "Windows 7", "Windows 8", "Windows 10"};
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones1);
            spinner2.setAdapter(adapter);

        } else if (recupera.equals("Android")) {
            mn = (TextView) findViewById(R.id.idsistemas);
            rt = getIntent().getStringExtra("nom");
            mn.setText(rt);
            spinner2 = (Spinner) findViewById(R.id.spinner2);
            String[] opciones = {"Android 2.2.x Froyo", "Android 4.1 Jelly Bean", "Android 4.4 KitKat ", "Android 5.0 Lollipop"};
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
            spinner2.setAdapter(adapter);

        }else if (recupera.equals("OSX")){
            mn = (TextView) findViewById(R.id.idsistemas);
            rt = getIntent().getStringExtra("nom");
            mn.setText(rt);
            spinner2 = (Spinner) findViewById(R.id.spinner2);
            String[] opciones = {"Versión 10.6: Snow Leopard", "Versión 10.7: Lion", "Versión 10.8: Mountain Lion", "Versión 10.10: Yosemite"};
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
            spinner2.setAdapter(adapter);
        }
        else if (recupera.equals("Linux")){
            mn = (TextView) findViewById(R.id.idsistemas);
            rt = getIntent().getStringExtra("nom");
            mn.setText(rt);
            spinner2 = (Spinner) findViewById(R.id.spinner2);
            String[] opciones = {"Ubuntu", "Debian", " Linux Mint", "Fedora"};
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
            spinner2.setAdapter(adapter);
        }
        else if (recupera.equals("iOS")){
            mn = (TextView) findViewById(R.id.idsistemas);
            rt = getIntent().getStringExtra("nom");
            mn.setText(rt);
            spinner2 = (Spinner) findViewById(R.id.spinner2);
            String[] opciones = {"iPhone", "iPhone 3G", "iPhone 3GS", "iPhone 4","iPhone 5","iPhone 5s", "iPhone 6"};
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
            spinner2.setAdapter(adapter);
        }

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
        if (id == R.id.action_Regresar) {
            Intent i = new Intent(this, MainActivity.class );
            startActivity(i);

            return true;
        }
        if(id == R.id.action_verciones)
        {
            String selec=spinner2.getSelectedItem().toString();
            if(selec.equals("Windows XP"))
            {
                windowsxp();
            }
            else
            if(selec.equals("Windows Vista"))
            {
                windowsVista();
            }
            else
                if (selec.equals("Windows 7"))
                {
                windows7();
                }else
                    if (selec.equals("Windows 8"))
                    {
                        windows8();
                    }else
                        if (selec.equals("Windows 10"))
                        {
                            windows10();
                        }else
                        ////////////////////////////////////////////////Android//////////////////////////////////////////
                            if (selec.equals("Android 2.2.x Froyo"))
                            {
                                anFroyo();
                            }else
                            if (selec.equals("Android 4.1 Jelly Bean"))
                            {
                                anJellyBean();
                            }else
                            if (selec.equals("Android 4.4 KitKat"))
                            {
                                anKitKat();
                            }else
                            if (selec.equals("Android 5.0 Lollipop"))
                            {
                                anLillipop();
                            }
            ////////////////////////////////////////IOX///////////////////////////////////////////////////////

                            else
                            if (selec.equals("Versión 10.6: Snow Leopard")){
                                leopardOS();
                            }else
                            if (selec.equals("Versión 10.7: Lion")){
                                lionOS(); }
                            else
                            if (selec.equals("Versión 10.8: Mountain Lion"))
                            {
                                 mountainLionOS();
                            }
                            else
                            if (selec.equals("Versión 10.10: Yosemite"))
                            {
                                yosemiteOS();
                            }
            else
 //////////////////////////////////////////////////Linux////////////////////////////////////////////////////////////////////////
                            //Debian", " Linux Mint", ". Fedora
            if (selec.equals("Ubuntu")){
                    ubuntuL();
            }else if (selec.equals("Debian")){
                        debianL();
            }else if (selec.equals("Linux Mint")){
                            LinuxMl();
            }else if (selec.equals("Fedora")){
                                fedoraL();
            }
///////////////////////////////////////////////////IOS///////////////////////////////////////////////////////////////////////////
            //iPhone", "iPhone 3G", "iPhone 3GS", "iPhone 4","iPhone 5","iPhone 5s", "iPhone 6
            else if (selec.equals("iPhone")){
                    iphone();
            }else if (selec.equals("iPhone 3G")){
                    iphone3G();
            }else if (selec.equals("iPhone 3GS")){
                    iphone3GS();
            }else if (selec.equals("iPhone 4")){
                    iphone4();
            }else if (selec.equals("iPhone 5")){
                       iphone5();
            }else if (selec.equals("iPhone 5s")){

            }
            else if (selec.equals("iPhone 6")){

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

    public void windowsVista(){

        String twv;
        String twvfc; //Texto W indos Vista fecha de creacion
        String twvfd;
        String tipoS;


        twv = "es una versión de Microsoft Windows, línea de sistemas operativos desarrollada por" +
             " Microsoft. Esta versión se enfoca para ser utilizada en equipos de escritorio en " +
                "hogares y oficinas, equipos portátiles, tabletas y equipos media center.";
        twvfc =" 8 de noviembre de 2006";
        twvfd =" ... ";
        tipoS = "Windows Vista";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("twv", twv);
        i.putExtra("twvfc",twvfc);
        i.putExtra("twfd",twvfd);
        i.putExtra("tipoS", tipoS);
        startActivity(i);

    }

    public void windows7()
    {
        String W7;
        String W7fc;
        String W7fd;
        String tipoS;

        W7 = "es una versión de Microsoft  Windows, línea de  sistemas  operativos " +
                        "producida por Microsoft Corporation. Esta versión está diseñada para " +
                        "uso en PC, incluyendo equipos de  escritorio  en  hogares y oficinas," +
                       " equipos portátiles, tablet PC, netbooks y equipos media center.";
        W7fc ="22 de julio de 2009";
        W7fd ="......";
        tipoS = "Windows 7";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("W7", W7);
        i.putExtra("W7fc",W7fc);
        i.putExtra("W7fd",W7fd);
        i.putExtra("tipoS", tipoS);
        startActivity(i);
    }
    public void windows8()
    {
        String w8,w8fc,w8fd,tipoS;
        w8 = " es la versión actual del sistema operativo de Microsoft Windows, producido por " +
              "Microsoft para su uso en computadoras personales, incluidas computadoras de " +
              "escritorio en casa y de negocios, computadoras portátiles, netbooks, tabletas," +
              "servidores y centros multimedia.";
        w8fc ="16 de febrero de 2012"; w8fd ="........."; tipoS = "Windows 8";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("w8", w8);i.putExtra("w8fc",w8fc);i.putExtra("w8fd",w8fd); i.putExtra("tipoS", tipoS);
        startActivity(i);
    }

    public void windows10()
    {
        String w10,w10fc,w10fd,tipoS;

        w10 = " es la versión más reciente del sistema operativo desarrollado por Microsoft " +
              "Será el sucesor de Windows 8 y 8.1. El sistema operativo se anuncia sólo dos" +
             " años después del lanzamiento de Windows 8, en octubre de 2012, una versión " +
              "que supuso un cambio radical respecto a las anteriores de Windows y que ha " +
              "tenido durante este tiempo una recepción mixta por parte de los usuarios y " +
              "las empresas";
        w10fc ="16 de febrero de 2012";
        w10fd =".........";
        tipoS = "Windows 10";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("w10", w10);
        i.putExtra("w10fc",w10fc);
        i.putExtra("w10fd",w10fd);
        i.putExtra("tipoS", tipoS);
        startActivity(i);
    }//Android 2.2.x Froyo","Android 4.1 Jelly Bean","Android 4.4 KitKat ","Android 5.0 Lollipop

    public void anFroyo()
    {
        String an, anfc, anfd,tipoS;
        an = " El 20 de mayo de 2010, El SDK de Android 2.2 Froyo (Yogur helado) fue lanzado, basado" +
                " en el núcleo Linux 2.6.32";
        anfc ="20 de mayo de 2010";
        anfd ="....";
        tipoS = "Froyo";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("an", an); i.putExtra("anfc",anfc);i.putExtra("anfd",anfd); i.putExtra("tipoS", tipoS);
        startActivity(i);
    }
    public void anJellyBean()
    {
        String an;
        String anfc;
        String anfd;
        String tipoS;
        an = "Jelly Bean (Gomita Confitada o Gominola) Basado en el núcleo de linux 3.0.31, Bean \" +\n" +
                "                \"fue una actualización incremental con el enfoque primario de mejorar la \" +\n" +
                "                \"funcionalidad y el rendimiento de la interfaz de usuario.\n";
        anfc ="El 20 de mayo de 201";
        anfd ="....";
        tipoS = "Jelly Bean";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("an", an);
        i.putExtra("anfc",anfc);
        i.putExtra("anfd",anfd);
        i.putExtra("tipoS", tipoS);
        startActivity(i);
    }
    public void anKitKat()
    {
        String an, anfc, anfd,tipoS;
        an = " Su nombre se debe a la chocolatina KitKat, de la empresa internacional Nestlé";
        anfc ="31 de octubre de 2013";
        anfd ="....";
        tipoS = "Kit Kat";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("an", an); i.putExtra("anfc",anfc);i.putExtra("anfd",anfd); i.putExtra("tipoS", tipoS);
        startActivity(i);

    }
    public void anLillipop()
    {
        String an, anfc, anfd,tipoS;
        an = " Un diseño intrépido, colorido, y sensible interfaz de usuario para las experiencias " +
                "coherentes e intuitivos en todos los dispositivos. Movimiento de respuesta natural," +
                " iluminación y sombras realistas y familiares elementos visuales hacen que sea más " +
                "fácil de navegar su dispositivo";
        anfc ="3 de noviembre de 2014";
        anfd ="....";
        tipoS = "Lillipop";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("an", an); i.putExtra("anfc",anfc);i.putExtra("anfd",anfd); i.putExtra("tipoS", tipoS);
        startActivity(i);
    }
    //Versión 10.6: Snow Leopard", "Versión 10.7: Lion", "Versión 10.8: Mountain Lion", "Versión 10.10: Yosemite
    public void  leopardOS(){
        String osn, osfc, osfd,tipoS;
        osn =" Fue llamado por Apple como «la mayor actualización del Mac OS X». Trajo consigo " +
                "más de 300 nuevas funciones.83 Leopard soporta tanto procesadores PowerPC como " +
                "Intel; el soporte para procesadores G3 fue abandonado y el procesador G4 requiere " +
                "una velocidad mínima de 867 MHz, y 512 MB de RAM para permitir la instalación.";
        osfc =" 26 de octubre de 2007";
        osfd ="....";
        tipoS = "Leopardo";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("osn", osn); i.putExtra("osfc",osfc);i.putExtra("osfd",osfd); i.putExtra("tipoS", tipoS);
        startActivity(i);
    }
    public void  lionOS(){
        String osn, osfc, osfd,tipoS;
        osn =" Apple mostró un Sneak Peek del próximo sistema operativo Mac OS X 10.7 con " +
                "nombre código «Lion». Dentro de las primeras características se encuentran " +
                "Launchpad que es un gestor de aplicaciones estilo iOS; y Mission Control que " +
                "se podría decir es la integración de Dashboard,";
        osfc =" 20 de octubre de 2010";
        osfd ="....";
        tipoS = "Lion";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("osn", osn); i.putExtra("osfc",osfc);i.putExtra("osfd",osfd); i.putExtra("tipoS", tipoS);
        startActivity(i);
    }
    public void  mountainLionOS(){
        String osn, osfc, osfd,tipoS;
        osn =" Apple lanzó la Developer Preview de Mac OS X 10.8 Mountain Lion, una versión del " +
                "sistema operativo en la que se incluyen muchas aplicaciones nativas de iOS, como " +
                "Recordatorios, Notas o Mensajes. Incluye también un centro de notificaciones " +
                "cercano al de iOS. Mac OS X Mountain Lion salió a la venta en España el 25 de " +
                "julio de 2012. Con esta nueva versión, Apple pretende potenciar el uso de la nube," +
                " con el ya usado iCloud,";
        osfc ="16 de febrero de 2012 ";
        osfd ="....";
        tipoS = "Mountain Lion";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("osn", osn); i.putExtra("osfc",osfc);i.putExtra("osfd",osfd); i.putExtra("tipoS", tipoS);
        startActivity(i);
    }
    public void  yosemiteOS(){
        String osn, osfc, osfd,tipoS;
        osn =" Apple presentó en la \"WWDC 2014\" Mac OS X 10.10 Yosemite, una nueva versión del " +
                "sistema operativo que presenta un rediseño en su interfaz y mejoras en el Finder, " +
                "Safari, Mail, Centro de Notificaciones, etc. La versión Beta se encontrará " +
                "disponible únicamente para el primer millón de usuarios que se suscriban en el " +
                "programa Beta de Apple.";
        osfc ="2 de junio de 2014";
        osfd ="....";
        tipoS = "Yosemite";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("osn", osn); i.putExtra("osfc",osfc);i.putExtra("osfd",osfd); i.putExtra("tipoS", tipoS);
        startActivity(i);
    }//////////////////////////////////////////////////////////////////Linux/////////////////////////////////////////////////////////////////
    //Debian", " Linux Mint", ". Fedora
    public void  ubuntuL(){
        String ln, lfc, lfd,tipoS;
        ln =" es un sistema operativo basado en GNU/Linux y que se distribuye como software libre ," +
                " el cual incluye su propio entorno de escritorio denominado Unity. Su nombre proviene" +
                " de la ética homónima, en la que se habla de la existencia de uno mismo como cooperación " +
                "de los demás.";
        lfc ="20 de octubre de 2004";
        lfd ="....";
        tipoS = "Ubuntu";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("ln", ln); i.putExtra("lfc",lfc);i.putExtra("lfd",lfd); i.putExtra("tipoS", tipoS);
        startActivity(i);
    }
    public void  LinuxMl(){
        String ln, lfc, lfd,tipoS;
        ln =" Linux Mint se compone de muchos paquetes de software, la mayor parte de los cuales se " +
                "distribuyen bajo una licencia de software libre. La principal licencia utilizada es " +
                "la GNU General Public License (GNU GPL) que, junto con la GNU Lesser General Public " +
                "License (GNU LGPL), ";
        lfc ="El 7 de septiembre de 2010";
        lfd ="....";
        tipoS = "Linux Mint";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("ln", ln); i.putExtra("lfc",lfc);i.putExtra("lfd",lfd); i.putExtra("tipoS", tipoS);
        startActivity(i);
    }
    public void  debianL(){
        String ln, lfc, lfd,tipoS;
        ln =" es una comunidad conformada por desarrolladores y usuarios, que mantiene un sistema " +
                "operativo GNU basado en software libre. El sistema se encuentra precompilado, " +
                "empaquetado y en un formato deb para múltiples arquitecturas de computador y " +
                "para varios núcleos.";
        lfc ="1995";
        lfd ="....";
        tipoS = "Debian";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("ln", ln); i.putExtra("lfc",lfc);i.putExtra("lfd",lfd); i.putExtra("tipoS", tipoS);
        startActivity(i);
    }
    public void  fedoraL(){
        String ln, lfc, lfd,tipoS;
        ln ="es una distribución Linux para propósitos generales basada en RPM, que se caracteriza " +
                "por ser un sistema estable, la cual es mantenida gracias a una comunidad internacional " +
                "de ingenieros, diseñadores gráficos y usuarios que informan de fallos y prueban nuevas " +
                "tecnologías. Cuenta con el respaldo y la promoción de Red Hat..";
        lfc ="16 de noviembre de 2001";
        lfd ="....";
        tipoS = "Fedora";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("ln", ln); i.putExtra("lfc",lfc);i.putExtra("lfd",lfd); i.putExtra("tipoS", tipoS);
        startActivity(i);
    }

    public void iphone(){
        String in, ifc, ifd,tipoS;
        in ="fue un teléfono inteligente de gama alta multimedia con conexión a Internet, pantalla" +
                " táctil capacitiva (con soporte multitáctil) y una interfaz de software minimalista" +
                " de la compañía Apple Inc..";
        ifc ="2007 solo EEUU";
        ifd ="....";
        tipoS = "iPhone";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("in", in); i.putExtra("ifc",ifc);i.putExtra("ifd",ifd); i.putExtra("tipoS", tipoS);
        startActivity(i);
    }//iPhone", "iPhone 3G", "iPhone 3GS", "iPhone 4","iPhone 5","iPhone 5s", "iPhone 6
    public void iphone3G(){
        String in, ifc, ifd,tipoS;
        in =" El iPhone es internamente similar a su predecesor, pero incluye varias características" +
                " nuevas en cuanto a hardware , tales como, GPS Asistido, datos 3G y soporte Tribanda" +
                " UMTS/HSDPA. El iPhone 3G también poseía mejoras a nivel de software presentes en el " +
                "iOS 2.0, el cual fue lanzado al mismo tiempo.";
        ifc = "11 de julio de 2008";
        ifd ="....";
        tipoS = "iPhone 3G";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("in", in); i.putExtra("ifc",ifc);i.putExtra("ifd",ifd); i.putExtra("tipoS", tipoS);
        startActivity(i);
    }
    public void iphone3GS(){
        String in, ifc, ifd,tipoS;
        in =" El iPhone 3GS usa el sistema operativo iOS de Apple, usado también en el iPad e " +
                "iPod Touch. Es controlado con gestos táctiles. Su sucesor es el iPhone 4, y fue" +
                " discontinuado del mercado en 2012 con el lanzamiento del iPhone 5";
        ifc = "19 de junio de 2009";
        ifd ="....";
        tipoS = "iPhone 3GS";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("in", in); i.putExtra("ifc",ifc);i.putExtra("ifd",ifd); i.putExtra("tipoS", tipoS);
        startActivity(i);
    }
    public void iphone4(){
        String in, ifc, ifd,tipoS;
        in =" es un teléfono inteligente de gama alta, que representó entre octubre-noviembre " +
                "de 2014, el 55% de los iPhone de Apple, que fue lanzado oficialmente al mercado" +
                " el año 2010 (en su color negro) y 2011 (en su color blanco). A diferencia de " +
                "las versiones anteriores del iPhone (2G, iPhone 3G y iPhone 3GS),";
        ifc = "2010/2011";
        ifd ="....";
        tipoS = "iPhone 4";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("in", in); i.putExtra("ifc",ifc);i.putExtra("ifd",ifd); i.putExtra("tipoS", tipoS);
        startActivity(i);
    }
    public void iphone5(){
        String in, ifc, ifd,tipoS;
        in =" es un teléfono inteligente de gama alta, que representó entre octubre-noviembre " +
                "de 2014, el 55% de los iPhone de Apple, que fue lanzado oficialmente al mercado" +
                " el año 2010 (en su color negro) y 2011 (en su color blanco). A diferencia de " +
                "las versiones anteriores del iPhone (2G, iPhone 3G y iPhone 3GS),";
        ifc = "2010/2011";
        ifd ="....";
        tipoS = "iPhone 5";
        Intent i = new Intent(this, VentanaInformacion2.class );
        i.putExtra("in", in); i.putExtra("ifc",ifc);i.putExtra("ifd",ifd); i.putExtra("tipoS", tipoS);
        startActivity(i);
    }


/*
    public void recuperarSis(){
        String recupera=getIntent().getStringExtra("tipoSistema");


        if(recupera.equals("Windows"))
        {
            TextView textoW = (TextView) findViewById(R.id.idsistemas);
            String des="Perrron";
            textoW.setText(des);
        }

    }*/
}
