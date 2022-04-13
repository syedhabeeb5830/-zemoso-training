    public static boolean checkStringForAllTheLetters(String str) {
        int index = 0;
        boolean[] vis = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            }
            else if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
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
