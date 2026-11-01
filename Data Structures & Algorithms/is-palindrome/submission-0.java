class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll(" ","").toLowerCase().replaceAll("[^a-zA-z0-9]","");
        System.out.println(str);

        int i = 0;
        int j = str.length() -1;

        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) return false;
            else {
                i++;
                j--;
            }
        }

        return true;
    }
}
