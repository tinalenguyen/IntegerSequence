public class Demo {

  public static void main(String[] args ){

  //  int[]nums = {1,3,5,0,-1,3,9};
  //  IntegerSequence as = new ArraySequence(nums);

  //  System.out.println("ArraySequence(array):");
  //  while(as.hasNext()){
  //  System.out.print(as.next()+", ");

    IntegerSequence r = new Range(10,20);
    IntegerSequence as = new ArraySequence(r);

    System.out.println("ArraySequence(seq):");
    while(as.hasNext()){
    System.out.print(as.next()+", ");
    }
    System.out.println();
    }

  }
