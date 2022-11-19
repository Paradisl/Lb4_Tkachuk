package Lb4_Tkachuk;
import java.util.Scanner;

public class Main4OOP {
/*
	public static void main(String[] args) {

        System.out.println("Ввод: ");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] words = line.split(" ");
        for(String word : words){
            if(word.length() == 4)
                System.out.println(word);
        }
    }
}
*/

/*
    public static void main(String[] args){
        String[] english = {
                "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q",
                "r","s","t","u","v","w","x","y","z",
        };
        String [] russian = {
                "а","б","к","д","э","ф","г","х","и","ж","к","л","м","н","о","п","к",
                "р","с","т","у","в","в","кс","й","з"
        };
        String word;
        System.out.println("Ввод:");
        Scanner s =  new Scanner (System.in);
        word = s.next();
        StringBuilder newWord = new StringBuilder("");
        for(int i = 0; i < word.length(); i++) {
            for(int j = 0; j < english.length; j++) {
                if(Character.toString(word.charAt(i)).equals(english[j]))
                    newWord=newWord.append(russian[j]);
            }
        }
        System.out.println(newWord);
    }
}
*/

/*
    public static void main(String[] args){
        System.out.println("Ввод:");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] words = line.split(" ");
        for(String word : words){
            if(word.matches("^[a-zA-Z]+$")) {
                System.out.println(word);
            }
        }
    }
}
*/

/*
    public static void main(String[] args){
        System.out.println("Ввод: ");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] words = line.split(" ");
        int k = 0;
        for(String word : words){
            if(word.matches("^[0-9]+$"))
                k++;
        }
        System.out.println(k);
    }
}
*/

	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        isPalindrome(s);
}
    public static String reverseString(String s){
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;
        
        
    }
    public static Boolean isPalindrome(String s) {
        if(s.equals(reverseString(s))){
            System.out.println("Полиндром");
        }else{
            System.out.println("Не полиндром");
        }
        return s.equals(reverseString(s));
        
    }
}



