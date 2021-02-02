import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int number;

    System.out.println("Enter a number to count up or down from: ");
    number = s.nextInt();

    System.out.println("Counting down!");
      if(number >= 0)
        for (int i = number; i >= 0; i--)
        System.out.println(i);
      else if (number < 0)
        for (int i = number; i <= 0; i++)
        System.out.println(i);        

    System.out.println("Blast Off!");
  }
}