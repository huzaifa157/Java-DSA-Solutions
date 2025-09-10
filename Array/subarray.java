public class subarray {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10 };

        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];

                }
                maxsum = Math.max(maxsum, sum);
                System.out.println();

            }

        }
        System.out.println();

        System.out.println("max sum : " + maxsum);

    }

}
