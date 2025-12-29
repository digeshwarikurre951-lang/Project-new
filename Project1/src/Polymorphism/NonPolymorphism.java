package Polymorphism;


public class NonPolymorphism {

	public static void main(String[] args) {
		
	JavaTrainer1 jt = new JavaTrainer1();
		AptiTrainer1 at = new AptiTrainer1();
		TestingTrainer1 tt = new TestingTrainer1();
		jt.teach();
		at.teach();
		tt.teach();
	}
}
class Trainer1 {
	void teach() {
		System.out.println("Teacher teaches to students.");
	}
}

class JavaTrainer1 extends Trainer1 {
	void teach() {
		System.out.println("Teaches java .");
	}
	
}
class AptiTrainer1 extends Trainer1 {
	void teach() {
		System.out.println("Teaches Aptitude.");
	}

}
class TestingTrainer1 extends Trainer1 {
	void teach() {
		System.out.println("Teaches Testing.");
	}
	
}
