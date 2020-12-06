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

    }
