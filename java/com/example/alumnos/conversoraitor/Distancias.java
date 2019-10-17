package com.example.alumnos.conversoraitor;

public class Distancias {
                                        // 0 Kilometros 1 metros 2 Yardas 3 Pies 4 Leguas  5 Furlong

    private static float [] deKilometrosA ={1f,1000f, 1093.61f, 3280.83f, 0.207124f, 4.97096f};
    private static float [] deMetrosA ={0.001f, 1f, 1.09361f, 3.28083f, 0.000207124f,  0.00497096f};

    private static float [] deYardasA ={0.0009144f, 0.9144f, 1f, 3f, 0.000189394f, 0,00454545f};
    private static float [] dePiesA ={0.0003048f, 0.30480f, 0.333333f, 1f, 6.3131300000f, 0,00151515f };
    private static float [] deLeguasA ={4.82803f, 4828.03f, 5279.997813024f, 15840f, 1f, 24f};
    private static float [] deFurlongA ={0.201168f, 201.168f, 220f, 660.001f, 0.0416667f, 1};



    static  float kmA(float cantidadLongitud, int longitudDestino){
        float resultadoOperacion = cantidadLongitud * deKilometrosA[longitudDestino];
        return resultadoOperacion;
    }

    static  float mA(float cantidadLongitud, int longitudDestino){
        float resultadoOperacion = cantidadLongitud * deMetrosA[longitudDestino];
        return resultadoOperacion;
    }
    static  float yardasA(float cantidadLongitud, int longitudDestino){
        float resultadoOperacion = cantidadLongitud * deYardasA[longitudDestino];
        return resultadoOperacion;
    }

    static  float piesA(float cantidadLongitud, int longitudDestino){
        float resultadoOperacion = cantidadLongitud * dePiesA[longitudDestino];
        return resultadoOperacion;
    }
    static  float leguasA(float cantidadLongitud, int longitudDestino){
        float resultadoOperacion = cantidadLongitud * deLeguasA[longitudDestino];
        return resultadoOperacion;
    }
    static  float furlongA(float cantidadLongitud, int longitudDestino){
        float resultadoOperacion = cantidadLongitud * deFurlongA[longitudDestino];
        return resultadoOperacion;
    }

}
