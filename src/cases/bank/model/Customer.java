package cases.bank.model;

import lombok.Data;

@Data
public class Customer {

	private String name;

	public Customer(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return getName();
	}
	
}
