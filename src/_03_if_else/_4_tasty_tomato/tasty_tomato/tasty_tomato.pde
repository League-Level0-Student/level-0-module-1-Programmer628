void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(255, 8, 53);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(137, 31, 4);
    rect(176, 103, 12, 32);
    if(mousePressed){
      fill(255, 255, 255)
      ellipse(30, 30, 0, 150)
    }
}
