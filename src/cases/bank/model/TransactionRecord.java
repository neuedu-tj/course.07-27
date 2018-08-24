package cases.bank.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Data
@RequiredArgsConstructor
@ToString
public class TransactionRecord {
	
	@NonNull private Account from;
	@NonNull private Account to;
	@NonNull private TransactionRecord transactionRecord;

}
