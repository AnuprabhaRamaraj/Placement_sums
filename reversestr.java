/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class reversestr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        String result="";
        char c,d;
        String reverse="";
         for(int i=str.length()-1;i>=0;i--){
            c=str.charAt(i);
            if(c==' '){
                 for(int j=result.length()-1;j>=0;j--){
                     d=result.charAt(j);
                     reverse+=d;
                 }
                     reverse=reverse+" ";
                     result="";
         }
        else if(c!=' '){
                 result+=c;
            }
           
            }
             System.out.print(reverse);
         }
                
}
