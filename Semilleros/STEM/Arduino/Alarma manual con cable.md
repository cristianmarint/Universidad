```
/*
   Alarma 
   MADE IN COLOMBIA 
*/
float sinVal;
int toneVal;

void setup(){
     pinMode(8, OUTPUT); // Definimos el pin 8 como salida.
  
     pinMode(3,INPUT);
    
}

void loop(){
  digitalWrite(3, LOW);
    if(digitalRead(3)==HIGH){
      for(int x=0; x<50; x++){
            // convertimos grados en radianes para luego obtener el valor.
            sinVal = (sin(x*(3.1412/180)));
            // generar una frecuencia a partir del valor sin
            toneVal = 200+(int(sinVal*5000));
            digitalWrite(8, toneVal);
            delay(2); 
     }
    }
    if(digitalRead(3) == LOW){
      digitalWrite(8, LOW);
    }
        
}

```

https://imgur.com/EHfI49h

<img src="https://i.imgur.com/EHfI49h.jpg">
