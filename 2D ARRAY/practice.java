public class practice {
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9},
                       {10,0,100}};
  
        for(int i=0; i<mat.length; i++){
            int row = 0 , col = mat[0].length-1;
            while(row<col){
                int temp = mat[i][row];
                mat[i][row] = mat[i][col];
                mat[i][col] = temp;
              row++;
              col--;

            }

        }

for(int i = 0; i < mat.length; i++) {
    for(int j = 0; j < mat[i].length; j++) {
        System.out.print(mat[i][j] + " ");
    }
    System.out.println();
}





//   int arr[] = {1,2,3,4,5};


//     int st = 0 , end = arr.length-1;
//     while(st<end){
//         int temp = arr[st];
//         arr[st] = arr[end];
//         arr[end] = temp;
//         st++;
//         end -- ;
//     }



  
//  for(int i:arr){
//     System.out.print(i + " ");
//  }




    }







    }
    
