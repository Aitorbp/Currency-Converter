package com.example.alumnos.conversoraitor;

import android.os.Debug;
import android.util.Log;

public  class  Divisas {

   private static float [] deEurosA ={1f,1.15f, 125.54f, 0.88f, 0.15f};
   private static float [] deDolaresA ={0.87f,1f, 109.55f, 0.76f, 0.13f};
   private static float [] deYenesA ={0.008f,0.0091f,1f, 1.0070f, 0.0011f};
   private static float [] deLibrasA ={1.14f,1.31f, 143.31f, 1, 0.17f};
   private static float [] deDenariosRomA ={6.65f, 7.64f, 834.84f, 5.85f, 1f};

   //Le pasamos como parámetro cantidad de dinero y monedaDestino que se la con el valor moneda seleccionado2

    //EUROS A.............
   static float eurosA(float cantidadDinero, int monedaDestino){
      Log.d("recojo",String.valueOf(cantidadDinero));
      float resultadoOperacion = cantidadDinero * deEurosA[monedaDestino];
      return resultadoOperacion;
   }

   //DOLARES A................
    static float dolaresA(float cantidadDinero, int monedaDestino){
        Log.d("recojo",String.valueOf(cantidadDinero));
        float resultadoOperacion = cantidadDinero * deDolaresA[monedaDestino];
        return resultadoOperacion;
    }

    //YENES A...................
    static float yenesA(float cantidadDinero, int monedaDestino){
        Log.d("recojo",String.valueOf(cantidadDinero));
        float resultadoOperacion = cantidadDinero * deYenesA[monedaDestino];
        return resultadoOperacion;
    }

    //LIBRAS A..............
    static float librasA(float cantidadDinero, int monedaDestino){
        Log.d("recojo",String.valueOf(cantidadDinero));
        float resultadoOperacion = cantidadDinero * deLibrasA[monedaDestino];
        return resultadoOperacion;
    }
    //DENARIOS ROMANOS A..................
    static float denariosA(float cantidadDinero, int monedaDestino){
        Log.d("recojo",String.valueOf(cantidadDinero));
        float resultadoOperacion = cantidadDinero * deDenariosRomA[monedaDestino];
        return resultadoOperacion;
    }


}
