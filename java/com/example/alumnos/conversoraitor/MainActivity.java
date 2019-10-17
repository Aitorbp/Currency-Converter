package com.example.alumnos.conversoraitor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //GENERAL
    Spinner _medidas;
    int posicionSeleccionada;
    int posicionSeleccionada2;
    int posicionMedida;
    TextView _textoDescripcion;
    ImageView _imagenFondo;


    //TEMPERATURAS
    LinearLayout _pantallaTemperaturas;
    Spinner _tipotemperatura;
    Spinner _resultadoTemperatura;
    EditText _introducirTemperatura;
    float recuperarTemperatura;
    EditText _resultadoImpresoTemperatura;
    float resultadoVariableTemp;


    //DISTANCIAS
    LinearLayout _pantallaDistancias;
    Spinner _tipodistancia;
    Spinner _resultadoDistancia;
    EditText _introducirDistancia;
    float recuperarDistancia;
    EditText _resultadoImpresoDistancia;
    float resultadoVariableDistancia;


    //MONEDAS
    Spinner _tiposMonedas;
    LinearLayout _pantallaMonedas;
    EditText _introducirDinero;
    Spinner _resultado;
    float recuperarNumero;



    float resultadoVariableMonedas;
    EditText _resultadoImpreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //GENERAL
        _medidas = (Spinner) findViewById(R.id.medidas);
        _textoDescripcion = (TextView)  findViewById(R.id.textoDescripcion);
        _imagenFondo = (ImageView) findViewById(R.id.imagenFondo);

        //TEMPERATURAS
        _pantallaTemperaturas = (LinearLayout) findViewById(R.id.pantallatemperaturas);
        _tipotemperatura = (Spinner) findViewById(R.id.tipotemperatura);
        _resultadoTemperatura = (Spinner) findViewById(R.id.resultadoTemperatura);
        _introducirTemperatura = (EditText) findViewById(R.id.introducirTemperatura);
        _resultadoImpresoTemperatura = (EditText) findViewById(R.id.resultadoImpresoTemperatura);



        //DISTANCIAS
        _pantallaDistancias = (LinearLayout) findViewById(R.id.pantalladistancias);
        _tipodistancia = (Spinner) findViewById(R.id.tipodistancia);
        _resultadoDistancia = (Spinner) findViewById(R.id.resultadoDistancia);
        _introducirDistancia = (EditText) findViewById(R.id.introducirDistancia);
        _resultadoImpresoDistancia = (EditText) findViewById(R.id.resultadoImpresoDistancia);


        //MONEDAS
        _tiposMonedas = (Spinner) findViewById(R.id.tipomonedas);
        _pantallaMonedas = (LinearLayout) findViewById(R.id.pantallamonedas);
        _introducirDinero = (EditText) findViewById(R.id.introducirDinero);
        _resultado = (Spinner) findViewById(R.id.resultado);
        _resultadoImpreso = (EditText) findViewById(R.id.resultadoImpreso);



        _medidas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                posicionMedida = position;
                introducirImagen(posicionMedida);



                switch (position) {
                    case 0:
                        _pantallaTemperaturas.setVisibility(View.VISIBLE);
                        _pantallaMonedas.setVisibility(View.GONE);
                        _pantallaDistancias.setVisibility(View.GONE);

                        introducirTextosTemp(_tipotemperatura.getSelectedItemPosition()); // Hacemos getSelectedItemPosition para coger la posición actual del spinner y no la anterior seleccionada, así nos cambiará directamente el texto cuando cambiemos de unidad


                        break;
                    case 1:
                        _pantallaDistancias.setVisibility(View.VISIBLE);
                        _pantallaMonedas.setVisibility(View.GONE);
                        _pantallaTemperaturas.setVisibility(View.GONE);

                        introducirTextoDistancias(_tipodistancia.getSelectedItemPosition());
                        break;


                    case 2:
                        _pantallaMonedas.setVisibility(View.VISIBLE);
                        _pantallaTemperaturas.setVisibility(View.GONE);
                        _pantallaDistancias.setVisibility(View.GONE);

                        introducirTextoMonedas(_tiposMonedas.getSelectedItemPosition());
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //SPINNER MONEDAS..............................................
        //Posiciones : 0 euros 1 dolares 3 yenes 4 denario romano  5 libras

        _tiposMonedas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                posicionSeleccionada = position;

                    introducirTextoMonedas(posicionSeleccionada);




            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        _resultado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                posicionSeleccionada2 = position;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //SPINNER TEMPERATURAS..............................................
        _tipotemperatura.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                posicionSeleccionada = position;

                    introducirTextosTemp(posicionSeleccionada);



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        _resultadoTemperatura.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                posicionSeleccionada2 = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //SPINNER DISTANCIAS.......................................................
        _tipodistancia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                posicionSeleccionada = position;

                    introducirTextoDistancias(posicionSeleccionada);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        _resultadoDistancia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                posicionSeleccionada2 = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void temperatura(int posicionSeleccionada, int posicionSeleccionada2) {
        if ((_introducirTemperatura.getText().toString().isEmpty())) {
            _introducirTemperatura.setError(getString(R.string.Error_Introducir_Vacio));
            return;
        }
        recuperarTemperatura = Float.parseFloat(_introducirTemperatura.getText().toString());

        switch (posicionSeleccionada) {


            case 0: //De CELSIUS

                switch (posicionSeleccionada2) {

                    case 1: //A Kelvin
                        resultadoVariableTemp = Temperaturas.deCelsiusAKelvin(recuperarTemperatura);

                        break;
                    case 2://A Fah
                        resultadoVariableTemp = Temperaturas.deCelsiusAFah(recuperarTemperatura);
                        break;
                    case 3: //A Rankine
                        resultadoVariableTemp = Temperaturas.deCelsiusARankine(recuperarTemperatura);
                        break;
                    default:
                        resultadoVariableTemp = recuperarTemperatura;
                        break;

                }
                break;

            case 1: //De KELVIN
                switch (posicionSeleccionada2) {

                    case 0: //A CELSIUS
                        resultadoVariableTemp = Temperaturas.deKelvinACelsius(recuperarTemperatura);
                        break;
                    case 2://A Fah
                        resultadoVariableTemp = Temperaturas.deKelvinAFah(recuperarTemperatura);
                        break;
                    //A RANKINE
                    case 3:
                        resultadoVariableTemp = Temperaturas.deKelvinARankine(recuperarTemperatura);
                        break;
                    default:
                        resultadoVariableTemp = recuperarTemperatura;
                        break;

                }
                break;

            case 2: //De FAHREN
                switch (posicionSeleccionada2) {

                    case 0: //A CELSIUS
                        resultadoVariableTemp = Temperaturas.deFahACelsius(recuperarTemperatura);
                        break;
                    case 1://A Kelvin
                        resultadoVariableTemp = Temperaturas.deFahAKelvin(recuperarTemperatura);
                        break;
                    case 3: //A RANKINE
                        resultadoVariableTemp = Temperaturas.deFahARankine(recuperarTemperatura);
                        break;
                    default:
                        resultadoVariableTemp = recuperarTemperatura;
                        break;

                }
                break;

            case 3:

                switch (posicionSeleccionada2){
                    case 0: //A CELSIUS
                        resultadoVariableTemp = Temperaturas.deRankineACelsius(recuperarTemperatura);
                        break;
                    case 1://A Kelvin
                        resultadoVariableTemp = Temperaturas.deRankineAKelvin(recuperarTemperatura);
                        break;
                    case 2: //A FHA
                        resultadoVariableTemp = Temperaturas.deRankineAFha(recuperarTemperatura);
                        break;
                    default:
                        resultadoVariableTemp = recuperarTemperatura;
                        break;
                }
                break;
            default:
                break;

        }
        _resultadoImpresoTemperatura.setText(String.valueOf(resultadoVariableTemp));
        Log.d("cuenta", String.valueOf(resultadoVariableTemp));
    }

    public void monedas(int posicionSeleccionada, int posicionSeleccionada2) {
        if ((_introducirDinero.getText().toString().isEmpty())) {
            _introducirDinero.setError(getString(R.string.Error_Introducir_Vacio));
            return;
        }
        recuperarNumero = Float.parseFloat(_introducirDinero.getText().toString());
        switch (posicionSeleccionada) {
            case 0:
                resultadoVariableMonedas = Divisas.eurosA(recuperarNumero, posicionSeleccionada2);
                break;
            case 1:
                resultadoVariableMonedas = Divisas.dolaresA(recuperarNumero, posicionSeleccionada2);
                break;
            case 2:
                resultadoVariableMonedas = Divisas.yenesA(recuperarNumero, posicionSeleccionada2);
                break;
            case 3:
                resultadoVariableMonedas = Divisas.librasA(recuperarNumero, posicionSeleccionada2);
                break;
            case 4:
                resultadoVariableMonedas = Divisas.denariosA(recuperarNumero, posicionSeleccionada2);
                break;
            default:
                break;
        }
        _resultadoImpreso.setText(String.valueOf(resultadoVariableMonedas));

    }

    public void distancias(int posicionSeleccionada, int posicionSeleccionada2) {
        if ((_introducirDistancia.getText().toString().isEmpty())) {
            _introducirDistancia.setError(getString(R.string.Error_Introducir_Vacio));
            return;
        }
        recuperarDistancia = Float.parseFloat(_introducirDistancia.getText().toString());

        switch (posicionSeleccionada) {
            case 0:
                resultadoVariableDistancia = Distancias.kmA(recuperarDistancia, posicionSeleccionada2);

                break;
            case 1:
                resultadoVariableDistancia = Distancias.mA(recuperarDistancia, posicionSeleccionada2);

                break;
            case 2:
                resultadoVariableDistancia = Distancias.yardasA(recuperarDistancia, posicionSeleccionada2);

                break;
            case 3:
                resultadoVariableDistancia = Distancias.piesA(recuperarDistancia, posicionSeleccionada2);

                break;
            case 4:
                resultadoVariableDistancia = Distancias.leguasA(recuperarDistancia, posicionSeleccionada2);

                break;
            case 5:
                resultadoVariableDistancia = Distancias.furlongA(recuperarDistancia, posicionSeleccionada2);

                break;

            default:
                break;
        }
        _resultadoImpresoDistancia.setText(String.valueOf(resultadoVariableDistancia));
    }

    public void introducirTextosTemp(int posicionSeleccionada){

        switch (posicionSeleccionada){
            case 0:
                _textoDescripcion.setText(R.string.textcelsius);
                _textoDescripcion.setVisibility(View.VISIBLE);

                break;
            case 1:
                _textoDescripcion.setText(R.string.textkelvin);
                _textoDescripcion.setVisibility(View.VISIBLE);


                break;
            case 2:
                _textoDescripcion.setText(R.string.textfah);
                _textoDescripcion.setVisibility(View.VISIBLE);

                break;
            case 3:
                _textoDescripcion.setText(R.string.textrankine);
                _textoDescripcion.setVisibility(View.VISIBLE);

                break;

                default:
                    break;
        }

    }

    public void introducirTextoMonedas(int posicionSeleccionada){
        switch (posicionSeleccionada){
            case 0:
                _textoDescripcion.setText(R.string.texteuros);
                _textoDescripcion.setVisibility(View.VISIBLE);
                break;

            case 1:
                _textoDescripcion.setText(R.string.textdolares);
                _textoDescripcion.setVisibility(View.VISIBLE);

                break;
            case 2:
                _textoDescripcion.setText(R.string.textyenes);
                _textoDescripcion.setVisibility(View.VISIBLE);

                break;
            case 3:

                _textoDescripcion.setText(R.string.textlibras);
                _textoDescripcion.setVisibility(View.VISIBLE);

                break;
            case 4:

                _textoDescripcion.setText(R.string.textdenarios);
                _textoDescripcion.setVisibility(View.VISIBLE);

                break;
            default:
                break;
        }
    }

    public void introducirTextoDistancias(int posicionSeleccionada){
        switch (posicionSeleccionada){
            case 0:

                _textoDescripcion.setText(R.string.textkilometros);


                break;
            case 1:

                _textoDescripcion.setText(R.string.textmetros);


                break;
            case 2:

                _textoDescripcion.setText(R.string.textyardas);

                break;
            case 3:

                _textoDescripcion.setText(R.string.textpies);

                break;
            case 4:

                _textoDescripcion.setText(R.string.textleguas);

                break;
            case 5:

                _textoDescripcion.setText(R.string.textfurlong);

                break;
                    default:
                        break;
        }
    }


    public void introducirImagen(int posicionMedida){
        _imagenFondo.setImageResource(R.drawable.robot1);
        switch (posicionMedida){
            case 0:
                _imagenFondo.setImageResource(R.drawable.robot1);

                break;
            case 1:
                _imagenFondo.setImageResource(R.drawable.robot2);

                break;
            case 2:
                _imagenFondo.setImageResource(R.drawable.robot3);

                break;
        }
    }

    public void Convertir(View view) {
        switch (posicionMedida){
            case 0:
                temperatura(posicionSeleccionada,posicionSeleccionada2);
                break;
            case 1:
                distancias(posicionSeleccionada,posicionSeleccionada2);
                break;
            case 2:
                monedas(posicionSeleccionada,posicionSeleccionada2);
                break;
            default:
                break;

        }

    }


}


