int hi = 0;
int bye = 1000;
void setup() {
  size(1000, 1000);
  background(200, 423, 423);
}
void draw() {
  makeMagical();
  for(int i = 0; i<300; i++) {
    fill(100, 0, 0);
    ellipse(getWormX(i), getWormY(i), 10, 10);
    hi=hi+10;
    bye = bye-10;
  }
}
float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
