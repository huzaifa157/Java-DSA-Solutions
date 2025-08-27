public class BinarySearch {
    public static void main(String[] args) {
        
   int[] arr = {3,5,6,7,8};
   int target = 7;

   int result = search(arr,target);
   System.out.println("The value is found at index: " + result + " value is " +  arr[result]);





    }

public static int search(int arr[], int target){
    int st =0;
    int end = arr.length-1;

  while(st<=end){
    int mid = st +(end-st)/2;
    if(arr[mid]== target) return mid;
    else if(target>arr[mid]){
        st = mid +1;
    }else{
        end = mid -1;
    }
  } return -1;
    
}

    
}
