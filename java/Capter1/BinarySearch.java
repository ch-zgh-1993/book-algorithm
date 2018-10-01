/*
* @Author: Zhang Guohua
* @Date:   2018-09-30 19:24:08
* @Last Modified by:   zgh
* @Last Modified time: 2018-10-01 19:10:58
* @Description: create by zgh
* @GitHub: Savour Humor
*/
import java.utils.Arrays;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
// 二分查找
// 
// 本例中，程序包导入失败，，，
// 查了是版本的问题，但是因要用 1.8 写方法，故暂不更改了。
// 
// 
// 
public class BinarySearch {
	public static int rank(int key, int[] a)	{
		// 有序数组
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi){// 小于等于才可以一直查找
			int mid = lo + (hi-lo)/2;
			if(key < mid) hi = mid - 1;
			else if(key > mid) lo = mid + 1;
			else return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] list = In.readInts(args[0]);
		Arrays.sort(list);
		while(!StdIn.isEmpty()){
			int key = StdIn.readInt();
			if(rank(key, list) < 0){
				StdOut.printf("输出的是不存在 ", key);
			}
		}
	}
}