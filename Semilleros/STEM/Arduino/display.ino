#include <LiquidCrystal.h>

// Inicializa la libreria en una variable con los números de los pines de la interfaz.
LiquidCrystal lcd(12, 11, 5, 4, 3, 2);
int i=0;

void pantalla(int op,int col=0,int fil=0,int del=50);

byte sonrisa[] = {
  B00000,
  B01010,
  B01010,
  B00000,
  B10001,
  B11011,
  B01110,
  B00000
};
byte corazon[] = {
  B00000,
  B01010,
  B10101,
  B10001,
  B10001,
  B01010,
  B00100,
  B00000
};
byte nConGorrito[] = {
  B11111,
  B00000,
  B10111,
  B11001,
  B10001,
  B10001,
  B10001,
  B00000
};

void setup() {
  lcd.createChar(1, sonrisa);
  lcd.createChar(2, corazon);
  lcd.createChar(3, nConGorrito);
  
  lcd.begin(16, 2);
      
  lcd.setCursor(3, 0);
  lcd.print("Feliz a");lcd.write(byte(3));lcd.print("o!");
}
void loop() {
  while(i<2019){
    lcd.setCursor(6, 1);
    i == 2010 ? i+=9 : i+=10;
    lcd.print( i );
  }
  delay(3000);
  pantalla(2,0,1,200);
  pantalla(1,0,1);
  i=0;
}


/*
 @Descripción realiza modificaciones al contenido de la pantalla
 @op selecciona el modo de la funcion
 @fil fila inicial para modificar el contenido
 @col columna inicial para modificar el contenido
 @del retrazo en el entre cada iteracion
*/
void pantalla(int op,int fil,int col,int del){
  switch (op)
  {
    // limpia la pantalla lCD
    case 1:
          for(int fl = fil; fl < 16; fl++)
          {
            for(int cl = col; cl < 2; cl++)
            {
                    lcd.setCursor(fl, cl);
                    lcd.print(" ");
                    delay(del);
            }
          }
    break;

    // decoracion
    case 2:
          for(int fl = fil; fl < 16; fl++)
          {
            for(int cl = col; cl < 2; cl++)
            {
                    lcd.setCursor(fl, cl);
                    lcd.write( byte( random(1,3) ) );
                    delay(del);
            }
          }
    break;
  
    default:
    break;
  }
}



// Circuito en:
// https://www.tinkercad.com/things/34N3HBJ1lK6

// Documentación:
  // Circuito
    // https://www.arduino.cc/en/Tutorial/HelloWorld  
  // Caracteres especiales
    // https://www.arduino.cc/en/Reference/LiquidCrystalCreateChar 
    // https://maxpromer.github.io/LCD-Character-Creator/