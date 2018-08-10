package cases.testing.answer;

import lombok.Data;

@Data
public class BlankAnswer extends Answer {

	private String[] contents;

	public BlankAnswer(String... contents) {
		
		this.contents = contents;
	}


}
