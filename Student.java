package by.epam.javabasic25.classes;

import java.util.Scanner;


public class Student {
	
//fields
 public String name;
 public String Surname; 
 public int markBiology;
 public int markGeography;
 public int markHistory;
 private double averageMark;

private static Scanner sc=new Scanner (System.in);  
 
public String getSurname() {
	return Surname;
}

public void setSurname(String surname) {
	Surname = surname;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getMarkBiology() {
	return markBiology;
}

public void setMarkBiology(int markBiology) {
	this.markBiology = markBiology;
}

public int getMarkGeography() {
	return markGeography;
}

public void setMarkGeography(int markGeography) {
	this.markGeography = markGeography;
}

public int getMarkHistory() {
	return markHistory;
}

public void setMarkHistory(int markHistory) {
	this.markHistory = markHistory;
}


public double getAverageMark() {
	return averageMark;
}

public void setAverageMark(double averageMark) {
	this.averageMark = averageMark;
}




///enter StudentName
public void EnterName () {	 
	
	 System.out.print("Enter Student name: ");
	 String temp = sc.nextLine();
     this.setName(temp);	 
}  

///enter StudentSurname
public void EnterSurName () {	 
	
	 System.out.print("Enter Student Surname: ");
	 String temp = sc.nextLine();
     this.setSurname(temp);	 
}
  
///enter mark Biology
 public void entermarkBiology() {

     System.out.print("Biology mark: ");
     while(!sc.hasNextInt()) {
         sc.next();
         System.out.print("Biology mark: ");
     }
     int temp = sc.nextInt();
     if (temp > 0 && temp <= 10) {
         this.setMarkBiology(temp);
     } else {
         System.out.println("Ivalid mark was entered");
         entermarkBiology();       
     }
 }
 
 /// enter mark Geography
 public void entermarkGeography() {

     System.out.print("Geography mark: ");
     while(!sc.hasNextInt()) {
         sc.next();
         System.out.print("Geography mark: ");
     }
     int temp = sc.nextInt();
     if (temp > 0 && temp <= 10) {
         this.setMarkGeography(temp);
     } else {
         System.out.println("Ivalid mark was entered");
         entermarkGeography();       
     }
 }
 
///enter mark History
 public void entermarkHistory() {

     System.out.print("History mark: ");
     while(!sc.hasNextInt()) {
         sc.next();
         System.out.print("History mark: ");
     }
     int temp = sc.nextInt();
     if (temp > 0 && temp <= 10) {
         this.setMarkHistory(temp);
     } else {
         System.out.println("Ivalid mark was entered");
         entermarkHistory();       
     }
 }
 
  

 public double calculateAverageMark() {

     double averageMark = ((double)getMarkBiology() + (double)getMarkGeography() + (double)getMarkHistory() )/3;

     this.setAverageMark(averageMark);

     return averageMark;

 }
 
 public boolean IsDowager() {

     if ( getMarkBiology() == 2 || getMarkGeography() == 2 || getMarkHistory() == 2) {

         return true;

     } else return false;

 }

 public boolean IsAchiever() {

     if(calculateAverageMark() == 5) {

         return true;

     } else return false;

 }
 
 public void printStudent() {

     System.out.println();       

     System.out.println("Average mark of Student " + getName() + getSurname() + ":  "+ calculateAverageMark());

 }
 
 }
 
 


