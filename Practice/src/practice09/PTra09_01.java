package practice09;

import practice09.util.Util;

public class PTra09_01 {
	public static void main(String[] args) {
		String str = "この文字列をゆっくり表示したい";
		Util.dispMessageSlowly(str, 500);

		// ★ 変数strを、Util内のメソッドを用いて0.5秒間隔で表示させなさい (message➡表示する文字列, millisecond➡1000で1秒なので、半分は500)
		// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです
	}
}
