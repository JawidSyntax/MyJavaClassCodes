 obpackage com.class25;

public class TestPayment {
	
	public static void main(String[] args) {
	
		Payment parent = new Payment();
		parent.makePayment();
		
		MasterCard mc = new MasterCard();
		mc.makePayment();
		
		Visa visa = new Visa();
		visa.makePayment();
		visa.annualFee();
		
		//achieving run time polymorphism
		//pay is our reference variable and payment is our type
		//new MasterCard(); - creating an object
		Payment pay = new MasterCard();
		pay.closePayment();
		pay.makePayment();
		
		Payment pay1 = new Visa();
		pay1.closePayment();
		pay1.makePayment();
		//pay1.annualpayment(); Method is undefined child methods are not accessable through up casting. since these are specific child property.
		
	}

}
