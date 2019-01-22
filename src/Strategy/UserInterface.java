package Strategy;

public class UserInterface {

	private String login;
	private String password;
	private boolean isLogin = false; 
	
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean auth(String login, String password) {
		//check login and password of user	
		//if failed check then return isLogin = false
		isLogin = true;
		return isLogin;
	}
	
	public void toPay(Payment payment) {
		if(this.isLogin)
		payment.toPay();
	}
}
