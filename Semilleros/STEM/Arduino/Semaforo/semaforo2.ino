/*
 * @Author: CristianMarinT 
 * @Date: 2019-04-04 14:54:18 
 * @Last Modified by: CristianMarinT
 * @Last Modified time: 2019-04-04 14:59:29
 */

#include <Adafruit_NeoPixel.h>

const int PINRING=2; //Pin donde está conectado el ring
const int PINTIRA=3; //Pin donde está conectada la tira de leds

const int NUMPIXELS=12; //Número de leds tira conectados 
const int ut=1000;  //Unidad de tiempo (ut) 1s == 1000ml
const float inter=0.07;  // % de tiempo que toma el cambio de color.

int estado=0; // Variable que controla el turno global de los semaforos.
uint8_t  i;

Adafruit_NeoPixel tira = Adafruit_NeoPixel(NUMPIXELS, PINTIRA, NEO_GRB + NEO_KHZ800);
Adafruit_NeoPixel ring = Adafruit_NeoPixel(40, PINRING);

// colores
const int colors [3][3]={
  {255,0,0}, //Rojo
  {255,255,0}, //Amarillo
  {0,255,0} //verde
};

// Posiciones de leds en la tira
const int seg[2][6]={
  {0,1,2,3,4,5},
  {6,7,8,9,10,11}
};

void setup()
{
  Serial.begin(9600);

  tira.begin();
  ring.begin();
}

void loop()
{
  pasoPeaton(2,0,7);
  semaforo(0 , 0, 5 , 0.5  ,10);
  pasoPeaton(0,0,7);


  pasoPeaton(2,7,15);
  semaforo(1 , 1, 5 , 0.5  ,10);
  pasoPeaton(0,7,15);

  estado=0;
}


// Usa la variable global del estado
// Variables de tiempo para cada color del semaforo
//            turno      grupo de leds     t. rojo   t. verde   t. amarillo
void semaforo(int turno ,int segmento     ,float tr ,float te  ,float ta     ){
    while(estado==turno){
      // rojo
      tira.setPixelColor(seg[segmento][0]  , colors[0][0], colors[0][1], colors[0][2] );
      tira.setPixelColor(seg[segmento][1]  , colors[0][0], colors[0][1], colors[0][2] );
      tira.show();
      delay(ut*tr);
      // Intervalo rojo-amarillo
      tira.setPixelColor(seg[segmento][1]  , colors[0][0], colors[0][1], colors[0][2] );
      tira.setPixelColor(seg[segmento][2]  , colors[0][0], colors[0][1], colors[0][2] );
      tira.show();
      tira.setPixelColor(seg[segmento][0]  ,0);
      tira.setPixelColor(seg[segmento][1]  ,0);
      delay(ut*(ta*inter));
      // amarillo
      tira.setPixelColor(seg[segmento][2]  , colors[1][0], colors[1][1], colors[1][2] );
      tira.setPixelColor(seg[segmento][3]  , colors[1][0], colors[1][1], colors[1][2] );
      tira.show();
      delay(ut*te);
      // Intervalo amarillo-verde
      tira.setPixelColor(seg[segmento][3]  , colors[1][0], colors[1][1], colors[1][2] );
      tira.setPixelColor(seg[segmento][4]  , colors[2][0], colors[2][1], colors[2][2] );
      tira.show();
      tira.setPixelColor(seg[segmento][2]  ,0);
      tira.setPixelColor(seg[segmento][3]  ,0);
      delay(ut*(ta*inter));
      // verde
      tira.setPixelColor(seg[segmento][4]  , colors[2][0], colors[2][1], colors[2][2] );
      tira.setPixelColor(seg[segmento][5]  , colors[2][0], colors[2][1], colors[2][2] );
      tira.show();
      delay(ut*ta);
      // Verde OFF
      tira.setPixelColor(seg[segmento][4]  ,0);
      tira.setPixelColor(seg[segmento][5]  ,0);
      tira.show();
      // Rojo ON 
      tira.setPixelColor(seg[segmento][0]  , colors[0][0], colors[0][1], colors[0][2] );
      tira.setPixelColor(seg[segmento][1]  , colors[0][0], colors[0][1], colors[0][2] ); 
      tira.show();

      estado++;
    }
    
}

//              Paso=0,alerta=1,detengase=2  |  led inicial | led final
void pasoPeaton(int turno                     ,int ini      ,int fin){
  switch(turno)
  {  
    case 0:
        for(i=ini; i<fin; i++) {
            ring.setPixelColor(i,  colors[2][0], colors[2][1], colors[2][2] );
            ring.show();
        }
    break;    
    
    case 1:
        for(i=ini; i<fin; i++) {
            ring.setPixelColor(0, colors[1][0], colors[1][1], colors[1][2] );
            ring.show();
            ring.setPixelColor(0, 0);
            ring.show();
        } 
            ring.show();
    break;    

    case 2:
        for(i=ini; i<fin; i++) {
            ring.setPixelColor(i, colors[0][0], colors[0][1], colors[0][2] );
        } 
        ring.show();
    break;    
  }
}

// Circuito en:
// https://www.tinkercad.com/things/0mWjvUwhhYG

// Documentación:
// NeoPixel 6:
// https://learn.adafruit.com/assets/30892

// NeoPixel ring:
// https://learn.adafruit.com/10-minute-neopixel-necklace