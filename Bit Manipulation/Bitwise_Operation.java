public class Bitwise_Operation {
    public static void main(String[] args) {
       System.out.println(getIthBit(5, 2));

       
    }

    public static int getIthBit(int no , int i){
        int bitMask =  1<<i;
        if((bitMask & no)== 0) return 0;
        else return 1;

    }
    
}

