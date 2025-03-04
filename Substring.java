/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Substring {
    public static void main(String[] args) {
        String str="hello world";
        System.out.println(stri(str,1,6));
         String sub=str.substring(1,6);
        System.out.println(sub);
         StringBuilder subbu=new StringBuilder(str.substring(1,6));
        System.out.println(subbu);
         StringBuffer subs=new StringBuffer (str.substring(1,6));
        System.out.println(subs);
    }
    static String stri(String str,int s,int e){
        String result="";
        for(int i=s;i<str.length()&&i<e;i++){
            result+=str.charAt(i);
        }
        return result;
    }
}