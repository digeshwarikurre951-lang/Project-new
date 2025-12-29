package Inheritance;
public class PlayerApp{
	public static void main(String[] args) {
		FootBall fb = new FootBall("Danish",22,"Male",25,54);
		System.out.println(fb.getName());
		System.out.println(fb.getAssist());
		
		Cricket ct = new Cricket("Danish",22,"Male",25,54);
		System.out.println(ct.getName());
		System.out.println(ct.getScore());
	}
}
