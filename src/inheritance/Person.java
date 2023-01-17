package inheritance;
/*
Write a program for  below inheritance scenario
Person > employee > tester
Person > employee > developer
Person
	Has name, age
	Does talk, walk ( just sysout in this method is fine)
 */
public class Person {
	String name; int age;
	
	void talk() {
		System.out.println("Person talks");
	}
	
	void walk() {
		System.out.println("Person walks");
	}

}
