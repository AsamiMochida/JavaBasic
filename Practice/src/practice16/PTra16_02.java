/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {


		boolean b = true;
		Boolean bb = b;
		System.out.println(b);

		byte by = 100;
		Byte byby = by;
		System.out.println(by);

		short s = 300;
		Short ss = s;
		System.out.println(s);

		char c = '日';
		Character cc = c;
		System.out.println(c);

		int i = 1000;
		Integer ii = i;
		System.out.println(i);

		long l = 2000L;
		Long ll = l;
		System.out.println(l);

		float f = 3.14F;
		Float ff = f;
		System.out.println(f);

		double d = 453.592;
		Double dd = d;
		System.out.println(d);


		// ★ 上記基本型を、それぞれのラッパークラスに代入してください
	}
}


/*　メモ：		System.out.println("基本型：" + Integer.toString(i));
				Integer i_wrapper = new Integer(i);
				System.out.println("Integerクラス型：" + i_wrapper.toString());
*/