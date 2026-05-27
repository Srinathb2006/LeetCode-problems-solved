class Solution {
    public int numberOfSpecialChars(String word) {

        boolean upper[] = new boolean[26];
        boolean lower[] = new boolean[26];
        boolean invalid[] = new boolean[26];

        char c[] = word.toCharArray();

        for(int i = 0; i < c.length; i++) {

            if(Character.isUpperCase(c[i])) {

                int idx = c[i] - 'A';

                if(!invalid[idx])
                    upper[idx] = true;

            } 
            else {

                int idx = c[i] - 'a';

                if(upper[idx])
                    invalid[idx] = true;

                lower[idx] = true;
            }
        }

        int count = 0;

        for(int i = 0; i < 26; i++) {

            if(upper[i] && lower[i] && !invalid[i])
                count++;
        }

        return count;
    }
}