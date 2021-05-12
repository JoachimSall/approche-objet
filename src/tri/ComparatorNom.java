package tri;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville> {

	@Override
	public int compare(Ville v1, Ville v2) {
		// TODO Auto-generated method stub
		if (v1.getNom().compareTo(v2.getNom()) > 0) {
			return 1;
		} else if (v1.getNom().compareTo(v2.getNom()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}
