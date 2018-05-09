package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します
		Book[] books = FileReaderClass.readBookDataFile();

		System.out.println("探したい本のタイトル（又はその一部）を入力してください");

		java.util.Scanner scanner = new java.util.Scanner(System.in);   // ←入力型プログラムです
		String line = scanner.nextLine();                                // ←コマンドプロンプトで入力した文字列がlineに代入される

		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください
		for(int i = 0; i < books.length; i++) {
			if(books[i].title.contains(line)) {
				System.out.println(books[i].dispBookInfo());
			}

		}
		
		
		// ↓↓↓　containsの使い方のメモ　↓↓↓
		
        //*Stringの宣言
//        String str = "appleorangemelon";
        
        //*指定した文字列が存在するか確認
//        if (str.contains("orange"))
//        {
//            System.out.println("It contains oranges");
//       }
		
		
		

	}
}
