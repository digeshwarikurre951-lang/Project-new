package Inheritance;

public class Player {
	String name;
	int age;
	String gender;
}
 class FootBall extends Player{
	int goals;
	int assist;
	public FootBall(String name,int age,String gender, int goals,int assist) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.goals = goals;
		this.assist = assist;
	}
	public int getGoal() {
		return goals;
	}
	public int getAssist() {
		return assist;
	}
	public String getName() {
		return name;
	}
	
	class Cricket extends Player{
		int score;
		int century;
		public Cricket(String name,int age,String gender, int score, int century) {
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.score = score;
			this.century = century;
		}
		public int getScore() {
			return score;
		}
		public int getAssist() {
			return century;
		}
		public String getName() {
			return name;
		}
	}
}