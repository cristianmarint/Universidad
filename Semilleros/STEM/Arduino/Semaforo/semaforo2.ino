/*
 * @Author: CristianMarinT 
 * @Date: 2019-04-04 10:05:35 
 * @Last Modified by: CristianMarinT
 * @Last Modified time: 2019-04-04 10:24:16
 */
#include <Adafruit_NeoPixel.h>

const int PIN=3; //Pin donde está conectada la tira de leds
const int NUMPIXELS=12; //Número de leds conectados
const float ut=1000;  //Unidad de tiempo (ut) 1s == 1000ml

Adafruit_NeoPixel pixels = Adafruit_NeoPixel(NUMPIXELS, PIN, NEO_GRB + NEO_KHZ800);

// colores
const int colors [3][3]={
    {255,0,0}, //Rojo
    {255,255,0}, //Amarillo
    {0,255,0} //verde
};

const int seg[2][6]={
  {0,1,2,3,4,5},
  {6,7,8,9,10,11}
};

// Variable que controla el turno global de los semaforos.
int estado=0;

void setup()
{
  Serial.begin(9600);

  pixels.begin();
}
 
void loop()
{
  semaforo(0 , 0, 1 , 1  ,1);
  semaforo(1 , 1, 1 , 1  ,1);
  estado=0;
}


// Usa la variable global del estado
// Variables de tiempo para cada color del semaforo
//            turno      grupo de leds     t. rojo   t. verde   t. amarillo
void semaforo(int turno ,int segmento     ,float tr ,float te  ,float ta     ){
    while(estado==turno){
      int i ,c= 0;

      // rojo
      pixels.setPixelColor(seg[segmento][0]  , colors[0][0], colors[0][1], colors[0][2] );
      pixels.setPixelColor(seg[segmento][1]  , colors[0][0], colors[0][1], colors[0][2] );
      pixels.show();
      delay(ut*tr);

      // Intervalo rojo-amarillo
      pixels.setPixelColor(seg[segmento][1]  , colors[0][0], colors[0][1], colors[0][2] );
      pixels.setPixelColor(seg[segmento][2]  , colors[0][0], colors[0][1], colors[0][2] );
      pixels.show();
      pixels.setPixelColor(seg[segmento][0]  ,0);
      pixels.setPixelColor(seg[segmento][1]  ,0);
      delay(ut*(ta*0.05));

      // amarillo
      pixels.setPixelColor(seg[segmento][2]  , colors[1][0], colors[1][1], colors[1][2] );
      pixels.setPixelColor(seg[segmento][3]  , colors[1][0], colors[1][1], colors[1][2] );
      pixels.show();
      delay(ut*te);

      // Intervalo amarillo-verde
      pixels.setPixelColor(seg[segmento][3]  , colors[1][0], colors[1][1], colors[1][2] );
      pixels.setPixelColor(seg[segmento][4]  , colors[2][0], colors[2][1], colors[2][2] );
      pixels.show();
      pixels.setPixelColor(seg[segmento][2]  ,0);
      pixels.setPixelColor(seg[segmento][3]  ,0);
      delay(ut*(ta*0.02));

      // verde
      pixels.setPixelColor(seg[segmento][4]  , colors[2][0], colors[2][1], colors[2][2] );
      pixels.setPixelColor(seg[segmento][5]  , colors[2][0], colors[2][1], colors[2][2] );
      pixels.show();
      delay(ut*ta);
      
      // Verde OFF
      pixels.setPixelColor(seg[segmento][4]  ,0);
      pixels.setPixelColor(seg[segmento][5]  ,0);
      pixels.show();

      // Rojo ON 
      pixels.setPixelColor(seg[segmento][0]  , colors[0][0], colors[0][1], colors[0][2] );
      pixels.setPixelColor(seg[segmento][1]  , colors[0][0], colors[0][1], colors[0][2] ); 
      pixels.show();
        

      estado++;
    }
}


// Circuito en:
// https://www.tinkercad.com/things/0mWjvUwhhYG

// Documentación:
// NeoPixel 6:
// https://learn.adafruit.com/assets/30892

// NeoPixel ring:
// https://learn.adafruit.com/10-minute-neopixel-necklace/arduino-code