/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;
import practice13.common.Person;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		Employee[] employees = new Employee[3];

		for(int i =0; i < employees.length; i ++) {
			Employee employee1 = new Employee();
			employee1.setUserId(Person.BASE_NO + i);
			employee1.setUserNm(NAMEDATA[i]);
			employee1.setMail(MAILDATA[i]);
			employee1.setPassword(PASSDATA[i]);
			employee1.setDepartmentNm(QUATERDATA[0][i]);
			employee1.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][i]));

			employees[i] = employee1;
		}

		for (int i = 0; i < employees.length; i++) {
			System.out.println("ID:" + employees[i].getUserId());
			System.out.println("名前：" + employees[i].getUserNm());
			System.out.println("メールアドレス：" + employees[i].getMail());
			System.out.println("パスワード：" + employees[i].getPassword());
			System.out.println("部署：" + employees[i].getDepartmentNm());
			System.out.println("部署人数：" + employees[i].getDepartmentCnt());
			System.out.println("---------------------------------");
		}
	}
}
