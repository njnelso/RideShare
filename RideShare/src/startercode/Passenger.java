package startercode;

public class Passenger extends User {
	
	// BUSINESS, PERSONAL, etc.
	private String accountType;

    public String getAccountType() {
        return accountType;
    }
    
    public void setAccountType() {
        this.accountType = accountType;
    }
}
