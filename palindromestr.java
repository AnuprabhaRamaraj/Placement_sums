/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class palindromestr {
    public static void main(String[] args) {
        String str="181";
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
         StringBuilder r =new StringBuilder(str).reverse();
        if(str.equals(r.toString())){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
          StringBuffer s =new StringBuffer(str).reverse();
        if(str.equals(s.toString())){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        
    }
}