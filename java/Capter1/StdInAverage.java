/*
* @Author: Zhang Guohua
* @Date:   2018-09-30 18:36:07
* @Last Modified by:   zgh
* @Last Modified time: 2018-10-07 18:21:45
* @Description: create by zgh
* @GitHub: Savour Humor
*/
import edu.princeton.cs.algs4.StdIn;-
import edu.princeton.cs.algs4.StdOut;
// 标注输入
public class StdInAverage{
	public static void main(String[] args) {
		// 取所有数的平均值
		// 
		double sum = 0.0;
		int cnt = 0;
		while(!StdIn.isEmpty()){ 
			// 读取一个数，并累加
			StdOut.print(StdIn.readObject());
			sum += StdIn.readDouble();
			cnt++;
		}
		double avg = sum/cnt;
		StdOut.printf("Average is %.5fn", avg);
	}
}