package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18{
	public KatoTaro_Chapter18() {
	setGivenName("太郎");
	
	}
	
	@Override
	public void eachIntroduce() {
		System.out.println("Javaが得意です");
		
	}
	
	//mainメソッドを追加
	public static void main(String[] args) {
		KatoTaro_Chapter18 katoTaro = new KatoTaro_Chapter18();
		katoTaro.execIntroduce();
	}

}
