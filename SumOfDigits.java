import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n,sum=0,a;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=sc.nextInt();
		
		while(n>0)
		{
		    a=n%10;
		    sum=sum+a;
		    n=n/10;
		}
		System.out.println("Sum of digit of number:"+sum);
	}
}
