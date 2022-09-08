import java.util.Scanner;

public class oerations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=20,b=5,c;
		System.out.println("Enter u r choice");
		int ch= sc.nextInt();
		switch(ch)
		{
			case 1:
			c=a+b;
			System.out.println("sum is\t"+c);
			break;
			case 2:
			c=a-b;
			System.out.println("sub is\t"+c);
			break;
			case 3:
			c=a*b;
			System.out.println("mul is\t"+c);
			break;
			case 4:
			c=a/b;
			System.out.println("div is\t"+c);
			break;
			default:
			System.out.println("invalid");
			break;
		}

	}

}
