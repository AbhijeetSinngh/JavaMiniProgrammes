package core;

public class Football implements Playable {
	String name;
	@Override
	public void play() {
		System.out.println("Hello");
	}
	@Override
	public void dontPlay() {
		// TODO Auto-generated method stub
		System.out.println("fRain haults play");
	}
	

}
