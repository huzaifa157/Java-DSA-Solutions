public class reverse {
    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8 };

        reverse(arr);

        for(int result : arr){
     System.out.print(result + " ");
        }

    }

    public static void reverse(int arr[]) {

        int st = 0, end = arr.length - 1;

        while (st < end) {

            // swap

            int temp = arr[end];
            arr[end] = arr[st];
            arr[st] = temp;

            st++;
            end--;

        }

    }




    // public static void reverse (int arr[]){

    // int[] arr1 = new int[arr.length];

    // for(int i=0; i<arr1.length; i++){
    // arr1[i] = arr[arr.length-1-i];
    // }
    // for(int res : arr1){
    // System.out.print(res + " ");
    // }

    // }

}
