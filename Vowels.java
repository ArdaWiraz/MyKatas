import java.util.Scanner;
public class Vowels {

  public static void main(String[] args){
    
    int vowelsCount = 0;

    System.out.println("Enter a sentence :");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
    for(int i = 0; i < str.length(); i++){
      char ch = str.charAt(i);
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        vowelsCount++;
    }

    System.out.print(vowelsCount);
    
  }
}