package kadai_018;


public class KatoHanako_Chapter18 extends Kato_Chapter18{
	public KatoHanako_Chapter18() {
	setGivenName("花子");
	
	}
	
	@Override
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
		
	}
	
	//mainメソッドを追加
	public static void main(String[] args) {
		KatoHanako_Chapter18 katoHanako = new KatoHanako_Chapter18();
		katoHanako.execIntroduce();
	}

}

