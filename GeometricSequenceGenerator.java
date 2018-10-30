
/**
 * File header comes here
 */

// ADD import statements here as needed


/**
 * Javadoc class header comes here
 *
 */

import java.util.Iterator;

public class GeometricSequenceGenerator implements Iterator<Integer> {
  private final int SIZE; // The number of elements in this sequence
  private final int INIT; // The first term in this sequence
  private final int RATIO; // The common ratio for this sequence
  private int next; // The next term in the sequence

  private int generatedCount; // The number of terms generated so far in this sequence
  // It refers also to the order of the next number to be generated by next() method

  // constructor
  public GeometricSequenceGenerator(int init, int ratio, int size) throws IllegalArgumentException {
    // TODO implement this constructor

    if(init<=0 || ratio<=0){
      throw new IllegalArgumentException("WARNING: The starting element and the common ratio for a geometric progression should be STRICTLY POSITIVE.");
    }
    if(size <= 0) {
      throw new IllegalArgumentException("WARNING: CANNOT create a sequence with size <= zero.");
    }
    this.SIZE=size;
    this.INIT=init;
    this.RATIO=ratio;
    next=INIT;
    generatedCount=0;
  }

  // TODO implement hasNext(), and next() methods here
  @Override
  public boolean hasNext() {
    return generatedCount < SIZE; 
  }

  @Override
  public Integer next() {
    if (!hasNext()) // check if the current element has a next element in this sequence
      return null;
  int current = next; // set the current element to next
  generatedCount++; // increment the number of generated elements so far
  
  next = current*RATIO; // set the next element (adds the common difference to the current number) 
  return current; // return the current number as the generated one// TODO your code comes here
  }

  // You can add local variable to your hasNext() or next() method to implement their correct behavior if needed
  // You can add public getters and setters methods as needed to implement your test methods here
  // You CANNOT define mutators for any final field


}