import java.util.Scanner;
public class yourName
{
    public static void main(String[] args) {
    
       Scanner input = new Scanner(System.in);
       System.out.println("Please type in your name");
       String yourName = input.nextLine();
       System.out.println();
       System.out.print("The number of letters in your name is "+yourName.length());
        
    }
   

}
