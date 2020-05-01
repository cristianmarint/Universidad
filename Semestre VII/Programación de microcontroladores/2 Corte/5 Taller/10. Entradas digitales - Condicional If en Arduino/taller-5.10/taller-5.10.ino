int pinButton =8;
int pinled=7;
int var;

void setup() {
  pinMode(pinButton,INPUT);
  pinMode(pinled,OUTPUT);
}

void loop() {
  var=digitalRead(pinButton);

  if(var==HIGH){
    digitalWrite(pinled,HIGH);
  }else{
    digitalWrite(pinled,LOW);
  }
}
