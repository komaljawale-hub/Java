import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        char ch = in.next().charAt(0);
        ch = Character.toLowerCase(ch);
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is a consonant.");
            
        }else{
            System.out.println("Not an alphabet.");
        }
    }
}
