
public class odd_even {
    public static void main(String[] args) {
        OddOrEven(4);
        OddOrEven(101);
        OddOrEven(104);
        




    }

  public static void OddOrEven(int no){
    int bitMask = 1;
    if((no & bitMask) == 1){
        System.out.println("odd");
    }else{
        System.out.println("even");
    }
  }


    
}
