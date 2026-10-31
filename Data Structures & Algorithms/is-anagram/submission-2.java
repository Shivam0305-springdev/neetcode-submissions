class Solution {
    public boolean isAnagram(String s, String t) {

        // Map<Character, Integer> anagramMap = new HashMap<>();

        // for(char c: s.toCharArray()) {
        //     if(anagramMap.containsKey(c)) {
        //         anagramMap.put(c, anagramMap.get(c)+1);
        //     }else {
        //         anagramMap.put(c, 1);
        //     }
        // }
        
        // for(char c: t.toCharArray()) {
        //     if(anagramMap.containsKey(c)) {
        //         anagramMap.put(c, anagramMap.get(c) -1);
        //     }else {
        //         return false;
        //     }
        // }

        // Set<Map.Entry<Character, Integer>> entries = anagramMap.entrySet();
        // for(Map.Entry<Character, Integer> entry: entries) {
        //     if(entry.getValue() != 0) return false;
        // }

        // return true;

        if(s.length() != t.length()) return false;

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int i: count) {
            if(i != 0) return false;
        }

        return true;

    }
}
