        import ddf.minim.*;
  Minim minim;
  AudioSample sound;
  PImage backgroundImage;
  int ballX=0; 
int ballY=0;
int speedX = 8;
int speedY = 1;
void setup () {
  size(500, 500);
  backgroundImage = loadImage("Background.jpg");
          minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
}
void draw () {
       
       
  image(backgroundImage, 0, 0);
  image(backgroundImage, 0, 0, width, height);
  
rect(0, mouseY, 10, 50);
  fill(100, 0, 0);
  stroke(100, 0, 0);
  ellipse(ballX, ballY, 40, 40);
  ballX=ballX+speedX;
  ballY=ballY+speedY;
  if(ballX>=width || ballX<=0) {
    speedX=-speedX;
    
  }
  if(ballY>=height || ballY<=0) {
    speedY=-speedY;
    sound.trigger();
    
  }
  if (intersects(ballX, ballY, 0, mouseY, 50)) {
    speedX=-speedX;
}
}
 boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else
          return false;
    }
