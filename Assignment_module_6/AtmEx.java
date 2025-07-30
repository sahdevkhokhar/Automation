package Assignment_module_6;

import java.util.Scanner;

public class AtmEx 
{
public static void main(String[] args)

{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Withdraw Amount");

int balance = 2000,Debitamt;
int RemainingAmt,error;
Debitamt = sc.nextInt();
RemainingAmt =  balance-Debitamt;
error = Debitamt-balance;


if(Debitamt<=2000)
{
System.out.println("Your transaction is successful");
System.out.println("Your Remaining Balance is :" +RemainingAmt);

}
else
{
System.out.println("Sorry insufficient balance you need more "+error+"to perform this transaction");
//System.out.println("");
}
	
}
	
	
}
