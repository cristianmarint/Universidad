int pausa=500;
void setup() {
  pinMode(13,OUTPUT);
  pinMode(12,OUTPUT);
  pinMode(11,OUTPUT);
  pinMode(10,OUTPUT);
  pinMode(9,OUTPUT);
  pinMode(8,OUTPUT);
  pinMode(7,OUTPUT);
}

void display(int a,int b, int c, int d, int e,int f, int g){
  digitalWrite(13,a);
  digitalWrite(12,b);
  digitalWrite(11,c);
  digitalWrite(10,d);
  digitalWrite(9,e);
  digitalWrite(8,f);
  digitalWrite(7,g);
}

void loop() {
      display(1,1,1,1,1,1,0);
      delay(pausa);
      display(0,1,1,0,0,0,0);
      delay(pausa);
      display(1,1,0,1,1,0,1);
      delay(pausa);
      display(1,1,1,1,0,0,1);
      delay(pausa);
      display(0,1,1,0,0,1,1);
      delay(pausa);
      display(1,0,1,1,0,1,1);
      delay(pausa);
      display(1,0,1,1,1,1,1);
      delay(pausa);
      display(1,1,1,0,0,0,0);
      delay(pausa);
      display(1,1,1,1,1,1,1);
      delay(pausa);
      display(1,1,1,1,0,1,1);
      delay(pausa);
      display(0,0,0,0,0,0,0);
      delay(pausa);
      
}
