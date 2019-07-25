int y = 20;
      int randomNumber = (int) random(500);
void setup() {
  size(500, 500);
}
void draw() {
  
  background(50, 100, 110);
     rain();
    if (y>=499) {
     y=20;
     randomNumber=(int) random(500);
    }
}
void rain() {
  
  fill(0, 0, 1000);
    stroke(0, 0, 1000);
    ellipse(randomNumber, y, 50, 50);
    y=y+2;
}
