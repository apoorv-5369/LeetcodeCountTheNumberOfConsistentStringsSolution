class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans=0;
        HashSet<Character> hs = new HashSet<>();
        for(char c: allowed.toCharArray()){
            hs.add(c);
        }
        for(String word: words){
            for(int i=0;i<word.length();i++){
                if(!hs.contains(word.charAt(i))){
                    break;
                }
                if(i==word.length()-1){
                    ans++;
                }
            }
        }
        return ans;
    }
}
