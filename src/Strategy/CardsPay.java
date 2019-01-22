package Strategy;

public class CardsPay implements Payment {

	String cardNumber;

	public CardsPay(String cardNumber){
		this.cardNumber = cardNumber;
	}

	@Override
	public void toPay() {
		if (checkNumber(cardNumber) && checkAvaliableMoney())
			System.out.println("Pay card is succesfull");
	}

	public boolean checkNumber(String accountNumber) {
		// check cardNumber of card
		// if failed check then return false
		return true;
	}

	public boolean checkAvaliableMoney() {
		// check money in the account
		// if failed check then return false
		return true;
	}

}
