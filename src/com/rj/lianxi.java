package com.rj;

import com.rh.Student;

public class lianxi {
	
    public static void main(String[] args) {
    	
//		Student stu[]  = new Student[3];
//		
//		Student stu1 = new Student();
//		stu[0] = stu1;
//		stu1.setName("zhangsan");
//		stu1.setAge(18);
//		stu1.setId("shandong");
//		
//		Student stu2 = new Student();
//		stu[1] = stu2;
//		stu2.setName("lisi");
//		stu2.setAge(20);
//		stu2.setId("jiangsu");
//		
//		Student stu3 = new Student();
//		stu[2] = stu3;
//		stu3.setName("wangwu");
//		stu3.setAge(18);
//		stu3.setId("hebei");
//		
//		for(Student i:stu){
//			if(null != i){
//				System.out.println(i.getName()+" "+i.getAge()+" "+i.getId());
//			}
//		}
      Student stu = new Student();
      stu.bike();
      stu.play("flykite");
      System.out.println("today i run"+stu.Run());
      System.out.println("kaoshi"+stu.Grade("shuxue"));
	
    }
}
