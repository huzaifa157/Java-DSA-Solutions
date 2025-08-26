public class linearSearch {
    public static void main(String[] args) {
        
        int arr[] = {4, 6, 8, 9};
        int target = 6;
        boolean found = false;  // flag

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Target found at index " + i + " value: " + arr[i]);
                found = true;
                break; // stop searching once found
            }
        }

        if (!found) {
            System.out.println("Target not found");
        }
    }
}
