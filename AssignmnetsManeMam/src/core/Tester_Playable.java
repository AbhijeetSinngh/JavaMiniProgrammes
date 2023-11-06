package core;

public class Tester_Playable  {
	public static void main(String[] args) {
		
	
Basketball play=new Basketball();
   Football foot=new Football();
   play.comPlay();
   play.dontPlay();
   play.letsPlay();
   foot.name="Abhijeet";
   foot.dontPlay();
  System.out.println(  foot.hashCode());
   System.out.println(play.hashCode());
   

	}
}
