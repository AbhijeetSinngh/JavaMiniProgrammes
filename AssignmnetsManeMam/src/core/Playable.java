package core;

public interface Playable {
	public static final String game = "";
	 void play() ;/*{
		//System.out.println("Lets Play");
	};*/
	 void dontPlay();
	default void letsPlay() {
		System.out.println("PLaY aND sTUDY");
	}
	
	
	

}
