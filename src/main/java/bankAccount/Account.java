package bankAccount;

public class Account {

	private String name;
	private double funds;
	private int creditScore;
	
	
	public Account() {
		name = "";
	}
	
	public Account(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFunds() {
		return funds;
	}

	public void setFunds(double funds) {
		this.funds = funds;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	
	public void withdraw(double w) {
		if((funds - w) >= 0 ) {
			funds -= w;
		}
	}
	
	public void deposit(double d) {
		if(d > 0) {
			funds += d;
		}
	}
	
	
	public String getCreditStanding() {
		if (creditScore > 850) {
			return "Invalid Credit Score";
		}
		else if (creditScore >= 720) {
			return "Excellent";
		}
		else if (creditScore >= 690) {
			return "Good";
		}
		else if (creditScore >= 630) {
			return "Fair";
		}
		else if (creditScore >= 300) {
			return "Bad";
		}
		else {
			return "Invalid Credit Score";
		}
	}
	
}
