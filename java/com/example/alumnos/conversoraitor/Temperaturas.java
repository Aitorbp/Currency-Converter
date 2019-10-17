package com.example.alumnos.conversoraitor;

import android.util.Log;

public class Temperaturas {

static float deCelsiusAFah(float gradosIntroducidos){
   float resultadoCelsiusFah = (gradosIntroducidos * 1.8f) + 32f;
   return resultadoCelsiusFah;
}

static float deCelsiusAKelvin(float gradosIntroducidos){

        float resultadoCelsiusKel = gradosIntroducidos + 273.15f;

        return resultadoCelsiusKel;

    }

    static float deCelsiusARankine(float gradosIntroducidos){

        float resultadoCelsiusRanki = ((gradosIntroducidos*(9f/5f))+491.67f);

        return resultadoCelsiusRanki;

    }

static float deKelvinACelsius(float gradosIntroducidos){
   float resultadoKelvinCelsius = gradosIntroducidos - 273.15f;
   return resultadoKelvinCelsius;
}

static float deKelvinAFah(float gradosIntroducidos){
      float resultadoKelvinFah = (((9f*(gradosIntroducidos - 273.15f))/5f)+32f);
      return resultadoKelvinFah;
   }
    static float deKelvinARankine(float gradosIntroducidos){
        float resultadoKelvinRank = (gradosIntroducidos * 1.8f);
        return resultadoKelvinRank;
    }


static float deFahACelsius(float gradosIntroducidos){
    float resultadoFahCelsius= ((5*(gradosIntroducidos-32f))/9f);
    return resultadoFahCelsius;
   }

static float deFahAKelvin(float gradosIntroducidos){
        float resultadoFahKelvin= (((5*(gradosIntroducidos-32f))/9f)+273.15f);
        return resultadoFahKelvin;
    }

    static float deFahARankine(float gradosIntroducidos){
        float resultadoFahRankine= (gradosIntroducidos + 459.67f);
        return resultadoFahRankine;
    }


    static float deRankineACelsius(float gradosIntroducidos){
        float resultadoRacelsius= ((gradosIntroducidos-491.67f) * (5f/9f));
        return resultadoRacelsius;
    }

    static float deRankineAFha(float gradosIntroducidos){
        float resultadoRaFha= ((gradosIntroducidos-459.67f));
        return resultadoRaFha;
    }

    static float deRankineAKelvin(float gradosIntroducidos){
        float resultadoRaKelkin= (gradosIntroducidos* (5f/9f));
        return resultadoRaKelkin;
    }
}
