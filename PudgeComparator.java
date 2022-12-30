package classwork18;

import java.util.Comparator;

public class PudgeComparator implements Comparator<Pudge> {

	@Override
	public int compare(Pudge o1, Pudge o2) {
		return o1.getLevel() - o2.getLevel();
	}

}
