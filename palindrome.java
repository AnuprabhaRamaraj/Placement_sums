class palindrome {
    public boolean isPalindrome(int x) {
         if(x<0){
            return false;
         }
           int res=0;
         int temp=x;
         int sum=0;
       
         while(temp!=0){
            res=temp%10;
            sum=sum*10+res;
            temp/=10;
         }
        
        if(x==sum){
            return true;
        }
        else{
            return false;
        }
    }
}