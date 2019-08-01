int hi = 0;
int bye = 1000;
void setup() {
  size(1000, 1000);
  background(200, 423, 423);
}
void draw() {
  for(int i = 0; i<300; i++) {
    ellipse(random(0, width), random(0, height), 10, 10);
    hi=hi+10;
    bye = bye-10;
  }
}
