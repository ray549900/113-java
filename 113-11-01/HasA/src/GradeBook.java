import java.util.Scanner;

public class GradeBook {
    private String courseName;
    private Student[] students;
    private double[] grades;
    private int numberOfStudents;

    public GradeBook(String courseName,Student[] students,int numberOfStudents){
        this.numberOfStudents = numberOfStudents;
        this.courseName = courseName;
        this.students = students;
        this.grades = new double[numberOfStudents];
        displayMessage();
    }

    public void displayMessage(){
        System.out.printf("歡迎使用%s\n",courseName);
    }

    public void processStudents(){
        Scanner input = new Scanner(System.in);
        System.out.printIn("輸入學生成績:");
        for (int i = 0;i< numberOfStudents;i++){
            students[i].printData();
            System.out.print("的成績");
            grades[i] = input.nextDouble();
        }
    }
    public double getMinimum(){
        double min =grades[0];
        for (int i =1;i< numberOfStudents;i++){

        }
    }
    public double getAverage(){
        double sum = 0;
        for (int i = 0;i< numberOfStudents;i++){
            sum += grades[i];
        }
        return sum /numberOfStudents;
    }

    public void displayGradeRepotr(){
        System.out.println("成績報告:");
        System.out.printf("學號\t姓名\t 成績");
        for(int i =0;i<numberOfStudents;i++){
            students[i].printData();
            System.out.printf("%.1f\n",grades[i]);
        }
        System.out.println("----------------------");

    }

}
