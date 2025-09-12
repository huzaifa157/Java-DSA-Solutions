public class SearchInRotatedArray{
    
    public int search(int[] arr, int target) {
        int n = arr.length;

        int st = 0, end = n - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            // ✅ Case 1: Found the target
            if (target == arr[mid]) return mid;

            // ✅ Case 2: Left half is sorted
            if (arr[st] <= arr[mid]) {
                // Check if target lies inside the left half
                if (arr[st] <= target && target < arr[mid]) {
                    end = mid - 1; // move search to the left half
                } else {
                    st = mid + 1;  // move search to the right half
                }
            }
            // ✅ Case 3: Right half is sorted
            else {
                // Check if target lies inside the right half
                if (arr[mid] < target && target <= arr[end]) {
                    st = mid + 1;  // move search to the right half
                } else {
                    end = mid - 1; // move search to the left half
                }
            }
        }

        // Target not found
        return -1;
    }
}
