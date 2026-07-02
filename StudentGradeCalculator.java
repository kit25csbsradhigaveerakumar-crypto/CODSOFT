import java.util.Scanner;

class StudentGradeCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numberOfSubjects;
        int totalMarks = 0;
        double averagePercentage;
        char grade;
        
        System.out.println("==============================");
        System.out.println("   STUDENT GRADE CALCULATOR");
        System.out.println("==============================");

        System.out.println("Enter the number of subjects: ");
        numberOfSubjects = sc.nextInt();

        for(int i = 1;i <= numberOfSubjects;i++){
           System.out.print("Enter marks for Subject " + i + " (out of 100): ");
           int marks = sc.nextInt();

           totalMarks += marks; 
        }

        averagePercentage = (double) totalMarks / numberOfSubjects;

        if(averagePercentage >= 90){
            grade = 'A';
        }
        else if(averagePercentage >= 80){
            grade ='B';
        }
        else if(averagePercentage >= 70){
            grade ='C';
        }
        else if(averagePercentage >= 60){
            grade ='D';
        }
        else{
            grade = 'F';
        }
        
        System.out.println("\n==========RESULT===========");
        System.out.println("Total Marks       : " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade             : " + grade);

        sc.close();

}
}