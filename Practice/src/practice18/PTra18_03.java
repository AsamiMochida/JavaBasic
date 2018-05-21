/*
 * PTra18_03.java
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

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("file/BestElevenCandidate.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		ArrayList<Player> playerList = new ArrayList<>();
		while (scanner.hasNext()) {
			Player player = new Player();
			String line = scanner.nextLine();
			String[] strlist = line.split(",");
			player.setPosition(strlist[0]);
			player.setName(strlist[1]);
			player.setCountry(strlist[2]);
			player.setTeam(strlist[3]);
			playerList.add(player);
		}
		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
//		メモ：ArrayListの中身の箱をremove(除外)すると、消えた箱の番号も箱ごと消えるので、次に控えていた箱の番号が消えた番号がを引き継いでしまう。(なくなった分詰められてしまうから数が変わる)
//		      ↓だからArrayListの後ろから消したいワードを探していくとよし
		for(int i = playerList.size() -1;i >= 0; i--) {
			if(playerList.get(i).getTeam().equals("レアル・マドリード") || playerList.get(i).getTeam().equals("バルセロナ")) {
				playerList.remove(i);
			}
		}
		// ★ 削除後のArrayListの中身を全件出力してください
		for (Player str : playerList) {
			System.out.println(str.toString());
		}

	}
}
