class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String s: strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);

            if(anagramMap.containsKey(sorted)) {
                List<String> list = anagramMap.get(sorted);
                list.add(s);
                anagramMap.put(sorted, list);
            }else {
                List<String> l = new ArrayList<>();
                l.add(s);
                anagramMap.put(sorted, l);
            }
        }

        List<List<String>> res= new ArrayList<>();

        for(List<String> value: anagramMap.values()) {
            res.add(value);
        }

        return res;
    }
}
