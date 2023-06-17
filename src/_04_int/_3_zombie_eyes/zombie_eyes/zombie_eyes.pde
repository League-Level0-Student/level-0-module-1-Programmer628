
void setup() {
  PImage face = loadImage("face.jpeg");
  size(400, 700);
  face.resize(400, 700);
  image(face, 0, 0);
}
void draw() {
  fill(0, 0, 0);
  ellipse(100, 225, 30, 30);
  ellipse(290, 195, 30, 30);
  if(mousePressed){
    fill(255, 0, 0);
  ellipse(100, 225, 30, 30);
  ellipse(290, 195, 30, 30);
  }
  

}
