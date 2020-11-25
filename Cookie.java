class Cookie {
  // instance variables
  private int count;
  private int bakeTemp;
  private int bakeTime;
  private boolean baked;

  // constructor
  Cookie() {
        count = 0;
        bakeTemp = 0;
        bakeTime = 0;
        baked = false;
      }

  // constructor
  Cookie(int aCount, int aBakeTemp, int aBakeTime, boolean isBaked) {
    count = aCount;
    bakeTemp = aBakeTemp;
    bakeTime = aBakeTime;
    baked = isBaked;
  }

  // accessors
  boolean getIsBaked() {
    return isBaked;
  }
  void setIsBaked() {
    baked = isBaked;
  }

  int getCount() {
    return count;
  }
  void setCount() {
    count = aCount;
  }

  int getBakeTemp(){
    return bakeTemp;
  }
  void setBakeTemp(){
    bakeTemp = aBakeTemp;
  }

  int getBakeTime(){
    return bakeTime;
  }
  void setBakeTime(){
    bakeTime = aBakeTime;
  }



  // bake cookies method
  void bakeCookies()
  {
    // takes in two parameters, bake temp and bake time
    //
    setBakeTemp();
    setBakeTime();
    System.out.println(count + " cookies were baked at" + bakeTemp + "degrees F for " + bakeTime + "minutes.");
  }

}