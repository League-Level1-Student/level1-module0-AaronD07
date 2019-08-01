int y = 20;
int score = 0;
      int randomNumber = (int) random(500);
void setup() {
  size(500, 500);
}
void draw() {
  
  background(50, 100, 110);
  
  fill(#7E7E7E);
          rect(mouseX, 400, 75, 100);

     rain();
    if (y>=499) {
       checkCatch(randomNumber);
     y=20;
     randomNumber=(int) random(500);
    
    }
        fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
void rain() {
  
  fill(0, 0, 1000);
    stroke(0, 0, 1000);
    ellipse(randomNumber, y, 50, 50);
    y=y+2;
}
 void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
