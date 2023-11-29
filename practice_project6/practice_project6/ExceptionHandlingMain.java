package practice_project6;

public class ExceptionHandlingMain {

	public static void main(String[] args) throws InvalidScoreException {
		// TODO Auto-generated method stub

		EligibilityValidator eligibility=new EligibilityValidator();
		eligibility.CheckScore(89);
	}

}
