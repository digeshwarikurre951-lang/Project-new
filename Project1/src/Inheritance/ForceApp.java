package Inheritance;

public class ForceApp {
	public static void main(String[] args) {
		Army a = new Army();
		Navy n = new Navy();
		Air ai = new Air();
		
		System.out.println("<<<<<<<<<<<<<<<A R M Y>>>>>>>>>>>>>>>");
		a.job();
		a.protect();
		a.useTank();
		
		System.out.println("<<<<<<<<<<<<<<<N A V Y>>>>>>>>>>>>>>>");
		
		n.job();
		n.protect();
		n.useShips();
		System.out.println("<<<<<<<<<<<<<<<A I R F O R C E>>>>>>>>>>>>>>>");
		
		ai.job();
		ai.protect();
		ai.useJets();
	}
}

class Force {
	void job() {
		System.out.println("To protect nation ");
	}
	void protect() {
		System.out.println("Protect Country");	
	}
}

class Army extends Force {
	void protect() {
		System.out.println("Protect land");	
	}
	void useTank() {
		System.out.println("Army uses tanks");
	}
}
class Navy extends Force {
	void protect() {
		System.out.println("Protect ocean");	
	}
	void useShips() {
		System.out.println("Navy uses distroyers");
	}

}

class Air extends Force {
	void protect() {
		System.out.println("Protect Ai waysr");	
	}
	void useJets() {
		System.out.println("Airforce uses Rafale");
	}

}

