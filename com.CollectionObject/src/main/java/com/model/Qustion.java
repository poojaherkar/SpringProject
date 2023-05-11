package com.model;


import java.util.Iterator;
import java.util.List;

public class Qustion {
	private int id;
	private String Que;
	List<Answer> answer;
	
	
	public Qustion() {
		super();
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQue() {
		return Que;
	}
	public void setQue(String que) {
		Que = que;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	public void display()
	{
		System.out.println("Qustion no:" +id);
		System.out.println("Question name:" +Que);
		
		Iterator<Answer> iterator =answer.iterator();
		while(iterator.hasNext())
		{
			Answer ans=iterator.next();
			System.out.println(ans);
		}
	}

}
