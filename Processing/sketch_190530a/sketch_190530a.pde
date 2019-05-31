PImage img;
float offset = 6;
float easing = 0.01;

void setup() {
  size(840, 360);
  img = loadImage("4.png");
}

void draw() { 
  image(img, 4, 1); 
  float dx = (mouseX-img.width/4) - offset;
  offset += dx * easing; 
  tint(155, 110);  
  image(img, offset, 5);
}
