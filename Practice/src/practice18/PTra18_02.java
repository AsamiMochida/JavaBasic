/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		Scanner scanner = null;

		try {
			scanner = new Scanner(new File("file/BestElevenCandidate.csv"));
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		ArrayList<Player> playerList = new ArrayList<>();
		while (scanner.hasNext()) {
			Player player = new Player();
			String line = scanner.nextLine();
			// ★ 1行ごとにArrayListに格納してください
			String[] strlist = line.split(",");
			player.setPosition(strlist[0]);
			player.setName(strlist[1]);
			player.setCountry(strlist[2]);
			player.setTeam(strlist[3]);
			playerList.add(player);

		}

		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう
		for (Player str : playerList) {
			System.out.println(str.toString());
		}
	}
}
