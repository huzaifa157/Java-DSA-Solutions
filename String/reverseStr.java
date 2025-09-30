public class reverseStr {
    public static void main(String[] args) {
        String s = " Hello World";
        s.trim();
 
        StringBuilder sb = new StringBuilder("");


        String words[] = s.split(" ");

        for(int i=words.length-1; i>=0; i--){
            sb.append(words[i]);
            if(i!=0)  sb.append(" ");
            

        }

        System.out.println(sb);
     
    }
    
}
