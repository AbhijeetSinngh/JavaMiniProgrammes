package core;

public class Basketball implements Playable{

	@Override
	public void play() {
		System.out.println("lets play basketball");
		
	}
	public void comPlay() {
		System.out.println("Play stopped due to rain");
	}
/*public void play() {
	System.out.println();
}*/
	@Override
	public void dontPlay() {
		// TODO Auto-generated method stub
		System.out.println("Rain haults play");
	}
}
