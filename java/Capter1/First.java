public class First {

	// 二分查找的递归实现

	private static int rank(int key, int[] a){
		return rank(key, a, 0, a.length -1);
	}

	private static int rank(int key, int[] a, int lo, int hi){
		// 如果key存在于 a[] 中，他的索引不会小于 lo 且不会 大于 hi
		if(lo > hi) return -1;
		int mid = lo + (hi - lo) / 2;
		if(key < a[mid]) return rank(key, a, lo, mid - 1);
		else if(key > a[mid]) return rank(key, a, mid + 1, hi);
		else return mid;
	}

	public static void main(String[] args){
		int [] a = {2, 4, 5, 7, 10, 23};
		System.out.println(rank(10, a));
	}
}