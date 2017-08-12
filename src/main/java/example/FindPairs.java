package example;

import java.util.ArrayList;
import java.util.List;

public class FindPairs {
	
	public static void main(String[] args) {
		int[] x = {1,2,3,4,5};
		FindPairs fp = new FindPairs();
	    List<Pair> li = fp.findPairsWhoseSumEqualToGivenNumber(x, 5);
	    System.out.println(li);
	}
	
	public List<Pair> findPairsWhoseSumEqualToGivenNumber(int[] a, int num) {
		List<Pair> al = new ArrayList<>();
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if((a[i] + a[j]) == num) {
					Pair p = new Pair();
					p.setFirstNum(a[i]);
					p.setSecondNum(a[j]);
					al.add(p);
					 
				}
			}
		}
		return al;
	}
}
