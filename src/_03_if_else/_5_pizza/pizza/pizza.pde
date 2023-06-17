
void setup() {
    size(400, 400);
    fill(240, 200, 92);
    ellipse(200, 200, 380, 380);
    fill(242, 255, 72);
    ellipse(200, 200, 330, 330);
    PImage pepperoni;
    pepperoni = loadImage("pepperoni.png");
}
void draw() {
    PImage pepperoni;
    pepperoni = loadImage("pepperoni.png");
    pepperoni.resize(70, 70);
    if(mousePressed){
    image(pepperoni, 170, 250);
    image(pepperoni, 180, 120);
    image(pepperoni, 240, 270);
    image(pepperoni, 270, 200);
    image(pepperoni, 130, 100);
    }
}
