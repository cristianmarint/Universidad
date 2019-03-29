int redPin = 9;
int greenPin = 10;
int bluePin = 11;

 
void setup()
{
  pinMode(redPin, OUTPUT);
  pinMode(greenPin, OUTPUT);
  pinMode(bluePin, OUTPUT);  
}
 
void loop()
{
  digitalWrite(redPin,HIGH);
  delay(500);
  digitalWrite(redPin,LOW);
  digitalWrite(greenPin,HIGH);
  digitalWrite(bluePin,LOW);
  delay(500);
  digitalWrite(redPin,LOW);
  digitalWrite(greenPin,LOW);
  digitalWrite(bluePin,HIGH);
  delay(500);
  digitalWrite(bluePin,LOW);
  digitalWrite(greenPin,LOW);
  digitalWrite(redPin,LOW);
  delay(500);
}

// Ejemplo en:
https://www.tinkercad.com/things/5QOWV9Pmht4-ejemplo1-2/editel