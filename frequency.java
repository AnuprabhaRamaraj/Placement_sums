import java.util.*;
class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String a=sc.nextLine();
        String w[]=a.toLowerCase().split(" ");
        boolean v[]=new boolean[w.length];
        for(int i=0;i<w.length;i++){
            if(!v[i]){
                int count=1;
                for(int j=i+1;j<w.length;j++){
                    if(w[i].equals(w[j])){
                        count++;
                        v[j]=true;
                    }
            }
             System.out.println(w[i]+":"+count);
        }
    }
}
}