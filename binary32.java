// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class binary32 {
    public static void main(String[] args) {
        int n=12;
         StringBuilder f=base(n);
         System.out.println(f);
         int i=2;
         int j=29;
         char bit1=f.charAt(i);
         char bit2=f.charAt(j);
        f.setCharAt(i, bit2);
        f.setCharAt(j, bit1);
        System.out.println(f);
    }
    static StringBuilder base(int n){
        String binary="";
        int temp=n;
        int rem;
        while(temp>0){
            rem=temp%2;
            binary=rem+binary;
            temp/=2;
        }
        String binary32Bit = String.format("%32s", binary).replace(' ', '0');
        StringBuilder a=new StringBuilder(binary32Bit);
        return a;
    }
}