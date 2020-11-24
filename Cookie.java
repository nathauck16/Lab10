class Cookie {
  // instance variables
  private int count;
  private int bakeTemp;
  private int bakeTime;
  private boolean isCookieBaked;

  // constructor
  Cookie(){
        count = 0;
        bakeTemp = 0;
        bakeTime = 0;
        isCookieBaked = false;
      }

  // constructor
  Cookie(int aCount, int aBakeTemp, int aBakeTime, boolean isACookieBaked) {
    count = aCount;
    bakeTemp = aBakeTemp;
    bakeTime = aBakeTime;
    isCookieBaked = isACookieBaked;
  }

  // accessors
  boolean getIsCookieBaked() {
    return isCookieBaked;
  }

  int getCount() {
    return count;
  }

  void setCount() {
    count = aCount;
  }

  // bake cookies method
  void bakeCookies()
  {
    // takes in two parameters, bake temp and bake time
    //
    //work here

    System.out.println(count + " cookies were baked at" + bakeTemp + "degrees F for " + bakeTime + "minutes.");
  }

}