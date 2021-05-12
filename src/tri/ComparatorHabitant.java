package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {
	
	@Override
	public int compare(Ville v1, Ville v2) {
		// TODO Auto-generated method stub
		if (v1.getNb() > v2.getNb()) {
			return 1;
		} else if (v1.getNb() < v2.getNb()) {
			return -1;
		} else {
			return 0;
		}
	}

}
