package cases.bank.model;

import cases.bank.storage.AccountCache;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@RequiredArgsConstructor
public class Transaction {

	@NonNull private String card;
	@NonNull private BigDecimal amount;
	@NonNull private Date transferTime;
	@NonNull private String detail;

	private String targetName;

	public String getTargetName() {
		return AccountCache.getInstance().getAccounts().get(card).getCustomer().getName();
	}


	@Override
	public String toString() {
		return String.format("Transaction [card=%s, amount=%s, transferTime=%s, detail=%s]", card, amount, transferTime,
				detail);
	}
	
	

}
