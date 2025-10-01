public class StringDemo {
    public static void main(String[] args) {
        // ============================
        // 🔹 String Examples
        // ============================
        String s = "leetcode";

        System.out.println("=== String Examples ===");
        System.out.println("Original String: " + s);

        // Length
        System.out.println("Length: " + s.length());

        // charAt
        System.out.println("charAt(0): " + s.charAt(0)); // 'l'

        // substring
        System.out.println("substring(2,5): " + s.substring(2, 5)); // "etc"

        // indexOf
        System.out.println("indexOf('e'): " + s.indexOf('e')); // 1
        System.out.println("lastIndexOf('e'): " + s.lastIndexOf('e')); // 7

        // contains
        System.out.println("Contains 'code': " + s.contains("code")); // true

        // startsWith / endsWith
        System.out.println("Starts with 'lee': " + s.startsWith("lee")); // true
        System.out.println("Ends with 'de': " + s.endsWith("de")); // true

        // equals
        System.out.println("Equals 'leetcode': " + s.equals("leetcode")); // true
        System.out.println("EqualsIgnoreCase 'LEETCODE': " + s.equalsIgnoreCase("LEETCODE")); // true

        // replace
        System.out.println("Replace 'e' with 'x': " + s.replace('e', 'x')); // lxxxcodx

        // split
        String[] parts = s.split("e");
        System.out.println("Split by 'e': ");
        for (String part : parts) {
            System.out.println(part);
        }

        // toCharArray
        char[] arr = s.toCharArray();
        System.out.println("toCharArray(): ");
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();

        // ============================
        // 🔹 StringBuilder Examples
        // ============================
        System.out.println("\n=== StringBuilder Examples ===");
        StringBuilder sb = new StringBuilder("abc");

        System.out.println("Original: " + sb);

        sb.append("d");
        System.out.println("After append: " + sb); // abcd

        sb.insert(2, "X");
        System.out.println("After insert: " + sb); // abXcd

        sb.delete(1, 3);
        System.out.println("After delete(1,3): " + sb); // acd

        sb.setCharAt(0, 'Z');
        System.out.println("After setCharAt(0,'Z'): " + sb); // Zcd

        sb.reverse();
        System.out.println("After reverse: " + sb); // dcZ

        System.out.println("Convert back to String: " + sb.toString());
    }
}
