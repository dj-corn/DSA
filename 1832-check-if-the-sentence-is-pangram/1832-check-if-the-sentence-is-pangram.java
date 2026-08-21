class Solution {
    public boolean checkIfPangram(String sentence) {
        int []arr = new int[26];
        for(int i=0; i<sentence.length();i++){
            int a = sentence.charAt(i)-'a';
            arr[a] = 1;
        }
        for(int i=0; i<26; i++){
            if(arr[i] == 0) return false;
        }
        return true;
    }
}