package example;

public class FindPairs {

//	int firstNum;
//	int secondNum;
	public static void main(String[] args) {
		int[] x = {1,2,3,4,5};
		FindPairs fp = new FindPairs();
		fp.findPairsWhoseSumEqualToGivenNumber(x, 5);
	}
	
	public void findPairsWhoseSumEqualToGivenNumber(int[] a, int num) {
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if((a[i] + a[j]) == num) {
					int firstNum = a[i];
					 int secondNum = a[j];
					 System.out.println(firstNum + "," + secondNum);
				}
			}
		}
	}
}
