class Solution {
    public boolean isPalindrome(int x) {
        String res = Integer.toString(x);
        int L = 0;
        int R = res.length() - 1;
        while(L < R){
           if(res.charAt(L) != res.charAt(R))
               return false;
           L += 1;
           R -= 1;
        }
       return true;  
    }
}

      