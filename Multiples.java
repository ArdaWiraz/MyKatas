import java.util.Scanner;

public class Multiples {

  public static void main(String[] args) {
    //TODO: Code stuff here
    System.out.println("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    int sum = 0;
    for(int i = 1; i < number; i++){
      if (i%3==0 && i%5==0)
        sum = sum + i;
      else if (i%3==0 || i%5==0)
        sum = sum + i;
    }
    System.out.print(sum);
  }
}