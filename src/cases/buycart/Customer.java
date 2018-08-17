package cases.buycart;

import lombok.Data;
import lombok.ToString;

import java.util.Arrays;

@Data
@ToString
public class Customer {
	
	private int id;
	private String name;
	
	private RecInfo[] recInfos;
	

	public Customer() {
		
	}

	public Customer(int id, String name, RecInfo[] recInfos) {
		
		this.id = id;
		this.name = name;
		this.recInfos = recInfos;
	}

	
	

}
