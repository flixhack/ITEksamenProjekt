

//Arduino arduino;
Serial myPort;
String a;
void setup() {
  size(470, 280);

  // Prints out the available serial ports.
 // println(Arduino.list());

  // Modify this line, by changing the "0" to the index of the serial
  // port corresponding to your Arduino board (as it appears in the list
  // printed by the line above).
  printArray(Serial.list());

  myPort = new Serial(this, "COM6", 9600);
}

void draw() {
  while (myPort.available() > 10) {
    a = myPort.readString();
    println(a);
  }
}
