int on = 1;
int pin[7] = {2,3,4,5,6,7,8};

int perA[4][7] = {
  {1,0,1,1,1,1,1}, //6
  {1,1,1,1,1,1,0}, //0
  {1,1,1,1,1,1,0}, //0
  {0,1,1,0,0,1,1}, //4
};

int perB[4][7] = {
  {1,0,1,1,0,1,1}, //5
  {1,1,1,0,0,0,0}, //7
  {0,1,1,0,0,0,0}, //1
  {1,1,0,1,1,0,1}, //2
};

void setup() {
  pinMode(12, OUTPUT);
  pinMode(13, OUTPUT);
  for(int x = 2; x <= 8; x++) {
    pinMode(x, OUTPUT);
  }
}

void loop() {
  for (int i = 0; i < 4; i++) {
    for(int j = 0; j <= 200; j++) {
      func(i);
    }
  }
}

void func(int i) {
  if (on){
    for(int z = 0; z < 7; z++) {
      digitalWrite(pin[z], perA[i][z]);
    }
    digitalWrite(13, LOW);
    digitalWrite(12, HIGH);
    delay(5);
    on = 0;
  }
  else {
    for(int z = 0; z < 7; z++) {
      digitalWrite(pin[z], perB[i][z]);
    }
    digitalWrite(13, HIGH);
    digitalWrite(12, LOW);
    delay(5);
    on = 1;
  }
}