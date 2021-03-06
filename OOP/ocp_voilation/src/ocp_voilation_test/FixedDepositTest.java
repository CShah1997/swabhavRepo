package ocp_voilation_test;

import com.techlabs.ocp_voilation.FestivalType;
import com.techlabs.ocp_voilation.FixedDeposit;

public class FixedDepositTest {
	
	public static void main(String args[])
	{
		FixedDeposit fd1=new FixedDeposit("001", "Dev Acc.", 10000, 4, FestivalType.HOLI);
		FixedDeposit fd2=new FixedDeposit("002", "Chirag Acc.", 20000, 1, FestivalType.NEW_YEAR);
		FixedDeposit fd3=new FixedDeposit("003", "Raj Acc.", 10500, 3, FestivalType.NORMAL);
		
		System.out.println(fd1.calculateSimpleInterest());
		System.out.println(fd2.calculateSimpleInterest());
		System.out.println(fd3.calculateSimpleInterest());
	}

}
