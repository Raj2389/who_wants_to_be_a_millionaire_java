package gamepackage;

import java.util.ArrayList;

public class Question {
	private boolean seen;
	
	private String question;
	private ArrayList<Answer> options;

	public Question(String question) {
		this.question = question;
		this.seen = false;
		this.options = new ArrayList<Answer>(); 
	}
	
	public void addAnswer(Answer answer) {
		this.options.add(answer);
	}
	
	public void askQuestion() {
		this.printQuestion();
	}
	
	public void checkAnswer() {
		
	}
	
	public void printQuestion() {
		System.out.println(this.getQuestion());
	}
	
	public String getQuestion() {
		return question;
	}

	public ArrayList<Answer> getOptions() {
		return options;
	}

	public boolean isSeen() {
		return seen;
	}

	public void setSeen(boolean seen) {
		this.seen = seen;
	}
}