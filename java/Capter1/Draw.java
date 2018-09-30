/*
* @Author: Zhang Guohua
* @Date:   2018-09-30 19:15:53
* @Last Modified by:   zgh
* @Last Modified time: 2018-09-30 19:21:32
* @Description: create by zgh
* @GitHub: Savour Humor
*/
import edu.princeton.cs.algs4.StdDraw;
public class Draw {
	
	// 第一画，坐标曲线
	private static void draw1(){
		int N = 100;
		StdDraw.setXscale(0, N);
		StdDraw.setYscale(0, N*N);
		StdDraw.setPenRadius(.01);
		for(int i = 1; i <= N; i++){
			StdDraw.point(i, i);
			StdDraw.point(i, i*i);
			StdDraw.point(i, i*Math.log(i));
		}
	}

	

	public static void main(String[] args) {
		draw1();
	}
	
}