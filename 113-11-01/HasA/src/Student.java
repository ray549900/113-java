public class Student {
    private String studentID;
    private String name;

    public Student(){
        new Student(studentID:"00000000",name"未知");
    }

    public Student(String studentID,String name){
        this.studentID = studentID;
        this.name = name;
    }

    public String getStudentID(){
        return studentID
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }

    public void printData( ) {
        System.out.printf("%s,%s", studentID,name);
    }

}
