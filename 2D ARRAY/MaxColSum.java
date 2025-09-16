public class MaxColSum {
    public static void main(String[] args) {
        
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int maxSumCol = Integer.MIN_VALUE;
        int colIndex = -1;  // to store which column has the max sum

        int col = arr[0].length;
        int row = arr.length;

        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < row; j++) {
                sum += arr[j][i];
            }

            if (sum > maxSumCol) {
                maxSumCol = sum;
                colIndex = i; // store column index
            }
        }

        // +1 because arrays are 0-indexed (human-friendly column number starts at 1)
        System.out.println("Max column sum = " + maxSumCol + " at column " + (colIndex + 1));
    }
}
