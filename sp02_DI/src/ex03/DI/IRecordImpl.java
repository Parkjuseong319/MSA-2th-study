package ex03.DI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class IRecordImpl implements IRecord {
	private int kor, eng, com;
	
	@Override
	public int total() {
		return kor + eng + com;
	}

	@Override
	public float avg() {
		return total()/3.0f;
	}

}
