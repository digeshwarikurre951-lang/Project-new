package Polymorphism;


public class TrainerApp {

	public static void main(String[] args) {
		Trainer t;
		t = new JavaTrainer();
		t.teach();
		t = new AptiTrainer();
		t.teach();
		t = new TestingTrainer();
		t.teach();
		
	}
}
class Trainer {
	void teach() {
		System.out.println("Teacher teaches to students.");
	}
}

class JavaTrainer extends Trainer {
	void teach() {
		System.out.println("Teaches java .");
	}
	
}
class AptiTrainer extends Trainer {
	void teach() {
		System.out.println("Teaches Aptitude.");
	}

}
class TestingTrainer extends Trainer {
	void teach() {
		System.out.println("Teaches Testing.");
	}
	
}
