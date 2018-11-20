const int buttonPinR = 3;
const int buttonPinB = 2;
const int buttonPinG = 1;
int ledPinR = 13;
int ledPinB = 12;
int ledPinG = 11;

int buttonStateR = 0;
int buttonStateB = 0;
int buttonStateG = 0;

void setup() {
  pinMode(ledPinR, OUTPUT);
  pinMode(ledPinB, OUTPUT);
  pinMode(ledPinG, OUTPUT);
  pinMode(buttonPinR, INPUT);
  pinMode(buttonPinB, INPUT);
  pinMode(buttonPinG, INPUT);

  digitalWrite(ledPinR, LOW);
  digitalWrite(ledPinG, LOW);
  digitalWrite(ledPinB, LOW);
}


void loop() {
  buttonStateR = digitalRead(buttonPinR);
  buttonStateB = digitalRead(buttonPinB);
  buttonStateG = digitalRead(buttonPinG);

  if (buttonStateR == HIGH){
    digitalWrite(ledPinR, HIGH);
  }
  else{
    digitalWrite(ledPinR, LOW);
  }
  
  if (buttonStateB == HIGH){
    digitalWrite(ledPinB, HIGH);
  }
  else{
    digitalWrite(ledPinB, LOW);
  }
  if (buttonStateG == HIGH){
    digitalWrite(ledPinG, HIGH);
  }
  else{
    digitalWrite(ledPinG, LOW);
  }

}
