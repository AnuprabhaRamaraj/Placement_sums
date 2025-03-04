/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
class charrepeater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        char c;
        int count;
        String result="";
        for(int i=0;i<str.length();i++){
            c=str.charAt(i);
            if(Character.isDigit(c)){
                count=c-'0';
            for(int j=0;j<count;j++){
                 System.out.print(result);
                 
            }
            result="";
        }
        else{
            result+=c;
            if(i==str.length()-1){
                if(result!=""){
                    System.out.print(result);
                }
            }
        }
        }
    }
}
