/*
* @Author: Zhang Guohua
* @Date:   2018-09-27 18:58:14
* @Last Modified by:   zgh
* @Last Modified time: 2018-09-27 19:07:03
* @Description: create by zgh
* @GitHub: Savour Humor
*/

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

// 格式化输出
public class Printf{

	//  输入 Printf 5 100.0 200.0
	//  一个空格一个参数
	public static void main(String[] args) {
		//  打印 N 个 (lo, hi) 之间的随机值
		int N = Integer.parseInt(args[0]);
		double lo = Double.parseDouble(args[1]);
		double hi = Double.parseDouble(args[2]);

		for(int i = 0; i < N; i++){
			double x = StdRandom.uniform(lo, hi);

			// 输出
			StdOut.printf("%.2f\n", x);
		}
	}
}	