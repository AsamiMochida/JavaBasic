/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

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

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		Collections.shuffle(playerList);

		int gkCount = 0;
		int dfCount = 0;
		int mfCount = 0;
		int fwCount = 0;

		for (int i = 0; i < playerList.size(); i++) {

			if(playerList.get(i).getPosition().equals("GK")) {
				if(gkCount < 1) {
					System.out.println(playerList.get(i));
					gkCount += 1;
				}
			}

			if(playerList.get(i).getPosition().equals("DF")) {
				if(dfCount < 4) {
					System.out.println(playerList.get(i));
					dfCount += 1;
				}
			}
			if(playerList.get(i).getPosition().equals("MF")) {
				if(mfCount < 4) {
					System.out.println(playerList.get(i));
					mfCount += 1;
				}
			}
			if(playerList.get(i).getPosition().equals("FW")) {
				if(fwCount < 2) {
					System.out.println(playerList.get(i));
					fwCount += 1;
				}
			}
		}
		// 作ったカウントを、そのポジションの選手を表示したタイミングで増やす。表示するときにカウントが○ヨリチイサイバアイミタイカンジデツクッテネ
	}
}
