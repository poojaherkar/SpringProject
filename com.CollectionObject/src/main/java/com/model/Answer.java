package com.model;

public class Answer {
	private int Ans_id;
	private String Ans_desc;
	public Answer() {
		super();
	}
	public Answer(int ans_id, String ans_desc) {
		super();
		Ans_id = ans_id;
		Ans_desc = ans_desc;
	}
	public int getAns_id() {
		return Ans_id;
	}
	public void setAns_id(int ans_id) {
		Ans_id = ans_id;
	}
	public String getAns_desc() {
		return Ans_desc;
	}
	public void setAns_desc(String ans_desc) {
		Ans_desc = ans_desc;
	}
	@Override
	public String toString() {
		return "Answer [Ans_id=" + Ans_id + ", Ans_desc=" + Ans_desc + "]";
	}
	
	
	

}
