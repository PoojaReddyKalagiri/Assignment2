import java.util.*;
class Check{
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     s=s.toLowerCase();
     if(check(s)){
        System.out.println("YES");
     }
     else{
        System.out.println("NO");
     }
  }
  public static boolean check(String s){
     boolean[] value=new boolean[26];
     int c=0;
     for(int i=0;i<s.length();i++){
      if(s.charAt(i)!=' ')
        c=s.charAt(i)-'a';
       value[c]=true;
     }
     for(int i=0;i<26;i++){
        if(value[i]==false)
          return false;
     }
     return true;
  }
}
