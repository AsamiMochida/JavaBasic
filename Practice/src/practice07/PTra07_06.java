package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください

		// ↓小数点で合計平均値をだすためにintではなくdouble(ダブル)で
		// 　繰り返しを避けるため、sumとcountはfor文から外して書く
		double sum = 0;
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
//				System.out.println("array[" + i + "][" + j + "]=" + array[i][j]);
				sum += array[i][j];
				count++;
			}
		}
		System.out.println("合計値:" + sum);
		System.out.println("値数:" + count);
		System.out.println("平均値:" + (sum/count));
	}
}

//for文以降のメモ
//　i < array.lengthはarrayの配列の数が２つより小さいという条件
//　中のfor内のarray[i].lengthはarrayの要素の数