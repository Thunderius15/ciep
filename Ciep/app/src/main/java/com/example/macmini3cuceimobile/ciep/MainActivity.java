package com.example.macmini3cuceimobile.ciep;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MainActivity extends ActionBarActivity {

    private final String NAMESPACE = "http://webservice/Logon.wsdl";
    private final String URL = "http://148.202.105.181/WebServiceLogon/WebServiceLogon";
    private final String SOAP_ACTION = "http://webservice/Logon.wsdl/valida";
    private final String METHOD_NAME = "valida";
    String usuario=null;
    String password=null;
    private static String key="UdGSIIAUWebServiceValidaUsuario";
    String temp=null;
    String salto=System.getProperty("line.separator");
    Boolean confirmacion=false;
    Boolean logeo=false;
    Boolean guia=false;
    String situacion1=null;
    String codigo1=null;
    String nombre1=null;
    String centro1=null;
    String carrera1=null;
    String departamento1=null;
    String situacion3=null;
    String codigo3=null;
    String nombre3=null;
    String centro3=null;
    String carrera3=null;
    String usuario3=null;
    String password3=null;
    String password32=null;
    String linea=null;
    String total="";
    EditText Usuario;
    EditText Contraseña;
    EditText situacion;
    EditText departamento;
    EditText codigo;
    EditText nombre;
    EditText centro;
    EditText carrera;
    EditText codigo4;
    EditText nombre4;
    EditText centro4;
    EditText carrera4;
    EditText usuario4;
    EditText contraseña4;
    EditText contraseña5;
    TextView op1_1;
    TextView op1_2;
    TextView op1_3;
    TextView op1_4;
    TextView op2_1;
    TextView op2_2;
    TextView op2_3;
    TextView op2_4;
    TextView op3_1;
    TextView op3_2;
    TextView op3_3;
    TextView op3_4;
    TextView op4_1;
    TextView op4_2;
    TextView op4_3;
    TextView op4_4;
    TextView op5_1;
    TextView op5_2;
    TextView op5_3;
    TextView op5_4;
    TextView op6_1;
    TextView op6_2;
    TextView op6_3;
    TextView op6_4;
    TextView op7_1;
    TextView op7_2;
    TextView op7_3;
    TextView op7_4;
    TextView op8_1;
    TextView op8_2;
    TextView op8_3;
    TextView op8_4;
    TextView op9_1;
    TextView op9_2;
    TextView op9_3;
    TextView op9_4;
    TextView op10_1;
    TextView op10_2;
    TextView op10_3;
    TextView op10_4;
    TextView op11_1;
    TextView op11_2;
    TextView op11_3;
    TextView op11_4;
    TextView op12_1;
    TextView op12_2;
    TextView op12_3;
    TextView op12_4;
    TextView op13_1;
    TextView op13_2;
    TextView op13_3;
    TextView op13_4;
    TextView op14_1;
    TextView op14_2;
    TextView op14_3;
    TextView op14_4;
    TextView op15_1;
    TextView op15_2;
    TextView op15_3;
    TextView op15_4;
    Button entrar21;
    Button entrar1;
    Button registrar1;
    Button siguiente1;
    Button cancelar1;
    Button regresar1;
    Button cerrar1;
    Button cerrar3;
    File ruta= Environment.getExternalStoragePublicDirectory("/.estu@pp/");
    File rutaguia8= Environment.getExternalStoragePublicDirectory("/.estu@pp/.guia8/");
    File nomar = new File(ruta.getAbsolutePath(), "registros.txt");
    File temploggeo = new File(ruta.getAbsolutePath(), "loggeo.txt");
    File guardadatosnum = new File(rutaguia8.getAbsolutePath(), "Datos Numericos.txt");
    Spinner sp;
    int pos;
    String[ ] array = {"Activo","Egresado","Trabajador"};
    int numguia=0;
    VideoView mVideoView;
    ImageView mImageView;
    MediaPlayer aud=null;
    int numaudguia8=0;
    int correctas8=0;
    float correctas9=0;
    int TIEMPO = 1500;
    Boolean seleccion8=false;
    int pregunta=0;
    int preguntas9[][]={{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0}};
    Menu menu;
    MenuItem opcion1;
    MenuItem opcion2;
    MenuItem submenu1;
    MenuItem submenu8;
    MenuItem submenu9;
    MenuItem submenu10;
    MenuItem submenu11;
    int ventana_datosnum=0;
    ImageView imagenguia9;
    Boolean descarga=false;
    int numar=0;
    File carga=null;
    LinearLayout fondo1_pantalla1_datosnumericos;
    ImageView imagen1_pantalla1_datosnumericos;
    ImageView imagen2_pantalla1_datosnumericos;
    ImageView imagen1_pantalla2_datosnumericos;
    ImageView imagen2_pantalla2_datosnumericos;
    ImageView imagen3_pantalla2_datosnumericos;
    ImageView imagen4_pantalla2_datosnumericos;
    ImageView imagen5_pantalla2_datosnumericos;
    ImageView imagen6_pantalla2_datosnumericos;
    ImageView imagen1_pantalla3_datosnumericos;
    ImageView imagen2_pantalla3_datosnumericos;
    ImageView imagen3_pantalla3_datosnumericos;
    ImageView imagen4_pantalla3_datosnumericos;
    ImageView imagen1_pantalla4_datosnumericos;
    ImageView imagen2_pantalla4_datosnumericos;
    ImageView imagen3_pantalla4_datosnumericos;
    ImageView imagen4_pantalla4_datosnumericos;
    ImageView imagen1_pantalla5_datosnumericos;
    ImageView imagen2_pantalla5_datosnumericos;
    ImageView imagen3_pantalla5_datosnumericos;
    ImageView imagen4_pantalla5_datosnumericos;
    ImageView imagen1_pantalla6_datosnumericos;
    ImageView imagen2_pantalla6_datosnumericos;
    ImageView imagen3_pantalla6_datosnumericos;
    ImageView imagen4_pantalla6_datosnumericos;
    ImageView imagen1_pantalla7_datosnumericos;
    ImageView imagen2_pantalla7_datosnumericos;
    ImageView imagen3_pantalla7_datosnumericos;
    ImageView imagen4_pantalla7_datosnumericos;
    ImageView imagen1_pantalla8_datosnumericos;
    ImageView imagen2_pantalla8_datosnumericos;
    ImageView imagen3_pantalla8_datosnumericos;
    ImageView imagen4_pantalla8_datosnumericos;
    ImageView imagen1_pantalla9_datosnumericos;
    ImageView imagen2_pantalla9_datosnumericos;
    ImageView imagen3_pantalla9_datosnumericos;
    ImageView imagen4_pantalla9_datosnumericos;
    ImageView imagen5_pantalla9_datosnumericos;
    ImageView imagen1_pantalla10_datosnumericos;
    ImageView imagen2_pantalla10_datosnumericos;
    ImageView imagen3_pantalla10_datosnumericos;
    ImageView imagen4_pantalla10_datosnumericos;
    ImageView imagen1_pantalla11_datosnumericos;
    ImageView imagen2_pantalla11_datosnumericos;
    ImageView imagen3_pantalla11_datosnumericos;
    ImageView imagen4_pantalla11_datosnumericos;
    ImageView imagen1_pantalla12_datosnumericos;
    ImageView imagen2_pantalla12_datosnumericos;
    ImageView imagen3_pantalla12_datosnumericos;
    ImageView imagen4_pantalla12_datosnumericos;
    LinearLayout fondo1_pantalla13_datosnumericos;
    ImageView imagen1_pantalla13_datosnumericos;
    ImageView imagen2_pantalla13_datosnumericos;
    ImageView imagen3_pantalla13_datosnumericos;
    ImageView imagen1_pantalla14_datosnumericos;
    ImageView imagen2_pantalla14_datosnumericos;
    ImageView imagen1_pantalla15_datosnumericos;
    ImageView imagen2_pantalla15_datosnumericos;
    ImageView imagen1_pantalla16_datosnumericos;
    ImageView imagen2_pantalla16_datosnumericos;
    ImageView imagen1_pantalla17_datosnumericos;
    ImageView imagen2_pantalla17_datosnumericos;
    ImageView imagen1_pantalla18_datosnumericos;
    ImageView imagen2_pantalla18_datosnumericos;
    ImageView imagen3_pantalla18_datosnumericos;
    ImageView imagen1_pantalla19_datosnumericos;
    ImageView imagen2_pantalla19_datosnumericos;
    ImageView imagen3_pantalla19_datosnumericos;
    ImageView imagen1_pantalla20_datosnumericos;
    ImageView imagen2_pantalla20_datosnumericos;
    ImageView imagen3_pantalla20_datosnumericos;
    ImageView imagen1_pantalla21_datosnumericos;
    ImageView imagen2_pantalla21_datosnumericos;
    ImageView imagen3_pantalla21_datosnumericos;
    ImageView imagen1_pantalla22_datosnumericos;
    ImageView imagen2_pantalla22_datosnumericos;
    ImageView imagen3_pantalla22_datosnumericos;
    ImageView imagen1_pantalla23_datosnumericos;
    ImageView imagen2_pantalla23_datosnumericos;
    ImageView imagen3_pantalla23_datosnumericos;
    ImageView imagen1_pantalla24_datosnumericos;
    ImageView imagen2_pantalla24_datosnumericos;
    ImageView imagen3_pantalla24_datosnumericos;
    ImageView imagen1_pantalla25_datosnumericos;
    ImageView imagen2_pantalla25_datosnumericos;
    ImageView imagen3_pantalla25_datosnumericos;
    ImageView imagen1_pantalla26_datosnumericos;
    ImageView imagen2_pantalla26_datosnumericos;
    ImageView imagen3_pantalla26_datosnumericos;
    ImageView imagen1_pantalla27_datosnumericos;
    ImageView imagen2_pantalla27_datosnumericos;
    ImageView imagen3_pantalla27_datosnumericos;
    ImageView imagen1_pantalla28_datosnumericos;
    ImageView imagen2_pantalla28_datosnumericos;
    ImageView imagen3_pantalla28_datosnumericos;
    ImageView imagen4_pantalla28_datosnumericos;
    ImageView estrella1_pantalla28_datosnumericos;
    ImageView estrella2_pantalla28_datosnumericos;
    ImageView estrella3_pantalla28_datosnumericos;
    ImageView estrella4_pantalla28_datosnumericos;
    ImageView estrella5_pantalla28_datosnumericos;
    TextView texto1_pantalla28_datosnumericos;
    TextView texto2_pantalla28_datosnumericos;
    TextView texto3_pantalla28_datosnumericos;
    ImageView imagen1_pantalla29_datosnumericos;
    File au;
    int ventana_foros;
    LinearLayout fondo1_pantalla1_forosvirtuales;
    ImageView imagen1_pantalla1_forosvirtuales;
    LinearLayout fondo2_pantalla1_forosvirtuales;
    ImageView comenzar_forosvirtuales;
    ImageView imagen1_pantalla2_forosvirtuales;
    ImageView imagen2_pantalla2_forosvirtuales;
    LinearLayout fondo1_pantalla2_forosvirtuales;
    ImageView menu_forosvirtuales;
    ImageView fondo1_pantalla3_forosvirtuales;
    ImageView imagen1_pantalla3_forosvirtuales;
    ImageView imagen2_pantalla3_forosvirtuales;
    ImageView imagen3_pantalla3_forosvirtuales;
    ImageView imagen4_pantalla3_forosvirtuales;
    ImageView fondo1_pantalla4_forosvirtuales;
    ImageView imagen1_pantalla4_forosvirtuales;
    ImageView imagen2_pantalla4_forosvirtuales;
    ImageView imagen3_pantalla4_forosvirtuales;
    ImageView imagen4_pantalla4_forosvirtuales;
    ImageView imagen5_pantalla4_forosvirtuales;
    ImageView fondo1_pantalla5_forosvirtuales;
    ImageView imagen1_pantalla5_forosvirtuales;
    ImageView imagen2_pantalla5_forosvirtuales;
    ImageView imagen3_pantalla5_forosvirtuales;
    ImageView imagen4_pantalla5_forosvirtuales;
    ImageView imagen5_pantalla5_forosvirtuales;
    ImageView imagen1_pantalla6_forosvirtuales;
    ImageView imagen2_pantalla6_forosvirtuales;
    ImageView imagen3_pantalla6_forosvirtuales;
    ImageView imagen4_pantalla6_forosvirtuales;
    ImageView imagen5_pantalla6_forosvirtuales;
    ImageView fondo1_pantalla7_forosvirtuales;
    ImageView imagen1_pantalla7_forosvirtuales;
    ImageView imagen2_pantalla7_forosvirtuales;
    ImageView imagen3_pantalla7_forosvirtuales;
    ImageView imagen4_pantalla7_forosvirtuales;
    ImageView imagen5_pantalla7_forosvirtuales;
    ImageView imagen1_pantalla8_forosvirtuales;
    ImageView imagen2_pantalla8_forosvirtuales;
    ImageView imagen3_pantalla8_forosvirtuales;
    ImageView imagen4_pantalla8_forosvirtuales;
    ImageView imagen5_pantalla8_forosvirtuales;
    ImageView fondo1_pantalla9_forosvirtuales;
    ImageView imagen1_pantalla9_forosvirtuales;
    ImageView imagen2_pantalla9_forosvirtuales;
    ImageView imagen3_pantalla9_forosvirtuales;
    ImageView imagen4_pantalla9_forosvirtuales;
    ImageView fondo1_pantalla10_forosvirtuales;
    ImageView imagen1_pantalla10_forosvirtuales;
    ImageView imagen2_pantalla10_forosvirtuales;
    ImageView imagen3_pantalla10_forosvirtuales;
    ImageView imagen4_pantalla10_forosvirtuales;
    ImageView imagen5_pantalla10_forosvirtuales;
    ImageView fondo1_pantalla11_forosvirtuales;
    ImageView imagen1_pantalla11_forosvirtuales;
    ImageView imagen2_pantalla11_forosvirtuales;
    ImageView imagen3_pantalla11_forosvirtuales;
    ImageView imagen4_pantalla11_forosvirtuales;
    ImageView fondo1_pantalla12_forosvirtuales;
    ImageView imagen1_pantalla12_forosvirtuales;
    ImageView imagen2_pantalla12_forosvirtuales;
    ImageView imagen3_pantalla12_forosvirtuales;
    ImageView imagen4_pantalla12_forosvirtuales;
    ImageView fondo1_pantalla13_forosvirtuales;
    ImageView imagen1_pantalla13_forosvirtuales;
    ImageView imagen2_pantalla13_forosvirtuales;
    ImageView imagen3_pantalla13_forosvirtuales;
    ImageView imagen4_pantalla13_forosvirtuales;
    ImageView fondo1_pantalla14_forosvirtuales;
    ImageView imagen1_pantalla14_forosvirtuales;
    ImageView imagen2_pantalla14_forosvirtuales;
    ImageView imagen3_pantalla14_forosvirtuales;
    ImageView imagen4_pantalla14_forosvirtuales;
    ImageView fondo1_pantalla15_forosvirtuales;
    ImageView imagen1_pantalla15_forosvirtuales;
    ImageView imagen2_pantalla15_forosvirtuales;
    ImageView imagen3_pantalla15_forosvirtuales;
    ImageView imagen4_pantalla15_forosvirtuales;
    ImageView imagen1_pantalla16_forosvirtuales;
    ImageView imagen2_pantalla16_forosvirtuales;
    LinearLayout fondo1_pantalla16_forosvirtuales;
    ImageView salir_forosvirtuales;
    int ventana_capacidades;
    LinearLayout fondo1_pantalla1_capacidadesparaelaprendizaje;
    ImageView imagen1_pantalla1_capacidadesparaelaprendizaje;
    ImageView comenzar_capacidadesparaelaprendizaje;
    ImageView imagen1_pantalla2_capacidadesparaelaprendizaje;
    ImageView menu_pantallas2_capacidadesparaelaprendizaje;
    ImageView imagen2_pantalla2_capacidadesparaelaprendizaje;
    ImageView imagen3_pantalla2_capacidadesparaelaprendizaje;
    ImageView imagen4_pantalla2_capacidadesparaelaprendizaje;
    ImageView imagen5_pantalla2_capacidadesparaelaprendizaje;
    ImageView imagen6_pantalla2_capacidadesparaelaprendizaje;
    ImageView imagen1_pantalla3_capacidadesparaelaprendizaje;
    ImageView imagen2_pantalla3_capacidadesparaelaprendizaje;
    ImageView imagen3_pantalla3_capacidadesparaelaprendizaje;
    ImageView imagen4_pantalla3_capacidadesparaelaprendizaje;
    ImageView imagen5_pantalla3_capacidadesparaelaprendizaje;
    ImageView imagen6_pantalla3_capacidadesparaelaprendizaje;
    ImageView imagen1_pantalla4_capacidadesparaelaprendizaje;
    ImageView imagen2_pantalla4_capacidadesparaelaprendizaje;
    ImageView imagen3_pantalla4_capacidadesparaelaprendizaje;
    ImageView imagen4_pantalla4_capacidadesparaelaprendizaje;
    ImageView imagen5_pantalla4_capacidadesparaelaprendizaje;
    ImageView imagen6_pantalla4_capacidadesparaelaprendizaje;
    ImageView imagen1_pantalla5_capacidadesparaelaprendizaje;
    ImageView fondo1_pantalla5_capacidadesparaelaprendizaje;
    ImageView imagen2_pantalla5_capacidadesparaelaprendizaje;
    ImageView imagen3_pantalla5_capacidadesparaelaprendizaje;
    ImageView imagen4_pantalla5_capacidadesparaelaprendizaje;
    ImageView imagen5_pantalla5_capacidadesparaelaprendizaje;
    ImageView imagen6_pantalla5_capacidadesparaelaprendizaje;
    ImageView imagen1_pantalla6_capacidadesparaelaprendizaje;
    ImageView fondo1_pantalla6_capacidadesparaelaprendizaje;
    ImageView imagen2_pantalla6_capacidadesparaelaprendizaje;
    ImageView imagen3_pantalla6_capacidadesparaelaprendizaje;
    ImageView imagen4_pantalla6_capacidadesparaelaprendizaje;
    ImageView imagen5_pantalla6_capacidadesparaelaprendizaje;
    ImageView imagen6_pantalla6_capacidadesparaelaprendizaje;
    ImageView imagen7_pantalla6_capacidadesparaelaprendizaje;
    ImageView imagen1_pantalla7_capacidadesparaelaprendizaje;
    ImageView fondo1_pantalla7_capacidadesparaelaprendizaje;
    ImageView imagen2_pantalla7_capacidadesparaelaprendizaje;
    ImageView imagen3_pantalla7_capacidadesparaelaprendizaje;
    ImageView imagen4_pantalla7_capacidadesparaelaprendizaje;
    ImageView imagen5_pantalla7_capacidadesparaelaprendizaje;
    ImageView imagen6_pantalla7_capacidadesparaelaprendizaje;
    ImageView imagen7_pantalla7_capacidadesparaelaprendizaje;
    ImageView imagen8_pantalla7_capacidadesparaelaprendizaje;
    ImageView imagen1_pantalla8_capacidadesparaelaprendizaje;
    ImageView fondo1_pantalla8_capacidadesparaelaprendizaje;
    ImageView imagen2_pantalla8_capacidadesparaelaprendizaje;
    ImageView imagen3_pantalla8_capacidadesparaelaprendizaje;
    ImageView imagen4_pantalla8_capacidadesparaelaprendizaje;
    ImageView imagen5_pantalla8_capacidadesparaelaprendizaje;
    ImageView imagen6_pantalla8_capacidadesparaelaprendizaje;
    ImageView imagen7_pantalla8_capacidadesparaelaprendizaje;
    ImageView imagen8_pantalla8_capacidadesparaelaprendizaje;
    ImageView imagen9_pantalla8_capacidadesparaelaprendizaje;
    ImageView imagen1_pantalla9_capacidadesparaelaprendizaje;
    ImageView fondo1_pantalla9_capacidadesparaelaprendizaje;
    ImageView imagen2_pantalla9_capacidadesparaelaprendizaje;
    ImageView imagen3_pantalla9_capacidadesparaelaprendizaje;
    ImageView imagen4_pantalla9_capacidadesparaelaprendizaje;
    ImageView imagen5_pantalla9_capacidadesparaelaprendizaje;
    ImageView imagen6_pantalla9_capacidadesparaelaprendizaje;
    ImageView imagen7_pantalla9_capacidadesparaelaprendizaje;
    ImageView imagen8_pantalla9_capacidadesparaelaprendizaje;
    ImageView imagen9_pantalla9_capacidadesparaelaprendizaje;
    ImageView imagen10_pantalla9_capacidadesparaelaprendizaje;
    ImageView imagen1_pantalla10_capacidadesparaelaprendizaje;
    ImageView fondo1_pantalla10_capacidadesparaelaprendizaje;
    ImageView imagen2_pantalla10_capacidadesparaelaprendizaje;
    ImageView imagen3_pantalla10_capacidadesparaelaprendizaje;
    ImageView imagen4_pantalla10_capacidadesparaelaprendizaje;
    ImageView imagen5_pantalla10_capacidadesparaelaprendizaje;
    ImageView imagen6_pantalla10_capacidadesparaelaprendizaje;
    ImageView imagen7_pantalla10_capacidadesparaelaprendizaje;
    ImageView imagen8_pantalla10_capacidadesparaelaprendizaje;
    ImageView imagen9_pantalla10_capacidadesparaelaprendizaje;
    ImageView imagen10_pantalla10_capacidadesparaelaprendizaje;
    ImageView imagen11_pantalla10_capacidadesparaelaprendizaje;
    ImageView imagen1_pantalla11_capacidadesparaelaprendizaje;
    ImageView fondo1_pantalla11_capacidadesparaelaprendizaje;
    ImageView imagen2_pantalla11_capacidadesparaelaprendizaje;
    ImageView imagen3_pantalla11_capacidadesparaelaprendizaje;
    ImageView imagen4_pantalla11_capacidadesparaelaprendizaje;
    ImageView imagen5_pantalla11_capacidadesparaelaprendizaje;
    ImageView imagen6_pantalla11_capacidadesparaelaprendizaje;
    ImageView imagen7_pantalla11_capacidadesparaelaprendizaje;
    ImageView imagen8_pantalla11_capacidadesparaelaprendizaje;
    ImageView imagen9_pantalla11_capacidadesparaelaprendizaje;
    ImageView imagen10_pantalla11_capacidadesparaelaprendizaje;
    ImageView imagen11_pantalla11_capacidadesparaelaprendizaje;
    ImageView imagen12_pantalla11_capacidadesparaelaprendizaje;
    ImageView imagen1_pantalla12_capacidadesparaelaprendizaje;
    ImageView imagen2_pantalla12_capacidadesparaelaprendizaje;
    ImageView imagen3_pantalla12_capacidadesparaelaprendizaje;
    ImageView imagen4_pantalla12_capacidadesparaelaprendizaje;
    ImageView imagen5_pantalla12_capacidadesparaelaprendizaje;
    ImageView imagen6_pantalla12_capacidadesparaelaprendizaje;
    ImageView imagen1_pantalla13_capacidadesparaelaprendizaje;
    ImageView imagen2_pantalla13_capacidadesparaelaprendizaje;
    ImageView imagen3_pantalla13_capacidadesparaelaprendizaje;
    ImageView imagen4_pantalla13_capacidadesparaelaprendizaje;
    ImageView imagen5_pantalla13_capacidadesparaelaprendizaje;
    ImageView imagen1_pantalla14_capacidadesparaelaprendizaje;
    ImageView imagen2_pantalla14_capacidadesparaelaprendizaje;
    ImageView imagen3_pantalla14_capacidadesparaelaprendizaje;
    ImageView imagen4_pantalla14_capacidadesparaelaprendizaje;
    ImageView imagen5_pantalla14_capacidadesparaelaprendizaje;
    ImageView imagen6_pantalla14_capacidadesparaelaprendizaje;
    ImageView imagen7_pantalla14_capacidadesparaelaprendizaje;
    ImageView imagen8_pantalla14_capacidadesparaelaprendizaje;
    ImageView imagen9_pantalla14_capacidadesparaelaprendizaje;
    ImageView imagen10_pantalla14_capacidadesparaelaprendizaje;
    ImageView imagen11_pantalla14_capacidadesparaelaprendizaje;
    int ventana_habilidadesdelectura;
    LinearLayout fondo1_pantalla1_habilidadesdelectura;
    ImageView imagen1_pantalla1_habilidadesdelectura;
    ImageView imagen2_pantalla1_habilidadesdelectura;
    ImageView comenzar_habilidadesdelectura;
    ImageView imagen1_pantalla2_habilidadesdelectura;
    ImageView imagen2_pantalla2_habilidadesdelectura;
    ImageView imagen3_pantalla2_habilidadesdelectura;
    ImageView imagen1_pantalla3_habilidadesdelectura;
    ImageView imagen2_pantalla3_habilidadesdelectura;
    ImageView imagen3_pantalla3_habilidadesdelectura;
    ImageView imagen1_pantalla4_habilidadesdelectura;
    ImageView imagen2_pantalla4_habilidadesdelectura;
    ImageView imagen3_pantalla4_habilidadesdelectura;
    ImageView imagen4_pantalla4_habilidadesdelectura;
    ImageView imagen1_pantalla5_habilidadesdelectura;
    ImageView imagen2_pantalla5_habilidadesdelectura;
    ImageView imagen3_pantalla5_habilidadesdelectura;
    ImageView imagen1_pantalla6_habilidadesdelectura;
    ImageView imagen2_pantalla6_habilidadesdelectura;
    ImageView imagen3_pantalla6_habilidadesdelectura;
    ImageView imagen1_pantalla7_habilidadesdelectura;
    ImageView imagen2_pantalla7_habilidadesdelectura;
    ImageView imagen3_pantalla7_habilidadesdelectura;
    ImageView imagen1_pantalla8_habilidadesdelectura;
    ImageView imagen2_pantalla8_habilidadesdelectura;
    ImageView imagen3_pantalla8_habilidadesdelectura;
    ImageView imagen1_pantalla9_habilidadesdelectura;
    ImageView imagen2_pantalla9_habilidadesdelectura;
    ImageView imagen3_pantalla9_habilidadesdelectura;
    ImageView imagen4_pantalla9_habilidadesdelectura;
    ImageView imagen1_pantalla10_habilidadesdelectura;
    ImageView imagen2_pantalla10_habilidadesdelectura;
    ImageView imagen3_pantalla10_habilidadesdelectura;
    ImageView imagen1_pantalla11_habilidadesdelectura;
    ImageView imagen2_pantalla11_habilidadesdelectura;
    ImageView imagen3_pantalla11_habilidadesdelectura;
    ImageView imagen1_pantalla12_habilidadesdelectura;
    ImageView imagen2_pantalla12_habilidadesdelectura;
    ImageView imagen3_pantalla12_habilidadesdelectura;
    ImageView imagen1_pantalla13_habilidadesdelectura;
    ImageView imagen2_pantalla13_habilidadesdelectura;
    ImageView imagen3_pantalla13_habilidadesdelectura;
    ImageView imagen1_pantalla14_habilidadesdelectura;
    ImageView imagen2_pantalla14_habilidadesdelectura;
    ImageView imagen3_pantalla14_habilidadesdelectura;
    ImageView imagen1_pantalla15_habilidadesdelectura;
    ImageView imagen2_pantalla15_habilidadesdelectura;
    ImageView imagen3_pantalla15_habilidadesdelectura;
    ImageView imagen1_pantalla16_habilidadesdelectura;
    ImageView imagen2_pantalla16_habilidadesdelectura;
    ImageView imagen3_pantalla16_habilidadesdelectura;
    ImageView imagen1_pantalla17_habilidadesdelectura;
    ImageView imagen2_pantalla17_habilidadesdelectura;
    ImageView imagen3_pantalla17_habilidadesdelectura;
    ImageView imagen1_pantalla18_habilidadesdelectura;

    Boolean mensaje9=false;
    Bitmap bm;
    BitmapDrawable bmDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        this.menu=menu;
        opcion1= menu.findItem(R.id.cerrar_sesion);
        opcion2= menu.findItem(R.id.datos);
        opcion1.setVisible(false);
        opcion2.setVisible(false);
        submenu1=menu.findItem(R.id.menuguia1);
        submenu1.setVisible(false);
        submenu8=menu.findItem(R.id.menuguia8);
        submenu8.setVisible(false);
        submenu9=menu.findItem(R.id.menuguia9);
        submenu9.setIcon(R.drawable.icono_menu);
        submenu9.setVisible(false);
        submenu10=menu.findItem(R.id.menuguia10);
        submenu10.setIcon(R.drawable.icono_menu);
        submenu10.setVisible(false);
        submenu11=menu.findItem(R.id.menuguia11);
        submenu11.setIcon(R.drawable.icono_menu);
        submenu11.setVisible(false);
        if(temploggeo.exists()==false){
            if(nomar.exists()==false)
            {
                try
                {
                    ruta.mkdirs();
                    OutputStreamWriter archivo = new OutputStreamWriter(new FileOutputStream(nomar));
                    archivo.close();
                }
                catch (Exception ex)
                {
                    Log.e("Ficheros", "Error al escribir fichero a memoria interna");
                }
            }
            setContentView(R.layout.activity_main);
            if(validaVersion()==true){
                video(1);
            }
            else{
                imagen(1);
            }
            getSupportActionBar().setSubtitle("");
        }
        else{
            logeo=true;
            numguia=0;
            validaTemp();
            setContentView(R.layout.guias);
            try {
                titulo(numguia);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.regresa_inicio) {
            ventana_datosnum=2;
            aud.stop();
            numaudguia8=2;
            correctas8=0;
            validaVentana8();
            validaudio(ventana_datosnum);
            return true;
        }
        if (id == R.id.regresa_guias1) {
            setContentView(R.layout.guias);
            guia = false;
            numguia=0;
            try {
                titulo(numguia);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return true;
        }
        if (id == R.id.regresa_guias8) {
            setContentView(R.layout.guias);
            guia = false;
            if(ventana_datosnum<=13){
                aud.stop();
            }
            numaudguia8=0;
            numguia=0;
            correctas8=0;
            ventana_datosnum=0;
            try {
                titulo(numguia);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return true;
        }
        if (id == R.id.regresa_guias9) {
            setContentView(R.layout.guias);
            guia = false;
            numguia=0;
            try {
                titulo(numguia);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            for(int i=0; i<7; i++){
                for(int j=0; j<2; j++){
                    preguntas9[i][j]=0;
                }
            }
            correctas9=0;
            return true;
        }
        if (id == R.id.regresa_guias10) {
            setContentView(R.layout.guias);
            guia = false;
            numguia=0;
            try {
                titulo(numguia);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return true;
        }
        if (id == R.id.regresa_guias11) {
            setContentView(R.layout.guias);
            guia = false;
            numguia=0;
            try {
                titulo(numguia);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return true;
        }
        if (id == R.id.guarda_datosnum) {
            if(guardadatosnum.exists()==false)
            {
                try
                {
                    OutputStreamWriter archivo = new OutputStreamWriter(
                            new FileOutputStream(guardadatosnum));
                    archivo.close();
                }
                catch (Exception ex)
                {
                    Log.e("Ficheros", "Error al escribir fichero a memoria interna");
                }
            }
            agregadatosnum();
            return true;
        }
        if(id==R.id.datos){
            carga();
            return true;
        }
        if(id==R.id.cerrar_sesion){
            setContentView(R.layout.activity_main);
            logeo=false;
            numguia=0;
            try {
                titulo(numguia);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            if(validaVersion()==true){
                video(1);
            }
            else{
                imagen(1);
            }
            opcion1.setVisible(false);
            opcion2.setVisible(false);
            temploggeo.delete();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void video(int video){
        if(video==1){
            mVideoView = (VideoView)findViewById(R.id.surface_view);
        }
        if(video==2){
            mVideoView = (VideoView)findViewById(R.id.surface_view1);
        }
        String uriPath = "android.resource://com.example.macmini3cuceimobile.ciep/"+R.raw.loginciep;
        Uri uri = Uri.parse(uriPath);
        mVideoView.setVideoURI(uri);
        mVideoView.requestFocus();
        mVideoView.start();

        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

            @Override
            public void onPrepared(MediaPlayer mp) {
                // TODO Auto-generated method stub
                mp.setLooping(true);
            }
        });
    }

    public void imagen(int imagen){
        if(imagen==1){
            mImageView = (ImageView)findViewById(R.id.imageView);
        }
        if(imagen==2){
            mImageView = (ImageView)findViewById(R.id.imageView1);
        }
        mImageView.setBackgroundResource(R.drawable.loginciep);
    }

    public void validaTemp(){
        try
        {
            FileInputStream fIn = new FileInputStream(temploggeo);
            InputStreamReader archivo = new InputStreamReader(fIn);
            BufferedReader br = new BufferedReader(archivo);
            linea = br.readLine();
            archivo.close();
            StringTokenizer tokens=new StringTokenizer(linea, ",");
            usuario=tokens.nextToken();
            password=tokens.nextToken();
            linea=verifica(usuario);
            separa(linea);
            linea=null;
            confirmacion=false;
        }
        catch (Exception ex)
        {
            Log.i("Ficheros", "Error al leer fichero desde memoria interna");
        }
    }

    public void inicio_datosnum(){
        String linea;
        String num=null;
        String usu="";
        Boolean band=false;
        try {
            FileInputStream fIn = new FileInputStream(guardadatosnum);
            InputStreamReader archivo1 = new InputStreamReader(fIn);
            BufferedReader br = new BufferedReader(archivo1);
            linea = br.readLine();
            while(linea!=null){
                StringTokenizer tkn = new StringTokenizer(linea, "&");
                usu=tkn.nextToken();
                if(usu.equals(usuario)){
                    num = tkn.nextToken();
                    ventana_datosnum = Integer.parseInt(num);
                    num = tkn.nextToken();
                    numaudguia8 = Integer.parseInt(num);
                    num = tkn.nextToken();
                    correctas8 = Integer.parseInt(num);
                    archivo1.close();
                    band=true;
                    linea=null;
                    eliminareg8();
                }
                else{
                    linea = br.readLine();
                }
            }
            if(band==true) {
                Boolean band2 = false;
                band2 = validaVersion();
                if(band2==true){
                    AlertaMayor();
                }
                else{
                    AlertaMenor();
                }
            }
            else{
                numaudguia8 = 1;
                ventana_datosnum = 1;
                validaVentana8();
                validaudio(ventana_datosnum);
            }
        } catch (Exception ex) {
            Log.e("Ficheros", "Error al leer fichero a memoria interna");
        }
    }

    public void agregadatosnum(){
        String linea="";
        String linea2="";
        String usu="";
        Boolean band=false;
        try {
            FileInputStream fIn = new FileInputStream(guardadatosnum);
            InputStreamReader archivo1 = new InputStreamReader(fIn);
            BufferedReader br = new BufferedReader(archivo1);
            linea = br.readLine();
            while (linea != null) {
                StringTokenizer tkn = new StringTokenizer(linea, "&");
                usu = tkn.nextToken();
                if (!usu.equals(usuario)) {
                    linea2 = linea2 + linea + salto;
                    linea = br.readLine();
                }
                else {
                    band = true;
                    linea2 = linea2 + (usuario + "&" + ventana_datosnum + "&" + numaudguia8 + "&" + correctas8 + salto);
                    linea = br.readLine();
                    while (linea != null) {
                        linea2 = linea + salto;
                        linea = br.readLine();
                    }
                }
            }
            archivo1.close();
            guardadatosnum.delete();
            if (band == false) {
                OutputStreamWriter archivo2 = new OutputStreamWriter(
                        new FileOutputStream(guardadatosnum));
                linea2 = linea2 + (usuario + "&" + ventana_datosnum + "&" + numaudguia8 + "&" + correctas8);
                archivo2.write(linea2);
                archivo2.flush();
                archivo2.close();
            }
            else{
                OutputStreamWriter archivo2 = new OutputStreamWriter(
                        new FileOutputStream(guardadatosnum));
                archivo2.write(linea2);
                archivo2.flush();
                archivo2.close();
            }
            Toast.makeText(MainActivity.this, "Información guardada exitosamente", Toast.LENGTH_LONG).show();
        }
        catch (Exception ex) {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }
    }

    public void clickaud (){
        if(aud.isPlaying()){
            aud.stop();
            validaudio(ventana_datosnum);
        }
        else{
            aud.start();
        }
    }

    public void validaudio(int ventana){
        if(ventana==1){
            au=Environment.getExternalStoragePublicDirectory("/.estu@pp/.guia8/.audio1.mp3");
            aud= MediaPlayer.create(this, Uri.fromFile(au));
        }
        if(ventana==2){
            au=Environment.getExternalStoragePublicDirectory("/.estu@pp/.guia8/.audio2.mp3");
            aud= MediaPlayer.create(this, Uri.fromFile(au));
        }
        if(ventana==3){
            au=Environment.getExternalStoragePublicDirectory("/.estu@pp/.guia8/.audio3.mp3");
            aud= MediaPlayer.create(this, Uri.fromFile(au));;
        }
        if(ventana==4){
            au=Environment.getExternalStoragePublicDirectory("/.estu@pp/.guia8/.audio4.mp3");
            aud= MediaPlayer.create(this, Uri.fromFile(au));
        }
        if(ventana==5){
            au=Environment.getExternalStoragePublicDirectory("/.estu@pp/.guia8/.audio5.mp3");
            aud= MediaPlayer.create(this, Uri.fromFile(au));
        }
        if(ventana==6){
            au=Environment.getExternalStoragePublicDirectory("/.estu@pp/.guia8/.audio6.mp3");
            aud= MediaPlayer.create(this, Uri.fromFile(au));
        }
        if(ventana==7){
            au=Environment.getExternalStoragePublicDirectory("/.estu@pp/.guia8/.audio7.mp3");
            aud= MediaPlayer.create(this, Uri.fromFile(au));
        }
        if(ventana==8){
            au=Environment.getExternalStoragePublicDirectory("/.estu@pp/.guia8/.audio8.mp3");
            aud= MediaPlayer.create(this, Uri.fromFile(au));
        }
        if(ventana==9){
            au=Environment.getExternalStoragePublicDirectory("/.estu@pp/.guia8/.audio9.mp3");
            aud= MediaPlayer.create(this, Uri.fromFile(au));
        }
        if(ventana==10){
            au=Environment.getExternalStoragePublicDirectory("/.estu@pp/.guia8/.audio10.mp3");
            aud= MediaPlayer.create(this, Uri.fromFile(au));
        }
        if(ventana==11){
            au=Environment.getExternalStoragePublicDirectory("/.estu@pp/.guia8/.audio11.mp3");
            aud= MediaPlayer.create(this, Uri.fromFile(au));
        }
        if(ventana==12){
            au=Environment.getExternalStoragePublicDirectory("/.estu@pp/.guia8/.audio12.mp3");
            aud= MediaPlayer.create(this, Uri.fromFile(au));
        }
        if(ventana==13){
            au=Environment.getExternalStoragePublicDirectory("/.estu@pp/.guia8/.audio13.mp3");
            aud= MediaPlayer.create(this, Uri.fromFile(au));
        }
    }

    public void AlertaMayor(){
        final Boolean[] opcion = {false};
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("Punto de Inicio");
        alertDialog.setMessage("¿Deseas continuar con los datos guardados?");
        alertDialog.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                validaVentana8();
                opcion[0] = true;
            }
        });
        alertDialog.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                numaudguia8 = 1;
                ventana_datosnum = 1;
                validaVentana8();
                validaudio(ventana_datosnum);
                opcion[0] = true;
            }
        });
        alertDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            public void onDismiss(DialogInterface arg0) {
                if (opcion[0] == false) {
                    numaudguia8 = 1;
                    ventana_datosnum = 1;
                    validaVentana8();
                    validaudio(ventana_datosnum);
                }
            }
        });
        alertDialog.show();
    }

    public void AlertaMenor(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("Punto de Inicio");
        alertDialog.setMessage("¿Deseas continuar con los datos guardados?");
        alertDialog.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                validaVentana8();
            }
        });
        alertDialog.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                numaudguia8 = 1;
                ventana_datosnum = 1;
                validaVentana8();
                validaudio(ventana_datosnum);
            }
        });
        alertDialog.show();
    }

    public void validaVentana8(){
        if (ventana_datosnum == 1) {
            setContentView(R.layout.pantalla1_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla1_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla1_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla1_datosnumericos);
            imagen1_pantalla1_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.siguiente_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla1_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla1_datosnumericos);
            imagen2_pantalla1_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.portada_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla1_datosnumericos=(LinearLayout)findViewById(R.id.fondo1_pantalla1_datosnumericos);
            fondo1_pantalla1_datosnumericos.setBackgroundDrawable(bmDrawable);
        }
        if(ventana_datosnum==2){
            setContentView(R.layout.pantalla2_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla3_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla2_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla2_datosnumericos);
            imagen1_pantalla2_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.porcentajes.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla2_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla2_datosnumericos);
            imagen2_pantalla2_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.graficas_de_pastel.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla2_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla2_datosnumericos);
            imagen3_pantalla2_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.histogramas.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla2_datosnumericos=(ImageView)findViewById(R.id.imagen4_pantalla2_datosnumericos);
            imagen4_pantalla2_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.autoevaluacion.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla2_datosnumericos=(ImageView)findViewById(R.id.imagen5_pantalla2_datosnumericos);
            imagen5_pantalla2_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.menu_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen6_pantalla2_datosnumericos=(ImageView)findViewById(R.id.imagen6_pantalla2_datosnumericos);
            imagen6_pantalla2_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==3){
            setContentView(R.layout.pantalla3_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla3_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla3_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla3_datosnumericos);
            imagen1_pantalla3_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion2_pantalla3_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla3_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla3_datosnumericos);
            imagen2_pantalla3_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.anterior_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla3_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla3_datosnumericos);
            imagen3_pantalla3_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.siguiente_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla3_datosnumericos=(ImageView)findViewById(R.id.imagen4_pantalla3_datosnumericos);
            imagen4_pantalla3_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==4){
            setContentView(R.layout.pantalla4_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.porcentajes.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla4_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla4_datosnumericos);
            imagen1_pantalla4_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla5_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla4_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla4_datosnumericos);
            imagen2_pantalla4_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.anterior_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla4_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla4_datosnumericos);
            imagen3_pantalla4_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.siguiente_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla4_datosnumericos=(ImageView)findViewById(R.id.imagen4_pantalla4_datosnumericos);
            imagen4_pantalla4_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==5){
            setContentView(R.layout.pantalla5_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.porcentajes.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla5_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla5_datosnumericos);
            imagen1_pantalla5_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla4_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla5_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla5_datosnumericos);
            imagen2_pantalla5_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.anterior_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla5_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla5_datosnumericos);
            imagen3_pantalla5_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.siguiente_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla5_datosnumericos=(ImageView)findViewById(R.id.imagen4_pantalla5_datosnumericos);
            imagen4_pantalla5_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==6){
            setContentView(R.layout.pantalla6_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.porcentajes.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla6_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla6_datosnumericos);
            imagen1_pantalla6_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla6_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla6_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla6_datosnumericos);
            imagen2_pantalla6_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.anterior_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla6_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla6_datosnumericos);
            imagen3_pantalla6_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.siguiente_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla6_datosnumericos=(ImageView)findViewById(R.id.imagen4_pantalla6_datosnumericos);
            imagen4_pantalla6_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==7){
            setContentView(R.layout.pantalla7_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.graficas_de_pastel.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla7_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla7_datosnumericos);
            imagen1_pantalla7_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla7_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla7_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla7_datosnumericos);
            imagen2_pantalla7_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.anterior_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla7_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla7_datosnumericos);
            imagen3_pantalla7_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.siguiente_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla7_datosnumericos=(ImageView)findViewById(R.id.imagen4_pantalla7_datosnumericos);
            imagen4_pantalla7_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==8){
            setContentView(R.layout.pantalla8_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.graficas_de_pastel.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla8_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla8_datosnumericos);
            imagen1_pantalla8_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla8_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla8_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla8_datosnumericos);
            imagen2_pantalla8_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.anterior_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla8_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla8_datosnumericos);
            imagen3_pantalla8_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.siguiente_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla8_datosnumericos=(ImageView)findViewById(R.id.imagen4_pantalla8_datosnumericos);
            imagen4_pantalla8_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==9){
            setContentView(R.layout.pantalla9_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.graficas_de_pastel.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla9_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla9_datosnumericos);
            imagen1_pantalla9_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla9_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla9_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla9_datosnumericos);
            imagen2_pantalla9_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion2_pantalla9_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla9_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla9_datosnumericos);
            imagen3_pantalla9_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.anterior_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla9_datosnumericos=(ImageView)findViewById(R.id.imagen4_pantalla9_datosnumericos);
            imagen4_pantalla9_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.siguiente_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla9_datosnumericos=(ImageView)findViewById(R.id.imagen5_pantalla9_datosnumericos);
            imagen5_pantalla9_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==10){
            setContentView(R.layout.pantalla10_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.histogramas.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla10_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla10_datosnumericos);
            imagen1_pantalla10_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla10_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla10_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla10_datosnumericos);
            imagen2_pantalla10_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.anterior_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla10_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla10_datosnumericos);
            imagen3_pantalla10_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.siguiente_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla10_datosnumericos=(ImageView)findViewById(R.id.imagen4_pantalla10_datosnumericos);
            imagen4_pantalla10_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==11){
            setContentView(R.layout.pantalla11_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.histogramas.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla11_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla11_datosnumericos);
            imagen1_pantalla11_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla11_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla11_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla11_datosnumericos);
            imagen2_pantalla11_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.anterior_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla11_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla11_datosnumericos);
            imagen3_pantalla11_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.siguiente_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla11_datosnumericos=(ImageView)findViewById(R.id.imagen4_pantalla11_datosnumericos);
            imagen4_pantalla11_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==12){
            setContentView(R.layout.pantalla12_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.histogramas.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla12_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla12_datosnumericos);
            imagen1_pantalla12_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla12_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla12_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla12_datosnumericos);
            imagen2_pantalla12_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.anterior_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla12_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla12_datosnumericos);
            imagen3_pantalla12_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.siguiente_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla12_datosnumericos=(ImageView)findViewById(R.id.imagen4_pantalla12_datosnumericos);
            imagen4_pantalla12_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==13){
            setContentView(R.layout.pantalla13_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.portada_autoevaluacion_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla13_datosnumericos=(LinearLayout)findViewById(R.id.fondo1_pantalla13_datosnumericos);
            fondo1_pantalla13_datosnumericos.setBackgroundDrawable(bmDrawable);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla13_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla13_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla13_datosnumericos);
            imagen1_pantalla13_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion2_pantalla13_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla13_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla13_datosnumericos);
            imagen2_pantalla13_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.anterior_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla13_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla13_datosnumericos);
            imagen3_pantalla13_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==14){
            setContentView(R.layout.pantalla14_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.autoevaluacion.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla14_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla14_datosnumericos);
            imagen1_pantalla14_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla14_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla14_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla14_datosnumericos);
            imagen2_pantalla14_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==15){
            setContentView(R.layout.pantalla15_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.autoevaluacion.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla15_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla15_datosnumericos);
            imagen1_pantalla15_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla15_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla15_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla15_datosnumericos);
            imagen2_pantalla15_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==16){
            setContentView(R.layout.pantalla16_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.autoevaluacion.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla16_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla16_datosnumericos);
            imagen1_pantalla16_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla16_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla16_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla16_datosnumericos);
            imagen2_pantalla16_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==17){
            setContentView(R.layout.pantalla17_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.autoevaluacion.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla17_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla17_datosnumericos);
            imagen1_pantalla17_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla17_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla17_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla17_datosnumericos);
            imagen2_pantalla17_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==18){
            setContentView(R.layout.pantalla18_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.autoevaluacion.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla18_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla18_datosnumericos);
            imagen1_pantalla18_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.grafica1_autoevaluacion_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla18_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla18_datosnumericos);
            imagen2_pantalla18_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla18_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla18_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla18_datosnumericos);
            imagen3_pantalla18_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==19){
            setContentView(R.layout.pantalla19_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.autoevaluacion.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla19_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla19_datosnumericos);
            imagen1_pantalla19_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.grafica1_autoevaluacion_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla19_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla19_datosnumericos);
            imagen2_pantalla19_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla19_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla19_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla19_datosnumericos);
            imagen3_pantalla19_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==20){
            setContentView(R.layout.pantalla20_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.autoevaluacion.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla20_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla20_datosnumericos);
            imagen1_pantalla20_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.grafica1_autoevaluacion_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla20_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla20_datosnumericos);
            imagen2_pantalla20_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla20_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla20_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla20_datosnumericos);
            imagen3_pantalla20_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==21){
            setContentView(R.layout.pantalla21_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.autoevaluacion.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla21_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla21_datosnumericos);
            imagen1_pantalla21_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.grafica1_autoevaluacion_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla21_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla21_datosnumericos);
            imagen2_pantalla21_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla21_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla21_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla21_datosnumericos);
            imagen3_pantalla21_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==22){
            setContentView(R.layout.pantalla22_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.autoevaluacion.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla22_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla22_datosnumericos);
            imagen1_pantalla22_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.grafica1_autoevaluacion_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla22_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla22_datosnumericos);
            imagen2_pantalla22_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla22_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla22_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla22_datosnumericos);
            imagen3_pantalla22_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==23){
            setContentView(R.layout.pantalla23_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.autoevaluacion.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla23_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla23_datosnumericos);
            imagen1_pantalla23_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.grafica2_autoevaluacion_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla23_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla23_datosnumericos);
            imagen2_pantalla23_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla23_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla23_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla23_datosnumericos);
            imagen3_pantalla23_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==24){
            setContentView(R.layout.pantalla24_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.autoevaluacion.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla24_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla24_datosnumericos);
            imagen1_pantalla24_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.grafica2_autoevaluacion_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla24_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla24_datosnumericos);
            imagen2_pantalla24_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla24_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla24_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla24_datosnumericos);
            imagen3_pantalla24_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==25){
            setContentView(R.layout.pantalla25_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.autoevaluacion.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla25_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla25_datosnumericos);
            imagen1_pantalla25_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.grafica2_autoevaluacion_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla25_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla25_datosnumericos);
            imagen2_pantalla25_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla25_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla25_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla25_datosnumericos);
            imagen3_pantalla25_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==26){
            setContentView(R.layout.pantalla26_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.autoevaluacion.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla26_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla26_datosnumericos);
            imagen1_pantalla26_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.grafica2_autoevaluacion_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla26_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla26_datosnumericos);
            imagen2_pantalla26_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla26_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla26_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla26_datosnumericos);
            imagen3_pantalla26_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==27){
            setContentView(R.layout.pantalla27_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.autoevaluacion.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla27_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla27_datosnumericos);
            imagen1_pantalla27_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.grafica2_autoevaluacion_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla27_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla27_datosnumericos);
            imagen2_pantalla27_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_pantalla27_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla27_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla27_datosnumericos);
            imagen3_pantalla27_datosnumericos.setImageBitmap(bm);
        }
        if(ventana_datosnum==28){
            setContentView(R.layout.pantalla28_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion3_pantalla28_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla28_datosnumericos=(ImageView)findViewById(R.id.imagen3_pantalla28_datosnumericos);
            imagen3_pantalla28_datosnumericos.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.menu_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla28_datosnumericos=(ImageView)findViewById(R.id.imagen4_pantalla28_datosnumericos);
            imagen4_pantalla28_datosnumericos.setImageBitmap(bm);
            if(correctas8==14){
                carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.estrella_bien_datosnumericos.png");
                bm = BitmapFactory.decodeFile(String.valueOf(carga));
                estrella1_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella1_pantalla28_datosnumericos);
                estrella1_pantalla28_datosnumericos.setImageBitmap(bm);
                estrella2_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella2_pantalla28_datosnumericos);
                estrella2_pantalla28_datosnumericos.setImageBitmap(bm);
                estrella3_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella3_pantalla28_datosnumericos);
                estrella3_pantalla28_datosnumericos.setImageBitmap(bm);
                estrella4_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella4_pantalla28_datosnumericos);
                estrella4_pantalla28_datosnumericos.setImageBitmap(bm);
                estrella5_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella5_pantalla28_datosnumericos);
                estrella5_pantalla28_datosnumericos.setImageBitmap(bm);
                carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_bien_pantalla28_datosnumericos.png");
                bm = BitmapFactory.decodeFile(String.valueOf(carga));
                imagen1_pantalla28_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla28_datosnumericos);
                imagen1_pantalla28_datosnumericos.setImageBitmap(bm);
                texto1_pantalla28_datosnumericos=(TextView)findViewById(R.id.texto1_pantalla28_datosnumericos);
                texto1_pantalla28_datosnumericos.setText("¡Felicidades!");
                texto1_pantalla28_datosnumericos.setTextColor(Color.parseColor("#FF1CA7C0"));
                texto2_pantalla28_datosnumericos=(TextView)findViewById(R.id.texto2_pantalla28_datosnumericos);
                texto2_pantalla28_datosnumericos.setText("CON UN TOTAL DE: 14 ACIERTOS");
                texto3_pantalla28_datosnumericos=(TextView)findViewById(R.id.texto3_pantalla28_datosnumericos);
                texto3_pantalla28_datosnumericos.setText("Concluíste con éxito la guía de aprendizaje:");
            }
            else{
                texto1_pantalla28_datosnumericos=(TextView)findViewById(R.id.texto1_pantalla28_datosnumericos);
                texto1_pantalla28_datosnumericos.setText("Inténtalo de nuevo");
                texto1_pantalla28_datosnumericos.setTextColor(Color.parseColor("#FF717171"));
                carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion1_mal_pantalla28_datosnumericos.png");
                bm = BitmapFactory.decodeFile(String.valueOf(carga));
                imagen1_pantalla28_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla28_datosnumericos);
                imagen1_pantalla28_datosnumericos.setImageBitmap(bm);
                carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.ilustracion2_pantalla28_datosnumericos.png");
                bm = BitmapFactory.decodeFile(String.valueOf(carga));
                imagen2_pantalla28_datosnumericos=(ImageView)findViewById(R.id.imagen2_pantalla28_datosnumericos);
                imagen2_pantalla28_datosnumericos.setImageBitmap(bm);
                if(correctas8>=3 && correctas8<6){
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.estrella_bien_datosnumericos.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    estrella1_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella1_pantalla28_datosnumericos);
                    estrella1_pantalla28_datosnumericos.setImageBitmap(bm);
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.estrella_mal_datosnumericos.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    estrella2_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella2_pantalla28_datosnumericos);
                    estrella2_pantalla28_datosnumericos.setImageBitmap(bm);
                    estrella3_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella3_pantalla28_datosnumericos);
                    estrella3_pantalla28_datosnumericos.setImageBitmap(bm);
                    estrella4_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella4_pantalla28_datosnumericos);
                    estrella4_pantalla28_datosnumericos.setImageBitmap(bm);
                    estrella5_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella5_pantalla28_datosnumericos);
                    estrella5_pantalla28_datosnumericos.setImageBitmap(bm);
                }
                else{
                    if(correctas8>=6 && correctas8<9){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.estrella_bien_datosnumericos.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        estrella1_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella1_pantalla28_datosnumericos);
                        estrella1_pantalla28_datosnumericos.setImageBitmap(bm);
                        estrella2_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella2_pantalla28_datosnumericos);
                        estrella2_pantalla28_datosnumericos.setImageBitmap(bm);
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.estrella_mal_datosnumericos.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        estrella3_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella3_pantalla28_datosnumericos);
                        estrella3_pantalla28_datosnumericos.setImageBitmap(bm);
                        estrella4_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella4_pantalla28_datosnumericos);
                        estrella4_pantalla28_datosnumericos.setImageBitmap(bm);
                        estrella5_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella5_pantalla28_datosnumericos);
                        estrella5_pantalla28_datosnumericos.setImageBitmap(bm);
                    }
                    else{
                        if(correctas8>=9 && correctas8<12){
                            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.estrella_bien_datosnumericos.png");
                            bm = BitmapFactory.decodeFile(String.valueOf(carga));
                            estrella1_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella1_pantalla28_datosnumericos);
                            estrella1_pantalla28_datosnumericos.setImageBitmap(bm);
                            estrella2_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella2_pantalla28_datosnumericos);
                            estrella2_pantalla28_datosnumericos.setImageBitmap(bm);
                            estrella3_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella3_pantalla28_datosnumericos);
                            estrella3_pantalla28_datosnumericos.setImageBitmap(bm);
                            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.estrella_mal_datosnumericos.png");
                            bm = BitmapFactory.decodeFile(String.valueOf(carga));
                            estrella4_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella4_pantalla28_datosnumericos);
                            estrella4_pantalla28_datosnumericos.setImageBitmap(bm);
                            estrella5_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella5_pantalla28_datosnumericos);
                            estrella5_pantalla28_datosnumericos.setImageBitmap(bm);
                        }
                        else{
                            if(correctas8>=12 && correctas8<14){
                                carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.estrella_bien_datosnumericos.png");
                                bm = BitmapFactory.decodeFile(String.valueOf(carga));
                                estrella1_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella1_pantalla28_datosnumericos);
                                estrella1_pantalla28_datosnumericos.setImageBitmap(bm);
                                estrella2_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella2_pantalla28_datosnumericos);
                                estrella2_pantalla28_datosnumericos.setImageBitmap(bm);
                                estrella3_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella3_pantalla28_datosnumericos);
                                estrella3_pantalla28_datosnumericos.setImageBitmap(bm);
                                estrella4_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella4_pantalla28_datosnumericos);
                                estrella4_pantalla28_datosnumericos.setImageBitmap(bm);
                                carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.estrella_mal_datosnumericos.png");
                                bm = BitmapFactory.decodeFile(String.valueOf(carga));
                                estrella5_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella5_pantalla28_datosnumericos);
                                estrella5_pantalla28_datosnumericos.setImageBitmap(bm);
                            }
                            else{
                                carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.estrella_mal_datosnumericos.png");
                                bm = BitmapFactory.decodeFile(String.valueOf(carga));
                                estrella1_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella1_pantalla28_datosnumericos);
                                estrella1_pantalla28_datosnumericos.setImageBitmap(bm);
                                estrella2_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella2_pantalla28_datosnumericos);
                                estrella2_pantalla28_datosnumericos.setImageBitmap(bm);
                                estrella3_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella3_pantalla28_datosnumericos);
                                estrella3_pantalla28_datosnumericos.setImageBitmap(bm);
                                estrella4_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella4_pantalla28_datosnumericos);
                                estrella4_pantalla28_datosnumericos.setImageBitmap(bm);
                                estrella5_pantalla28_datosnumericos=(ImageView)findViewById(R.id.estrella5_pantalla28_datosnumericos);
                                estrella5_pantalla28_datosnumericos.setImageBitmap(bm);
                            }
                        }
                    }
                }
            }
        }
        if(ventana_datosnum==29){
            setContentView(R.layout.pantalla29_datosnumericos);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia8/.salir_datosnumericos.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla29_datosnumericos=(ImageView)findViewById(R.id.imagen1_pantalla29_datosnumericos);
            imagen1_pantalla29_datosnumericos.setImageBitmap(bm);
        }
        validaudio(ventana_datosnum);
    }

    public void validaVentana9(){
        if (ventana_capacidades == 1) {
            setContentView(R.layout.pantalla1_capacidadesparaelaprendizaje);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.portada_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla1_capacidadesparaelaprendizaje = (LinearLayout) findViewById(R.id.fondo1_pantalla1_capacidadesparaelaprendizaje);
            fondo1_pantalla1_capacidadesparaelaprendizaje.setBackgroundDrawable(bmDrawable);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.ilustracion_pantalla1_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla1_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen1_pantalla1_capacidadesparaelaprendizaje);
            imagen1_pantalla1_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.comenzar_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            comenzar_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.comenzar_capacidadesparaelaprendizaje);
            comenzar_capacidadesparaelaprendizaje.setBackgroundDrawable(bmDrawable);
        }
        if (ventana_capacidades == 2) {
            setContentView(R.layout.pantalla2_capacidadesparaelaprendizaje);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_pantalla2_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla2_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen1_pantalla2_capacidadesparaelaprendizaje);
            imagen1_pantalla2_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.menu_pantalla2_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            menu_pantallas2_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.menu_pantallas2_capacidadesparaelaprendizaje);
            menu_pantallas2_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.ilustracion_pantalla2_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla2_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen2_pantalla2_capacidadesparaelaprendizaje);
            imagen2_pantalla2_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla2_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen3_pantalla2_capacidadesparaelaprendizaje);
            imagen3_pantalla2_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla2_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen4_pantalla2_capacidadesparaelaprendizaje);
            imagen4_pantalla2_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla2_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen5_pantalla2_capacidadesparaelaprendizaje);
            imagen5_pantalla2_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen6_pantalla2_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen6_pantalla2_capacidadesparaelaprendizaje);
            imagen6_pantalla2_capacidadesparaelaprendizaje.setImageBitmap(bm);
        }
        if (ventana_capacidades == 3) {
            setContentView(R.layout.pantalla3_capacidadesparaelaprendizaje);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_pantalla3_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla3_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen1_pantalla3_capacidadesparaelaprendizaje);
            imagen1_pantalla3_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.ilustracion_pantalla3_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla3_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen2_pantalla3_capacidadesparaelaprendizaje);
            imagen2_pantalla3_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla3_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen3_pantalla3_capacidadesparaelaprendizaje);
            imagen3_pantalla3_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla3_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen4_pantalla3_capacidadesparaelaprendizaje);
            imagen4_pantalla3_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla3_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen5_pantalla3_capacidadesparaelaprendizaje);
            imagen5_pantalla3_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen6_pantalla3_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen6_pantalla3_capacidadesparaelaprendizaje);
            imagen6_pantalla3_capacidadesparaelaprendizaje.setImageBitmap(bm);
        }
        if (ventana_capacidades == 4) {
            setContentView(R.layout.pantalla4_capacidadesparaelaprendizaje);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_pantalla4_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla4_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen1_pantalla4_capacidadesparaelaprendizaje);
            imagen1_pantalla4_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.ilustracion_pantalla4_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla4_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen2_pantalla4_capacidadesparaelaprendizaje);
            imagen2_pantalla4_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla4_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen3_pantalla4_capacidadesparaelaprendizaje);
            imagen3_pantalla4_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla4_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen4_pantalla4_capacidadesparaelaprendizaje);
            imagen4_pantalla4_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla4_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen5_pantalla4_capacidadesparaelaprendizaje);
            imagen5_pantalla4_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen6_pantalla4_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen6_pantalla4_capacidadesparaelaprendizaje);
            imagen6_pantalla4_capacidadesparaelaprendizaje.setImageBitmap(bm);
        }
        if (ventana_capacidades == 5) {
            setContentView(R.layout.pantalla5_capacidadesparaelaprendizaje);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_superior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla5_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen1_pantalla5_capacidadesparaelaprendizaje);
            imagen1_pantalla5_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_pantalla5_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla5_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.fondo1_pantalla5_capacidadesparaelaprendizaje);
            fondo1_pantalla5_capacidadesparaelaprendizaje.setBackgroundDrawable(bmDrawable);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo1_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla5_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen2_pantalla5_capacidadesparaelaprendizaje);
            imagen2_pantalla5_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla5_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen3_pantalla5_capacidadesparaelaprendizaje);
            imagen3_pantalla5_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla5_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen4_pantalla5_capacidadesparaelaprendizaje);
            imagen4_pantalla5_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla5_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen5_pantalla5_capacidadesparaelaprendizaje);
            imagen5_pantalla5_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen6_pantalla5_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen6_pantalla5_capacidadesparaelaprendizaje);
            imagen6_pantalla5_capacidadesparaelaprendizaje.setImageBitmap(bm);
        }
        if (ventana_capacidades == 6) {
            setContentView(R.layout.pantalla6_capacidadesparaelaprendizaje);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_superior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla6_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen1_pantalla6_capacidadesparaelaprendizaje);
            imagen1_pantalla6_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_pantalla6_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla6_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.fondo1_pantalla6_capacidadesparaelaprendizaje);
            fondo1_pantalla6_capacidadesparaelaprendizaje.setBackgroundDrawable(bmDrawable);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo1_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla6_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen2_pantalla6_capacidadesparaelaprendizaje);
            imagen2_pantalla6_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo2_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla6_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen3_pantalla6_capacidadesparaelaprendizaje);
            imagen3_pantalla6_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla6_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen4_pantalla6_capacidadesparaelaprendizaje);
            imagen4_pantalla6_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla6_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen5_pantalla6_capacidadesparaelaprendizaje);
            imagen5_pantalla6_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen6_pantalla6_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen6_pantalla6_capacidadesparaelaprendizaje);
            imagen6_pantalla6_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen7_pantalla6_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen7_pantalla6_capacidadesparaelaprendizaje);
            imagen7_pantalla6_capacidadesparaelaprendizaje.setImageBitmap(bm);
        }
        if (ventana_capacidades == 7) {
            setContentView(R.layout.pantalla7_capacidadesparaelaprendizaje);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_superior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla7_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen1_pantalla7_capacidadesparaelaprendizaje);
            imagen1_pantalla7_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_pantalla7_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla7_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.fondo1_pantalla7_capacidadesparaelaprendizaje);
            fondo1_pantalla7_capacidadesparaelaprendizaje.setBackgroundDrawable(bmDrawable);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo1_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla7_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen2_pantalla7_capacidadesparaelaprendizaje);
            imagen2_pantalla7_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo2_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla7_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen3_pantalla7_capacidadesparaelaprendizaje);
            imagen3_pantalla7_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo3_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla7_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen4_pantalla7_capacidadesparaelaprendizaje);
            imagen4_pantalla7_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla7_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen5_pantalla7_capacidadesparaelaprendizaje);
            imagen5_pantalla7_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen6_pantalla7_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen6_pantalla7_capacidadesparaelaprendizaje);
            imagen6_pantalla7_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen7_pantalla7_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen7_pantalla7_capacidadesparaelaprendizaje);
            imagen7_pantalla7_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen8_pantalla7_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen8_pantalla7_capacidadesparaelaprendizaje);
            imagen8_pantalla7_capacidadesparaelaprendizaje.setImageBitmap(bm);
        }
        if (ventana_capacidades == 8) {
            setContentView(R.layout.pantalla8_capacidadesparaelaprendizaje);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_superior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla8_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen1_pantalla8_capacidadesparaelaprendizaje);
            imagen1_pantalla8_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_pantalla8_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla8_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.fondo1_pantalla8_capacidadesparaelaprendizaje);
            fondo1_pantalla8_capacidadesparaelaprendizaje.setBackgroundDrawable(bmDrawable);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo1_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla8_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen2_pantalla8_capacidadesparaelaprendizaje);
            imagen2_pantalla8_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo2_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla8_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen3_pantalla8_capacidadesparaelaprendizaje);
            imagen3_pantalla8_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo3_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla8_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen4_pantalla8_capacidadesparaelaprendizaje);
            imagen4_pantalla8_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo4_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla8_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen5_pantalla8_capacidadesparaelaprendizaje);
            imagen5_pantalla8_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen6_pantalla8_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen6_pantalla8_capacidadesparaelaprendizaje);
            imagen6_pantalla8_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen7_pantalla8_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen7_pantalla8_capacidadesparaelaprendizaje);
            imagen7_pantalla8_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen8_pantalla8_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen8_pantalla8_capacidadesparaelaprendizaje);
            imagen8_pantalla8_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen9_pantalla8_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen9_pantalla8_capacidadesparaelaprendizaje);
            imagen9_pantalla8_capacidadesparaelaprendizaje.setImageBitmap(bm);
        }
        if (ventana_capacidades == 9) {
            setContentView(R.layout.pantalla9_capacidadesparaelaprendizaje);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_superior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla9_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen1_pantalla9_capacidadesparaelaprendizaje);
            imagen1_pantalla9_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_pantalla9_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla9_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.fondo1_pantalla9_capacidadesparaelaprendizaje);
            fondo1_pantalla9_capacidadesparaelaprendizaje.setBackgroundDrawable(bmDrawable);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo1_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla9_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen2_pantalla9_capacidadesparaelaprendizaje);
            imagen2_pantalla9_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo2_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla9_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen3_pantalla9_capacidadesparaelaprendizaje);
            imagen3_pantalla9_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo3_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla9_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen4_pantalla9_capacidadesparaelaprendizaje);
            imagen4_pantalla9_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo4_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla9_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen5_pantalla9_capacidadesparaelaprendizaje);
            imagen5_pantalla9_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo5_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen6_pantalla9_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen6_pantalla9_capacidadesparaelaprendizaje);
            imagen6_pantalla9_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen7_pantalla9_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen7_pantalla9_capacidadesparaelaprendizaje);
            imagen7_pantalla9_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen8_pantalla9_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen8_pantalla9_capacidadesparaelaprendizaje);
            imagen8_pantalla9_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen9_pantalla9_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen9_pantalla9_capacidadesparaelaprendizaje);
            imagen9_pantalla9_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen10_pantalla9_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen10_pantalla9_capacidadesparaelaprendizaje);
            imagen10_pantalla9_capacidadesparaelaprendizaje.setImageBitmap(bm);
        }
        if (ventana_capacidades == 10) {
            setContentView(R.layout.pantalla10_capacidadesparaelaprendizaje);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_superior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla10_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen1_pantalla10_capacidadesparaelaprendizaje);
            imagen1_pantalla10_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_pantalla10_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla10_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.fondo1_pantalla10_capacidadesparaelaprendizaje);
            fondo1_pantalla10_capacidadesparaelaprendizaje.setBackgroundDrawable(bmDrawable);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo1_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla10_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen2_pantalla10_capacidadesparaelaprendizaje);
            imagen2_pantalla10_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo2_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla10_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen3_pantalla10_capacidadesparaelaprendizaje);
            imagen3_pantalla10_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo3_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla10_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen4_pantalla10_capacidadesparaelaprendizaje);
            imagen4_pantalla10_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo4_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla10_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen5_pantalla10_capacidadesparaelaprendizaje);
            imagen5_pantalla10_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo5_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen6_pantalla10_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen6_pantalla10_capacidadesparaelaprendizaje);
            imagen6_pantalla10_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo6_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen7_pantalla10_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen7_pantalla10_capacidadesparaelaprendizaje);
            imagen7_pantalla10_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen8_pantalla10_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen8_pantalla10_capacidadesparaelaprendizaje);
            imagen8_pantalla10_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen9_pantalla10_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen9_pantalla10_capacidadesparaelaprendizaje);
            imagen9_pantalla10_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen10_pantalla10_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen10_pantalla10_capacidadesparaelaprendizaje);
            imagen10_pantalla10_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen11_pantalla10_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen11_pantalla10_capacidadesparaelaprendizaje);
            imagen11_pantalla10_capacidadesparaelaprendizaje.setImageBitmap(bm);
        }
        if (ventana_capacidades == 11) {
            setContentView(R.layout.pantalla11_capacidadesparaelaprendizaje);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_superior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla11_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen1_pantalla11_capacidadesparaelaprendizaje);
            imagen1_pantalla11_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_pantalla11_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla11_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.fondo1_pantalla11_capacidadesparaelaprendizaje);
            fondo1_pantalla11_capacidadesparaelaprendizaje.setBackgroundDrawable(bmDrawable);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo1_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla11_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen2_pantalla11_capacidadesparaelaprendizaje);
            imagen2_pantalla11_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo2_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla11_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen3_pantalla11_capacidadesparaelaprendizaje);
            imagen3_pantalla11_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo3_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla11_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen4_pantalla11_capacidadesparaelaprendizaje);
            imagen4_pantalla11_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo4_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla11_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen5_pantalla11_capacidadesparaelaprendizaje);
            imagen5_pantalla11_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo5_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen6_pantalla11_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen6_pantalla11_capacidadesparaelaprendizaje);
            imagen6_pantalla11_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo6_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen7_pantalla11_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen7_pantalla11_capacidadesparaelaprendizaje);
            imagen7_pantalla11_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.rectangulo7_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen8_pantalla11_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen8_pantalla11_capacidadesparaelaprendizaje);
            imagen8_pantalla11_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen9_pantalla11_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen9_pantalla11_capacidadesparaelaprendizaje);
            imagen9_pantalla11_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen10_pantalla11_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen10_pantalla11_capacidadesparaelaprendizaje);
            imagen10_pantalla11_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen11_pantalla11_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen11_pantalla11_capacidadesparaelaprendizaje);
            imagen11_pantalla11_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen12_pantalla11_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen12_pantalla11_capacidadesparaelaprendizaje);
            imagen12_pantalla11_capacidadesparaelaprendizaje.setImageBitmap(bm);
        }
        if (ventana_capacidades == 12) {
            setContentView(R.layout.pantalla12_capacidadesparaelaprendizaje);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_pantalla12_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla12_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen1_pantalla12_capacidadesparaelaprendizaje);
            imagen1_pantalla12_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.ilustracion_pantalla12_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla12_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen2_pantalla12_capacidadesparaelaprendizaje);
            imagen2_pantalla12_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla12_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen3_pantalla12_capacidadesparaelaprendizaje);
            imagen3_pantalla12_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla12_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen4_pantalla12_capacidadesparaelaprendizaje);
            imagen4_pantalla12_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla12_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen5_pantalla12_capacidadesparaelaprendizaje);
            imagen5_pantalla12_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen6_pantalla12_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen6_pantalla12_capacidadesparaelaprendizaje);
            imagen6_pantalla12_capacidadesparaelaprendizaje.setImageBitmap(bm);
        }
        if (ventana_capacidades == 13) {
            setContentView(R.layout.pantalla13_capacidadesparaelaprendizaje);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_pantalla13_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla13_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen1_pantalla13_capacidadesparaelaprendizaje);
            imagen1_pantalla13_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla13_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen2_pantalla13_capacidadesparaelaprendizaje);
            imagen2_pantalla13_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_anterior_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla13_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen3_pantalla13_capacidadesparaelaprendizaje);
            imagen3_pantalla13_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla13_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen4_pantalla13_capacidadesparaelaprendizaje);
            imagen4_pantalla13_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.boton_siguiente_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla13_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen5_pantalla13_capacidadesparaelaprendizaje);
            imagen5_pantalla13_capacidadesparaelaprendizaje.setImageBitmap(bm);
        }
        if (ventana_capacidades == 14) {
            setContentView(R.layout.pantalla14_capacidadesparaelaprendizaje);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.texto_pantalla14_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla14_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen1_pantalla14_capacidadesparaelaprendizaje);
            imagen1_pantalla14_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.ejercicio_pantalla14_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla14_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen2_pantalla14_capacidadesparaelaprendizaje);
            imagen2_pantalla14_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.linea1_pantalla14_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla14_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen3_pantalla14_capacidadesparaelaprendizaje);
            imagen3_pantalla14_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.linea2_pantalla14_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla14_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen4_pantalla14_capacidadesparaelaprendizaje);
            imagen4_pantalla14_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.linea3_pantalla14_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla14_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen5_pantalla14_capacidadesparaelaprendizaje);
            imagen5_pantalla14_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.linea4_pantalla14_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen6_pantalla14_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen6_pantalla14_capacidadesparaelaprendizaje);
            imagen6_pantalla14_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.linea5_pantalla14_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen7_pantalla14_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen7_pantalla14_capacidadesparaelaprendizaje);
            imagen7_pantalla14_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.linea6_pantalla14_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen8_pantalla14_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen8_pantalla14_capacidadesparaelaprendizaje);
            imagen8_pantalla14_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.linea7_pantalla14_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen9_pantalla14_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen9_pantalla14_capacidadesparaelaprendizaje);
            imagen9_pantalla14_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.linea8_pantalla14_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen10_pantalla14_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen10_pantalla14_capacidadesparaelaprendizaje);
            imagen10_pantalla14_capacidadesparaelaprendizaje.setImageBitmap(bm);
            carga = Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.ilustracion_pantalla14_capacidadesparaelaprendizaje.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen11_pantalla14_capacidadesparaelaprendizaje = (ImageView) findViewById(R.id.imagen11_pantalla14_capacidadesparaelaprendizaje);
            imagen11_pantalla14_capacidadesparaelaprendizaje.setImageBitmap(bm);
        }
    }

    public void validaVentana10(){
        if (ventana_habilidadesdelectura == 1) {
            setContentView(R.layout.pantalla1_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.encabezado_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla1_habilidadesdelectura=(LinearLayout)findViewById(R.id.fondo1_pantalla1_habilidadesdelectura);
            fondo1_pantalla1_habilidadesdelectura.setBackgroundDrawable(bmDrawable);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion1_pantalla1_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla1_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla1_habilidadesdelectura);
            imagen1_pantalla1_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.bienvenido_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla1_habilidadesdelectura=(ImageView)findViewById(R.id.imagen2_pantalla1_habilidadesdelectura);
            imagen2_pantalla1_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.comienzo_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            comenzar_habilidadesdelectura=(ImageView)findViewById(R.id.comenzar_habilidadesdelectura);
            comenzar_habilidadesdelectura.setImageBitmap(bm);
        }
        if (ventana_habilidadesdelectura== 2) {
            setContentView(R.layout.pantalla2_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion1_pantalla2_7_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla2_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla2_habilidadesdelectura);
            imagen1_pantalla2_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.anterior_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla2_habilidadesdelectura=(ImageView)findViewById(R.id.imagen2_pantalla2_habilidadesdelectura);
            imagen2_pantalla2_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.siguiente_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla2_habilidadesdelectura=(ImageView)findViewById(R.id.imagen3_pantalla2_habilidadesdelectura);
            imagen3_pantalla2_habilidadesdelectura.setImageBitmap(bm);
        }
        if (ventana_habilidadesdelectura == 3) {
            setContentView(R.layout.pantalla3_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion1_pantalla3_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla3_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla3_habilidadesdelectura);
            imagen1_pantalla3_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.anterior_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla3_habilidadesdelectura=(ImageView)findViewById(R.id.imagen2_pantalla3_habilidadesdelectura);
            imagen2_pantalla3_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.siguiente_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla3_habilidadesdelectura=(ImageView)findViewById(R.id.imagen3_pantalla3_habilidadesdelectura);
            imagen3_pantalla3_habilidadesdelectura.setImageBitmap(bm);
        }
        if (ventana_habilidadesdelectura == 4) {
            setContentView(R.layout.pantalla4_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion1_pantalla4_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla4_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla4_habilidadesdelectura);
            imagen1_pantalla4_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion2_pantalla4_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla4_habilidadesdelectura=(ImageView)findViewById(R.id.imagen2_pantalla4_habilidadesdelectura);
            imagen2_pantalla4_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.anterior_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla4_habilidadesdelectura=(ImageView)findViewById(R.id.imagen3_pantalla4_habilidadesdelectura);
            imagen3_pantalla4_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.siguiente_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla4_habilidadesdelectura=(ImageView)findViewById(R.id.imagen4_pantalla4_habilidadesdelectura);
            imagen4_pantalla4_habilidadesdelectura.setImageBitmap(bm);
        }
        if (ventana_habilidadesdelectura == 5) {
            setContentView(R.layout.pantalla5_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion1_pantalla5_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla5_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla5_habilidadesdelectura);
            imagen1_pantalla5_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.anterior_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla5_habilidadesdelectura=(ImageView)findViewById(R.id.imagen2_pantalla5_habilidadesdelectura);
            imagen2_pantalla5_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.siguiente_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla5_habilidadesdelectura=(ImageView)findViewById(R.id.imagen3_pantalla5_habilidadesdelectura);
            imagen3_pantalla5_habilidadesdelectura.setImageBitmap(bm);
        }
        if (ventana_habilidadesdelectura == 6) {
            setContentView(R.layout.pantalla6_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion1_pantalla6_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla6_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla6_habilidadesdelectura);
            imagen1_pantalla6_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.anterior_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla6_habilidadesdelectura=(ImageView)findViewById(R.id.imagen2_pantalla6_habilidadesdelectura);
            imagen2_pantalla6_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.siguiente_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla6_habilidadesdelectura=(ImageView)findViewById(R.id.imagen3_pantalla6_habilidadesdelectura);
            imagen3_pantalla6_habilidadesdelectura.setImageBitmap(bm);
        }
        if (ventana_habilidadesdelectura == 7) {
            setContentView(R.layout.pantalla7_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion1_pantalla2_7_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla7_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla7_habilidadesdelectura);
            imagen1_pantalla7_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.anterior_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla7_habilidadesdelectura=(ImageView)findViewById(R.id.imagen2_pantalla7_habilidadesdelectura);
            imagen2_pantalla7_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.siguiente_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla7_habilidadesdelectura=(ImageView)findViewById(R.id.imagen3_pantalla7_habilidadesdelectura);
            imagen3_pantalla7_habilidadesdelectura.setImageBitmap(bm);
        }
        if (ventana_habilidadesdelectura == 8) {
            setContentView(R.layout.pantalla8_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion1_pantalla8_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla8_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla8_habilidadesdelectura);
            imagen1_pantalla8_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.anterior_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla8_habilidadesdelectura=(ImageView)findViewById(R.id.imagen2_pantalla8_habilidadesdelectura);
            imagen2_pantalla8_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.siguiente_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla8_habilidadesdelectura=(ImageView)findViewById(R.id.imagen3_pantalla8_habilidadesdelectura);
            imagen3_pantalla8_habilidadesdelectura.setImageBitmap(bm);
        }
        if (ventana_habilidadesdelectura == 9) {
            setContentView(R.layout.pantalla9_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion1_pantalla9_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla9_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla9_habilidadesdelectura);
            imagen1_pantalla9_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion2_pantalla9_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla9_habilidadesdelectura=(ImageView)findViewById(R.id.imagen2_pantalla9_habilidadesdelectura);
            imagen2_pantalla9_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.anterior_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla9_habilidadesdelectura=(ImageView)findViewById(R.id.imagen3_pantalla9_habilidadesdelectura);
            imagen3_pantalla9_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.siguiente_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla9_habilidadesdelectura=(ImageView)findViewById(R.id.imagen4_pantalla9_habilidadesdelectura);
            imagen4_pantalla9_habilidadesdelectura.setImageBitmap(bm);
        }
        if (ventana_habilidadesdelectura == 10) {
            setContentView(R.layout.pantalla10_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion1_pantalla10_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla10_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla10_habilidadesdelectura);
            imagen1_pantalla10_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.anterior_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla10_habilidadesdelectura=(ImageView)findViewById(R.id.imagen2_pantalla10_habilidadesdelectura);
            imagen2_pantalla10_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.siguiente_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla10_habilidadesdelectura=(ImageView)findViewById(R.id.imagen3_pantalla10_habilidadesdelectura);
            imagen3_pantalla10_habilidadesdelectura.setImageBitmap(bm);
        }
        if (ventana_habilidadesdelectura == 11) {
            setContentView(R.layout.pantalla11_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion1_pantalla11_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla11_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla11_habilidadesdelectura);
            imagen1_pantalla11_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.anterior_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla11_habilidadesdelectura=(ImageView)findViewById(R.id.imagen2_pantalla11_habilidadesdelectura);
            imagen2_pantalla11_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.siguiente_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla11_habilidadesdelectura=(ImageView)findViewById(R.id.imagen3_pantalla11_habilidadesdelectura);
            imagen3_pantalla11_habilidadesdelectura.setImageBitmap(bm);
        }
        if (ventana_habilidadesdelectura == 12) {
            setContentView(R.layout.pantalla12_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion1_pantalla12_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla12_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla12_habilidadesdelectura);
            imagen1_pantalla12_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.anterior_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla12_habilidadesdelectura=(ImageView)findViewById(R.id.imagen2_pantalla12_habilidadesdelectura);
            imagen2_pantalla12_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.siguiente_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla12_habilidadesdelectura=(ImageView)findViewById(R.id.imagen3_pantalla12_habilidadesdelectura);
            imagen3_pantalla12_habilidadesdelectura.setImageBitmap(bm);
        }
        if (ventana_habilidadesdelectura == 13) {
            setContentView(R.layout.pantalla13_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion1_pantalla13_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla13_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla13_habilidadesdelectura);
            imagen1_pantalla13_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.anterior_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla13_habilidadesdelectura=(ImageView)findViewById(R.id.imagen2_pantalla13_habilidadesdelectura);
            imagen2_pantalla13_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.siguiente_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla13_habilidadesdelectura=(ImageView)findViewById(R.id.imagen3_pantalla13_habilidadesdelectura);
            imagen3_pantalla13_habilidadesdelectura.setImageBitmap(bm);
        }
        if (ventana_habilidadesdelectura == 14) {
            setContentView(R.layout.pantalla14_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion1_pantalla14_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla14_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla14_habilidadesdelectura);
            imagen1_pantalla14_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.anterior_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla14_habilidadesdelectura=(ImageView)findViewById(R.id.imagen2_pantalla14_habilidadesdelectura);
            imagen2_pantalla14_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.siguiente_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla14_habilidadesdelectura=(ImageView)findViewById(R.id.imagen3_pantalla14_habilidadesdelectura);
            imagen3_pantalla14_habilidadesdelectura.setImageBitmap(bm);
        }
        if (ventana_habilidadesdelectura == 15) {
            setContentView(R.layout.pantalla15_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion1_pantalla15_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla15_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla15_habilidadesdelectura);
            imagen1_pantalla15_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.anterior_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla15_habilidadesdelectura=(ImageView)findViewById(R.id.imagen2_pantalla15_habilidadesdelectura);
            imagen2_pantalla15_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.siguiente_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla15_habilidadesdelectura=(ImageView)findViewById(R.id.imagen3_pantalla15_habilidadesdelectura);
            imagen3_pantalla15_habilidadesdelectura.setImageBitmap(bm);
        }
        if (ventana_habilidadesdelectura == 16) {
            setContentView(R.layout.pantalla16_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion1_pantalla16_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla16_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla16_habilidadesdelectura);
            imagen1_pantalla16_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.anterior_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla16_habilidadesdelectura=(ImageView)findViewById(R.id.imagen2_pantalla16_habilidadesdelectura);
            imagen2_pantalla16_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.siguiente_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla16_habilidadesdelectura=(ImageView)findViewById(R.id.imagen3_pantalla16_habilidadesdelectura);
            imagen3_pantalla16_habilidadesdelectura.setImageBitmap(bm);
        }
        if (ventana_habilidadesdelectura == 17) {
            setContentView(R.layout.pantalla17_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.ilustracion1_pantalla17_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla17_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla17_habilidadesdelectura);
            imagen1_pantalla17_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.anterior_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla17_habilidadesdelectura=(ImageView)findViewById(R.id.imagen2_pantalla17_habilidadesdelectura);
            imagen2_pantalla17_habilidadesdelectura.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.siguiente_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla17_habilidadesdelectura=(ImageView)findViewById(R.id.imagen3_pantalla17_habilidadesdelectura);
            imagen3_pantalla17_habilidadesdelectura.setImageBitmap(bm);
        }
        if (ventana_habilidadesdelectura == 18) {
            setContentView(R.layout.pantalla18_habilidadesdelectura);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia10/.anterior_habilidadesdelectura.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla18_habilidadesdelectura=(ImageView)findViewById(R.id.imagen1_pantalla18_habilidadesdelectura);
            imagen1_pantalla18_habilidadesdelectura.setImageBitmap(bm);
        }
    }

    public void validaVentana11(){
        if (ventana_foros == 1) {
            setContentView(R.layout.pantalla1_forosvirtuales);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.portada_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla1_forosvirtuales=(LinearLayout)findViewById(R.id.fondo1_pantalla1_forosvirtuales);
            fondo1_pantalla1_forosvirtuales.setBackgroundDrawable(bmDrawable);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.bienvenida_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla1_forosvirtuales=(ImageView)findViewById(R.id.imagen1_pantalla1_forosvirtuales);
            imagen1_pantalla1_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.barra_negra_botones_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo2_pantalla1_forosvirtuales=(LinearLayout)findViewById(R.id.fondo2_pantalla1_forosvirtuales);
            fondo2_pantalla1_forosvirtuales.setBackgroundDrawable(bmDrawable);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.comenzar_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            comenzar_forosvirtuales=(ImageView)findViewById(R.id.comenzar_forosvirtuales);
            comenzar_forosvirtuales.setImageBitmap(bm);
        }
        if (ventana_foros == 2) {
            setContentView(R.layout.pantalla2_forosvirtuales);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_pantalla2_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla2_forosvirtuales=(ImageView)findViewById(R.id.imagen2_pantalla2_forosvirtuales);
            imagen2_pantalla2_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.barra_negra_botones_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla2_forosvirtuales=(LinearLayout)findViewById(R.id.fondo1_pantalla2_forosvirtuales);
            fondo1_pantalla2_forosvirtuales.setBackgroundDrawable(bmDrawable);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.menu_pantalla2_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            menu_forosvirtuales=(ImageView)findViewById(R.id.menu_forosvirtuales);
            menu_forosvirtuales.setImageBitmap(bm);
        }
        if (ventana_foros == 3) {
            setContentView(R.layout.pantalla3_forosvirtuales);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_pantalla3_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla3_forosvirtuales=(ImageView)findViewById(R.id.fondo1_pantalla3_forosvirtuales);
            fondo1_pantalla3_forosvirtuales.setBackgroundDrawable(bmDrawable);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla3_forosvirtuales=(ImageView)findViewById(R.id.imagen1_pantalla3_forosvirtuales);
            imagen1_pantalla3_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla3_forosvirtuales=(ImageView)findViewById(R.id.imagen2_pantalla3_forosvirtuales);
            imagen2_pantalla3_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla3_forosvirtuales=(ImageView)findViewById(R.id.imagen3_pantalla3_forosvirtuales);
            imagen3_pantalla3_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla3_forosvirtuales=(ImageView)findViewById(R.id.imagen4_pantalla3_forosvirtuales);
            imagen4_pantalla3_forosvirtuales.setImageBitmap(bm);
        }
        if (ventana_foros == 4) {
            setContentView(R.layout.pantalla4_forosvirtuales);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_pantalla4_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla4_forosvirtuales=(ImageView)findViewById(R.id.fondo1_pantalla4_forosvirtuales);
            fondo1_pantalla4_forosvirtuales.setBackgroundDrawable(bmDrawable);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.ilustracion_pantalla4_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla4_forosvirtuales=(ImageView)findViewById(R.id.imagen1_pantalla4_forosvirtuales);
            imagen1_pantalla4_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla4_forosvirtuales=(ImageView)findViewById(R.id.imagen2_pantalla4_forosvirtuales);
            imagen2_pantalla4_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla4_forosvirtuales=(ImageView)findViewById(R.id.imagen3_pantalla4_forosvirtuales);
            imagen3_pantalla4_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla4_forosvirtuales=(ImageView)findViewById(R.id.imagen4_pantalla4_forosvirtuales);
            imagen4_pantalla4_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla4_forosvirtuales=(ImageView)findViewById(R.id.imagen5_pantalla4_forosvirtuales);
            imagen5_pantalla4_forosvirtuales.setImageBitmap(bm);
        }
        if (ventana_foros == 5) {
            setContentView(R.layout.pantalla5_forosvirtuales);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_pantalla5_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla5_forosvirtuales=(ImageView)findViewById(R.id.fondo1_pantalla5_forosvirtuales);
            fondo1_pantalla5_forosvirtuales.setBackgroundDrawable(bmDrawable);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.ilustracion_pantalla5_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla5_forosvirtuales=(ImageView)findViewById(R.id.imagen1_pantalla5_forosvirtuales);
            imagen1_pantalla5_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla5_forosvirtuales=(ImageView)findViewById(R.id.imagen2_pantalla5_forosvirtuales);
            imagen2_pantalla5_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla5_forosvirtuales=(ImageView)findViewById(R.id.imagen3_pantalla5_forosvirtuales);
            imagen3_pantalla5_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla5_forosvirtuales=(ImageView)findViewById(R.id.imagen4_pantalla5_forosvirtuales);
            imagen4_pantalla5_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla5_forosvirtuales=(ImageView)findViewById(R.id.imagen5_pantalla5_forosvirtuales);
            imagen5_pantalla5_forosvirtuales.setImageBitmap(bm);
        }
        if (ventana_foros == 6) {
            setContentView(R.layout.pantalla6_forosvirtuales);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_pantalla6_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla6_forosvirtuales=(ImageView)findViewById(R.id.imagen1_pantalla6_forosvirtuales);
            imagen1_pantalla6_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla6_forosvirtuales=(ImageView)findViewById(R.id.imagen2_pantalla6_forosvirtuales);
            imagen2_pantalla6_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla6_forosvirtuales=(ImageView)findViewById(R.id.imagen3_pantalla6_forosvirtuales);
            imagen3_pantalla6_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla6_forosvirtuales=(ImageView)findViewById(R.id.imagen4_pantalla6_forosvirtuales);
            imagen4_pantalla6_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla6_forosvirtuales=(ImageView)findViewById(R.id.imagen5_pantalla6_forosvirtuales);
            imagen5_pantalla6_forosvirtuales.setImageBitmap(bm);
        }
        if (ventana_foros == 7) {
            setContentView(R.layout.pantalla7_forosvirtuales);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_pantalla7_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla7_forosvirtuales=(ImageView)findViewById(R.id.fondo1_pantalla7_forosvirtuales);
            fondo1_pantalla7_forosvirtuales.setBackgroundDrawable(bmDrawable);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.ilustracion_pantalla7_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla7_forosvirtuales=(ImageView)findViewById(R.id.imagen1_pantalla7_forosvirtuales);
            imagen1_pantalla7_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla7_forosvirtuales=(ImageView)findViewById(R.id.imagen2_pantalla7_forosvirtuales);
            imagen2_pantalla7_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla7_forosvirtuales=(ImageView)findViewById(R.id.imagen3_pantalla7_forosvirtuales);
            imagen3_pantalla7_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla7_forosvirtuales=(ImageView)findViewById(R.id.imagen4_pantalla7_forosvirtuales);
            imagen4_pantalla7_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla7_forosvirtuales=(ImageView)findViewById(R.id.imagen5_pantalla7_forosvirtuales);
            imagen5_pantalla7_forosvirtuales.setImageBitmap(bm);
        }
        if (ventana_foros == 8) {
            setContentView(R.layout.pantalla8_forosvirtuales);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_pantalla8_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla8_forosvirtuales=(ImageView)findViewById(R.id.imagen1_pantalla8_forosvirtuales);
            imagen1_pantalla8_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla8_forosvirtuales=(ImageView)findViewById(R.id.imagen2_pantalla8_forosvirtuales);
            imagen2_pantalla8_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla8_forosvirtuales=(ImageView)findViewById(R.id.imagen3_pantalla8_forosvirtuales);
            imagen3_pantalla8_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla8_forosvirtuales=(ImageView)findViewById(R.id.imagen4_pantalla8_forosvirtuales);
            imagen4_pantalla8_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla8_forosvirtuales=(ImageView)findViewById(R.id.imagen5_pantalla8_forosvirtuales);
            imagen5_pantalla8_forosvirtuales.setImageBitmap(bm);
        }
        if (ventana_foros == 9) {
            setContentView(R.layout.pantalla9_forosvirtuales);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_pantalla9_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla9_forosvirtuales=(ImageView)findViewById(R.id.fondo1_pantalla9_forosvirtuales);
            fondo1_pantalla9_forosvirtuales.setBackgroundDrawable(bmDrawable);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla9_forosvirtuales=(ImageView)findViewById(R.id.imagen1_pantalla9_forosvirtuales);
            imagen1_pantalla9_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla9_forosvirtuales=(ImageView)findViewById(R.id.imagen2_pantalla9_forosvirtuales);
            imagen2_pantalla9_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla9_forosvirtuales=(ImageView)findViewById(R.id.imagen3_pantalla9_forosvirtuales);
            imagen3_pantalla9_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla9_forosvirtuales=(ImageView)findViewById(R.id.imagen4_pantalla9_forosvirtuales);
            imagen4_pantalla9_forosvirtuales.setImageBitmap(bm);
        }
        if (ventana_foros == 10) {
            setContentView(R.layout.pantalla10_forosvirtuales);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_pantalla10_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla10_forosvirtuales=(ImageView)findViewById(R.id.fondo1_pantalla10_forosvirtuales);
            fondo1_pantalla10_forosvirtuales.setBackgroundDrawable(bmDrawable);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.ilustracion_pantalla10_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla10_forosvirtuales=(ImageView)findViewById(R.id.imagen1_pantalla10_forosvirtuales);
            imagen1_pantalla10_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla10_forosvirtuales=(ImageView)findViewById(R.id.imagen2_pantalla10_forosvirtuales);
            imagen2_pantalla10_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla10_forosvirtuales=(ImageView)findViewById(R.id.imagen3_pantalla10_forosvirtuales);
            imagen3_pantalla10_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla10_forosvirtuales=(ImageView)findViewById(R.id.imagen4_pantalla10_forosvirtuales);
            imagen4_pantalla10_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen5_pantalla10_forosvirtuales=(ImageView)findViewById(R.id.imagen5_pantalla10_forosvirtuales);
            imagen5_pantalla10_forosvirtuales.setImageBitmap(bm);
        }
        if (ventana_foros == 11) {
            setContentView(R.layout.pantalla11_forosvirtuales);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_pantalla11_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla11_forosvirtuales=(ImageView)findViewById(R.id.fondo1_pantalla11_forosvirtuales);
            fondo1_pantalla11_forosvirtuales.setBackgroundDrawable(bmDrawable);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla11_forosvirtuales=(ImageView)findViewById(R.id.imagen1_pantalla11_forosvirtuales);
            imagen1_pantalla11_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla11_forosvirtuales=(ImageView)findViewById(R.id.imagen2_pantalla11_forosvirtuales);
            imagen2_pantalla11_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla11_forosvirtuales=(ImageView)findViewById(R.id.imagen3_pantalla11_forosvirtuales);
            imagen3_pantalla11_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla11_forosvirtuales=(ImageView)findViewById(R.id.imagen4_pantalla11_forosvirtuales);
            imagen4_pantalla11_forosvirtuales.setImageBitmap(bm);
        }
        if (ventana_foros == 12) {
            setContentView(R.layout.pantalla12_forosvirtuales);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_pantalla12_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla12_forosvirtuales=(ImageView)findViewById(R.id.fondo1_pantalla12_forosvirtuales);
            fondo1_pantalla12_forosvirtuales.setBackgroundDrawable(bmDrawable);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla12_forosvirtuales=(ImageView)findViewById(R.id.imagen1_pantalla12_forosvirtuales);
            imagen1_pantalla12_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla12_forosvirtuales=(ImageView)findViewById(R.id.imagen2_pantalla12_forosvirtuales);
            imagen2_pantalla12_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla12_forosvirtuales=(ImageView)findViewById(R.id.imagen3_pantalla12_forosvirtuales);
            imagen3_pantalla12_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla12_forosvirtuales=(ImageView)findViewById(R.id.imagen4_pantalla12_forosvirtuales);
            imagen4_pantalla12_forosvirtuales.setImageBitmap(bm);
        }
        if (ventana_foros == 13) {
            setContentView(R.layout.pantalla13_forosvirtuales);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_pantalla13_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla13_forosvirtuales=(ImageView)findViewById(R.id.fondo1_pantalla13_forosvirtuales);
            fondo1_pantalla13_forosvirtuales.setBackgroundDrawable(bmDrawable);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla13_forosvirtuales=(ImageView)findViewById(R.id.imagen1_pantalla13_forosvirtuales);
            imagen1_pantalla13_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla13_forosvirtuales=(ImageView)findViewById(R.id.imagen2_pantalla13_forosvirtuales);
            imagen2_pantalla13_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla13_forosvirtuales=(ImageView)findViewById(R.id.imagen3_pantalla13_forosvirtuales);
            imagen3_pantalla13_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla13_forosvirtuales=(ImageView)findViewById(R.id.imagen4_pantalla13_forosvirtuales);
            imagen4_pantalla13_forosvirtuales.setImageBitmap(bm);
        }
        if (ventana_foros == 14) {
            setContentView(R.layout.pantalla14_forosvirtuales);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_pantalla14_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla14_forosvirtuales=(ImageView)findViewById(R.id.fondo1_pantalla14_forosvirtuales);
            fondo1_pantalla14_forosvirtuales.setBackgroundDrawable(bmDrawable);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla14_forosvirtuales=(ImageView)findViewById(R.id.imagen1_pantalla14_forosvirtuales);
            imagen1_pantalla14_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla14_forosvirtuales=(ImageView)findViewById(R.id.imagen2_pantalla14_forosvirtuales);
            imagen2_pantalla14_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla14_forosvirtuales=(ImageView)findViewById(R.id.imagen3_pantalla14_forosvirtuales);
            imagen3_pantalla14_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla14_forosvirtuales=(ImageView)findViewById(R.id.imagen4_pantalla14_forosvirtuales);
            imagen4_pantalla14_forosvirtuales.setImageBitmap(bm);
        }
        if (ventana_foros == 15) {
            setContentView(R.layout.pantalla15_forosvirtuales);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_pantalla15_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla15_forosvirtuales=(ImageView)findViewById(R.id.fondo1_pantalla15_forosvirtuales);
            fondo1_pantalla15_forosvirtuales.setBackgroundDrawable(bmDrawable);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla15_forosvirtuales=(ImageView)findViewById(R.id.imagen1_pantalla15_forosvirtuales);
            imagen1_pantalla15_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_anterior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla15_forosvirtuales=(ImageView)findViewById(R.id.imagen2_pantalla15_forosvirtuales);
            imagen2_pantalla15_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen3_pantalla15_forosvirtuales=(ImageView)findViewById(R.id.imagen3_pantalla15_forosvirtuales);
            imagen3_pantalla15_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_siguiente_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen4_pantalla15_forosvirtuales=(ImageView)findViewById(R.id.imagen4_pantalla15_forosvirtuales);
            imagen4_pantalla15_forosvirtuales.setImageBitmap(bm);
        }
        if (ventana_foros == 16) {
            setContentView(R.layout.pantalla16_forosvirtuales);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.panel_superior_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen1_pantalla16_forosvirtuales=(ImageView)findViewById(R.id.imagen1_pantalla16_forosvirtuales);
            imagen1_pantalla16_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.texto_pantalla16_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            imagen2_pantalla16_forosvirtuales=(ImageView)findViewById(R.id.imagen2_pantalla16_forosvirtuales);
            imagen2_pantalla16_forosvirtuales.setImageBitmap(bm);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.barra_negra_botones_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            bmDrawable = new BitmapDrawable(bm);
            fondo1_pantalla16_forosvirtuales=(LinearLayout)findViewById(R.id.fondo1_pantalla16_forosvirtuales);
            fondo1_pantalla16_forosvirtuales.setBackgroundDrawable(bmDrawable);
            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia11/.boton_salir_forosvirtuales.png");
            bm = BitmapFactory.decodeFile(String.valueOf(carga));
            salir_forosvirtuales=(ImageView)findViewById(R.id.salir_forosvirtuales);
            salir_forosvirtuales.setImageBitmap(bm);
        }
    }

    public Boolean validaVersion(){
        Boolean band=false;
        if(android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1){
            band=true;
        }
        return band;
    }

    public void eliminareg8(){
        String linea=null;
        String linea2=null;
        String usu=null;
        try {
            FileInputStream fIn = new FileInputStream(guardadatosnum);
            InputStreamReader archivo1 = new InputStreamReader(fIn);
            BufferedReader br = new BufferedReader(archivo1);
            linea = br.readLine();
            while(linea!=null){
                StringTokenizer tkn = new StringTokenizer(linea, "&");
                usu=tkn.nextToken();
                if(!usu.equals(usuario)){
                    linea2=linea+salto;
                }
                linea=br.readLine();
            }
            archivo1.close();
            guardadatosnum.delete();
            OutputStreamWriter archivo2 = new OutputStreamWriter(
                    new FileOutputStream(guardadatosnum));
            archivo2.write(linea2);
            archivo2.flush();
            archivo2.close();
        } catch (Exception ex) {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }
    }

    public void consulta(final String usuario, final String password){
        Thread hilo = new Thread(){
            public void run(){
                try{
                    SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
                    request.addProperty("usuario", usuario);
                    request.addProperty("password", password);
                    request.addProperty("key", key);
                    SoapSerializationEnvelope sobre = new SoapSerializationEnvelope(SoapEnvelope.VER11);
                    sobre.setOutputSoapObject(request);
                    HttpTransportSE transporte = new HttpTransportSE(URL);
                    transporte.call(SOAP_ACTION, sobre);
                    temp=sobre.getResponse().toString();
                    if(temp.equals("0")){
                        MainActivity.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(MainActivity.this, "Usuario o contraseña invalidos, vuelve a intentar", Toast.LENGTH_LONG).show();
                                entrar21.setEnabled(true);
                            }
                        });
                    }
                    else{
                        MainActivity.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                temp=extiende(temp);
                                agregar(temp + "," + usuario + "," + password);
                                temp=verifica(usuario);
                                separa(temp);
                                setContentView(R.layout.guias);
                                logeo=true;
                                opcion1.setVisible(true);
                                opcion2.setVisible(true);
                                try {
                                    OutputStreamWriter archivo = new OutputStreamWriter(
                                            new FileOutputStream(temploggeo));
                                    linea = (usuario + "," + password);
                                    archivo.write(linea);
                                    archivo.flush();
                                    archivo.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        hilo.start();
    }

    public void separa(final String linea){
        StringTokenizer tkn=new StringTokenizer(linea,",");
        this.situacion1=tkn.nextToken();
        this.codigo1=tkn.nextToken();
        this.nombre1=tkn.nextToken();
        if(situacion1.equals("TRABAJADOR")){
            this.departamento1=tkn.nextToken();
            this.centro1=tkn.nextToken();
        }
        else{
            this.centro1=tkn.nextToken();
            this.carrera1=tkn.nextToken();
        }
    }

    public String extiende (String linea){
        String aux;
        aux = linea.substring(1);
        if(linea.startsWith("A")){
            linea="ACTIVO"+aux;
        }
        else{
            if(linea.startsWith("E")){
                linea="EGRESADO"+aux;
            }
            else{
                if(linea.startsWith("T")){
                    linea="TRABAJADOR"+aux;
                }
            }
        }
        return linea;
    }

    public void agregar(String linea){
        try
        {
            FileInputStream fIn = new FileInputStream(nomar);
            InputStreamReader archivo1 = new InputStreamReader(fIn);
            BufferedReader br = new BufferedReader(archivo1);
            String linea2 = br.readLine();
            while(linea2!=null){
                total=total+linea2+salto;
                linea2 = br.readLine();
            }
            archivo1.close();
            total=total+linea;
            OutputStreamWriter archivo2 = new OutputStreamWriter(
                    new FileOutputStream(nomar));
            archivo2.write(total+salto);
            archivo2.flush();
            archivo2.close();
            total="";
        }
        catch (Exception ex)
        {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }
    }

    public void carga(){
        if(situacion1.equals("TRABAJADOR")){
            setContentView(R.layout.logint);
            situacion=(EditText)findViewById(R.id.situacion4);
            codigo=(EditText)findViewById(R.id.codigo4);
            nombre=(EditText)findViewById(R.id.nombre4);
            departamento=(EditText)findViewById(R.id.depa4);
            centro=(EditText)findViewById(R.id.centro4);
            situacion.setText(situacion1);
            codigo.setText(codigo1);
            nombre.setText(nombre1);
            departamento.setText(departamento1);
            centro.setText(centro1);
        }
        else{
            setContentView(R.layout.login);
            situacion=(EditText)findViewById(R.id.situacion2);
            codigo=(EditText)findViewById(R.id.codigo2);
            nombre=(EditText)findViewById(R.id.nombre2);
            centro=(EditText)findViewById(R.id.centro2);
            carrera=(EditText)findViewById(R.id.carrera2);
            situacion.setText(situacion1);
            codigo.setText(codigo1);
            nombre.setText(nombre1);
            centro.setText(centro1);
            carrera.setText(carrera1);
        }

    }

    public String verifica(String campo1){
        String usuario="";
        String linea2 ="";
        String linea3="";
        try
        {
            FileInputStream fIn = new FileInputStream(nomar);
            InputStreamReader archivo = new InputStreamReader(fIn);
            BufferedReader br = new BufferedReader(archivo);
            linea3 = br.readLine();
            while(linea3!=null){
                StringTokenizer tokens=new StringTokenizer(linea3, ",");
                this.situacion1=tokens.nextToken();
                this.codigo1=tokens.nextToken();
                this.nombre1=tokens.nextToken();
                this.centro1=tokens.nextToken();
                this.carrera1=tokens.nextToken();
                usuario=tokens.nextToken();
                if(campo1.equals(usuario)){
                    confirmacion=true;
                    linea2=linea3;
                }
                if(confirmacion==true){
                    linea3=null;
                }
                else{
                    linea3 = br.readLine();
                }
            }
            archivo.close();
        }
        catch (Exception ex)
        {
            Log.e("Ficheros", "Error al leer fichero desde memoria interna");
        }
        return linea2;
    }

    public Boolean conectadoWifi()
    {
        ConnectivityManager connectivity = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null)
        {
            NetworkInfo info = connectivity.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            if (info != null)
            {
                if (info.isConnected())
                    return true;
            }
        }
        return false;
    }

    public Boolean conectadoRedMovil()
    {
        ConnectivityManager connectivity = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null)
        {
            NetworkInfo info = connectivity.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            if (info != null)
            {
                if (info.isConnected())
                    return true;
            }
        }
        return false;
    }

    public Boolean estaConectado()
    {
        if(conectadoWifi())
            return true;
        else
        {
            if(conectadoRedMovil())
                return true;
            else
                return false;
        }
    }

    public void titulo(int numguia) throws FileNotFoundException {
        if(numguia==0){
            this.setTitle("estu@pp");
            getSupportActionBar().setSubtitle("");
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff137684")));
            opcion1.setVisible(true);
            opcion2.setVisible(true);
            submenu8.setVisible(false);
            submenu9.setVisible(false);
            submenu10.setVisible(false);
            submenu11.setVisible(false);
        }
        if(numguia==1){
            this.setTitle("");
            getSupportActionBar().setSubtitle("Guía de Habilidades para el Aprendizaje");
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF203197")));
            opcion1.setVisible(false);
            opcion2.setVisible(false);
            submenu1.setVisible(true);
            submenu1.setIcon(R.drawable.icono_menu);
        }
        if(numguia==8){
            this.setTitle("");
            getSupportActionBar().setSubtitle("Guía de Habilidades para el Aprendizaje");
            opcion1.setVisible(false);
            opcion2.setVisible(false);
            submenu8.setVisible(true);
            submenu8.setIcon(R.drawable.icono_menu);
        }
        if(numguia==9){
            this.setTitle("");
            getSupportActionBar().setSubtitle("Capacidades para el aprendizaje de las matemáticas");
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF5DA233")));
            opcion1.setVisible(false);
            opcion2.setVisible(false);
            submenu9.setVisible(true);
        }
        if(numguia==10){
            this.setTitle("");
            getSupportActionBar().setSubtitle("Guía de Habilidades para el Aprendizaje");
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FFC0B080")));
            opcion1.setVisible(false);
            opcion2.setVisible(false);
            submenu10.setVisible(true);
        }
        if(numguia==11){
            this.setTitle("");
            getSupportActionBar().setSubtitle("Participación en foros virtuales");
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF4A4A4A")));
            opcion1.setVisible(false);
            opcion2.setVisible(false);
            submenu11.setVisible(true);
        }
    }

    public void Alerta(String title, String message, final int pregunta){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
        alertDialog.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
            }
        });
        if(android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1){
            alertDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                public void onDismiss(DialogInterface arg0) {
                    SeCerro(pregunta);
                }

            });
        }
        else{
            SeCerro(pregunta);
        }
        alertDialog.show();
    }

    public void SeCerro(int pregunta){
        if(pregunta==1){
            ventana_datosnum=15;
            validaVentana8();
            seleccion8=false;
        }
        if(pregunta==2){
            ventana_datosnum=16;
            validaVentana8();
            seleccion8=false;
        }
        if(pregunta==3){
            ventana_datosnum=17;
            validaVentana8();
            seleccion8=false;
        }
        if(pregunta==4){
            ventana_datosnum=18;
            validaVentana8();
            seleccion8=false;
        }
        if(pregunta==5){
            ventana_datosnum=19;
            validaVentana8();
            seleccion8=false;
        }
        if(pregunta==6){
            ventana_datosnum=20;
            validaVentana8();
            seleccion8=false;
        }
        if(pregunta==7){
            ventana_datosnum=21;
            validaVentana8();
            seleccion8=false;
        }
        if(pregunta==8){
            ventana_datosnum=22;
            validaVentana8();
            seleccion8=false;
        }
        if(pregunta==9){
            ventana_datosnum=23;
            validaVentana8();
            seleccion8=false;
        }
        if(pregunta==10){
            ventana_datosnum=24;
            validaVentana8();
            seleccion8=false;
        }
        if(pregunta==11){
            ventana_datosnum=25;
            validaVentana8();
            seleccion8=false;
        }
        if(pregunta==12){
            ventana_datosnum=26;
            validaVentana8();
            seleccion8=false;
        }
        if(pregunta==13){
            ventana_datosnum=27;
            validaVentana8();
            seleccion8=false;
        }
        if(pregunta==14){
            ventana_datosnum=28;
            validaVentana8();
            seleccion8=false;
        }
    }

    private void tiempo(final String title, final String message, final int pregunta)
    {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                Alerta(title, message, pregunta);
            }
        }, TIEMPO);
    }

    private void descargar(String rutaarchivos, String Url, String nombrearc) {
        File dir=Environment.getExternalStoragePublicDirectory(rutaarchivos);
        if(!dir.exists()){
            dir.mkdirs();
        }
        Uri downloadLocation=Uri.fromFile(new File(dir, nombrearc));
        String serviceString = Context.DOWNLOAD_SERVICE;
        DownloadManager downloadManager;
        downloadManager = (DownloadManager)getSystemService(serviceString);
        Uri uri = Uri.parse(Url);
        DownloadManager.Request request ;
        request =  new DownloadManager.Request(uri);
        request.setDestinationUri(downloadLocation);
        downloadManager.enqueue(request);
    }

    public Boolean dropbox(){
        String rutaarchivos;
        String url;
        String nomarchivo;
        File dir;
        if(numguia==8){
            rutaarchivos="/.estu@pp/.guia8/";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos);
            if(!dir.exists()){
                url = "https://dl.dropbox.com/s/d0xws3twtqg99mi/anterior_datosnumericos.png?dl=0";
                nomarchivo = ".anterior_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/psy2exzbmcv97gt/audio1.mp3?dl=0";
                nomarchivo = ".audio1.mp3";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/0mfkhjkgxg3dy0u/audio2.mp3?dl=0";
                nomarchivo = ".audio2.mp3";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/aphplyveykeekb8/audio3.mp3?dl=0";
                nomarchivo = ".audio3.mp3";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/djiavpqoy96wdt9/audio4.mp3?dl=0";
                nomarchivo = ".audio4.mp3";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/2o86picioj7z0ms/audio5.mp3?dl=0";
                nomarchivo = ".audio5.mp3";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/xv9t32flekkq7rb/audio6.mp3?dl=0";
                nomarchivo = ".audio6.mp3";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/4x1qmcjhj6pkb11/audio7.mp3?dl=0";
                nomarchivo = ".audio7.mp3";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/d4tnfvla5hf7nxt/audio8.mp3?dl=0";
                nomarchivo = ".audio8.mp3";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/pmqd7s4qq2i9we4/audio9.mp3?dl=0";
                nomarchivo = ".audio9.mp3";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/1vjelammj81gzpo/audio10.mp3?dl=0";
                nomarchivo = ".audio10.mp3";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/ly1euzouyholvnh/audio11.mp3?dl=0";
                nomarchivo = ".audio11.mp3";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/laz8w9yrxjd2trs/audio12.mp3?dl=0";
                nomarchivo = ".audio12.mp3";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/1490hkarxe1ajgy/audio13.mp3?dl=0";
                nomarchivo = ".audio13.mp3";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/od5b55b1248jp02/autoevaluacion.png?dl=0";
                nomarchivo = ".autoevaluacion.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/05172gl7sliegr5/estrella_bien_datosnumericos.png?dl=0";
                nomarchivo = ".estrella_bien_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/7s4aadkk39q6oub/estrella_mal_datosnumericos.jpg?dl=0";
                nomarchivo = ".estrella_mal_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/vry2h70op3x9kiz/grafica1_autoevaluacion_datosnumericos.png?dl=0";
                nomarchivo = ".grafica1_autoevaluacion_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/6gih6j73o3fy93m/grafica2_autoevaluacion_datosnumericos.png?dl=0";
                nomarchivo = ".grafica2_autoevaluacion_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/812ovio4zj5twug/graficas_de_pastel.png?dl=0";
                nomarchivo = ".graficas_de_pastel.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/9y5os8cqzqg3wry/histogramas.png?dl=0";
                nomarchivo = ".histogramas.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/483d3c1h0vu7dh1/ilustracion1_bien_pantalla28_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_bien_pantalla28_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/wfkui32acoau8iw/ilustracion1_mal_pantalla28_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_mal_pantalla28_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/qhu8lvlxejikygm/ilustracion1_pantalla1_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla1_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/rxpha9lhq253cl8/ilustracion1_pantalla3_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla3_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/c242k0rgy5z3b6f/ilustracion1_pantalla4_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla4_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/fkz4uimtgy4orey/ilustracion1_pantalla5_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla5_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/zdjksqamcgsr5sf/ilustracion1_pantalla6_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla6_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/9v7br9bxq4bloft/ilustracion1_pantalla7_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla7_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/borxu5darp6n6vt/ilustracion1_pantalla8_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla8_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/gddgxczxxg0l9bq/ilustracion1_pantalla9_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla9_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/tpk0kzll85ljv1p/ilustracion1_pantalla10_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla10_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/39zatjx9ck4mk6l/ilustracion1_pantalla11_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla11_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/7dheg5p029khzia/ilustracion1_pantalla12_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla12_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/zroihavq8gw6suv/ilustracion1_pantalla13_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla13_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/nbzhim8k5dlhxsp/ilustracion1_pantalla14_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla14_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/uej9ckw89tu2omo/ilustracion1_pantalla15_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla15_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/ot0b10x7vti1w79/ilustracion1_pantalla16_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla16_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/dhoway7xutmoeol/ilustracion1_pantalla17_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla17_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/3mkbqi25emccuzl/ilustracion1_pantalla18_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla18_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/pzp17vtnx5ehom9/ilustracion1_pantalla19_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla19_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/db11lmzyt5zq6lo/ilustracion1_pantalla20_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla20_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/1826pkzifo1w78f/ilustracion1_pantalla21_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla21_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/x3ydw0rw496rtu0/ilustracion1_pantalla22_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla22_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/tk0m07zpbjai6fa/ilustracion1_pantalla23_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla23_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/v5q9anu27cqjk3e/ilustracion1_pantalla24_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla24_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/sf2yiycc16ik2up/ilustracion1_pantalla25_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla25_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/qu72ie7uxi2ejv7/ilustracion1_pantalla26_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla26_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/7f95od2225wjafd/ilustracion1_pantalla27_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla27_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/i65xvhazs8jwp27/ilustracion2_pantalla3_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion2_pantalla3_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/10mrv1rm04bnqpc/ilustracion2_pantalla9_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion2_pantalla9_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/0iejsqrsxqagnf3/ilustracion2_pantalla13_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion2_pantalla13_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/37xjgmv0lyrpb9r/ilustracion2_pantalla28_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion2_pantalla28_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/n9gth933rnqoosa/ilustracion3_pantalla28_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion3_pantalla28_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/ek249f5y7uqa5ea/menu_datosnumericos.png?dl=0";
                nomarchivo = ".menu_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/0xhs74rf50402xp/porcentajes.png?dl=0";
                nomarchivo = ".porcentajes.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/j6gnz3t9krdlis3/portada_autoevaluacion_datosnumericos.png?dl=0";
                nomarchivo = ".portada_autoevaluacion_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/0rwyp4tsv4hgqpd/portada_datosnumericos.png?dl=0";
                nomarchivo = ".portada_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/1fixvvfse3ubm65/salir_datosnumericos.png?dl=0";
                nomarchivo = ".salir_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/pc4az50qjx6sgp3/siguiente_datosnumericos.png?dl=0";
                nomarchivo = ".siguiente_datosnumericos.png";
                descargar(rutaarchivos, url, nomarchivo);
            }
            else{
                url = "https://dl.dropbox.com/s/d0xws3twtqg99mi/anterior_datosnumericos.png?dl=0";
                nomarchivo = ".anterior_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/psy2exzbmcv97gt/audio1.mp3?dl=0";
                nomarchivo = ".audio1.mp3";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/0mfkhjkgxg3dy0u/audio2.mp3?dl=0";
                nomarchivo = ".audio2.mp3";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/aphplyveykeekb8/audio3.mp3?dl=0";
                nomarchivo = ".audio3.mp3";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/djiavpqoy96wdt9/audio4.mp3?dl=0";
                nomarchivo = ".audio4.mp3";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/2o86picioj7z0ms/audio5.mp3?dl=0";
                nomarchivo = ".audio5.mp3";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/xv9t32flekkq7rb/audio6.mp3?dl=0";
                nomarchivo = ".audio6.mp3";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/4x1qmcjhj6pkb11/audio7.mp3?dl=0";
                nomarchivo = ".audio7.mp3";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/d4tnfvla5hf7nxt/audio8.mp3?dl=0";
                nomarchivo = ".audio8.mp3";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/pmqd7s4qq2i9we4/audio9.mp3?dl=0";
                nomarchivo = ".audio9.mp3";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/1vjelammj81gzpo/audio10.mp3?dl=0";
                nomarchivo = ".audio10.mp3";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/ly1euzouyholvnh/audio11.mp3?dl=0";
                nomarchivo = ".audio11.mp3";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/laz8w9yrxjd2trs/audio12.mp3?dl=0";
                nomarchivo = ".audio12.mp3";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/1490hkarxe1ajgy/audio13.mp3?dl=0";
                nomarchivo = ".audio13.mp3";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/od5b55b1248jp02/autoevaluacion.png?dl=0";
                nomarchivo = ".autoevaluacion.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/05172gl7sliegr5/estrella_bien_datosnumericos.png?dl=0";
                nomarchivo = ".estrella_bien_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/7s4aadkk39q6oub/estrella_mal_datosnumericos.jpg?dl=0";
                nomarchivo = ".estrella_mal_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/vry2h70op3x9kiz/grafica1_autoevaluacion_datosnumericos.png?dl=0";
                nomarchivo = ".grafica1_autoevaluacion_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/6gih6j73o3fy93m/grafica2_autoevaluacion_datosnumericos.png?dl=0";
                nomarchivo = ".grafica2_autoevaluacion_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/812ovio4zj5twug/graficas_de_pastel.png?dl=0";
                nomarchivo = ".graficas_de_pastel.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/9y5os8cqzqg3wry/histogramas.png?dl=0";
                nomarchivo = ".histogramas.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/483d3c1h0vu7dh1/ilustracion1_bien_pantalla28_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_bien_pantalla28_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/wfkui32acoau8iw/ilustracion1_mal_pantalla28_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_mal_pantalla28_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/qhu8lvlxejikygm/ilustracion1_pantalla1_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla1_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/rxpha9lhq253cl8/ilustracion1_pantalla3_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla3_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/c242k0rgy5z3b6f/ilustracion1_pantalla4_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla4_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/fkz4uimtgy4orey/ilustracion1_pantalla5_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla5_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/zdjksqamcgsr5sf/ilustracion1_pantalla6_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla6_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/9v7br9bxq4bloft/ilustracion1_pantalla7_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla7_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/borxu5darp6n6vt/ilustracion1_pantalla8_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla8_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/gddgxczxxg0l9bq/ilustracion1_pantalla9_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla9_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/tpk0kzll85ljv1p/ilustracion1_pantalla10_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla10_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/39zatjx9ck4mk6l/ilustracion1_pantalla11_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla11_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/7dheg5p029khzia/ilustracion1_pantalla12_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla12_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/zroihavq8gw6suv/ilustracion1_pantalla13_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla13_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/nbzhim8k5dlhxsp/ilustracion1_pantalla14_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla14_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/uej9ckw89tu2omo/ilustracion1_pantalla15_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla15_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/ot0b10x7vti1w79/ilustracion1_pantalla16_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla16_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/dhoway7xutmoeol/ilustracion1_pantalla17_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla17_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/3mkbqi25emccuzl/ilustracion1_pantalla18_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla18_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/pzp17vtnx5ehom9/ilustracion1_pantalla19_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla19_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/db11lmzyt5zq6lo/ilustracion1_pantalla20_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla20_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/1826pkzifo1w78f/ilustracion1_pantalla21_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla21_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/x3ydw0rw496rtu0/ilustracion1_pantalla22_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla22_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/tk0m07zpbjai6fa/ilustracion1_pantalla23_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla23_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/v5q9anu27cqjk3e/ilustracion1_pantalla24_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla24_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/sf2yiycc16ik2up/ilustracion1_pantalla25_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla25_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/qu72ie7uxi2ejv7/ilustracion1_pantalla26_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla26_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/7f95od2225wjafd/ilustracion1_pantalla27_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla27_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/i65xvhazs8jwp27/ilustracion2_pantalla3_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion2_pantalla3_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/10mrv1rm04bnqpc/ilustracion2_pantalla9_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion2_pantalla9_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/0iejsqrsxqagnf3/ilustracion2_pantalla13_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion2_pantalla13_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/37xjgmv0lyrpb9r/ilustracion2_pantalla28_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion2_pantalla28_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/n9gth933rnqoosa/ilustracion3_pantalla28_datosnumericos.png?dl=0";
                nomarchivo = ".ilustracion3_pantalla28_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/ek249f5y7uqa5ea/menu_datosnumericos.png?dl=0";
                nomarchivo = ".menu_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/0xhs74rf50402xp/porcentajes.png?dl=0";
                nomarchivo = ".porcentajes.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/j6gnz3t9krdlis3/portada_autoevaluacion_datosnumericos.png?dl=0";
                nomarchivo = ".portada_autoevaluacion_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/0rwyp4tsv4hgqpd/portada_datosnumericos.png?dl=0";
                nomarchivo = ".portada_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/1fixvvfse3ubm65/salir_datosnumericos.png?dl=0";
                nomarchivo = ".salir_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/pc4az50qjx6sgp3/siguiente_datosnumericos.png?dl=0";
                nomarchivo = ".siguiente_datosnumericos.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
            }
            return true;
        }
        if(numguia==9){
            rutaarchivos="/.estu@pp/.guia9/";
            dir = Environment.getExternalStoragePublicDirectory(rutaarchivos);
            if (!dir.exists()) {
                url = "https://dl.dropbox.com/s/fv07yxfxsw3efao/boton_anterior_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".boton_anterior_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/45em6jitxku23dy/boton_siguiente_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".boton_siguiente_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/3as93iblxfrunwj/comenzar_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".comenzar_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/g1tpy9j15gpuulf/correcto_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".correcto_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/qai1tulf4arrn89/ejercicio_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".ejercicio_pantalla14_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/gw0rw85f4zr2b1y/ilustracion_pantalla1_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".ilustracion_pantalla1_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/pyfr5ll8l90el85/ilustracion_pantalla2_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".ilustracion_pantalla2_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/gm5073x9j5zhz7q/ilustracion_pantalla3_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".ilustracion_pantalla3_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/mjnhjret9hore64/ilustracion_pantalla4_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".ilustracion_pantalla4_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/wqhupu7uihmwckh/ilustracion_pantalla12_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".ilustracion_pantalla12_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/fy6br7f2s7c7eg4/ilustracion_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".ilustracion_pantalla14_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/3kanstlk1eyc5k5/incorrecto_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".incorrecto_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/frnzv0j91pitt5x/linea1_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".linea1_pantalla14_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/e1ls8w1dzo0xy1i/linea2_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".linea2_pantalla14_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/gugmbd1irl92snu/linea3_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".linea3_pantalla14_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/gens7fi8q2wegin/linea4_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".linea4_pantalla14_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/wywwave2yexr5xu/linea5_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".linea5_pantalla14_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/1b33n17qllwj5b5/linea6_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".linea6_pantalla14_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/05z3i0s8u51eocw/linea7_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".linea7_pantalla14_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/xflrc0blpmmcin6/linea8_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".linea8_pantalla14_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/i5cujya3rlz1zr7/menu_pantalla2_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".menu_pantalla2_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/4so6a6hjg6ze359/portada_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".portada_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/wbc428v5mxd7y69/rectangulo1_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".rectangulo1_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/crelq97152zi9aa/rectangulo2_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".rectangulo2_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/rcimsydaw7lx3ab/rectangulo3_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".rectangulo3_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/1uy1v32cnt51lsh/rectangulo4_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".rectangulo4_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/4ihcl02d4c84vtp/rectangulo5_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".rectangulo5_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/10aj1qjdgzdla0c/rectangulo6_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".rectangulo6_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/qw5njzv08ehugwf/rectangulo7_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".rectangulo7_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/x2wfg8ompobxdhb/texto_anterior_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_anterior_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/bhxkw13p4qmmthb/texto_pantalla2_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla2_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/feb10r5yrfwsms2/texto_pantalla3_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla3_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/g5yawmq1kfsc21j/texto_pantalla4_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla4_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/h7fjmdzftqo93my/texto_pantalla5_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla5_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/rwudf0nnpjc0zff/texto_pantalla6_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla6_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/9tfih0oyaymupan/texto_pantalla7_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla7_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/v818ca0gy2ecabo/texto_pantalla8_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla8_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/bi5burcaj0dx6rw/texto_pantalla9_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla9_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/ytplspd04y8bfg4/texto_pantalla10_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla10_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/dvi3h2u3spei6rw/texto_pantalla11_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla11_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/193asffdptsjzwy/texto_pantalla12_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla12_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/kz40hj6svgsb8lr/texto_pantalla13_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla13_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/mlc3d6vli4fuvo7/texto_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla14_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/5g62btnopbnsvht/texto_siguiente_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_siguiente_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/7y47wshxqzpfagh/texto_superior_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_superior_capacidadesparaelaprendizaje.png";
                descargar(rutaarchivos, url, nomarchivo);
            }
            else{
                url = "https://dl.dropbox.com/s/fv07yxfxsw3efao/boton_anterior_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".boton_anterior_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/45em6jitxku23dy/boton_siguiente_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".boton_siguiente_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/3as93iblxfrunwj/comenzar_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".comenzar_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/g1tpy9j15gpuulf/correcto_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".correcto_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/qai1tulf4arrn89/ejercicio_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".ejercicio_pantalla14_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/gw0rw85f4zr2b1y/ilustracion_pantalla1_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".ilustracion_pantalla1_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/pyfr5ll8l90el85/ilustracion_pantalla2_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".ilustracion_pantalla2_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/gm5073x9j5zhz7q/ilustracion_pantalla3_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".ilustracion_pantalla3_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/mjnhjret9hore64/ilustracion_pantalla4_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".ilustracion_pantalla4_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/wqhupu7uihmwckh/ilustracion_pantalla12_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".ilustracion_pantalla12_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/fy6br7f2s7c7eg4/ilustracion_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".ilustracion_pantalla14_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/3kanstlk1eyc5k5/incorrecto_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".incorrecto_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/frnzv0j91pitt5x/linea1_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".linea1_pantalla14_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/e1ls8w1dzo0xy1i/linea2_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".linea2_pantalla14_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/gugmbd1irl92snu/linea3_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".linea3_pantalla14_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/gens7fi8q2wegin/linea4_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".linea4_pantalla14_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/wywwave2yexr5xu/linea5_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".linea5_pantalla14_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/1b33n17qllwj5b5/linea6_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".linea6_pantalla14_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/05z3i0s8u51eocw/linea7_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".linea7_pantalla14_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/xflrc0blpmmcin6/linea8_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".linea8_pantalla14_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/i5cujya3rlz1zr7/menu_pantalla2_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".menu_pantalla2_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/4so6a6hjg6ze359/portada_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".portada_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/wbc428v5mxd7y69/rectangulo1_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".rectangulo1_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/crelq97152zi9aa/rectangulo2_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".rectangulo2_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/rcimsydaw7lx3ab/rectangulo3_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".rectangulo3_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/1uy1v32cnt51lsh/rectangulo4_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".rectangulo4_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/4ihcl02d4c84vtp/rectangulo5_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".rectangulo5_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/10aj1qjdgzdla0c/rectangulo6_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".rectangulo6_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/qw5njzv08ehugwf/rectangulo7_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".rectangulo7_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/x2wfg8ompobxdhb/texto_anterior_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_anterior_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/bhxkw13p4qmmthb/texto_pantalla2_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla2_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/feb10r5yrfwsms2/texto_pantalla3_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla3_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/g5yawmq1kfsc21j/texto_pantalla4_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla4_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/h7fjmdzftqo93my/texto_pantalla5_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla5_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/rwudf0nnpjc0zff/texto_pantalla6_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla6_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/9tfih0oyaymupan/texto_pantalla7_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla7_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/v818ca0gy2ecabo/texto_pantalla8_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla8_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/bi5burcaj0dx6rw/texto_pantalla9_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla9_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/ytplspd04y8bfg4/texto_pantalla10_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla10_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/dvi3h2u3spei6rw/texto_pantalla11_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla11_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/193asffdptsjzwy/texto_pantalla12_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla12_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/kz40hj6svgsb8lr/texto_pantalla13_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla13_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/mlc3d6vli4fuvo7/texto_pantalla14_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_pantalla14_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/5g62btnopbnsvht/texto_siguiente_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_siguiente_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/7y47wshxqzpfagh/texto_superior_capacidadesparaelaprendizaje.png?dl=0";
                nomarchivo = ".texto_superior_capacidadesparaelaprendizaje.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
            }
            return true;
        }
        if(numguia==10){
            rutaarchivos="/.estu@pp/.guia10/";
            dir = Environment.getExternalStoragePublicDirectory(rutaarchivos);
            if(!dir.exists()){
                url = "https://dl.dropbox.com/s/v1ytb2ovt3sk7bf/anterior_habilidadesdelectura.png?dl=0";
                nomarchivo = ".anterior_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/rg2xke9oxtj4nsb/bienvenido_habilidadesdelectura.png?dl=0";
                nomarchivo = ".bienvenido_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/o5n0l93spl2loam/comienzo_habilidadesdelectura.png?dl=0";
                nomarchivo = ".comienzo_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/78fq819n9y6a4is/encabezado_habilidadesdelectura.png?dl=0";
                nomarchivo = ".encabezado_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/w1t3jjxt4rxtja3/ilustracion1_pantalla1_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla1_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/h6bxfcnof81l9v4/ilustracion1_pantalla2_7_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla2_7_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/jr0j51j3w9qv78s/ilustracion1_pantalla3_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla3_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/7t1hllo2spzyw3s/ilustracion1_pantalla4_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla4_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/cpeh6kddrc5mtbj/ilustracion1_pantalla5_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla5_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/cd35ryp055ohyv0/ilustracion1_pantalla6_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla6_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/vo7rqki7wymey9f/ilustracion1_pantalla8_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla8_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/uhpyrf2y7c3pdrk/ilustracion1_pantalla9_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla9_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/okemx5lgxm2nxzv/ilustracion1_pantalla10_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla10_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/d23wn72t66xw6yj/ilustracion1_pantalla11_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla11_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/8mwcg7d9hif6bym/ilustracion1_pantalla12_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla12_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/9c94sg8dwqbdevm/ilustracion1_pantalla13_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla13_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/9a8cwe5zv4zqx70/ilustracion1_pantalla14_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla14_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/ggr02vxfdcp0epm/ilustracion1_pantalla15_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla15_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/hfu4d8zs0iljp3f/ilustracion1_pantalla16_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla16_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/84stcxard2jicnd/ilustracion1_pantalla17_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla17_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/9exr5itntkm6l5v/ilustracion2_pantalla4_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion2_pantalla4_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/jera4hnai7e2dw0/ilustracion2_pantalla9_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion2_pantalla9_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/y8eaueptp59kmgd/siguiente_habilidadesdelectura.png?dl=0";
                nomarchivo = ".siguiente_habilidadesdelectura.png";
                descargar(rutaarchivos, url, nomarchivo);
            }
            else{
                url = "https://dl.dropbox.com/s/v1ytb2ovt3sk7bf/anterior_habilidadesdelectura.png?dl=0";
                nomarchivo = ".anterior_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/rg2xke9oxtj4nsb/bienvenido_habilidadesdelectura.png?dl=0";
                nomarchivo = ".bienvenido_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/o5n0l93spl2loam/comienzo_habilidadesdelectura.png?dl=0";
                nomarchivo = ".comienzo_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/78fq819n9y6a4is/encabezado_habilidadesdelectura.png?dl=0";
                nomarchivo = ".encabezado_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/w1t3jjxt4rxtja3/ilustracion1_pantalla1_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla1_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/h6bxfcnof81l9v4/ilustracion1_pantalla2_7_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla2_7_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/jr0j51j3w9qv78s/ilustracion1_pantalla3_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla3_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/7t1hllo2spzyw3s/ilustracion1_pantalla4_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla4_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/cpeh6kddrc5mtbj/ilustracion1_pantalla5_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla5_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/cd35ryp055ohyv0/ilustracion1_pantalla6_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla6_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/vo7rqki7wymey9f/ilustracion1_pantalla8_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla8_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/uhpyrf2y7c3pdrk/ilustracion1_pantalla9_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla9_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/okemx5lgxm2nxzv/ilustracion1_pantalla10_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla10_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/d23wn72t66xw6yj/ilustracion1_pantalla11_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla11_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/8mwcg7d9hif6bym/ilustracion1_pantalla12_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla12_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/9c94sg8dwqbdevm/ilustracion1_pantalla13_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla13_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/9a8cwe5zv4zqx70/ilustracion1_pantalla14_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla14_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/ggr02vxfdcp0epm/ilustracion1_pantalla15_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla15_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/hfu4d8zs0iljp3f/ilustracion1_pantalla16_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla16_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/84stcxard2jicnd/ilustracion1_pantalla17_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion1_pantalla17_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/9exr5itntkm6l5v/ilustracion2_pantalla4_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion2_pantalla4_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/jera4hnai7e2dw0/ilustracion2_pantalla9_habilidadesdelectura.png?dl=0";
                nomarchivo = ".ilustracion2_pantalla9_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/y8eaueptp59kmgd/siguiente_habilidadesdelectura.png?dl=0";
                nomarchivo = ".siguiente_habilidadesdelectura.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
            }
            return true;
        }
        if(numguia==11) {
            rutaarchivos="/.estu@pp/.guia11/";
            dir = Environment.getExternalStoragePublicDirectory(rutaarchivos);
            if (!dir.exists()) {
                url = "https://dl.dropbox.com/s/51nlkg8w5n1q0sg/barra_negra_botones_forosvirtuales.png?dl=0";
                nomarchivo = ".barra_negra_botones_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/cec97l94ychp1wf/bienvenida_forosvirtuales.png?dl=0";
                nomarchivo = ".bienvenida_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/kpczn53cztvym1m/boton_anterior_forosvirtuales.png?dl=0";
                nomarchivo = ".boton_anterior_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/ubgx7wkiixyv6yy/boton_salir_forosvirtuales.png?dl=0";
                nomarchivo = ".boton_salir_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/ev5st26dh8dcv9c/boton_siguiente_forosvirtuales.png?dl=0";
                nomarchivo = ".boton_siguiente_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/bqt6hzfh93xaggu/comenzar_forosvirtuales.png?dl=0";
                nomarchivo = ".comenzar_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/6u2l7bru21z8x6w/ilustracion_pantalla4_forosvirtuales.png?dl=0";
                nomarchivo = ".ilustracion_pantalla4_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/6u7scsbs5w5d02k/ilustracion_pantalla5_forosvirtuales.png?dl=0";
                nomarchivo = ".ilustracion_pantalla5_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/8hcrig9d0thorn4/ilustracion_pantalla7_forosvirtuales.png?dl=0";
                nomarchivo = ".ilustracion_pantalla7_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/40pay9f3zwsfelz/ilustracion_pantalla10_forosvirtuales.png?dl=0";
                nomarchivo = ".ilustracion_pantalla10_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/zly7rxtalw0yl5c/menu_pantalla2_forosvirtuales.png?dl=0";
                nomarchivo = ".menu_pantalla2_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/rwn4o8pxmgbkvxe/panal_superior_forosvirtuales.png?dl=0";
                nomarchivo = ".panel_superior_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/8b01iy45lekzlyw/portada_forosvirtuales.png?dl=0";
                nomarchivo = ".portada_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/go2rhp3wsn7i46w/texto_anterior_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_anterior_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/4a0iavgf3i5d537/texto_pantalla2_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla2_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/efgqmw78t86ba09/texto_pantalla3_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla3_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/au9aq7q1suamog9/texto_pantalla4_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla4_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/6zh1azigr43flak/texto_pantalla5_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla5_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/fi70lhgl0igfu94/texto_pantalla6_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla6_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/ic4jnm6bnmxjinz/texto_pantalla7_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla7_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/5ouzeywt3b4nodc/texto_pantalla8_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla8_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/o22mungvh2y3ri3/texto_pantalla9_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla9_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/rytcqnbw1t83onu/texto_pantalla10_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla10_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/p6alq3s8ku7lr21/texto_pantalla11_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla11_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/f4sfe4j35bsdhtk/texto_pantalla12_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla12_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/g53sjhxw9bofoj1/texto_pantalla13_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla13_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/boewxlnno8g0teb/texto_pantalla14_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla14_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/u93i5fd0lbqpjbl/texto_pantalla15_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla15_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/p68v6eick7gajra/texto_pantalla16_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla16_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
                url = "https://dl.dropbox.com/s/wrpbkhtokxxmyp8/texto_siguiente_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_siguiente_forosvirtuales.png";
                descargar(rutaarchivos, url, nomarchivo);
            }
            else{
                url = "https://dl.dropbox.com/s/51nlkg8w5n1q0sg/barra_negra_botones_forosvirtuales.png?dl=0";
                nomarchivo = ".barra_negra_botones_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/cec97l94ychp1wf/bienvenida_forosvirtuales.png?dl=0";
                nomarchivo = ".bienvenida_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/kpczn53cztvym1m/boton_anterior_forosvirtuales.png?dl=0";
                nomarchivo = ".boton_anterior_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/ubgx7wkiixyv6yy/boton_salir_forosvirtuales.png?dl=0";
                nomarchivo = ".boton_salir_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/ev5st26dh8dcv9c/boton_siguiente_forosvirtuales.png?dl=0";
                nomarchivo = ".boton_siguiente_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/bqt6hzfh93xaggu/comenzar_forosvirtuales.png?dl=0";
                nomarchivo = ".comenzar_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/6u2l7bru21z8x6w/ilustracion_pantalla4_forosvirtuales.png?dl=0";
                nomarchivo = ".ilustracion_pantalla4_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/6u7scsbs5w5d02k/ilustracion_pantalla5_forosvirtuales.png?dl=0";
                nomarchivo = ".ilustracion_pantalla5_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/8hcrig9d0thorn4/ilustracion_pantalla7_forosvirtuales.png?dl=0";
                nomarchivo = ".ilustracion_pantalla7_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/40pay9f3zwsfelz/ilustracion_pantalla10_forosvirtuales.png?dl=0";
                nomarchivo = ".ilustracion_pantalla10_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/zly7rxtalw0yl5c/menu_pantalla2_forosvirtuales.png?dl=0";
                nomarchivo = ".menu_pantalla2_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/rwn4o8pxmgbkvxe/panal_superior_forosvirtuales.png?dl=0";
                nomarchivo = ".panel_superior_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/8b01iy45lekzlyw/portada_forosvirtuales.png?dl=0";
                nomarchivo = ".portada_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/go2rhp3wsn7i46w/texto_anterior_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_anterior_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/4a0iavgf3i5d537/texto_pantalla2_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla2_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/efgqmw78t86ba09/texto_pantalla3_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla3_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/au9aq7q1suamog9/texto_pantalla4_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla4_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/6zh1azigr43flak/texto_pantalla5_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla5_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/fi70lhgl0igfu94/texto_pantalla6_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla6_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/ic4jnm6bnmxjinz/texto_pantalla7_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla7_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/5ouzeywt3b4nodc/texto_pantalla8_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla8_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/o22mungvh2y3ri3/texto_pantalla9_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla9_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/rytcqnbw1t83onu/texto_pantalla10_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla10_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/p6alq3s8ku7lr21/texto_pantalla11_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla11_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/f4sfe4j35bsdhtk/texto_pantalla12_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla12_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/g53sjhxw9bofoj1/texto_pantalla13_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla13_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/boewxlnno8g0teb/texto_pantalla14_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla14_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/u93i5fd0lbqpjbl/texto_pantalla15_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla15_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/p68v6eick7gajra/texto_pantalla16_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_pantalla16_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
                url = "https://dl.dropbox.com/s/wrpbkhtokxxmyp8/texto_siguiente_forosvirtuales.png?dl=0";
                nomarchivo = ".texto_siguiente_forosvirtuales.png";
                dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
                if (!dir.exists()) {
                    descargar(rutaarchivos, url, nomarchivo);
                }
            }
            return true;
        }
        return false;
    }

    public int validaArchivos(){
        String nomarchivo;
        String rutaarchivos;
        int ar=0;
        File dir;
        if(numguia==8){
            rutaarchivos="/.estu@pp/.guia8/";
            nomarchivo = ".anterior_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".audio1.mp3";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".audio2.mp3";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".audio3.mp3";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".audio4.mp3";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".audio5.mp3";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".audio6.mp3";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".audio7.mp3";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".audio8.mp3";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".audio9.mp3";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".audio10.mp3";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".audio11.mp3";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".audio12.mp3";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".audio13.mp3";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".autoevaluacion.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".estrella_bien_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".estrella_mal_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".grafica1_autoevaluacion_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".grafica2_autoevaluacion_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".graficas_de_pastel.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".histogramas.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_bien_pantalla28_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_mal_pantalla28_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla1_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla3_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla4_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla5_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla6_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla7_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla8_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla9_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla10_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla11_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla12_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla13_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla14_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla15_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla16_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla17_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla18_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla19_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla20_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla21_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla22_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla23_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla24_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla25_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla26_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla27_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion2_pantalla3_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion2_pantalla9_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion2_pantalla13_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion2_pantalla28_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion3_pantalla28_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".menu_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".porcentajes.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".portada_autoevaluacion_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".portada_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".salir_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".siguiente_datosnumericos.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
        }
        if(numguia==9) {
            rutaarchivos = "/.estu@pp/.guia9/";
            nomarchivo = ".boton_anterior_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".boton_siguiente_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".comenzar_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".correcto_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ejercicio_pantalla14_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion_pantalla1_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion_pantalla2_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion_pantalla3_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion_pantalla4_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion_pantalla12_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion_pantalla14_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".incorrecto_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".linea1_pantalla14_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".linea2_pantalla14_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".linea3_pantalla14_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".linea4_pantalla14_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".linea5_pantalla14_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".linea6_pantalla14_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".linea7_pantalla14_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".linea8_pantalla14_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".menu_pantalla2_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".portada_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".rectangulo1_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".rectangulo2_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".rectangulo3_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".rectangulo4_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".rectangulo5_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".rectangulo6_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".rectangulo7_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_anterior_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla2_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla3_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla4_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla5_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla6_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla7_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla8_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla9_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla10_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla11_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla12_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla13_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla14_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_siguiente_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_superior_capacidadesparaelaprendizaje.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
        }
        if(numguia==10){
            rutaarchivos="/.estu@pp/.guia10/";
            nomarchivo = ".anterior_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".bienvenido_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".comienzo_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".encabezado_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla1_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla2_7_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla3_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla4_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla5_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla6_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla8_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla9_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla10_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla11_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla12_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla13_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla14_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla15_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla16_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion1_pantalla17_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion2_pantalla4_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion2_pantalla9_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".siguiente_habilidadesdelectura.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
        }
        if(numguia==11){
            rutaarchivos="/.estu@pp/.guia11/";
            nomarchivo = ".barra_negra_botones_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".bienvenida_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".boton_anterior_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".boton_salir_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".boton_siguiente_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".comenzar_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion_pantalla4_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion_pantalla5_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion_pantalla7_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".ilustracion_pantalla10_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".menu_pantalla2_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".panel_superior_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".portada_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_anterior_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla2_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla3_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla4_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla5_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla6_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla7_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla8_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla9_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla10_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla11_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla12_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla13_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla14_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla15_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_pantalla16_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
            nomarchivo = ".texto_siguiente_forosvirtuales.png";
            dir=Environment.getExternalStoragePublicDirectory(rutaarchivos+nomarchivo);
            if(dir.exists()){
                ar++;
            }
        }
        return ar;
    }

    public void mensaje(int mensaje) {
        if (mensaje == 1) {
            Toast.makeText(MainActivity.this, "Descargando archivos, espere un momento por favor", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MainActivity.this, "Archivos descargados exitosamente", Toast.LENGTH_LONG).show();
        }
    }

    public void AlertaDatosLoggeoMayor(){
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("Descarga de archivos");
        alertDialog.setMessage("Estas utilizando tus datos moviles.\n¿Deseas continuar con la conexión?");
        alertDialog.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                consulta(usuario, password);
            }
        });
        alertDialog.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                entrar21.setEnabled(true);
            }
        });
        alertDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            public void onDismiss(DialogInterface arg0) {
                entrar21.setEnabled(true);
            }
        });
        alertDialog.show();
    }

    public void AlertaDatosLoggeoMenor(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("Descarga de archivos");
        alertDialog.setMessage("Estas utilizando tus datos moviles.\n¿Deseas continuar con la conexión?");
        alertDialog.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                consulta(usuario, password);
            }
        });
        alertDialog.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                entrar21.setEnabled(true);
            }
        });
        alertDialog.show();
    }

    public void AlertaDatosDescargaMayor(){
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("Descarga de archivos");
        alertDialog.setMessage("Estas utilizando tus datos moviles.\n¿Deseas continuar con la descarga?");
        alertDialog.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                if(numguia==8){
                    mensaje(1);
                    guia=true;
                    descarga=dropbox();
                    if(descarga==true){
                        numar=validaArchivos();
                        while(numar!=44){
                            numar=validaArchivos();
                        }
                        mensaje(2);
                        if(numar==44){
                            try {
                                titulo(numguia);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            if(!guardadatosnum.exists())
                            {
                                numaudguia8=1;
                                ventana_datosnum=1;
                                validaVentana8();
                                validaudio(ventana_datosnum);
                            }
                            else{
                                inicio_datosnum();
                            }
                        }
                    }
                }
                if(numguia==9){
                    mensaje(1);
                    guia=true;
                    descarga=dropbox();
                    if(descarga==true){
                        numar=validaArchivos();
                        while(numar!=45){
                            numar=validaArchivos();
                        }
                        mensaje(2);
                        if(numar==45){
                            try {
                                titulo(numguia);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            ventana_capacidades=1;
                            validaVentana9();
                        }
                    }
                }
                if(numguia==11){
                    mensaje(1);
                    guia=true;
                    descarga=dropbox();
                    if(descarga==true){
                        numar=validaArchivos();
                        while(numar!=30){
                            numar=validaArchivos();
                        }
                        mensaje(2);
                        if(numar==30){
                            try {
                                titulo(numguia);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            ventana_foros=1;
                            validaVentana11();
                        }
                    }
                }
            }
        });
        alertDialog.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                numguia=0;
            }
        });
        alertDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            public void onDismiss(DialogInterface arg0) {
                numguia=0;
            }
        });
        alertDialog.show();
    }

    public void AlertaDatosDescargaMenor(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("Descarga de archivos");
        alertDialog.setMessage("Estas utilizando tus datos moviles.\n¿Deseas continuar con la descarga?");
        alertDialog.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                if(numguia==8){
                    mensaje(1);
                    guia=true;
                    descarga=dropbox();
                    if(descarga==true){
                        numar=validaArchivos();
                        while(numar!=44){
                            numar=validaArchivos();
                        }
                        mensaje(2);
                        if(numar==44){
                            try {
                                titulo(numguia);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            if(!guardadatosnum.exists())
                            {
                                numaudguia8=1;
                                ventana_datosnum=1;
                                validaVentana8();
                                validaudio(ventana_datosnum);
                            }
                            else{
                                inicio_datosnum();
                            }
                        }
                    }
                }
                if(numguia==9){
                    mensaje(1);
                    guia=true;
                    descarga=dropbox();
                    if(descarga==true){
                        numar=validaArchivos();
                        while(numar!=45){
                            numar=validaArchivos();
                        }
                        mensaje(2);
                        if(numar==45){
                            try {
                                titulo(numguia);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            ventana_capacidades=1;
                            validaVentana9();
                        }
                    }
                }
                if(numguia==11){
                    mensaje(1);
                    guia=true;
                    descarga=dropbox();
                    if(descarga==true){
                        numar=validaArchivos();
                        while(numar!=30){
                            numar=validaArchivos();
                        }
                        mensaje(2);
                        if(numar==30){
                            try {
                                titulo(numguia);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            ventana_foros=1;
                            validaVentana11();
                        }
                    }
                }
            }
        });
        alertDialog.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                numguia=0;
            }
        });
        alertDialog.show();
    }

    public void onClick(View view) throws IOException {
        switch (view.getId()){
            case R.id.entrar:
                entrar1=(Button)findViewById(R.id.entrar);
                entrar1.setEnabled(false);
                Usuario=(EditText)findViewById(R.id.usuario);
                Contraseña=(EditText)findViewById(R.id.contraseña);
                usuario=Usuario.getText().toString();
                password=Contraseña.getText().toString();
                if (usuario.equals("") && !password.equals("")){
                    Toast.makeText(MainActivity.this, "Porfavor ingresa un usuario", Toast.LENGTH_SHORT).show();
                    entrar1.setEnabled(true);
                }
                else{
                    if(!usuario.equals("") && password.equals("")){
                        Toast.makeText(MainActivity.this, "Porfavor ingresa una contraseña", Toast.LENGTH_SHORT).show();
                        entrar1.setEnabled(true);
                    }
                    else{
                        if(usuario.equals("") && password.equals("")){
                            Toast.makeText(MainActivity.this, "Porfavor ingresa sus datos", Toast.LENGTH_SHORT).show();
                            entrar1.setEnabled(true);
                        }
                        else{
                            confirmacion=false;
                            linea=verifica(usuario);
                            if(confirmacion==true){
                                separa(linea);
                                linea=null;
                                confirmacion=false;
                                setContentView(R.layout.guias);
                                logeo=true;
                                titulo(numguia);
                                try {
                                    OutputStreamWriter archivo = new OutputStreamWriter(
                                            new FileOutputStream(temploggeo));
                                    linea = (usuario + "," + password);
                                    archivo.write(linea);
                                    archivo.flush();
                                    archivo.close();
                                    linea=null;
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            else{
                                Toast.makeText(MainActivity.this, "Usuario no registrado, por favor registrate o conectate con siiau", Toast.LENGTH_SHORT).show();
                                entrar1.setEnabled(true);
                            }
                        }
                    }
                }
                break;
            case R.id.entrar2:
                entrar21=(Button)findViewById(R.id.entrar2);
                entrar21.setEnabled(false);
                Usuario=(EditText)findViewById(R.id.codigo);
                Contraseña=(EditText)findViewById(R.id.nip);
                usuario=Usuario.getText().toString();
                password=Contraseña.getText().toString();
                if(usuario.equals("") && !password.equals("")){
                    Toast.makeText(MainActivity.this, "Porfavor ingresa un usuario", Toast.LENGTH_SHORT).show();
                    entrar21.setEnabled(true);
                }
                else{
                    if(!usuario.equals("") && password.equals("")){
                        Toast.makeText(MainActivity.this, "Porfavor ingresa una contraseña", Toast.LENGTH_SHORT).show();
                        entrar21.setEnabled(true);
                    }
                    else{
                        if(usuario.equals("") && password.equals("")){
                            Toast.makeText(MainActivity.this, "Porfavor ingresa sus datos", Toast.LENGTH_SHORT).show();
                            entrar21.setEnabled(true);
                        }
                        else{
                            linea=verifica(usuario);
                            if(confirmacion==true){
                                separa(linea);
                                linea=null;
                                confirmacion=false;
                                setContentView(R.layout.guias);
                                logeo=true;
                                titulo(numguia);
                                try {
                                    OutputStreamWriter archivo = new OutputStreamWriter(
                                            new FileOutputStream(temploggeo));
                                    linea = (usuario + "," + password);
                                    archivo.write(linea);
                                    archivo.flush();
                                    archivo.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            else{
                                if(estaConectado()){
                                    if(!conectadoRedMovil()){
                                        consulta(usuario, password);
                                    }
                                    else{
                                        if(validaVersion()==true){
                                            AlertaDatosLoggeoMayor();
                                        }
                                        else{
                                            AlertaDatosLoggeoMenor();
                                        }
                                    }
                                }
                                else{
                                    Toast.makeText(MainActivity.this, "No tienes una conexion de internet estable, porfavor accede a una o registrate", Toast.LENGTH_LONG).show();
                                    entrar21.setEnabled(true);
                                }
                            }
                        }
                    }
                }
                break;
            case R.id.siguiente:
                siguiente1=(Button)findViewById(R.id.siguiente);
                siguiente1.setEnabled(false);
                setContentView(R.layout.siiau);
                if(validaVersion()==true){
                    video(2);
                }
                else{
                    imagen(2);
                }
                break;
            case R.id.registro:
                setContentView(R.layout.registro);
                centro4=(EditText)findViewById(R.id.centroreg);
                carrera4=(EditText)findViewById(R.id.carrerareg);
                sp = (Spinner) findViewById(R.id.spinner);
                ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item ,array);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                sp.setAdapter(adapter);
                sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
                {
                    public void onItemSelected(AdapterView<?> parentView, View selectedItemView,int position, long id)
                    {
                        pos = position;
                        if(pos==2){
                            centro4.setHint("Departamento");
                            carrera4.setHint("Centro");
                        }
                        else{
                            centro4.setHint("Centro");
                            carrera4.setHint("Carrera");
                        }
                    }
                    public void onNothingSelected(AdapterView<?> parentView) { }
                });
                break;
            case R.id.registrar:
                registrar1=(Button)findViewById(R.id.registrar);
                registrar1.setEnabled(false);
                codigo4=(EditText)findViewById(R.id.codigoreg);
                nombre4=(EditText)findViewById(R.id.nombrereg);
                usuario4=(EditText)findViewById(R.id.usuarioreg);
                contraseña4=(EditText)findViewById(R.id.contraseñareg);
                contraseña5=(EditText)findViewById(R.id.contraseñareg2);
                codigo3=codigo4.getText().toString();
                nombre3=nombre4.getText().toString();
                centro3=centro4.getText().toString();
                carrera3=carrera4.getText().toString();
                usuario3=usuario4.getText().toString();
                password3=contraseña4.getText().toString();
                password32=contraseña5.getText().toString();
                situacion3=array[pos];
                if(situacion3.equals("")||codigo3.equals("")||nombre3.equals("")||centro3.equals("")||carrera3.equals("")||usuario3.equals("")||password3.equals("")||password32.equals("")){
                    Toast.makeText(MainActivity.this, "Porfavor completa todos los campos", Toast.LENGTH_SHORT).show();
                    registrar1.setEnabled(true);
                }
                else{
                    if(password3.equals(password32)==false){
                        Toast.makeText(MainActivity.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                        registrar1.setEnabled(true);
                    }
                    else{
                        verifica(usuario3);
                        if(confirmacion==false){
                            Toast.makeText(MainActivity.this, "Registro realizado correctamente", Toast.LENGTH_SHORT).show();
                            agregar(situacion3.toUpperCase() + "," + codigo3.toUpperCase() + "," + nombre3.toUpperCase() + "," + centro3.toUpperCase() + "," + carrera3.toUpperCase() + "," + usuario3 + "," + password3);
                            setContentView(R.layout.activity_main);
                            if(validaVersion()==true){
                                video(1);
                            }
                            else{
                                imagen(1);
                            }
                        }
                        else{
                            Toast.makeText(MainActivity.this, "Usuario ya existe, intenta con otro usuario", Toast.LENGTH_SHORT).show();
                            registrar1.setEnabled(true);
                        }
                    }
                }
                break;
            case R.id.cancelar:
                cancelar1=(Button)findViewById(R.id.cancelar);
                cancelar1.setEnabled(false);
                setContentView(R.layout.activity_main);
                if(validaVersion()==true){
                    video(1);
                }
                else{
                    imagen(1);
                }
                break;
            case R.id.regresar:
                regresar1=(Button)findViewById(R.id.regresar);
                regresar1.setEnabled(false);
                setContentView(R.layout.activity_main);
                if(validaVersion()==true){
                    video(1);
                }
                else{
                    imagen(1);
                }
                break;
            case R.id.cerrar:
                cerrar1=(Button)findViewById(R.id.cerrar);
                cerrar1.setEnabled(false);
                setContentView(R.layout.guias);
                break;
            case R.id.cerrar2:
                cerrar3=(Button)findViewById(R.id.cerrar2);
                cerrar3.setEnabled(false);
                setContentView(R.layout.guias);
                break;
            case R.id.intro_anterior_datosnumericos2:
                aud.stop();
                validaudio(ventana_datosnum);
                ventana_datosnum--;
                validaVentana8();
                numaudguia8--;
                break;
            case R.id.intro_anterior_datosnumericos3:
                aud.stop();
                numaudguia8--;
                ventana_datosnum--;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_anterior_datosnumericos4:
                aud.stop();
                numaudguia8--;
                ventana_datosnum--;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_anterior_datosnumericos5:
                aud.stop();
                numaudguia8--;
                ventana_datosnum--;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_anterior_datosnumericos6:
                aud.stop();
                numaudguia8--;
                ventana_datosnum--;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_anterior_datosnumericos7:
                aud.stop();
                numaudguia8--;
                ventana_datosnum--;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_anterior_datosnumericos8:
                aud.stop();
                numaudguia8--;
                ventana_datosnum--;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_anterior_datosnumericos9:
                aud.stop();
                numaudguia8--;
                ventana_datosnum--;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_anterior_datosnumericos10:
                aud.stop();
                numaudguia8--;
                ventana_datosnum--;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_anterior_datosnumericos11:
                aud.stop();
                numaudguia8--;
                ventana_datosnum--;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_anterior_datosnumericos12:
                aud.stop();
                numaudguia8--;
                ventana_datosnum--;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_siguiente_datosnumericos:
                getSupportActionBar().setSubtitle("¿Cómo representar datos numéricos?");
                aud.stop();
                validaudio(ventana_datosnum);
                numaudguia8++;
                ventana_datosnum++;
                validaVentana8();
                break;
            case R.id.intro_siguiente_datosnumericos2:
                aud.stop();
                numaudguia8++;
                ventana_datosnum++;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_siguiente_datosnumericos3:
                aud.stop();
                numaudguia8++;
                ventana_datosnum++;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_siguiente_datosnumericos4:
                aud.stop();
                numaudguia8++;
                ventana_datosnum++;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_siguiente_datosnumericos5:
                aud.stop();
                numaudguia8++;
                ventana_datosnum++;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_siguiente_datosnumericos6:
                aud.stop();
                numaudguia8++;
                ventana_datosnum++;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_siguiente_datosnumericos7:
                aud.stop();
                numaudguia8++;
                ventana_datosnum++;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_siguiente_datosnumericos8:
                aud.stop();
                numaudguia8++;
                ventana_datosnum++;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_siguiente_datosnumericos9:
                aud.stop();
                numaudguia8++;
                ventana_datosnum++;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_siguiente_datosnumericos10:
                aud.stop();
                numaudguia8++;
                ventana_datosnum++;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.intro_siguiente_datosnumericos11:
                aud.stop();
                numaudguia8++;
                ventana_datosnum++;
                validaVentana8();
                validaudio(ventana_datosnum);
                break;
            case R.id.empezar_datosnum:
                aud.stop();
                ventana_datosnum++;
                validaVentana8();
                break;
            case R.id.sonido1_datosnumericos:
                clickaud();
                break;
            case R.id.sonido3_datosnumericos:
                clickaud();
                break;
            case R.id.sonido4_datosnumericos:
                clickaud();
                break;
            case R.id.sonido5_datosnumericos:
                clickaud();
                break;
            case R.id.sonido6_datosnumericos:
                clickaud();
                break;
            case R.id.sonido7_datosnumericos:
                clickaud();
                break;
            case R.id.sonido8_datosnumericos:
                clickaud();
                break;
            case R.id.sonido9_datosnumericos:
                clickaud();
                break;
            case R.id.sonido10_datosnumericos:
                clickaud();
                break;
            case R.id.sonido11_datosnumericos:
                clickaud();
                break;
            case R.id.sonido12_datosnumericos:
                clickaud();
                break;
            case R.id.sonido13_datosnumericos:
                clickaud();
                break;
            case R.id.respuesta1_1:
                if(seleccion8==false){
                    op1_1=(TextView)findViewById(R.id.texto1_1);
                    op1_4=(TextView)findViewById(R.id.texto1_4);
                    op1_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op1_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "Para calcular este valor, solo multiplicas el 15% por 20 en su expresión decimal; o sea, recorriendo el punto dos lugares a la derecha: \n\n (0.15)(20)=3", 1);
                    seleccion8=true;
                }
                break;
            case R.id.respuesta1_2:
                if(seleccion8==false){
                    op1_2=(TextView)findViewById(R.id.texto1_2);
                    op1_4=(TextView)findViewById(R.id.texto1_4);
                    op1_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op1_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "Para calcular este valor, solo multiplicas el 15% por 20 en su expresión decimal; o sea, recorriendo el punto dos lugares a la derecha: \n\n (0.15)(20)=3", 1);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta1_3:
                if(seleccion8==false){
                    op1_3=(TextView)findViewById(R.id.texto1_3);
                    op1_4=(TextView)findViewById(R.id.texto1_4);
                    op1_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op1_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "Para calcular este valor, solo multiplicas el 15% por 20 en su expresión decimal; o sea, recorriendo el punto dos lugares a la derecha: \n\n (0.15)(20)=3", 1);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta1_4:
                if(seleccion8==false){
                    op1_4=(TextView)findViewById(R.id.texto1_4);
                    op1_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Correcta", "Para calcular este valor, solo multiplicas el 15% por 20 en su expresión decimal; o sea, recorriendo el punto dos lugares a la derecha: \n\n (0.15)(20)=3", 1);
                    correctas8++;
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta2_1:
                if(seleccion8==false){
                    op2_1=(TextView)findViewById(R.id.texto2_1);
                    op2_2=(TextView)findViewById(R.id.texto2_2);
                    op2_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op2_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "Para calcular este valor, solo multiplicas el 200% por 6 en su expresión decimal; o sea, recorriendo el punto dos lugares a la derecha:  \n\n (2)(6)=12", 2);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta2_2:
                if(seleccion8==false){
                    op2_2=(TextView)findViewById(R.id.texto2_2);
                    op2_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Correcta", "Para calcular este valor, solo multiplicas el 200% por 6 en su expresión decimal; o sea, recorriendo el punto dos lugares a la derecha:  \n\n (2)(6)=12", 2);
                    correctas8++;
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta2_3:
                if(seleccion8==false){
                    op2_2=(TextView)findViewById(R.id.texto2_2);
                    op2_3=(TextView)findViewById(R.id.texto2_3);
                    op2_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op2_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "Para calcular este valor, solo multiplicas el 200% por 6 en su expresión decimal; o sea, recorriendo el punto dos lugares a la derecha:  \n\n (2)(6)=12", 2);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta2_4:
                if(seleccion8==false){
                    op2_2=(TextView)findViewById(R.id.texto2_2);
                    op2_4=(TextView)findViewById(R.id.texto2_4);
                    op2_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op2_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "Para calcular este valor, solo multiplicas el 200% por 6 en su expresión decimal; o sea, recorriendo el punto dos lugares a la derecha:  \n\n (2)(6)=12", 2);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta3_1:
                if(seleccion8==false){
                    op3_1=(TextView)findViewById(R.id.texto3_1);
                    op3_2=(TextView)findViewById(R.id.texto3_2);
                    op3_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op3_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "Para calcular este porcentaje, solo divide el total de hombres entre 500 y obtendrás la expresión del porcentaje en decimal, para expresar en porcentaje, recorre el punto 2 casillas a la izquierda (multiplica por 100).", 3);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta3_2:
                if(seleccion8==false){
                    op3_2=(TextView)findViewById(R.id.texto3_2);
                    op3_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Correcta", "Para calcular este porcentaje, solo divide el total de hombres entre 500 y obtendrás la expresión del porcentaje en decimal, para expresar en porcentaje, recorre el punto 2 casillas a la izquierda (multiplica por 100).", 3);
                    correctas8++;
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta3_3:
                if(seleccion8==false){
                    op3_2=(TextView)findViewById(R.id.texto3_2);
                    op3_3=(TextView)findViewById(R.id.texto3_3);
                    op3_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op3_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "Para calcular este porcentaje, solo divide el total de hombres entre 500 y obtendrás la expresión del porcentaje en decimal, para expresar en porcentaje, recorre el punto 2 casillas a la izquierda (multiplica por 100).", 3);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta3_4:
                if(seleccion8==false){
                    op3_2=(TextView)findViewById(R.id.texto3_2);
                    op3_4=(TextView)findViewById(R.id.texto3_4);
                    op3_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op3_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "Para calcular este porcentaje, solo divide el total de hombres entre 500 y obtendrás la expresión del porcentaje en decimal, para expresar en porcentaje, recorre el punto 2 casillas a la izquierda (multiplica por 100).", 3);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta5_1:
                if(seleccion8==false){
                    op5_4=(TextView)findViewById(R.id.texto5_4);
                    op5_1=(TextView)findViewById(R.id.texto5_1);
                    op5_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op5_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "Para encontrar este valor, se multiplican los $32,000 por 12% (en decimal). El valor obtenido representa la ganancia que obtuviste. Para obtener la cantidad en la que lo compraste, basta con restar esta cantidad a los $32,000.  \n32,000 x .12 = 3840 \n32,000 – 3,840 = 28,160 ", 4);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta5_2:
                if(seleccion8==false){
                    op5_4=(TextView)findViewById(R.id.texto5_4);
                    op5_2=(TextView)findViewById(R.id.texto5_2);
                    op5_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op5_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "Para encontrar este valor, se multiplican los $32,000 por 12% (en decimal). El valor obtenido representa la ganancia que obtuviste. Para obtener la cantidad en la que lo compraste, basta con restar esta cantidad a los $32,000.  \n32,000 x .12 = 3840 \n32,000 – 3,840 = 28,160 ", 4);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta5_3:
                if(seleccion8==false){
                    op5_4=(TextView)findViewById(R.id.texto5_4);
                    op5_3=(TextView)findViewById(R.id.texto5_3);
                    op5_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op5_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "Para encontrar este valor, se multiplican los $32,000 por 12% (en decimal). El valor obtenido representa la ganancia que obtuviste. Para obtener la cantidad en la que lo compraste, basta con restar esta cantidad a los $32,000.  \n32,000 x .12 = 3840 \n32,000 – 3,840 = 28,160 ", 4);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta5_4:
                if(seleccion8==false){
                    op5_4=(TextView)findViewById(R.id.texto5_4);
                    op5_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Correcta", "Para encontrar este valor, se multiplican los $32,000 por 12% (en decimal). El valor obtenido representa la ganancia que obtuviste. Para obtener la cantidad en la que lo compraste, basta con restar esta cantidad a los $32,000.  \n32,000 x .12 = 3840 \n32,000 – 3,840 = 28,160 ", 4);
                    correctas8++;
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta6_1:
                if(seleccion8==false){
                    op6_4=(TextView)findViewById(R.id.texto6_4);
                    op6_1=(TextView)findViewById(R.id.texto6_1);
                    op6_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op6_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "En este caso tenemos una razón, esto es, una fracción que nos representa:\n\n25%/100% = 1/4", 5);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta6_2:
                if(seleccion8==false){
                    op6_4=(TextView)findViewById(R.id.texto6_4);
                    op6_2=(TextView)findViewById(R.id.texto6_2);
                    op6_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op6_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "En este caso tenemos una razón, esto es, una fracción que nos representa:\n\n25%/100% = 1/4", 5);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta6_3:
                if(seleccion8==false){
                    op6_4=(TextView)findViewById(R.id.texto6_4);
                    op6_3=(TextView)findViewById(R.id.texto6_3);
                    op6_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op6_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "En este caso tenemos una razón, esto es, una fracción que nos representa:\n\n25%/100% = 1/4", 5);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta6_4:
                if(seleccion8==false){
                    op6_4=(TextView)findViewById(R.id.texto6_4);
                    op6_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Correcta", "En este caso tenemos una razón, esto es, una fracción que nos representa:\n\n25%/100% = 1/4", 5);
                    correctas8++;
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta7_1:
                if(seleccion8==false){
                    op7_4=(TextView)findViewById(R.id.texto7_4);
                    op7_1=(TextView)findViewById(R.id.texto7_1);
                    op7_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op7_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "En este caso es más fácil resolver por regla de 3:\nSi 60 votos ---- 100%\n      ¿?       ----- 40%\n\n(60)(40)/100 = 24", 6);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta7_2:
                if(seleccion8==false){
                    op7_4=(TextView)findViewById(R.id.texto7_4);
                    op7_2=(TextView)findViewById(R.id.texto7_2);
                    op7_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op7_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "En este caso es más fácil resolver por regla de 3:\nSi 60 votos ---- 100%\n      ¿?       ----- 40%\n\n(60)(40)/100 = 24", 6);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta7_3:
                if(seleccion8==false){
                    op7_4=(TextView)findViewById(R.id.texto7_4);
                    op7_3=(TextView)findViewById(R.id.texto7_3);
                    op7_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op7_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "En este caso es más fácil resolver por regla de 3:\nSi 60 votos ---- 100%\n      ¿?       ----- 40%\n\n(60)(40)/100 = 24", 6);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta7_4:
                if(seleccion8==false){
                    op7_4=(TextView)findViewById(R.id.texto7_4);
                    op7_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Correcta", "En este caso es más fácil resolver por regla de 3:\nSi 60 votos ---- 100%\n      ¿?       ----- 40%\n\n(60)(40)/100 = 24", 6);
                    correctas8++;
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta8_1:
                if(seleccion8==false){
                    op8_1=(TextView)findViewById(R.id.texto8_1);
                    op8_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Correcta", "En este caso también tenemos una razón, esto es, una fracción que nos representa:\n\n20%/100% = 1/5", 7);
                    correctas8++;
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta8_2:
                if(seleccion8==false){
                    op8_1=(TextView)findViewById(R.id.texto8_1);
                    op8_2=(TextView)findViewById(R.id.texto8_2);
                    op8_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op8_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "En este caso también tenemos una razón, esto es, una fracción que nos representa:\n\n20%/100% = 1/5", 7);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta8_3:
                if(seleccion8==false){
                    op8_1=(TextView)findViewById(R.id.texto8_1);
                    op8_3=(TextView)findViewById(R.id.texto8_3);
                    op8_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op8_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "En este caso también tenemos una razón, esto es, una fracción que nos representa:\n\n20%/100% = 1/5", 7);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta8_4:
                if(seleccion8==false){
                    op8_1=(TextView)findViewById(R.id.texto8_1);
                    op8_4=(TextView)findViewById(R.id.texto8_4);
                    op8_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op8_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "En este caso también tenemos una razón, esto es, una fracción que nos representa:\n\n20%/100% = 1/5", 7);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta9_1:
                if(seleccion8==false){
                    op9_3=(TextView)findViewById(R.id.texto9_3);
                    op9_1=(TextView)findViewById(R.id.texto9_1);
                    op9_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op9_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "En este caso también se resuelve por regla de 3:\nSi 60 votos ---- 100%\n      ¿?       ----- 15%\n\n(60)(15)/100 = 9", 8);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta9_2:
                if(seleccion8==false){
                    op9_3=(TextView)findViewById(R.id.texto9_3);
                    op9_2=(TextView)findViewById(R.id.texto9_2);
                    op9_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op9_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "En este caso también se resuelve por regla de 3:\nSi 60 votos ---- 100%\n      ¿?       ----- 15%\n\n(60)(15)/100 = 9", 8);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta9_3:
                if(seleccion8==false){
                    op9_3=(TextView)findViewById(R.id.texto9_3);
                    op9_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Correcta", "En este caso también se resuelve por regla de 3:\nSi 60 votos ---- 100%\n      ¿?       ----- 15%\n\n(60)(15)/100 = 9", 8);
                    correctas8++;
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta9_4:
                if(seleccion8==false){
                    op9_3=(TextView)findViewById(R.id.texto9_3);
                    op9_4=(TextView)findViewById(R.id.texto9_4);
                    op9_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op9_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "En este caso también se resuelve por regla de 3:\nSi 60 votos ---- 100%\n      ¿?       ----- 15%\n\n(60)(15)/100 = 9", 8);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta10_1:
                if(seleccion8==false){
                    op10_3=(TextView)findViewById(R.id.texto10_3);
                    op10_1=(TextView)findViewById(R.id.texto10_1);
                    op10_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op10_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "En este caso también se resuelve por regla de 3:\nSi 60 votos ---- 100%\n      ¿?       ----- 25%\n\n(60)(25)/100 = 15", 9);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta10_2:
                if(seleccion8==false){
                    op10_3=(TextView)findViewById(R.id.texto10_3);
                    op10_2=(TextView)findViewById(R.id.texto10_2);
                    op10_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op10_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "En este caso también se resuelve por regla de 3:\nSi 60 votos ---- 100%\n      ¿?       ----- 25%\n\n(60)(25)/100 = 15", 9);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta10_3:
                if(seleccion8==false){
                    op10_3=(TextView)findViewById(R.id.texto10_3);
                    op10_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Correcta", "En este caso también se resuelve por regla de 3: \nSi 60 votos ---- 100%\n      ¿?       ----- 25%\n\n(60)(25)/100 = 15", 9);
                    correctas8++;
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta10_4:
                if(seleccion8==false){
                    op10_3=(TextView)findViewById(R.id.texto10_3);
                    op10_4=(TextView)findViewById(R.id.texto10_4);
                    op10_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_rojo));
                    op10_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulo_redondeado_verde));
                    tiempo("Respuesta Incorrecta", "En este caso también se resuelve por regla de 3:\nSi 60 votos ---- 100%\n      ¿?       ----- 25%\n\n(60)(25)/100 = 15", 9);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta11_1:
                if(seleccion8==false){
                    op11_4=(TextView)findViewById(R.id.texto11_4);
                    op11_1=(TextView)findViewById(R.id.texto11_1);
                    op11_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_rojo));
                    op11_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Incorrecta", "Si lo que se pregunta es por la desocupación, es fácil verificar en el histograma que la columna más alta corresponde a Alemania. ", 10);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta11_2:
                if(seleccion8==false){
                    op11_4=(TextView)findViewById(R.id.texto11_4);
                    op11_2=(TextView)findViewById(R.id.texto11_2);
                    op11_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_rojo));
                    op11_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Incorrecta", "Si lo que se pregunta es por la desocupación, es fácil verificar en el histograma que la columna más alta corresponde a Alemania. ", 10);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta11_3:
                if(seleccion8==false){
                    op11_4=(TextView)findViewById(R.id.texto11_4);
                    op11_3=(TextView)findViewById(R.id.texto11_3);
                    op11_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_rojo));
                    op11_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Incorrecta", "Si lo que se pregunta es por la desocupación, es fácil verificar en el histograma que la columna más alta corresponde a Alemania. ", 10);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta11_4:
                if(seleccion8==false){
                    op11_4=(TextView)findViewById(R.id.texto11_4);
                    op11_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Correcta", "Si lo que se pregunta es por la desocupación, es fácil verificar en el histograma que la columna más alta corresponde a Alemania. ", 10);
                    correctas8++;
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta12_1:
                if(seleccion8==false){
                    op12_2=(TextView)findViewById(R.id.texto12_2);
                    op12_1=(TextView)findViewById(R.id.texto12_1);
                    op12_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_rojo));
                    op12_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Incorrecta", "En primera instancia, es fácil encontrar que lo que se te pregunta es lo inverso a lo que la gráfica expresa o representa: lo contrario de la desocupación es la ocupación. En consecuencia, Japón no existe entre las opciones, por lo que debes buscar el siguiente valor más cercano a 4, que es el correspondiente a los Estados Unidos (4.6).", 11);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta12_2:
                if(seleccion8==false){
                    op12_2=(TextView)findViewById(R.id.texto12_2);
                    op12_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Correcta", "En primera instancia, es fácil encontrar que lo que se te pregunta es lo inverso a lo que la gráfica expresa o representa: lo contrario de la desocupación es la ocupación. En consecuencia, Japón no existe entre las opciones, por lo que debes buscar el siguiente valor más cercano a 4, que es el correspondiente a los Estados Unidos (4.6).", 11);
                    correctas8++;
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta12_3:
                if(seleccion8==false){
                    op12_2=(TextView)findViewById(R.id.texto12_2);
                    op12_3=(TextView)findViewById(R.id.texto12_3);
                    op12_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_rojo));
                    op12_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Incorrecta", "En primera instancia, es fácil encontrar que lo que se te pregunta es lo inverso a lo que la gráfica expresa o representa: lo contrario de la desocupación es la ocupación. En consecuencia, Japón no existe entre las opciones, por lo que debes buscar el siguiente valor más cercano a 4, que es el correspondiente a los Estados Unidos (4.6).", 11);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta12_4:
                if(seleccion8==false){
                    op12_2=(TextView)findViewById(R.id.texto12_2);
                    op12_4=(TextView)findViewById(R.id.texto12_4);
                    op12_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_rojo));
                    op12_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Incorrecta", "En primera instancia, es fácil encontrar que lo que se te pregunta es lo inverso a lo que la gráfica expresa o representa: lo contrario de la desocupación es la ocupación. En consecuencia, Japón no existe entre las opciones, por lo que debes buscar el siguiente valor más cercano a 4, que es el correspondiente a los Estados Unidos (4.6).", 11);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta13_1:
                if(seleccion8==false){
                    op13_1=(TextView)findViewById(R.id.texto13_1);
                    op13_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Correcta", "De nuevo con Japón. Su valor en la gráfica es 4. Debes multiplicar dicho valor por 2.75 (equivalente a 2 3/4) con lo que obtienes el resultado de 11, es decir, el expresado para Alemania.", 12);
                    correctas8++;
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta13_2:
                if(seleccion8==false){
                    op13_1=(TextView)findViewById(R.id.texto13_1);
                    op13_2=(TextView)findViewById(R.id.texto13_2);
                    op13_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_rojo));
                    op13_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Incorrecta", "De nuevo con Japón. Su valor en la gráfica es 4. Debes multiplicar dicho valor por 2.75 (equivalente a 2 3/4) con lo que obtienes el resultado de 11, es decir, el expresado para Alemania.", 12);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta13_3:
                if(seleccion8==false){
                    op13_1=(TextView)findViewById(R.id.texto13_1);
                    op13_3=(TextView)findViewById(R.id.texto13_3);
                    op13_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_rojo));
                    op13_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Incorrecta", "De nuevo con Japón. Su valor en la gráfica es 4. Debes multiplicar dicho valor por 2.75 (equivalente a 2 3/4) con lo que obtienes el resultado de 11, es decir, el expresado para Alemania.", 12);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta13_4:
                if(seleccion8==false){
                    op13_1=(TextView)findViewById(R.id.texto13_1);
                    op13_4=(TextView)findViewById(R.id.texto13_4);
                    op13_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_rojo));
                    op13_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Incorrecta", "De nuevo con Japón. Su valor en la gráfica es 4. Debes multiplicar dicho valor por 2.75 (equivalente a 2 3/4) con lo que obtienes el resultado de 11, es decir, el expresado para Alemania.", 12);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta14_1:
                if(seleccion8==false){
                    op14_3=(TextView)findViewById(R.id.texto14_3);
                    op14_1=(TextView)findViewById(R.id.texto14_1);
                    op14_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_rojo));
                    op14_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Incorrecta", "Sigamos haciendo multiplicaciones, para encontrar los valores de estos resultados, multiplica cada uno de ellos, el más alto será el de canadá pues es igual a 15.25.\n\n(2.5)(6.1) = 15.25", 13);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta14_2:
                if(seleccion8==false){
                    op14_3=(TextView)findViewById(R.id.texto14_3);
                    op14_2=(TextView)findViewById(R.id.texto14_2);
                    op14_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_rojo));
                    op14_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Incorrecta", "Sigamos haciendo multiplicaciones, para encontrar los valores de estos resultados, multiplica cada uno de ellos, el más alto será el de canadá pues es igual a 15.25.\n\n(2.5)(6.1) = 15.25", 13);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta14_3:
                if(seleccion8==false){
                    op14_3=(TextView)findViewById(R.id.texto14_3);
                    op14_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Correcta", "Sigamos haciendo multiplicaciones, para encontrar los valores de estos resultados, multiplica cada uno de ellos, el más alto será el de canadá pues es igual a 15.25.\n\n(2.5)(6.1) = 15.25", 13);
                    correctas8++;
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta14_4:
                if(seleccion8==false){
                    op14_3=(TextView)findViewById(R.id.texto14_3);
                    op14_4=(TextView)findViewById(R.id.texto14_4);
                    op14_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_rojo));
                    op14_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Incorrecta", "Sigamos haciendo multiplicaciones, para encontrar los valores de estos resultados, multiplica cada uno de ellos, el más alto será el de canadá pues es igual a 15.25.\n\n(2.5)(6.1) = 15.25", 13);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta15_1:
                if(seleccion8==false){
                    op15_2=(TextView)findViewById(R.id.texto15_2);
                    op15_1=(TextView)findViewById(R.id.texto15_1);
                    op15_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_rojo));
                    op15_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Incorrecta", "Se obtiene mediante la suma de todos los valores y su posterior división entre el número de valores.", 14);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta15_2:
                if(seleccion8==false){
                    op15_2=(TextView)findViewById(R.id.texto15_2);
                    op15_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Correcta", "Se obtiene mediante la suma de todos los valores y su posterior división entre el número de valores.", 14);
                    correctas8++;
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta15_3:
                if(seleccion8==false){
                    op15_2=(TextView)findViewById(R.id.texto15_2);
                    op15_3=(TextView)findViewById(R.id.texto15_3);
                    op15_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_rojo));
                    op15_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Incorrecta", "Se obtiene mediante la suma de todos los valores y su posterior división entre el número de valores.", 14);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.respuesta15_4:
                if(seleccion8==false){
                    op15_2=(TextView)findViewById(R.id.texto15_2);
                    op15_4=(TextView)findViewById(R.id.texto15_4);
                    op15_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_rojo));
                    op15_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangulonormal_verde));
                    tiempo("Respuesta Incorrecta", "Se obtiene mediante la suma de todos los valores y su posterior división entre el número de valores.", 14);
                    seleccion8=true;
                    ventana_datosnum++;
                }
                break;
            case R.id.salir_datosnumericos:
                setContentView(R.layout.guias);
                guia = false;
                numguia=0;
                correctas8=0;
                numaudguia8=0;
                ventana_datosnum=0;
                titulo(numguia);
                break;
            case R.id.guia1:
                numguia=1;
                setContentView(R.layout.pantalla1_frances);
                titulo(numguia);
                guia=true;
                break;
            case R.id.guia2:
                Toast.makeText(MainActivity.this, "Aun no esta programado, CuceiMobile trabajando", Toast.LENGTH_SHORT).show();
                break;
            case R.id.guia3:
                Toast.makeText(MainActivity.this, "Aun no esta programado, CuceiMobile trabajando", Toast.LENGTH_SHORT).show();
                break;
            case R.id.guia4:
                Toast.makeText(MainActivity.this, "Aun no esta programado, CuceiMobile trabajando", Toast.LENGTH_SHORT).show();
                break;
            case R.id.guia5:
                Toast.makeText(MainActivity.this, "Aun no esta programado, CuceiMobile trabajando", Toast.LENGTH_SHORT).show();
                break;
            case R.id.guia6:
                Toast.makeText(MainActivity.this, "Aun no esta programado, CuceiMobile trabajando", Toast.LENGTH_SHORT).show();
                break;
            case R.id.guia7:
                Toast.makeText(MainActivity.this, "Aun no esta programado, CuceiMobile trabajando", Toast.LENGTH_SHORT).show();
                break;
            case R.id.guia8:
                numguia=8;
                numar=0;
                numar=validaArchivos();
                if(numar==60){
                    guia=true;
                    titulo(numguia);
                    if(!guardadatosnum.exists())
                    {
                        numaudguia8=1;
                        ventana_datosnum=1;
                        validaVentana8();
                        validaudio(ventana_datosnum);
                    }
                    else{
                        inicio_datosnum();
                    }
                }
                else{
                    if(estaConectado()){
                        if(!conectadoRedMovil()){
                            mensaje(1);
                            guia=true;
                            descarga=dropbox();
                            if(descarga==true){
                                numar=validaArchivos();
                                while(numar!=60){
                                    numar=validaArchivos();
                                }
                                mensaje(2);
                                if(numar==60){
                                    titulo(numguia);
                                    if(!guardadatosnum.exists())
                                    {
                                        numaudguia8=1;
                                        ventana_datosnum=1;
                                        validaVentana8();
                                        validaudio(ventana_datosnum);
                                    }
                                    else{
                                        inicio_datosnum();
                                    }
                                }
                            }
                        }
                        else{
                            if(validaVersion()==true){
                                AlertaDatosDescargaMayor();
                            }
                            else{
                                AlertaDatosDescargaMenor();
                            }
                        }
                    }
                    else{
                        Toast.makeText(MainActivity.this, "No tienes una conexion de internet estable, porfavor accede a una para descargar el contenido", Toast.LENGTH_LONG).show();
                        numguia=0;
                    }
                }
                break;
            case R.id.guia9:
                numguia=9;
                numar=0;
                numar=validaArchivos();
                if(numar==45){
                    guia=true;
                    titulo(numguia);
                    ventana_capacidades=1;
                    validaVentana9();
                }
                else{
                    if(estaConectado()){
                        if(!conectadoRedMovil()){
                            mensaje(1);
                            guia=true;
                            descarga=dropbox();
                            if(descarga==true){
                                numar=validaArchivos();
                                while(numar!=45){
                                    numar=validaArchivos();
                                }
                                mensaje(2);
                                if(numar==45){
                                    titulo(numguia);
                                    ventana_capacidades=1;
                                    validaVentana9();
                                }
                            }
                        }
                        else{
                            if(validaVersion()==true){
                                AlertaDatosDescargaMayor();
                            }
                            else{
                                AlertaDatosDescargaMenor();
                            }
                        }
                    }
                    else{
                        Toast.makeText(MainActivity.this, "No tienes una conexion de internet estable, porfavor accede a una para descargar el contenido", Toast.LENGTH_LONG).show();
                        numguia=0;
                    }
                }
                break;
            case R.id.guia10:
                numguia=10;
                numar=0;
                numar=validaArchivos();
                if(numar==23){
                    guia=true;
                    titulo(numguia);
                    ventana_habilidadesdelectura=1;
                    validaVentana10();
                }
                else{
                    if(estaConectado()){
                        if(!conectadoRedMovil()){
                            mensaje(1);
                            guia=true;
                            descarga=dropbox();
                            if(descarga==true){
                                numar=validaArchivos();
                                while(numar!=23){
                                    numar=validaArchivos();
                                }
                                mensaje(2);
                                if(numar==23){
                                    titulo(numguia);
                                    ventana_habilidadesdelectura=1;
                                    validaVentana10();
                                }
                            }
                        }
                        else{
                            if(validaVersion()==true){
                                AlertaDatosDescargaMayor();
                            }
                            else{
                                AlertaDatosDescargaMenor();
                            }
                        }
                    }
                    else{
                        Toast.makeText(MainActivity.this, "No tienes una conexion de internet estable, porfavor accede a una para descargar el contenido", Toast.LENGTH_LONG).show();
                        numguia=0;
                    }
                }
                break;
            case R.id.guia11:
                numguia=11;
                numar=0;
                numar=validaArchivos();
                if(numar==30){
                    guia=true;
                    titulo(numguia);
                    ventana_foros=1;
                    validaVentana11();
                }
                else{
                    if(estaConectado()){
                        if(!conectadoRedMovil()){
                            mensaje(1);
                            guia=true;
                            descarga=dropbox();
                            if(descarga==true){
                                numar=validaArchivos();
                                while(numar!=30){
                                    numar=validaArchivos();
                                }
                                mensaje(2);
                                if(numar==30){
                                    titulo(numguia);
                                    ventana_foros=1;
                                    validaVentana11();
                                }
                            }
                        }
                        else{
                            if(validaVersion()==true){
                                AlertaDatosDescargaMayor();
                            }
                            else{
                                AlertaDatosDescargaMenor();
                            }
                        }
                    }
                    else{
                        Toast.makeText(MainActivity.this, "No tienes una conexion de internet estable, porfavor accede a una para descargar el contenido", Toast.LENGTH_LONG).show();
                        numguia=0;
                    }
                }
                break;
            case R.id.guia12:
                Toast.makeText(MainActivity.this, "Aun no esta programado, CuceiMobile trabajando", Toast.LENGTH_SHORT).show();
                break;
            case R.id.comenzar_forosvirtuales:
                ventana_foros++;
                validaVentana11();
                break;
            case R.id.menu_forosvirtuales:
                ventana_foros++;
                validaVentana11();
                break;
            case R.id.anterior_pantalla3_forosvirtuales:
                ventana_foros--;
                validaVentana11();
                break;
            case R.id.siguiente_pantalla3_forosvirtuales:
                ventana_foros++;
                validaVentana11();
                break;
            case R.id.anterior_pantalla4_forosvirtuales:
                ventana_foros--;
                validaVentana11();
                break;
            case R.id.siguiente_pantalla4_forosvirtuales:
                ventana_foros++;
                validaVentana11();
                break;
            case R.id.anterior_pantalla5_forosvirtuales:
                ventana_foros--;
                validaVentana11();
                break;
            case R.id.siguiente_pantalla5_forosvirtuales:
                ventana_foros++;
                validaVentana11();
                break;
            case R.id.anterior_pantalla6_forosvirtuales:
                ventana_foros--;
                validaVentana11();
                break;
            case R.id.siguiente_pantalla6_forosvirtuales:
                ventana_foros++;
                validaVentana11();
                break;
            case R.id.anterior_pantalla7_forosvirtuales:
                ventana_foros--;
                validaVentana11();
                break;
            case R.id.siguiente_pantalla7_forosvirtuales:
                ventana_foros++;
                validaVentana11();
                break;
            case R.id.anterior_pantalla8_forosvirtuales:
                ventana_foros--;
                validaVentana11();
                break;
            case R.id.siguiente_pantalla8_forosvirtuales:
                ventana_foros++;
                validaVentana11();
                break;
            case R.id.anterior_pantalla9_forosvirtuales:
                ventana_foros--;
                validaVentana11();
                break;
            case R.id.siguiente_pantalla9_forosvirtuales:
                ventana_foros++;
                validaVentana11();
                break;
            case R.id.anterior_pantalla10_forosvirtuales:
                ventana_foros--;
                validaVentana11();
                break;
            case R.id.siguiente_pantalla10_forosvirtuales:
                ventana_foros++;
                validaVentana11();
                break;
            case R.id.anterior_pantalla11_forosvirtuales:
                ventana_foros--;
                validaVentana11();
                break;
            case R.id.siguiente_pantalla11_forosvirtuales:
                ventana_foros++;
                validaVentana11();
                break;
            case R.id.anterior_pantalla12_forosvirtuales:
                ventana_foros--;
                validaVentana11();
                break;
            case R.id.siguiente_pantalla12_forosvirtuales:
                ventana_foros++;
                validaVentana11();
                break;
            case R.id.anterior_pantalla13_forosvirtuales:
                ventana_foros--;
                validaVentana11();
                break;
            case R.id.siguiente_pantalla13_forosvirtuales:
                ventana_foros++;
                validaVentana11();
                break;
            case R.id.anterior_pantalla14_forosvirtuales:
                ventana_foros--;
                validaVentana11();
                break;
            case R.id.siguiente_pantalla14_forosvirtuales:
                ventana_foros++;
                validaVentana11();
                break;
            case R.id.anterior_pantalla15_forosvirtuales:
                ventana_foros--;
                validaVentana11();
                break;
            case R.id.siguiente_pantalla15_forosvirtuales:
                ventana_foros++;
                validaVentana11();
                break;
            case R.id.salir_forosvirtuales:
                setContentView(R.layout.guias);
                guia = false;
                numguia=0;
                titulo(numguia);
                break;
            case R.id.respuesta1_pantalla12_forosvirtuales:
                Toast.makeText(MainActivity.this, "respuesta 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.respuesta2_pantalla12_forosvirtuales:
                Toast.makeText(MainActivity.this, "respuesta 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.respuesta3_pantalla12_forosvirtuales:
                Toast.makeText(MainActivity.this, "respuesta 3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.respuesta1_pantalla13_forosvirtuales:
                Toast.makeText(MainActivity.this, "respuesta 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.respuesta2_pantalla13_forosvirtuales:
                Toast.makeText(MainActivity.this, "respuesta 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.respuesta1_pantalla14_forosvirtuales:
                Toast.makeText(MainActivity.this, "respuesta 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.respuesta2_pantalla14_forosvirtuales:
                Toast.makeText(MainActivity.this, "respuesta 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.respuesta3_pantalla14_forosvirtuales:
                Toast.makeText(MainActivity.this, "respuesta 3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.respuesta1_pantalla15_forosvirtuales:
                Toast.makeText(MainActivity.this, "respuesta 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.respuesta2_pantalla15_forosvirtuales:
                Toast.makeText(MainActivity.this, "respuesta 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.respuesta3_pantalla15_forosvirtuales:
                Toast.makeText(MainActivity.this, "respuesta 3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.comenzar_capacidadesparaelaprendizaje:
                ventana_capacidades++;
                validaVentana9();
                break;
            case R.id.anterior_pantalla2_capacidadesparaelaprendizaje:
                ventana_capacidades--;
                validaVentana9();
                break;
            case R.id.siguiente_pantalla2_capacidadesparaelaprendizaje:
                ventana_capacidades++;
                validaVentana9();
                break;
            case R.id.anterior_pantalla3_capacidadesparaelaprendizaje:
                ventana_capacidades--;
                validaVentana9();
                break;
            case R.id.siguiente_pantalla3_capacidadesparaelaprendizaje:
                ventana_capacidades++;
                validaVentana9();
                break;
            case R.id.anterior_pantalla4_capacidadesparaelaprendizaje:
                ventana_capacidades--;
                validaVentana9();
                break;
            case R.id.siguiente_pantalla4_capacidadesparaelaprendizaje:
                ventana_capacidades++;
                validaVentana9();
                if(preguntas9[0][0]!=0){
                    if(preguntas9[0][0]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla5_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if (preguntas9[0][0]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla5_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if (preguntas9[0][0]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla5_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if (preguntas9[0][0]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla5_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                }
                break;
            case R.id.anterior_pantalla5_capacidadesparaelaprendizaje:
                ventana_capacidades--;
                validaVentana9();
                break;
            case R.id.siguiente_pantalla5_capacidadesparaelaprendizaje:
                ventana_capacidades++;
                validaVentana9();
                if(preguntas9[1][0]!=0){
                    if(preguntas9[1][0]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla6_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[1][0]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla6_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[1][0]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla6_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[1][0]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla6_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                }
                break;
            case R.id.anterior_pantalla6_capacidadesparaelaprendizaje:
                ventana_capacidades--;
                validaVentana9();
                if(preguntas9[0][0]!=0){
                    if(preguntas9[0][0]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla5_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[0][0]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla5_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[0][0]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla5_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[0][0]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla5_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                }
                break;
            case R.id.siguiente_pantalla6_capacidadesparaelaprendizaje:
                ventana_capacidades++;
                validaVentana9();
                if(preguntas9[2][0]!=0){
                    if(preguntas9[2][0]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla7_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[2][0]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla7_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[2][0]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla7_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[2][0]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla7_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                }
                break;
            case R.id.anterior_pantalla7_capacidadesparaelaprendizaje:
                ventana_capacidades--;
                validaVentana9();
                if(preguntas9[1][0]!=0){
                    if(preguntas9[1][0]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla6_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[1][0]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla6_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[1][0]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla6_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[1][0]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla6_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                }
                break;
            case R.id.siguiente_pantalla7_capacidadesparaelaprendizaje:
                ventana_capacidades++;
                validaVentana9();
                if(preguntas9[3][0]!=0){
                    if(preguntas9[3][0]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla8_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[3][0]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla8_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[3][0]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla8_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[3][0]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla8_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                }
                break;
            case R.id.anterior_pantalla8_capacidadesparaelaprendizaje:
                ventana_capacidades--;
                validaVentana9();
                if(preguntas9[2][0]!=0){
                    if(preguntas9[2][0]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla7_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[2][0]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla7_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[2][0]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla7_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[2][0]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla7_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                }
                break;
            case R.id.siguiente_pantalla8_capacidadesparaelaprendizaje:
                ventana_capacidades++;
                validaVentana9();
                if(preguntas9[4][0]!=0){
                    if(preguntas9[4][0]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla9_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[4][0]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla9_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[4][0]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla9_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[4][0]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla9_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[4][1]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla9_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[4][1]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla9_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[4][1]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla9_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[4][1]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla9_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                }
                break;
            case R.id.anterior_pantalla9_capacidadesparaelaprendizaje:
                ventana_capacidades--;
                validaVentana9();
                if(preguntas9[3][0]!=0){
                    if(preguntas9[3][0]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla8_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[3][0]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla8_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[3][0]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla8_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[3][0]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla8_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                }
                break;
            case R.id.siguiente_pantalla9_capacidadesparaelaprendizaje:
                ventana_capacidades++;
                validaVentana9();
                if(preguntas9[5][0]!=0){
                    if(preguntas9[5][0]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla10_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[5][0]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla10_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[5][0]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla10_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[5][0]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla10_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                }
                break;
            case R.id.anterior_pantalla10_capacidadesparaelaprendizaje:
                ventana_capacidades--;
                validaVentana9();
                if(preguntas9[4][0]!=0){
                    if(preguntas9[4][0]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla9_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[4][0]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla9_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[4][0]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla9_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[4][0]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla9_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[4][1]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla9_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[4][1]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla9_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[4][1]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla9_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[4][1]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla9_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                }
                break;
            case R.id.siguiente_pantalla10_capacidadesparaelaprendizaje:
                ventana_capacidades++;
                validaVentana9();
                if(preguntas9[6][0]!=0){
                    if(preguntas9[6][0]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla11_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[6][0]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla11_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[6][0]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla11_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[6][0]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla11_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[6][1]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla11_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[6][1]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla11_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[6][1]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla11_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[6][1]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla11_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                }
                break;
            case R.id.anterior_pantalla11_capacidadesparaelaprendizaje:
                ventana_capacidades--;
                validaVentana9();
                if(preguntas9[5][0]!=0){
                    if(preguntas9[5][0]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla10_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[5][0]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla10_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[5][0]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla10_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[5][0]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla10_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                }
                break;
            case R.id.siguiente_pantalla11_capacidadesparaelaprendizaje:
                ventana_capacidades++;
                validaVentana9();
                if(preguntas9[0][0]!=0 && preguntas9[1][0]!=0 && preguntas9[2][0]!=0 && preguntas9[3][0]!=0 && preguntas9[4][0]!=0 && preguntas9[4][1]!=0 && preguntas9[5][0]!=0 && preguntas9[6][0]!=0 && preguntas9[6][1]!=0){
                    if(mensaje9==false){
                        Toast.makeText(MainActivity.this, nombre1+". Tienes un total de: "+correctas9+"/7 respuestas correctas", Toast.LENGTH_LONG).show();
                        mensaje9=true;
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Por favor termina de resolver todas las preguntas", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.anterior_pantalla12_capacidadesparaelaprendizaje:
                ventana_capacidades--;
                validaVentana9();
                if(preguntas9[6][0]!=0){
                    if(preguntas9[6][0]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla11_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[6][0]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla11_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[6][0]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla11_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[6][0]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla11_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[6][1]==1){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla11_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[6][1]==2){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla11_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[6][1]==3){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla11_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                    if(preguntas9[6][1]==4){
                        carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                        bm = BitmapFactory.decodeFile(String.valueOf(carga));
                        imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla11_capacidadesparaelaprendizaje);
                        imagenguia9.setImageBitmap(bm);
                    }
                }
                break;
            case R.id.siguiente_pantalla12_capacidadesparaelaprendizaje:
                ventana_capacidades++;
                validaVentana9();
                break;
            case R.id.anterior_pantalla13_capacidadesparaelaprendizaje:
                ventana_capacidades--;
                validaVentana9();
                break;
            case R.id.siguiente_pantalla13_capacidadesparaelaprendizaje:
                ventana_capacidades++;
                validaVentana9();
                break;
            case R.id.menu_pantallas2_capacidadesparaelaprendizaje:
                Toast.makeText(MainActivity.this, "No se a donde debe mandar este boton. Atte: CuceiMobile", Toast.LENGTH_LONG).show();
                break;
            case R.id.opcion1_pantalla5_capacidadesparaelaprendizaje:
                if(preguntas9[0][0]==0){
                    correctas9++;
                    preguntas9[0][0]=1;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla5_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion2_pantalla5_capacidadesparaelaprendizaje:
                if(preguntas9[0][0]==0){
                    preguntas9[0][0]=2;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla5_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion3_pantalla5_capacidadesparaelaprendizaje:
                if(preguntas9[0][0]==0){
                    preguntas9[0][0]=3;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla5_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion4_pantalla5_capacidadesparaelaprendizaje:
                if(preguntas9[0][0]==0){
                    preguntas9[0][0]=4;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla5_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion1_pantalla6_capacidadesparaelaprendizaje:
                if(preguntas9[1][0]==0){
                    preguntas9[1][0]=1;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla6_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion2_pantalla6_capacidadesparaelaprendizaje:
                if(preguntas9[1][0]==0){
                    correctas9++;
                    preguntas9[1][0]=2;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla6_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion3_pantalla6_capacidadesparaelaprendizaje:
                if(preguntas9[1][0]==0){
                    preguntas9[1][0]=3;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla6_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion4_pantalla6_capacidadesparaelaprendizaje:
                if(preguntas9[1][0]==0){
                    preguntas9[1][0]=4;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla6_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion1_pantalla7_capacidadesparaelaprendizaje:
                if(preguntas9[2][0]==0){
                    preguntas9[2][0]=1;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla7_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion2_pantalla7_capacidadesparaelaprendizaje:
                if(preguntas9[2][0]==0){
                    correctas9++;
                    preguntas9[2][0]=2;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla7_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion3_pantalla7_capacidadesparaelaprendizaje:
                if(preguntas9[2][0]==0){
                    preguntas9[2][0]=3;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla7_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion4_pantalla7_capacidadesparaelaprendizaje:
                if(preguntas9[2][0]==0){
                    preguntas9[2][0]=4;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla7_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion1_pantalla8_capacidadesparaelaprendizaje:
                if(preguntas9[3][0]==0){
                    correctas9++;
                    preguntas9[3][0]=1;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla8_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion2_pantalla8_capacidadesparaelaprendizaje:
                if(preguntas9[3][0]==0){
                    preguntas9[3][0]=2;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla8_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion3_pantalla8_capacidadesparaelaprendizaje:
                if(preguntas9[3][0]==0){
                    preguntas9[3][0]=3;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla8_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion4_pantalla8_capacidadesparaelaprendizaje:
                if(preguntas9[3][0]==0){
                    preguntas9[3][0]=4;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla8_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion1_pantalla9_capacidadesparaelaprendizaje:
                if(preguntas9[4][0]==0){
                    correctas9+=0.5;
                    preguntas9[4][0]=1;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla9_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                else{
                    if(preguntas9[4][1]==0){
                        if(preguntas9[4][0]!=1){
                            correctas9+=0.5;
                            preguntas9[4][1]=1;
                            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                            bm = BitmapFactory.decodeFile(String.valueOf(carga));
                            imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla9_capacidadesparaelaprendizaje);
                            imagenguia9.setImageBitmap(bm);
                        }
                    }
                }
                break;
            case R.id.opcion2_pantalla9_capacidadesparaelaprendizaje:
                if(preguntas9[4][0]==0){
                    correctas9+=0.5;
                    preguntas9[4][0]=2;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla9_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                else{
                    if(preguntas9[4][1]==0){
                        if(preguntas9[4][0]!=2){
                            correctas9+=0.5;
                            preguntas9[4][1]=2;
                            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                            bm = BitmapFactory.decodeFile(String.valueOf(carga));
                            imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla9_capacidadesparaelaprendizaje);
                            imagenguia9.setImageBitmap(bm);
                        }
                    }
                }
                break;
            case R.id.opcion3_pantalla9_capacidadesparaelaprendizaje:
                if(preguntas9[4][0]==0){
                    preguntas9[4][0]=3;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla9_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                else{
                    if(preguntas9[4][1]==0){
                        if(preguntas9[4][0]!=3){
                            preguntas9[4][1]=3;
                            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                            bm = BitmapFactory.decodeFile(String.valueOf(carga));
                            imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla9_capacidadesparaelaprendizaje);
                            imagenguia9.setImageBitmap(bm);
                        }
                    }
                }
                break;
            case R.id.opcion4_pantalla9_capacidadesparaelaprendizaje:
                if(preguntas9[4][0]==0){
                    preguntas9[4][0]=4;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla9_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                else{
                    if(preguntas9[4][1]==0){
                        if(preguntas9[4][0]!=4){
                            preguntas9[4][1]=4;
                            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                            bm = BitmapFactory.decodeFile(String.valueOf(carga));
                            imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla9_capacidadesparaelaprendizaje);
                            imagenguia9.setImageBitmap(bm);
                        }
                    }
                }
                break;
            case R.id.opcion1_pantalla10_capacidadesparaelaprendizaje:
                if(preguntas9[5][0]==0){
                    preguntas9[5][0]=1;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla10_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion2_pantalla10_capacidadesparaelaprendizaje:
                if(preguntas9[5][0]==0){
                    preguntas9[5][0]=2;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla10_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion3_pantalla10_capacidadesparaelaprendizaje:
                if(preguntas9[5][0]==0){
                    correctas9++;
                    preguntas9[5][0]=3;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla10_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion4_pantalla10_capacidadesparaelaprendizaje:
                if(preguntas9[5][0]==0){
                    preguntas9[5][0]=4;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla10_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                break;
            case R.id.opcion1_pantalla11_capacidadesparaelaprendizaje:
                if(preguntas9[6][0]==0){
                    correctas9+=0.5;
                    preguntas9[6][0]=1;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla11_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                else{
                    if(preguntas9[6][1]==0){
                        if(preguntas9[6][0]!=1){
                            correctas9+=0.5;
                            preguntas9[6][1]=1;
                            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                            bm = BitmapFactory.decodeFile(String.valueOf(carga));
                            imagenguia9=(ImageView)findViewById(R.id.respuesta1_pantalla11_capacidadesparaelaprendizaje);
                            imagenguia9.setImageBitmap(bm);
                        }
                    }
                }
                break;
            case R.id.opcion2_pantalla11_capacidadesparaelaprendizaje:
                if(preguntas9[6][0]==0){
                    preguntas9[6][0]=2;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla11_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                else{
                    if(preguntas9[6][1]==0){
                        if(preguntas9[6][0]!=2){
                            preguntas9[6][1]=2;
                            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                            bm = BitmapFactory.decodeFile(String.valueOf(carga));
                            imagenguia9=(ImageView)findViewById(R.id.respuesta2_pantalla11_capacidadesparaelaprendizaje);
                            imagenguia9.setImageBitmap(bm);
                        }
                    }
                }
                break;
            case R.id.opcion3_pantalla11_capacidadesparaelaprendizaje:
                if(preguntas9[6][0]==0){
                    preguntas9[6][0]=3;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla11_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                else{
                    if(preguntas9[6][1]==0){
                        if(preguntas9[6][0]!=3){
                            preguntas9[6][1]=3;
                            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.incorrecto_capacidadesparaelaprendizaje.png");
                            bm = BitmapFactory.decodeFile(String.valueOf(carga));
                            imagenguia9=(ImageView)findViewById(R.id.respuesta3_pantalla11_capacidadesparaelaprendizaje);
                            imagenguia9.setImageBitmap(bm);
                        }
                    }
                }
                break;
            case R.id.opcion4_pantalla11_capacidadesparaelaprendizaje:
                if(preguntas9[6][0]==0){
                    correctas9+=0.5;
                    preguntas9[6][0]=4;
                    carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                    bm = BitmapFactory.decodeFile(String.valueOf(carga));
                    imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla11_capacidadesparaelaprendizaje);
                    imagenguia9.setImageBitmap(bm);
                }
                else{
                    if(preguntas9[6][1]==0){
                        if(preguntas9[6][0]!=4){
                            correctas9+=0.5;
                            preguntas9[6][1]=4;
                            carga=Environment.getExternalStoragePublicDirectory(".estu@pp/.guia9/.correcto_capacidadesparaelaprendizaje.png");
                            bm = BitmapFactory.decodeFile(String.valueOf(carga));
                            imagenguia9=(ImageView)findViewById(R.id.respuesta4_pantalla11_capacidadesparaelaprendizaje);
                            imagenguia9.setImageBitmap(bm);
                        }
                    }
                }
                break;
            case R.id.comenzar_habilidadesdelectura:
                ventana_habilidadesdelectura++;
                validaVentana10();
                getSupportActionBar().setSubtitle("Habilidades de lectura");
                break;
            case R.id.anterior_pantalla2_habilidadesdelectura:
                ventana_habilidadesdelectura--;
                validaVentana10();
                getSupportActionBar().setSubtitle("Guía de Habilidades para el Aprendizaje");
                break;
            case R.id.siguiente_pantalla2_habilidadesdelectura:
                ventana_habilidadesdelectura++;
                validaVentana10();
                break;
            case R.id.anterior_pantalla3_habilidadesdelectura:
                ventana_habilidadesdelectura--;
                validaVentana10();
                break;
            case R.id.siguiente_pantalla3_habilidadesdelectura:
                ventana_habilidadesdelectura++;
                validaVentana10();
                break;
            case R.id.anterior_pantalla4_habilidadesdelectura:
                ventana_habilidadesdelectura--;
                validaVentana10();
                break;
            case R.id.siguiente_pantalla4_habilidadesdelectura:
                ventana_habilidadesdelectura++;
                validaVentana10();
                break;
            case R.id.anterior_pantalla5_habilidadesdelectura:
                ventana_habilidadesdelectura--;
                validaVentana10();
                break;
            case R.id.siguiente_pantalla5_habilidadesdelectura:
                ventana_habilidadesdelectura++;
                validaVentana10();
                break;
            case R.id.anterior_pantalla6_habilidadesdelectura:
                ventana_habilidadesdelectura--;
                validaVentana10();
                break;
            case R.id.siguiente_pantalla6_habilidadesdelectura:
                ventana_habilidadesdelectura++;
                validaVentana10();
                break;
            case R.id.anterior_pantalla7_habilidadesdelectura:
                ventana_habilidadesdelectura--;
                validaVentana10();
                break;
            case R.id.siguiente_pantalla7_habilidadesdelectura:
                ventana_habilidadesdelectura++;
                validaVentana10();
                break;
            case R.id.anterior_pantalla8_habilidadesdelectura:
                ventana_habilidadesdelectura--;
                validaVentana10();
                break;
            case R.id.siguiente_pantalla8_habilidadesdelectura:
                ventana_habilidadesdelectura++;
                validaVentana10();
                break;
            case R.id.anterior_pantalla9_habilidadesdelectura:
                ventana_habilidadesdelectura--;
                validaVentana10();
                break;
            case R.id.siguiente_pantalla9_habilidadesdelectura:
                ventana_habilidadesdelectura++;
                validaVentana10();
                break;
            case R.id.anterior_pantalla10_habilidadesdelectura:
                ventana_habilidadesdelectura--;
                validaVentana10();
                break;
            case R.id.siguiente_pantalla10_habilidadesdelectura:
                ventana_habilidadesdelectura++;
                validaVentana10();
                break;
            case R.id.anterior_pantalla11_habilidadesdelectura:
                ventana_habilidadesdelectura--;
                validaVentana10();
                break;
            case R.id.siguiente_pantalla11_habilidadesdelectura:
                ventana_habilidadesdelectura++;
                validaVentana10();
                break;
            case R.id.anterior_pantalla12_habilidadesdelectura:
                ventana_habilidadesdelectura--;
                validaVentana10();
                break;
            case R.id.siguiente_pantalla12_habilidadesdelectura:
                ventana_habilidadesdelectura++;
                validaVentana10();
                break;
            case R.id.anterior_pantalla13_habilidadesdelectura:
                ventana_habilidadesdelectura--;
                validaVentana10();
                break;
            case R.id.siguiente_pantalla13_habilidadesdelectura:
                ventana_habilidadesdelectura++;
                validaVentana10();
                break;
            case R.id.anterior_pantalla14_habilidadesdelectura:
                ventana_habilidadesdelectura--;
                validaVentana10();
                break;
            case R.id.siguiente_pantalla14_habilidadesdelectura:
                ventana_habilidadesdelectura++;
                validaVentana10();
                break;
            case R.id.anterior_pantalla15_habilidadesdelectura:
                ventana_habilidadesdelectura--;
                validaVentana10();
                break;
            case R.id.siguiente_pantalla15_habilidadesdelectura:
                ventana_habilidadesdelectura++;
                validaVentana10();
                break;
            case R.id.anterior_pantalla16_habilidadesdelectura:
                ventana_habilidadesdelectura--;
                validaVentana10();
                break;
            case R.id.siguiente_pantalla16_habilidadesdelectura:
                ventana_habilidadesdelectura++;
                validaVentana10();
                break;
            case R.id.anterior_pantalla17_habilidadesdelectura:
                ventana_habilidadesdelectura--;
                validaVentana10();
                break;
            case R.id.siguiente_pantalla17_habilidadesdelectura:
                ventana_habilidadesdelectura++;
                validaVentana10();
                break;
            case R.id.anterior_pantalla18_habilidadesdelectura:
                ventana_habilidadesdelectura--;
                validaVentana10();
                break;
            case R.id.imagen6_pantalla2_datosnumericos:
                guia=false;
                setContentView(R.layout.guias);
                numguia=0;
                titulo(numguia);
                break;
            case R.id.introduccion_datosnumericos:
                ventana_datosnum++;
                validaVentana8();
                break;
            case R.id.porcentajes_datosnumericos:
                ventana_datosnum=4;
                validaVentana8();
                break;
            case R.id.graficas_datosnumericos:
                ventana_datosnum=7;
                validaVentana8();
                break;
            case R.id.histograma_datosnumericos:
                ventana_datosnum=10;
                validaVentana8();
                break;
            case R.id.autoevaluacion_datosnumericos:
                ventana_datosnum=13;
                validaVentana8();
                break;
            case R.id.imagen4_pantalla28_datosnumericos:
                ventana_datosnum=2;
                validaVentana8();
                break;
            case R.id.imagen3_pantalla28_datosnumericos:
                ventana_datosnum=29;
                validaVentana8();
                break;
        }
    }
}