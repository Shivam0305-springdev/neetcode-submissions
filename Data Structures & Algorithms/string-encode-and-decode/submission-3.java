class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();

        for(String s: strs) {
            encodedString.append(String.valueOf(s.length())).append("#").append(s);
        }

        return encodedString.toString();
    }

    //4#Hello5#World

    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int idx = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, idx));
            int start = idx+1;
            decodedList.add(str.substring(start, idx+1+length));
            i = start + length;
        }
        
        return decodedList;
    }
}
