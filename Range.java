import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  public Range(int start, int end){
    this.start = start;
    this.end = end;
    this.current = start;
      }

  public void reset(){
//start over from the start of the sequence

    current = start;

  }

  public int length() {
//returns total length of sequence

    return end-start+1;

  }

  public boolean hasNext(){
//does this sequence have more elements?

    return current <= end;

  }

  public int next(){
//has a throw NoSuchElementException
//returns current value of sequence and advances

    if (current > end){
      throw new NoSuchElementException("There are no more values");
    }
    current++;
    return current-1;

  }
}
