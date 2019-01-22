package Strategy;

public class WebMoneyPay implements Payment {

	String webmoneyNumber;
	
	public WebMoneyPay(String webmoneyNumber){
		this.webmoneyNumber = webmoneyNumber;
	}
	
	@Override
	public void toPay() {
		if(checkNumber(webmoneyNumber) && checkAvaliableMoney())
		System.out.println("Pay WebMoney is succesfull");		
	}
	
	public boolean checkNumber(String accountNumber) {
		//check webmoneyNumber of account WebMoney
		//if failed check then return false
		return true;
	}
	
	public boolean checkAvaliableCurrency() {
		//check avaliable currency in the account
		//if failed check then return false
		return true;
	}
	
	public boolean checkAvaliableMoney() {
		if(checkAvaliableCurrency())
		commissionInterest();
		//check money in the account
		//if failed check then return false
		return true;
	}
	
	public double commissionInterest() {
		double money = 10;
		//commission for transfer
		return money;
	}
}
