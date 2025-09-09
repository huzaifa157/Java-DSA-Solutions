public class subarray {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10 };
        int totalSubarray = 0;
        int t_sum = 0;
        int maxSub = Integer.MIN_VALUE;
        int minSub = Integer.MAX_VALUE;
    

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                    int sum = 0;

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                  
                }
                totalSubarray++;
                  t_sum+= sum;
                System.out.println();
                  System.out.println("sum: "+ sum );
                  
               if(maxSub < sum){
                maxSub = sum;
               }
                if(minSub > sum){
                    minSub = sum;
                }




            }
            System.out.println();
        }

        System.out.println("Total subarrays : " + totalSubarray);
        System.out.println("Total sum of all subarray sums: " + t_sum);
        System.out.println("Maximum subarray sum: " + maxSub);
        System.out.println("Minimum subarray sum: " + minSub);

    }

}
