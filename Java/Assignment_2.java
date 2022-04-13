    public static boolean checkStringForAllTheLetters(String input) {
        int index = 0;
        boolean[] vis = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
            }
            else if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                index = input.charAt(i) - 'A';
            }
            vis[index] = true;
        }

       for(boolean ele: vis){
           if(!ele)
               return false;
       }
        return true;
    }

// Time complexity -  O(n)        where n is the length of the string
// Space complexity - O(26)
