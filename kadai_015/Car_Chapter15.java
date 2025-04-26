package kadai_015;

public class Car_Chapter15 {
    private int gear = 1; //１～５のギアを表現
    private int speed = 10;//ギアチェンジ後の速度
    
	public void gearChange(int afterGear) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ギア" + this.gear + "から"+ afterGear +"に切り替えました");
		this.gear = afterGear;
		
		
		//ギアに応じた速度を取得
		this.speed = switch (this.gear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		
		};

}
    public void run() {
    System.out.println("速度は時速" + this.speed + "kmです");
    
    }

    public static void main(String[] args) {
    	Car_Chapter15 car = new Car_Chapter15();
    	car.gearChange(3);
    	car.run();
    }
    }
    
