package _2019_8_20.VisitMode;

public class GradeSelection implements Visitor
{
    public void visit(Student student)
    {
        if (student != null && student.getGrade() >= 90) {
            System.out.println(student.getName() + "�ķ�����" + student.getGrade() + "���ٻ��˳ɼ����㽱��");
        }
    }

    public void visit(Teacher teacher)
    {
        if (teacher != null && teacher.getScore() >= 85) {
            System.out.println(teacher.getName() + "�ķ�����" + teacher.getScore() + "���ٻ��˳ɼ����㽱��");
        }
    }
}
