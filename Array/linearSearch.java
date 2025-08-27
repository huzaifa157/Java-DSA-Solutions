
public class linearSearch {
    public static void main(String[] args) {

        int[] arr = { 4, 55, 7, 8, 6, 99 };
        int target = 6;
        int result = Search(arr, target);

        if (result == -1) {
            System.out.println("Not found!");
        } else {
            System.out.println("Target found at index " + result + " valued: " + arr[result]);
        }

    }

    public static int Search(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

    }

}
