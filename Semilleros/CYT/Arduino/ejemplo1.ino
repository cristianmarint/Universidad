// Enciende el led 13 X cantidad de veces
// Se especifica un punto final y uno inicial 
// si se desea

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
  
    digitalWrite(13,HIGH);
    delay(1000);
    digitalWrite(13,LOW);

    if(inicio==fin){
        Serial.print(":)");
        exit(0);
    }else{
        // parpadearLed(inicio++,fin);
        parpadearLed(inicio+1,fin);
    }
}


// Accesible en:
// https://www.tinkercad.com/things/jDlBsW65B0X-ejemplo1/editel