package interface1;

public class 최예나 implements Move,Attack{

	@Override
	public void moving() {
		System.out.println("예나가 360도 회전하며 옆으로간다.");
		
	}

	@Override
	public void target() {
		System.out.println("예나가 경림이를 노려보았다.");
		
	}

}
