int pinled=8;
int pinsensor=13;
int estado;

void setup() {
  pinMode(pinled,OUTPUT);
  pinMode(pinsensor,INPUT);
}

void loop() {
  estado=digitalRead(pinsensor);
  if(estado==HIGH){
    digitalWrite(pinled,LOW);  
  }else{
    digitalWrite(pinled,HIGH);  
  }
}
