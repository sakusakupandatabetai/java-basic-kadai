package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18{
	public KatoIchiro_Chapter18() {
	setGivenName("一郎");
	
	}
	
	@Override
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
		
	}
	
	//mainメソッドを追加
	public static void main(String[] args) {
		KatoIchiro_Chapter18 katoIchiro = new KatoIchiro_Chapter18();
		katoIchiro.execIntroduce();
	}

}
