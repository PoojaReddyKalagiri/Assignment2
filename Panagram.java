
/* A panagram is a sentence containing every letter in the English Alphabet */

import java.util.Scanner;
public class Panagram{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine().toLowerCase();   // converting the given input string to lower case
        if(isPanagram(input)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    /* isPanagram method to check whether the input string is panagram or not */

    public static boolean isPanagram(String input){
        boolean[] isPresent=new boolean[26];  // to check whether each letter is present or not
        int letterIndex=0;
        for(int i=0;i<input.length();i++){
            if(Character.isLetter(input.charAt(i)))
                letterIndex=input.charAt(i)-'a';
            isPresent[letterIndex]=true;
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