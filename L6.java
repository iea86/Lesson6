package by.epam.javabasic25.classes;


public class L6 {

	public static void main(String[] args) {

		Group group = new Group();		
				
		int countOfStudents = group.enterCountOfStudents();

        group.enterGroup(countOfStudents); 
        
        group.calculateAverageMarkByGroup();        
               
        group.calculateNumberOfAchievers();
        
        group.calculateNumberOfDowagers();
        
        group.printGroup();
    }

}
