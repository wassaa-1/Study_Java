package step05oop.step09interface.basic;

public class Shark extends Unit implements Horrible {
	public void move(int x, int y) {
		System.out.printf("위치를 (%d, %d)만큼 이동", x, y);
	}

	@Override
	public void bit(Unit target) {
		System.out.println(target + "을 아그작");
		
	}
}
