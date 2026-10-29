class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String s: strs) {
            int[] count = new int[26];
            for(int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }
            
            String hash = Arrays.toString(count);

            if(anagramMap.containsKey(hash)) {
                List<String> list = anagramMap.get(hash);
                list.add(s);
                anagramMap.put(hash, list);
            }else {
                List<String> l = new ArrayList<>();
                l.add(s);
                anagramMap.put(hash, l);
            }
        }

        List<List<String>> res= new ArrayList<>();

        for(List<String> value: anagramMap.values()) {
            res.add(value);
        }

        return res;
    }
}
