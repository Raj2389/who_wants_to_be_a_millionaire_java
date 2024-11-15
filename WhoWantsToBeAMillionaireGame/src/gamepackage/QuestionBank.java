package gamepackage;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class QuestionBank {
	private ArrayList<Question> questions;
    private File file = new File("src/gamepackage/questions.txt");

	public QuestionBank() {
		this.questions = new ArrayList<Question>();
		this.populateQuestions();
	}
	
	public void populateQuestions() {
		try (Scanner input = new Scanner(file);) {
			Question question = null;
			while (input.hasNextLine()) {
				String line = input.nextLine();
				if (line.contains("Question")) {
					question = new Question(line.split("Question: ")[1]);
				} else if (line.contains("Answer")) {
					int correctOption = Integer.parseInt((line).split("Answer: ")[1]);
					Answer option = question.getOptions().get(correctOption - 1);
					option.setCorrect(true);
					questions.add(question);
				} else if (!line.isBlank()) {
					String option = line.split("\\) ")[1];
					Answer answerOption = new Answer(option);
					question.addAnswer(answerOption);
				}

			}
		} catch (FileNotFoundException e) {
			System.err.println(e);
		}
	}
	
	
	public Question getQuestion() {
	     Random random = new Random(); 
	     Question randomQuestion = this.questions.get(random.nextInt(this.questions.size()));
	     while (randomQuestion.isSeen()) {
		     randomQuestion = this.questions.get(random.nextInt(this.questions.size()));
	     }
	     return randomQuestion;
	}

}