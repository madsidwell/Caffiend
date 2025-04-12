package ShippingService;

import java.util.*;

public class PaymentService {
	public List<String> paymentDetails;
	public List<String> transactionHistory;

	public PaymentService() {
		paymentDetails = new ArrayList<>();
		transactionHistory = new ArrayList<>();
	}

	public boolean paySeller(User user, Seller seller, double amount, PaymentInfo paymentInfo) {
		// Use the username from the User object
		String paymentRecord = "User " + user.username +
				" with card number " + paymentInfo.cardNo +
				" paid $" + amount + " to Seller " + seller.name;
		paymentDetails.add(paymentRecord);
		transactionHistory.add(paymentRecord);
		System.out.println(paymentRecord);
		return true;
	}

	public void depositProfit(Seller seller, double amount) {
		String depositRecord = "Deposited $" + amount + " to Seller " + seller.name + "'s account.";
		transactionHistory.add(depositRecord);
		System.out.println(depositRecord);
	}

	public void showTransactionHistory() {
		System.out.println("Transaction History");
		for (String record : transactionHistory) {
			System.out.println(record);
		}
	}
}
