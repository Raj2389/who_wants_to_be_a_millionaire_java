package gamepackage;

public class Answer {
	private String option;
	private boolean correct;
	
	public Answer(String option) {
		this.option = option;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}
	
	public void printOption() {
		System.out.println(this.getOption());
	}

}