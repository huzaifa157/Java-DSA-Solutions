import java.util.Arrays;
public class MajorityElement {
    public static void main(String[] args) {




//         Why does majority always come in center?

// Majority element means: ek element n/2 se zyada baar repeat hota hai.
// Matlab agar array ki length 9 hai, majority element kam se kam 5 times repeat hoga.
// Jab aap sort karte ho, toh wo element itni baar repeat hota hai ke beech ke index (middle) pe wohi element zaroor hota hai.
        
   int arr[] = {4,5,6,5,5,4,6,5,4};
   Arrays.sort(arr);

 int majority = arr[arr.length/2];
 System.out.println(majority);

    }


// 2nd better way  Boyer–Moore Majority Vote Algorithm

  public static int majorityElement(int[] arr) {

        // Step 1: Assume the first element is the majority candidate
        int Majority = arr[0], lead = 1;

        // Step 2: Traverse the array
        for (int i = 1; i < arr.length; i++) {

            // If current element equals the candidate, increase its lead
            if (arr[i] == Majority) {
                lead++;
            }
            // Otherwise, decrease the lead
            else if (lead > 0) {
                lead--;
            }
            // If lead becomes 0, change the candidate to the current element
            else {
                Majority = arr[i];
                lead = 1;
            }
        }

        // After this loop, "Majority" will hold the majority element
        return Majority;
    }
    
}
