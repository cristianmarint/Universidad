int pincho=13;
int tiempazo=1;//tiempo en segundazos

void setup() {
  pinMode(pincho,OUTPUT);
}

void loop() {
  digitalWrite(pincho,HIGH);
  delay(tiempazo*1000);
  digitalWrite(pincho,LOW);
  delay(tiempazo*1000);
}
