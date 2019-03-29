void setup(){
  pinMode(13, OUTPUT);
}

void loop(){
  Serial.begin(9600);
  parpadearLed(0,5);
}


// Para un INICIO y un FIN se realiza el proceso
// de encendido y apago de forma recursiva
void parpadearLed(int inicio,int fin){
    Serial.print("Inicio:");Serial.println(inicio);
    Serial.print("Fin:");Serial.println(fin);
    Serial.println("---");
  
    digitalWrite(13, HIGH);
    delay(1000); // Wait for 1000 millisecond(s)
    digitalWrite(13, LOW);
    delay(1000); // Wait for 1000 millisecond(s)

    if(inicio==fin){
        Serial.print(":)");
        exit(0);
    }else{
        // parpadearLed(inicio++,fin);
        parpadearLed(inicio+1,fin);
    }
}

// Ejemplo en:
https://www.tinkercad.com/things/jDlBsW65B0X-ejemplo1/editel