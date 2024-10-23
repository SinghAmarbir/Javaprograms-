public class Main {
    public static void main(String[] args) {
        String input = "aaaaaaabbbbbbcccccdddd";
        String result = removeExcessRepeats(input);
        System.out.println(result); // Output: "aaabbbcccd"
    }

    public static String removeExcessRepeats(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            // Check if the next character is the same as the current one
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // If the count is less than or equal to 3, append the character
                if (count <= 2) {
                    sb.append(str.charAt(i));
                }
                // Reset the count for the next character
                count = 1;
            }
        }

        return sb.toString();
    }
}
