#include <Adafruit_NeoPixel.h>

const int PIN=2; //Pin donde está conectada la tira de leds
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
  // semaforo(0,10,2,15);
  // estado=0;
}


// Usa la variable global del estado
// Variables de tiempo para cada color del semaforo
//            turno     t. rojo   t. verde   t. amarillo   //grupo de leds
void semaforo(int turno,float tr ,float te  ,float ta     ,int segmento){
    while(estado==turno){

        Serial.print("Estado=> ");Serial.println(estado);
        Serial.print("+Turno=>");Serial.println(turno);
        int i = 0;
        int c = 0;
        int sg = 0;
        if(segmento=0){
          sg=0;
        }else{
          sg=1;
        }

      for( i = segmento ; i < pixels.numPixels(); i++)
      {


        // // rojo
        // pixels.setPixelColor(seg[segmento][sg]  , colors[0][0], colors[0][1], colors[0][2] );
        // pixels.setPixelColor(seg[segmento][sg]  , colors[0][0], colors[0][1], colors[0][2] );
        // pixels.show();
        // delay(ut*tr);

        // // Intervalo rojo-amarillo
        // pixels.setPixelColor(seg[segmento][sg-1]  , colors[0][0], colors[0][1], colors[0][2] );
        // pixels.setPixelColor(seg[segmento][sg+1]  , colors[0][0], colors[0][1], colors[0][2] );
        // pixels.show();
        // pixels.setPixelColor(0  ,0);
        // pixels.setPixelColor(1  ,0);
        // delay(ut*(ta*0.05));

        // // amarillo
        // pixels.setPixelColor(2  , colors[1][0], colors[1][1], colors[1][2] );
        // pixels.setPixelColor(3  , colors[1][0], colors[1][1], colors[1][2] );
        // pixels.show();
        // delay(ut*te);

        // // Intervalo amarillo-verde
        // pixels.setPixelColor(3  , colors[1][0], colors[1][1], colors[1][2] );
        // pixels.setPixelColor(4, colors[2][0], colors[2][1], colors[2][2] );
        // pixels.show();
        // pixels.setPixelColor(2  ,0);
        // pixels.setPixelColor(3  ,0);
        // delay(ut*(ta*0.02));

        // // verde
        // pixels.setPixelColor(4  , colors[2][0], colors[2][1], colors[2][2] );
        // pixels.setPixelColor(5  , colors[2][0], colors[2][1], colors[2][2] );
        // pixels.show();
        // delay(ut*ta);
      }
      

      for( i = 0; i < pixels.numPixels(); i++)
      {
        pixels.setPixelColor(i,0);//OFF
      }
      pixels.show();
        

      estado++; 
    }
}


// Circuito en:
// https://www.tinkercad.com/things/0mWjvUwhhYG

// Fuente del cirucito:
// https://learn.adafruit.com/assets/30892