public class string_vowels {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String word = "alphabet";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            for (char v : vowels) {
                if (ch == v) {
                    count++;
                    break;
                }
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}