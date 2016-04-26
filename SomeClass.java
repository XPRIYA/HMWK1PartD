public class TheMotivator {
	public void feedbackScore(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}

	public void addLetterGrade(int score) {
		if (score == 100)
			System.out.println("A");
		else if (score > 90)
			System.out.println("A-");
		else if (score > 80)
			System.out.println("B");
		else if (score > 70)
			System.out.println("C");
		else if (score > 60)
			System.out.println("D");
		else
			System.out.println("Failed Class!");
	}

	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedbackScore(60);
		tm.addLetterGrade(60);
	}
}
