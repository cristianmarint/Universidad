// Leds
const int rp1 = 5;
const int gp1 = 6;
const int bp1 = 7;

const int rp2 = 9;
const int gp2 = 10;
const int bp2 = 11;

// Variable que controla el turno global de los semaforos.
int estado=0;

void setup()
{
//   Serial.begin(9600);

  //  Inicialización de los pines
  pinMode(rp1, OUTPUT);
  pinMode(gp1, OUTPUT);
  pinMode(bp1, OUTPUT);  

  pinMode(rp2, OUTPUT);
  pinMode(gp2, OUTPUT);
  pinMode(bp2, OUTPUT);

  setColor(255, 0, 0,rp2,gp2,bp2);  // Rojo  
}
 
void loop()
{
    semaforo(0,rp1,gp1,bp1);
    semaforo(1,rp2,gp2,bp2);
    estado=0;
}



// Estable un color al led en RGB
void setColor(int red, int green, int blue,int rp,int gp,int bp)
{
  analogWrite(rp, red);
  analogWrite(gp, green);
  analogWrite(bp, blue);  
}



// Usa la variable global del turno
// y una segunda para determinar el 
// momento adecuado para ser activado
// void semaforo(int estado,int turno,int rp,int gp,int bp){
void semaforo(int turno,int rp,int gp,int bp){
    while(estado==turno){
        estado++; 
        Serial.print("=>");Serial.println(estado);

        setColor(255, 0, 0,rp,gp,bp);  // Rojo
        delay(3000);

        setColor(255, 255, 0,rp,gp,bp);  // Amarillo
        delay(1000);

        setColor(0, 255, 0,rp,gp,bp);  // Azul
        delay(3000);

        setColor(255, 0, 0,rp,gp,bp);  // Rojo
        
    }
}


// Circuito en:
// https://www.tinkercad.com/things/6OLDgHV13Kl






// por cambiar:
// Convertir los colores en un array3D y 
// y en set color solo se especifica la posicion del color