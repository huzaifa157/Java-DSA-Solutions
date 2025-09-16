public class linearSearch {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,0},
            {4,5,6,0},
            {7,8,9,0}
        };

        int search = 5;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){

                if(arr[i][j] == search){
                    System.out.println("\nTarget found at row " + i + ", column " + j + 
                                       " → value = " + arr[i][j]);
                }
            }
        }
    }
}
