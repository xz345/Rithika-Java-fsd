package practice_project6;

public class EligibilityValidator {
	

	public void CheckScore(int score) throws InvalidScoreException {
		if(score>=70) {
			System.out.println("Congratulations !, You have Sucessfully cleared");
			
			
		}
		else {
			
			throw new InvalidScoreException();
			

		}

	}
}
