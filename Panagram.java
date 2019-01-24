import java.util.Scanner;
public class Panagram{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine().toLowerCase();
        if(isPanagram(input)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static boolean isPanagram(String input){
        boolean[] isPresent=new boolean[26];
        int alphabetIndex=0;
        for(int i=0;i<input.length();i++){
            if(Character.isLetter(input.charAt(i)))
                alphabetIndex=input.charAt(i)-'a';
            isPresent[alphabetIndex]=true;
        }
        for(int i=0;i<26;i++){
            if(isPresent[i]==false)
                return false;
        }
        return true;
    }
}

/*

Test Cases:

Input 1:
The quick brown fox jumps over the lazy dog
Output 1:
YES

Input 2:
hi , hello ! how do you do?
Output 2:
NO

*/