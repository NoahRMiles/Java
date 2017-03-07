import java.util.Scanner;

public class num5Launcher {

	public static void main(String[] args) {
		num5LabActivity labActivity = new num5LabActivity(86.90);
        num5PassFailExam passFailExam = new num5PassFailExam(78.50);
        num4Essay essay = new num4Essay(30,20,20,30);
        num5FinalExam finalExam = new num5FinalExam(95.12);
        num5Course courseGrades = new num5Course(labActivity,passFailExam,essay,finalExam);

        System.out.print(courseGrades);
	}

}
