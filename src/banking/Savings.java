package banking;

class Savings extends Account {
	protected double interest;
	protected double interestAmount;

	public Savings() {
		super("savings");
		
		this.interest = 3.451;
		this.interestAmount = 0.00;
	}
	
	private String formatPercentage() {
		return String.format(".1%", this.interest);
	}
	
	public void setInterestManually(double interest) {
		this.interest = interest;
	}
	
	public void setInterest() {
		double amount = this.getAmount();
		this.interestAmount = amount + this.interest * amount;
	}
	
	public String getInterestAmount(){
		String percent = this.formatPercentage();
		return percent;
	}

}
