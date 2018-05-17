/*
 * PTra15_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Java2Month;
import practice15.common.Room;

public class PTra15_02 {
	public static void main(String[] args) {

		Room room = new Java2Month();

		// roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください
		// メモ：分かっていないといけないポイント！●Room型にgetCurriculumメソッドはない。Java2Monthクラスにあるため、(p4おおまかに捉える際の制約　の所)
		Java2Month jRoom = (Java2Month)room;
		// ↑メモ：キャスト演算子を使い、強制的に型変換をする

		jRoom.getCurriculum();

		// 取得したカリキュラム情報を全て出力してください
		String[] j = new String[7];
		for(int i = 0; i < j.length; i++) {
			j = jRoom.getCurriculum();
			System.out.println(j[i]);
		}
	}
}
