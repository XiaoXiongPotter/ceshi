package com.rh;

import java.util.Random;

public class Student {
    private String id;
    private String name;
    private int age;
    public Student(){
    	
    }
    public void bike(){
    	System.out.println("go home");
    }
    public void play(String obj){
    	System.out.println("today i play"+obj);
    }
    
    public  int Run(){
		return 3000;
    	
    }
    
    public String Grade(String course){
    	Random random = new Random();
    	return course+random.nextInt(100);
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
}
