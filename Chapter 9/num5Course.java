public class num5Course extends num4GradedActivity 
						implements  num6Analyzable{

	num4GradedActivity[] grades = new num4GradedActivity[4];
public num5Course(num5LabActivity labActivity, num5PassFailExam passFailExam, num4Essay essay, num5FinalExam finalExam)
    {
        this.setLab(labActivity);
        this.setPassFailExam(passFailExam);
        this.setEssay(essay);
        this.setFinalExam(finalExam);
    }
public double getAverage()
    {
        double avg = 0;
        for (int i = 0; i < grades.length; i++)
        {
            avg += grades[i].getScore();
        }
        avg = avg / grades.length;
return avg;
    }
@Override
    public num4GradedActivity getHighest()
    {
        double high = grades[0].getScore();
        int holder = -1;
        for (int i = 0; i < grades.length; i++)
        {
            if (grades[i].getScore() > high)
            {
                high = grades[i].getScore();
                holder = i;
            }
        }
        return grades[holder];
    }
@Override
    public num4GradedActivity getLowest()
    {
        double low = grades[0].getScore();
        int holder = -1;
        for (int i = 0; i < grades.length; i++)
        {
            if (grades[i].getScore() < low)
            {
                low = grades[i].getScore();
                holder = i;
            }
        }
return grades[holder];
    }
    num5Course(){}
    public void setLab(num5LabActivity labActivity) { grades[0] = labActivity; }
    public void setPassFailExam(num5PassFailExam passFailExam){ grades[1] = passFailExam;}
    public void setEssay(num4Essay essay){grades[2] = essay;}
    public void setFinalExam(num5FinalExam finalExam){ grades[3] = finalExam;}
@Override
    public String toString()
    {
        return "Lab Activity: " + grades[0].getGrade() + " (" + grades[0].getScore() + ")"  +
                "\nPass Fail Exam: " + grades[1].getGrade()+ " (" + grades[1].getScore() + ")"  +
                "\nEssay: " + grades[2].getGrade()+ " (" + grades[2].getScore() + ")"  +
                "\nFinal Exam: " + grades[3].getGrade()+ " (" + grades[3].getScore() + ")" +
                "\nAverage: " + String.format("%,.2f%%", getAverage()) +
                "\nHighest Value: " + getHighest().getScore() +
                "\nLowest Value: " + getLowest().getScore();
}
}
