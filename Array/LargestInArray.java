public class LargestInArray {
    
public static void main(String[] args) {
    

int[] arr = {1,4,7,9,11,2};

int result = largest(arr);
System.out.println("largest element found is " + arr[result] + " at index " + result  );




}






public static int largest(int arr[]){

  int largest = arr[0];
  int index = 0;
  
  for(int i=0; i<arr.length; i++){
    if(arr[i]> largest){
        largest = arr[i];
        index = i;
    }
  }
  return index;

}

}
