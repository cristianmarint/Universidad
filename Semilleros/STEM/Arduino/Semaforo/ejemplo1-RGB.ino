/*
 * @Author: CristianMarinT 
 * @Date: 2019-04-04 10:30:46 
 * @Last Modified by:   CristianMarinT 
 * @Last Modified time: 2019-04-04 10:30:46 
 */

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
  setColor(1, 0, 0);  // red lowest brightness
  delay(1000);
  setColor(50, 0, 0);  // red
  delay(1000);
  setColor(140, 0, 0);  // red
  delay(1000);
  setColor(255, 0, 0);  // red
  delay(1000);
  setColor(0, 255, 0);  // green
  delay(1000);
  setColor(0, 0, 255);  // blue
  delay(1000);
  setColor(255, 255, 0);  // yellow
  delay(1000);  
  setColor(80, 0, 80);  // purple
  delay(1000);
  setColor(255, 50, 0);  // Orange
  delay(1000);
}

void setColor(int red, int green, int blue)
{
  analogWrite(redPin, red);
  analogWrite(greenPin, green);
  analogWrite(bluePin, blue);  
}


// Circuito en:
// https://www.tinkercad.com/things/5QOWV9Pmht4

// Fuente:
// http://educ8s.tv/arduino-rgb-led-tutorial/