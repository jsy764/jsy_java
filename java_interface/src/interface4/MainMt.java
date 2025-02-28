package interface4;

public class MainMt {

	public static void main(String[] args) {
		RemoteCon[] rcon = new RemoteCon[] {
				new Light(), new Tv(),
				new Aircon()
		};
		for(RemoteCon con : rcon) {
			con.turnon();
			con.turnoff();
		}
	}

}
