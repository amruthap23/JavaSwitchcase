import java.util.Scanner;
public class Switchcase 
{
	public static void main(String[] args) {
	    int choice;
		System.out.println("Choose one:\n 1.Hi\n 2.Hey\n 3.Hello\n ");
		Scanner s=new Scanner(System.in);
		choice =s.nextInt();
		switch(choice)
		{
		    case 1 : System.out.println("You said Hi");
		    break;
		    case 2 : System.out.println("You said Hi");
		    break;
		    case 3 : System.out.println("You said Hi");
		    break;
		    default : System.out.println("Invalid choice");
		}
	}
}
