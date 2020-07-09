package banking;

class Checking extends Account{
	protected double overDraftFees;
	protected double overDraftFee;
	

	public Checking() {
		super("checking");
		
		this.overDraftFees = 0.00;
		this.overDraftFee = 10.00;
	}
	
	public void setOverDraftFees() {
		this.overDraftFees = this.overDraftFees + this.overDraftFee;
	}
	
	public double getOverDraftFees() {
		return this.overDraftFees;
	}

}
