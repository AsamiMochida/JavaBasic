package practice13.common;

public class SuperHero extends Hero{

	Item equipment; //メモ：アイテム装備


	public Item getEquipment() {
		return equipment;
	}
	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}


/*	public SuperHero() {
		super();
	}
	メモ：●()の値はHeroの(25,10,7)と変わらない。そして「引数なし、処理内容なし」のコンストラクタ(デフォルトコンストラクタ)
	はコンパイル時に自動追加されるから記述はしなくていい。
*/


	public int attack() {
		return super.attack() + this.equipment.getAdditionalDamage();
	}
	/*↑メモ：CHaracterクラスのpowerはprivateでここでは使えないけど、powerが含まれているattackメソッドは利用できる。
	 *　　　　this.equipment.getAdditionalDamage()　は、スーパーヒーローのアイテム型のequipment(装備)フィールド名、アイテムクラスのゲットadditionalDamage(追加ダメージ(装備力))
	 */
}





/*
 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
 *
 * フィールド
 * 		equipment	:	common.Item　　　　←メモ：Item型の、equipmentというフィールドを作る
 * メソッド
 * 		attackメソッドをオーバーライドし、
 * 		powerに加えて、additionalDamage分を加算した値としてください
 *
 * 		equipmentのアクセサ
 */
