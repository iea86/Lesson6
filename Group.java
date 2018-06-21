package by.epam.javabasic25.classes;

import java.util.Scanner;

public class Group {

    private static Student[] studentsArray;
    private static int countOfStudents;
    private static int CountOfAchievers;
    private static int CountOfDowagers;
    private static double averageMarkByGroup;
    
    private static Scanner sc = new Scanner(System.in);
  
  
 public static Student[] getStudentsArray() {
		return studentsArray;
	}

	public static void setStudentsArray(Student[] studentsArray) {
		Group.studentsArray = studentsArray;
	}

	public static int getCountOfStudents() {
		return countOfStudents;
	}

	public static void setCountOfStudents(int countOfStudents) {
		Group.countOfStudents = countOfStudents;
	}

	public static int getCountOfAchievers() {
		return CountOfAchievers;
	}

	public static void setCountOfAchievers(int countOfAchievers) {
		CountOfAchievers = countOfAchievers;
	}

	public static int getCountOfDowagers() {
		return CountOfDowagers;
	}

	public static void setCountOfDowagers(int countOfDowagers) {
		CountOfDowagers = countOfDowagers;
	}

	public static double getAverageMarkByGroup() {
		return averageMarkByGroup;
	}

	public static void setAverageMarkByGroup(double averageMarkByGroup) {
		Group.averageMarkByGroup = averageMarkByGroup;
	}

	//to enter the number of Student in the Group   
    public int enterCountOfStudents() {
        System.out.print("Count of Students: ");
        while(!sc.hasNextInt()) {
            sc.next();            
            System.out.print("Count of Students: ");
        }

        countOfStudents = sc.nextInt();
        return countOfStudents;
    }

//to create array
    public void enterGroup(int countOfStudents) {

        Group.studentsArray = new Student[countOfStudents];

        for (int i = 0; i < Group.getStudentsArray().length; i++) {

            Student student = new Student();
            student.EnterName();
            student.EnterSurName();
            student.entermarkBiology();
            student.entermarkGeography();
            student.entermarkHistory();    
            
            Group.getStudentsArray()[i] = student;                              
            }             
 }
    
    
    public void calculateAverageMarkByGroup() {

        double temp = Group.getAverageMarkByGroup();

        for (int i = 0; i < Group.getStudentsArray().length; i++) {
            temp += Group.getStudentsArray()[i].getMarkBiology();
            temp += Group.getStudentsArray()[i].getMarkGeography();
            temp += Group.getStudentsArray()[i].getMarkHistory();
           
            Group.setAverageMarkByGroup(temp); /// to get the sum of marks for all Students
        }
        Group.setAverageMarkByGroup(Group.getAverageMarkByGroup()/(Group.getCountOfStudents()*3));   // to get the average mark for the Group
    }
    


    public void calculateNumberOfDowagers() {
    	
    	int temp = Group.getCountOfDowagers();
    	
    	 for (int i = 0; i < Group.getStudentsArray().length; i++) {

            if(Group.getStudentsArray()[i].IsDowager()) {
            	temp = temp +1;  
            }

        }
    	 Group.setCountOfDowagers(temp);
   }



 public void calculateNumberOfAchievers() {
    	
    	int temp = Group.getCountOfAchievers();
    	
    	 for (int i = 0; i < Group.getStudentsArray().length; i++) {

            if(Group.getStudentsArray()[i].IsAchiever()) {
            	temp = temp +1;  
            }

        }
    	 Group.setCountOfAchievers(temp);
   }


  
    
    public void printGroup() {

        System.out.println();

        System.out.println("Number of Students: " + getCountOfStudents());   

        System.out.println("Average mark by group: " + getAverageMarkByGroup());  
        
        for (int i = 0; i < Group.getStudentsArray().length; i++) {
            studentsArray[i].printStudent(); 
        }
        
        System.out.println();
        
        System.out.println("Number of Achievers: " + getCountOfAchievers());
        
        System.out.println("Number of Dowagers: " + getCountOfDowagers());

    }
    
}

   