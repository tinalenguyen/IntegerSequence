import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
      data = new int[other.length];
      for (int i = 0 ; i < other.length ; i++){

        data[i] = other[i];

      }
      currentIndex = 0;

    }

    //Postcondition: The otherseq will be reset.
    //This constructor will copy ALL values of the `otherseq` into the data array.
    public ArraySequence(IntegerSequence otherseq){
      otherseq.reset();
      int i = 0;
      data = new int[otherseq.length()];
      while (otherseq.hasNext()) {
        data[i] = otherseq.next();
        i++;
      }

    }

    public boolean hasNext(){
        if (currentIndex >= data.length){
          return false;
        }
      return true;
    }

    public int next(){
      if (currentIndex >= data.length){
        throw new NoSuchElementException("There are no more values");
      }
      currentIndex++;
      return data[currentIndex-1];
    }

    public int length(){
        return data.length;

    }

    public void reset(){
        currentIndex = 0;

    }
}
