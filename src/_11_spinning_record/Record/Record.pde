     import ddf.minim.*;     
     PImage pictureOfRecord;   
 int a=10;
   Minim minim;        //as a member variable
  AudioPlayer song;      //as a member variable
 void setup() {
         //at the very top of your sketch

  minim = new Minim(this);    //in the setup method
  song = minim.loadFile("Trampoline.mp3", 512);   //in the setup method
                      //as member variable
        size(510,400);                                 //in setup method
        pictureOfRecord= loadImage("record.jpeg");      //in setup method
       
        pictureOfRecord.resize(510,400);     //in setup method
        
}
void draw() {
  a=a+5;

   rotateImage(pictureOfRecord, a);
  if(mousePressed) {
      image(pictureOfRecord, 0, 0);
      song.play();
      //in draw method
}
else{
  song.pause();
}
}
   void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
    
