package vezbiNBroeviDeliviSo5SoFor;
import java.util.Scanner;
public class DelivostSoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		int i,n ;
		System.out.print("Do brojot: ");
		n = input.nextInt();
		
		
		for(i=1;i<=n;i++) {
			if (i % 5 == 0)
			{
			System.out.println(i);
			}	
		}
		
		

//		}
	}

}
