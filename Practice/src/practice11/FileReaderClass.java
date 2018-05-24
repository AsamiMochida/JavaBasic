package practice11;

/**
 * ファイルの読み込みを行います。
 * @author LIKEIT
 *
 */
public class FileReaderClass {

	private FileReaderClass() {
		/* インスタンス化を禁止 */
	}

	/**
	 * 本の情報をBook型配列で返す。
	 */
	public static Book[] readBookDataFile() {

		Book[] bookList = new Book[4];

		String[][] bookInfoList = {
					{"スッキリわかるJava入門","中山清喬／国本大悟","2600","657","インプレス"},
					{"Java言語プログラミングレッスン","結城浩","2400","379","ソフトバンク"},
					{"オブジェクト指向設計実践ガイド","Sandi Metz","3280","303","技術評論社"},
					{"リーダブルコード","Dustin Boswell／Trevor Foucher","2400","237","O","REILLY"}
				};

		for (int i = 0; i < bookList.length; i++) {
			bookList[i] = new Book(
				bookInfoList[i][0],
				bookInfoList[i][1],
				Integer.parseInt(bookInfoList[i][2]) ,
				Integer.parseInt(bookInfoList[i][3]),
				bookInfoList[i][4]
			);
		}

		return bookList;
	}
}

//package practice11;
///*
// * ReadFileClass.java
// *   作成	IT-College	2016
// *------------------------------------------------------------
// * Copyright(c) Rhizome Inc. All Rights Reserved.
// */
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
///**
// * ファイルの読み込みを行います。
// * @author Rhizome
// *
// */
//public class FileReaderClass {
//
//	private FileReaderClass() {
//		/* インスタンス化を禁止 */
//	}
//
//	/**
//	 * bookData.csvを読み込み、Bookの配列として取得します。
//	 * @return	bookDataの内容をBookインスタンスの配列として変換した形
//	 */
//	public static Book[] readBookDataFile() {
//		String[] fileRow = new String[65536];	/* とりあえずたくさん確保：List<String>を使いたい */
//		Book[] bookList = null;				/* 初期値：List<Book>を使いたい */
//		int index = 0;
//
//		try(Scanner scanner = new Scanner(new File("csv/bookData.csv"))) {
//			while(scanner.hasNext()) {
//				fileRow[index] = scanner.nextLine();
//				index++;
//			}
//
//			bookList = new Book[index];
//			for (int i = 0; i < index; i++) {
//				String[] rowArray = fileRow[i].split(",");
//				bookList[i] = new Book(
//								 rowArray[0]	// 本のタイトル
//								,rowArray[1]	// 著者
//								,Integer.parseInt(rowArray[2])	// 定価
//								,Integer.parseInt(rowArray[3])	// ページ数
//								,rowArray[4]	// 出版社
//							);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("ファイルが見つかりませんでした");
//		} catch (Exception e) {
//			System.out.println("エラーが発生しました");
//		}
//
//		return bookList;
//	}
//}
