package classwork18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;



public class MainColl {

	public static void main(String[] args) {

		
		MyLinkedList myList = new MyLinkedList();
		myList.add(10);
		myList.add(23);
		myList.add(43);
		myList.add(67);
		//System.out.println(myList.toString());
		//System.out.println(myList.get(2));
		myList.add(1, 44);
		//System.out.println(myList.toString());
		myList.add(0, 44);
		//System.out.println(myList.toString());
		
		Set<Integer> hs = new HashSet<>();
		Set<Integer> lhs = new LinkedHashSet<>();
		Set<Integer> ts = new TreeSet<>();
		System.out.print("RND[" );
		for (int i = 0; i < 10; i++) {
			Integer temp = (int)(Math.random() * 100);
			System.out.print(temp + ", ");
			hs.add(temp);
			lhs.add(temp);
			ts.add(temp);
		}
		//System.out.println();
		//System.out.println("hs " + hs);
		//System.out.println("lhs" + lhs);
		//System.out.println("ts " + ts);
		
		Iterator<Integer> it = lhs.iterator();
		while(it.hasNext()) {
			if(it.next() % 2 == 0) {
				it.remove();
			}
		}
		System.out.println();
		
		System.out.println("lhs" + lhs);
		
		ts.removeAll(lhs);
		System.out.println("ts " + ts);
		lhs.add(12);
		lhs.retainAll(ts);
		System.out.println("lhs" + lhs);
		lhs.addAll(hs);
		System.out.println("lhs" + lhs);
		
		
		Set<Pudge> treeSet = new TreeSet<>(new PudgeComparator());
		Pudge p1 = new Pudge(100, "Sergij");
		Pudge p2 = new Pudge(12, "Vitalij");
		
		treeSet.add(p1);
		treeSet.add(p2);
		System.out.println("ts " + treeSet.size());
		
	}

}
