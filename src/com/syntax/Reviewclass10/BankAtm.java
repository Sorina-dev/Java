package com.syntax.Reviewclass10;

public abstract class BankAtm {
	// depositMoney
		// depostCheck
		// withdrawMoney
		// transferMoney
		// getBalance
		
		// our focus is what to do
		// not how to
		
		/* AbstractClass
		 * 
		 * 0-100% abstraction with abstract class
		 
		 	1. Create a class with abstract keyword
		 	2. Create abstract method or concrete methods inside this class
		 	3. Create another class and extend it to this class
		 	4. implement all abstract method inside this class
		*/
		
		double checkingFund;
		double savingFund;
		
		public BankAtm(double checkingFund, double savingFund) {
			this.checkingFund=checkingFund;
			this.savingFund=savingFund;
		}
		
		public abstract void depositMoney(String accountType, double amount);
		public abstract void depositCheck(String accountType, double amount);
		
//		abstract void method1();
		
		// atm should not allow us to withdraw money in multiples of 1 or 5 five dollar
		// if amount entered is smaller than our money in the bank --> Insuffiecient fund.
		// 341.00 --> 
		public void withdrawMoney(String accountType, double amount) {
			if(amount%10!=0) {
				System.out.println("Amount must be multiples of 10$");
			}else {
				double a=0;
				if(accountType.equals("checking")) {
					a=checkingFund;
				}else if(accountType.equals("saving")) {
					a=savingFund;
				}			
				
				if(amount>a) {
					System.out.println("Insufficient Fund");
				}else {
					System.out.println(amount+" is withdrawn form your " + accountType);
				}
			}
		}
		
		// we have two abstract (unimplemented methods) and one concrete (implemented)
		//  2/3 of methods are abstract method --> 67% abstraction

}
class ChaseBankAtm extends BankAtm{
	
	public ChaseBankAtm(double checkingFund, double savingFund) {
		super(checkingFund, savingFund);  // invokes super class constructor
	}
	/* We have two options
 	1. Add unimplemented method and write a logic for these methods --> Make this concrete
 	2. Make ChaseBankAtm class abstract	 	
 */
	
	
	@Override
	public void depositMoney(String accountType, double amount) {
		
		System.out.println(amount+"$ is deposited to your "+accountType + " account");
		
		if(accountType.equals("checking")) {
			checkingFund+=amount;
		}else if(accountType.equals("saving")) {
			savingFund+=amount;
		}
	}
	@Override
	public void depositCheck(String accountType, double amount) {
		System.out.println((amount*0.99)+"$ is deposited to your "+ accountType+ " account");
		
		if(accountType.equals("checking")) {
			checkingFund+=amount*0.99;
		}else if(accountType.equals("saving")) {
			savingFund+=amount*0.99;
		}
	}
}

