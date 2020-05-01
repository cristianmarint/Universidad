int mensaje=0;
void setup() {
  Serial.begin(9600);
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

int mostrar(int a){
  Serial.print("Se ingreso: ");
  Serial.write(a);
  Serial.println();
  a=0;
  a=Serial.read();
}

void loop() {
  if(Serial.available()>0){
    mensaje=Serial.read();
    
    if(mensaje=='0'){
      display(1,1,1,1,1,1,0);
      mostrar(mensaje);
    }
    if(mensaje=='1'){
      display(0,1,1,0,0,0,0);
      mostrar(mensaje);
    }
    if(mensaje=='2'){
      display(1,1,0,1,1,0,1);
      mostrar(mensaje);
    }
    if(mensaje=='3'){
      display(1,1,1,1,0,0,1);
      mostrar(mensaje);
    }
    if(mensaje=='4'){
      display(0,1,1,0,0,1,1);
      mostrar(mensaje);
    }
    if(mensaje=='5'){
      display(1,0,1,1,0,1,1);
      mostrar(mensaje);
    }
    if(mensaje=='6'){
      display(1,0,1,1,1,1,1);
      mostrar(mensaje);
    }
    if(mensaje=='7'){
      display(1,1,1,0,0,0,0);
      mostrar(mensaje);
    }
    if(mensaje=='8'){
      display(1,1,1,1,1,1,1);
      mostrar(mensaje);
    }
    if(mensaje=='9'){
      display(1,1,1,1,0,1,1);
      mostrar(mensaje);
    }
    if(mensaje=='a'){
      display(0,0,0,0,0,0,0);
      mostrar(mensaje);      
    }
  }
}
