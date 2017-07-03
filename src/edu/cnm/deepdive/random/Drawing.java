/**
 * 
 */
package edu.cnm.deepdive.random;

import java.util.Random;

/**
 * @author Kelly Escobar
 *
 */
  abstract class Drawing {

    
  private Random rng;
  
  
  protected Drawing() {
    this(new Random());
  }
  
  protected Drawing(Random rng) {
    this.rng = rng;
  }

  /**
   * @return the rng
   */
  protected Random getRng() {
    return rng;
  }

  /**
   * @param rng the rng to set
   */
  protected void setRng(Random rng) {
    this.rng = rng;
  }
  
  /**
   * 
   */
  public abstract void shuffle();
  
  /**
   * 
   * @param num
   * @return
   */
  public abstract Integer[] draw(int num);
  
}

















