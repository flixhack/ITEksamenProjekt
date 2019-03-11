import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class spil extends PApplet {



public void setup ( ) {


}



public void draw ( ) {
background(255,0,0);
ellipse(600,400,800,600);
fill(255,0,0);
ellipse(600,400,600,400);
fill(255);
}
  public void settings() { 
size(1200,800 , P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "spil" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
