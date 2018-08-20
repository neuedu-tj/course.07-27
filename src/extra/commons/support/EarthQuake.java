package extra.commons.support;



import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.text.MessageFormat;

@Data
@ToString
public class EarthQuake {
	
	private String location;
	private float intensity;
	private float depth;
	private Date time;

}
