class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(p.length()>s.length())
            return ans;
            int[]pFreq =new int[26];
            int[]windowFreq = new int[26];
            for(char ch : p.toCharArray()){
                pFreq[ch -'a']++;

            }
            int k=p.length();
            for(int i=0; i<s.length(); i++){
                windowFreq[s.charAt(i) -'a']++;
                if(  i >= k){
                    windowFreq[s.charAt(i - k)-'a']--;
                }
            if(Arrays.equals(pFreq,windowFreq)){
                ans.add(i- k + 1);
            }
            }
            return ans;
        

    }
}