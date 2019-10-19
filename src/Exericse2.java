public class Exericse2 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int i=1;
            String a=null;
            String[]b=s.split("");
            if(s==null){
                return 0;
            }
            for(int j=0;i<b.length;i++){
                if(a.contains(b[j])){
                    
                }
                a.join(b[j]);
            }
            return 0;
        }
    }
}
