public class Bitwise_Operation {
    public static void main(String[] args) {
       System.out.println(getIthBit(5, 2));

       System.out.println(SetIthBit(10,2));

       System.out.println(clearIthBit(10, 1));

       
    }

    public static int getIthBit(int no , int i){
        int bitMask =  1<<i;
        if((bitMask & no)== 0) return 0;
        else return 1;

    }

    public static int SetIthBit(int no ,int i){
        int bitMask = 1<<i;

       return bitMask | no;
    }
    


public static int clearIthBit(int no , int i){
    int bitMask = ~(1<<i);

    return bitMask & no;

}
}