package headfirst.serialization;

import java.io.Serializable;

public class QuizCard implements Serializable {
	
	static final long serialVersionUID = 1L;
	
	private String question;
	private String answer;
	public QuizCard(String q, String a) {
		this.question = q;
		this.answer = a;
	}
	public String getQuestion() {
		return this.question;
	}
	public String getAnswer() {
		return this.answer;
	}
}
