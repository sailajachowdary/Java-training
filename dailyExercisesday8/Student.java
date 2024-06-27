package com.java.dailyExercisesday8;

class Student extends Person {
	private String university;
	private String degree;

	public Student(String name, int age, String university, String degree) {
		super(name, age);
		this.university = university;
		this.degree = degree;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("University: " + university);
		System.out.println("Degree: " + degree);
	}
}
