public class TheMotivator {
	public void feedbackScore(int score) {
		if (score == 100)
			System.out.println("You're super smart!");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}

	public void addLetterGrade(int score) {
		System.out.println("Letter Grade and GPA is as follows:");
		if (score == 100)
			System.out.println("Letter Grade: A; GPA: 4.0");
		else if (score > 90)
			System.out.println("Letter Grade: A-; GPA: 3.5");
		else if (score > 80)
			System.out.println("Letter Grade: B; GPA: 3.2");
		else if (score > 70)
			System.out.println("Letter Grade: C; GPA: 3.0");
		else if (score > 60)
			System.out.println("Letter Grade: D; GPA: 2.8");
		else
			System.out.println("Failed Class!; GPA: BAD!");
	}

	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedbackScore(60);
		tm.addLetterGrade(60);
	}
}
