package ch04;

public class StudentTEst {

    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 강남구";

        studentLee.showStudentInfo();
    }

}
