class peakIndexMountain {
    public static int peakIndexInMountainArray(int[] arr) { // made static
        int st = 0, end = arr.length - 1;

        while (st < end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] < arr[mid + 1]) {
                st = mid + 1; // peak is on the right
            } else {
                end = mid;    // peak is mid or on the left
            }
        }
        return st; // st == end == peak index
    }


//  public int peakIndexInMountainArray(int[] arr) {
        
//     int st =1 , end = arr.length-2;

//     while(st<=end){
//         int mid = st + (end-st)/2;

//         if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]) return mid;
//         else if(arr[mid-1]  < arr[mid]) st = mid +1;
//         else end = mid -1;
//     }

//      return -1;


//     }









    public static void main(String[] args) {
        int arr[] = {0, 3, 8, 9, 5, 2};
        int peakIndex = peakIndexInMountainArray(arr);

        System.out.println("Peak index: " + peakIndex);
        System.out.println("Peak value: " + arr[peakIndex]);

        System.out.println("Array elements:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
