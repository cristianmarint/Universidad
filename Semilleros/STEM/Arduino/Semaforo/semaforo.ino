/*
 * @Author: CristianMarinT 
 * @Date: 2019-04-04 10:06:04 
 * @Last Modified by:   CristianMarinT 
 * @Last Modified time: 2019-04-04 10:06:04 
 */

// Leds
const int rp1 = 5;
const int gp1 = 6;
const int bp1 = 7;

const int rp2 = 9;
const int gp2 = 10;
const int bp2 = 11;

// colores
const int colors [3][3]={
    {255,0,0}, //Rojo
    {255,255,0}, //Amarillo
    {0,255,0} //verde
};

// Variable que controla el turno global de los semaforos.
int estado=0;

void setup()
{
  Serial.begin(9600);

  //  Inicialización de los pines
  pinMode(rp1, OUTPUT);
  pinMode(gp1, OUTPUT);
  pinMode(bp1, OUTPUT);  

  pinMode(rp2, OUTPUT);
  pinMode(gp2, OUTPUT);
  pinMode(bp2, OUTPUT);

  setColor(0,rp2,gp2,bp2);  // Rojo  
}
 
void loop()
{
    semaforo(0,rp1,gp1,bp1);
    semaforo(1,rp2,gp2,bp2);
    estado=0;
}



// Estable un color al led en RGB
void setColor(int color,int rp,int gp,int bp)
{
  analogWrite(rp,colors[color][0]);
  analogWrite(gp,colors[color][1]);
  analogWrite(bp,colors[color][2]);  
}



// Usa la variable global del estado
// y una segunda para determinar el 
// momento (turno) adecuado para ser activado
void semaforo(int turno,int rp,int gp,int bp){
    while(estado==turno){
        Serial.print("Estado=> ");Serial.println(estado);
        Serial.print("+Turno=>");Serial.println(estado);

        setColor(0,rp,gp,bp);  // Rojo
        delay(3000);
        setColor(1,rp,gp,bp);  // Amarillo
        delay(1000);
        setColor(2,rp,gp,bp);  // Verde
        delay(3000);
        setColor(0,rp,gp,bp);  // Rojo  
        estado++; 
    }
}


// Circuito en:
// https://www.tinkercad.com/things/6OLDgHV13Kl