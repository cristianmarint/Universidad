int pinbutton1=8;
int pinbutton2=9;
int pinbutton3=10;

int var1;
int var2;
int var3;

int pinled1=5;
int pinled2=6;
int pinled3=7;

void setup() {
  pinMode(pinbutton1,INPUT);
  pinMode(pinbutton2,INPUT);
  pinMode(pinbutton3,INPUT);

  pinMode(pinled1,OUTPUT);
  pinMode(pinled2,OUTPUT);
  pinMode(pinled3,OUTPUT);

}

void loop() {
  var1=digitalRead(pinbutton1);
  var2=digitalRead(pinbutton2);
  var3=digitalRead(pinbutton3);

  if(var1==HIGH){
    digitalWrite(pinled1,HIGH);
    digitalWrite(pinled2,LOW);
    digitalWrite(pinled3,LOW);
    }else if(var2==HIGH){
          digitalWrite(pinled2,HIGH);
          digitalWrite(pinled1,LOW);
          digitalWrite(pinled3,LOW);
      }else if(var3==HIGH){
            digitalWrite(pinled3,HIGH);
            digitalWrite(pinled1,LOW);
            digitalWrite(pinled2,LOW);
      }else{
        digitalWrite(pinled1,HIGH);
        digitalWrite(pinled2,HIGH);
        digitalWrite(pinled3,HIGH);
      }

}
