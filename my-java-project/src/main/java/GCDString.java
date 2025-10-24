public class GCDString {
    public static String gcdOfStrings(String str1, String str2) {
        StringBuilder com = new StringBuilder();
        String big, small;
        boolean valid = true;

        // Step 1: Find smaller and bigger string
        if (str1.length() < str2.length()) {
            small = str1;
            big = str2;       
        } else {
            small = str2;
            big = str1;  
        }

        // Step 2: Find the common prefix
        int i = 0;
        while (i < small.length() && str1.charAt(i) == str2.charAt(i)) {
            com.append(str1.charAt(i));
            i++;              
        }

        // Step 3: If no prefix found, return ""
        if (com.length() == 0) {
            return "";
        }

        // Step 4: Try to reduce com to its smallest repeating block
        String prefix = com.toString();
        for (int k = 1; k <= prefix.length() / 2; k++) {
            if (prefix.length() % k == 0) {
                String sub = prefix.substring(0, k);
                StringBuilder repeated = new StringBuilder();
                for (int j = 0; j < prefix.length() / k; j++) {
                    repeated.append(sub);
                }
                if (repeated.toString().equals(prefix)) {
                    prefix = sub; // Shrink to smallest repeating unit
                    break;
                }
            }
        }
        com.setLength(0);
        com.append(prefix);

        // Step 5: Check if both strings are made of this 'com' pattern
        for (int j = 0; j < big.length(); j++) {
            char expected = com.charAt(j % com.length());
            if (big.charAt(j) != expected) {
                valid = false;
                break;
            }
            if (j < small.length() && small.charAt(j) != expected) {
                valid = false;
                break;
            }
        }

        // Step 6: Return based on validation
        if (!valid) {
            return "";
        } else {
            return com.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));     // AB
        System.out.println(gcdOfStrings("ABCABCABC", "ABCABC")); // ABC
        System.out.println(gcdOfStrings("AAAAAA", "AAA"));       // A
        System.out.println(gcdOfStrings("LEET", "CODE"));        // ""
    }
}
