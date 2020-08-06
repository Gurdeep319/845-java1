package com.lti.model;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Question.Difficulty;

public class QuestionBankLoader {
	
	public List<Question> loadQuestionsOnJava() {
		String subjectName = "java";
		
		QuestionBank qb = new QuestionBank();
		qb.addNewSubject(subjectName);
			
		Question q = new Question("What is java? ", Difficulty.EASY);
		List<Option> ops = new ArrayList<Option>();
		ops.add(new Option("java is a DataBase",false));
		ops.add(new Option("Java is a programming language", true));
		ops.add(new Option("Java is an OS",false));
		ops.add(new Option("Java is a filesystem",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("What is G1? ", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("G1 is Garbage collector",true));
		ops.add(new Option("G1 is jeevan in english", false));
		ops.add(new Option("G1 is the sequel of Ra.One",false));
		ops.add(new Option("G1 is a bed of Roses",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("Who Developed java ? ", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("James Gosling",true));
		ops.add(new Option("Shah Rukh Khan", false));
		ops.add(new Option("Bill Gates",false));
		ops.add(new Option("Ananya Pandey",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("Which is the parent class of all classes in java ?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("Object",true));
		ops.add(new Option("Exception", false));
		ops.add(new Option("Scanner",false));
		ops.add(new Option("Collection",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		
		
		return qb.getQuestionsFor(subjectName);
	}
}
