package extra.commons.predicate;


import extra.commons.support.EarthQuake;
import org.apache.commons.collections.Predicate;


public class MajorQuakePredicate implements Predicate {

	private Float intensity;   //4
	private Float depth;		//8
	
	public MajorQuakePredicate(Float intensity, Float depth) {
		this.intensity = intensity;
		this.depth = depth;
	}

	public boolean evaluate(Object object) {
		boolean satisfies = false;
		if(object instanceof EarthQuake) {
			EarthQuake quake = (EarthQuake) object;
			if(quake.getIntensity()> intensity && quake.getDepth()< depth) {
				satisfies = true;
			}
		}
		return satisfies;
	}

	


}
