class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int[]freq=new int[26];
       // count of magazine letter
       for(char ch : magazine.toCharArray()){
        freq[ch -'a']++;
       } 
       // check letter of ransomNote 
       for(char ch : ransomNote.toCharArray()) {
       if(freq[ch -'a']== 0){
        return false;
       }
       freq[ch -'a']--;
    }
    return true ;
}
}