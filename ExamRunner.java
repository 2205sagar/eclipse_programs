package com.xworkz.constructor.runner;

import com.xworkz.constructor.Exam;

public class ExamRunner {
	public static void main(String[] args) {
			Exam exam=new Exam();
			exam.writing();
			//exam.setScore(60);
			//String result1=exam.result(exam.getScore());
			//System.out.println(result1);
			//exam.setScore(25);
			//String result2=exam.result(exam.getScore());
			//System.out.println(result2);
			int score=exam.getTotalScore(20);
			System.out.println("Total score is:"+score);
			exam.setScore(score);
			String result=exam.result(exam.getScore());
			System.out.println(result);
		
	}

}
