package interface4;

public class Tv implements RemoteCon{
	
	@Override
	public void turnon() {
		System.out.println("tv가 켜졌다.");
		
	}

	@Override
	public void turnoff() {
		System.out.println("tv가 꺼졌다.");
		
	}

}
