package travelplannerpcm.datatypes;

public class CreditCardDetails {
	
	private int creditCardNumber;
	private String provider;
	private int lastDigits;
	
	public CreditCardDetails(String provider, int creditCardNumber) {
		this.provider = provider;
		this.creditCardNumber = creditCardNumber;
		this.lastDigits = creditCardNumber / 1000;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getLastDigits() {
		return lastDigits;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}
}