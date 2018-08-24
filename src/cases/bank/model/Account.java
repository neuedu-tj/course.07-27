package cases.bank.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Account {

	private Customer customer;

	private String card;
	private String pwd;

	private BigDecimal balance;

	public Account() {	}

	public Account(Customer customer, String card, String pwd) {
		this.customer = customer;
		this.card = card;
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Account [customer=" + customer + ", card=" + card + ", pwd=" + pwd + "]";
	}



}
