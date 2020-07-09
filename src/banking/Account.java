package banking;

class Account {
	
	private String type;
	private double amount;
	
	public Account(String type){
		this.type = type;
	}
	
	protected void setType(String type) {
		this.type = type;
	}
	
	protected String getType() {
		return this.type;
	}
	
	protected void setAmount(double amount) {
		this.amount = this.amount + amount;
	}
	
	protected double getAmount() {
		return this.amount;
	}
	
	protected void withdraw(double amount, String type) {
		if(this.amount - amount < 0 && type =="savings") {
			System.out.println("You do not have enough funds to withdraw!!!!!!!");
		} else {
			this.amount = this.amount - amount;
		}
		
	}

}
