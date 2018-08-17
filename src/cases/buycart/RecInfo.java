package cases.buycart;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RecInfo {

	private int id;
	private String addr;
	private String recName;
	
	private boolean isDefault = false;

	public RecInfo(int id, String addr, String recName , boolean isDefault) {
		this.id = id;
		this.addr = addr;
		this.recName = recName;
		this.isDefault = isDefault;
	}



}
