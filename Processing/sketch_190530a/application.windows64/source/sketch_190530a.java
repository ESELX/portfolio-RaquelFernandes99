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

public class sketch_190530a extends PApplet {

PImage img;
float offset = 6;
float easing = 0.01f;

public void setup() {
  
  img = loadImage("4.png");
}

public void draw() { 
  image(img, 4, 1); 
  float dx = (mouseX-img.width/4) - offset;
  offset += dx * easing; 
  tint(155, 110);  
  image(img, offset, 5);
}
  public void settings() {  size(840, 360); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_190530a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
