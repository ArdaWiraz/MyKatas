import java.util.Scanner;

public class BitCounting {

  public static void main(String[] args){
    // Show me the code!
    System.out.println("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    String s = Integer.toBinaryString(n);
    char[] c = s.toCharArray();
    int q = 0;
    
    for (int i = 0; i < c.length; i++){
      if (c[i] == '1')
        q++;
    }
    
    System.out.print(q);
  }
  
}