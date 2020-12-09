import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
      reset();
      data = new int[other.length];
      for (int i = 0 ; i < other.length ; i++){

        data[i] = other[i];

      }


    }

    //Postcondition: The otherseq will be reset.
    //This constructor will copy ALL values of the `otherseq` into the data array.
    public ArraySequence(IntegerSequence otherseq){
      reset();
      int i = 0;
      data = new int[otherseq.length()];
      otherseq.reset();
      while (otherseq.hasNext()) {
        data[i] = otherseq.next();
        i++;
        }
        otherseq.reset();
    }

    public boolean hasNext(){
        if (currentIndex >= data.length){
          return false;
        }
      return true;
    }

    public int next(){
      if (hasNext()==false){
        throw new NoSuchElementException();
      }
      else {
      currentIndex++;
      return data[currentIndex-1];
    }
  }

    public int length(){
        return data.length;

    }

    public void reset(){
        currentIndex = 0;

    }
}
