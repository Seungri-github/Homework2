import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private String major;
    private int telNum;

    public void setStudentId(int studentId) { this.studentId = studentId; } //this = 객체의 멤버변수
    public void setName(String name) { this.name = name; }
    public void setMajor(String major) { this.major = major; }
    public void setTelNum(String telNum) { this.telNum = Integer.parseInt(telNum); }
    public int getStudentId()
    {
        return studentId;
    }
    public String getName() { return name; }
    public String getMajor() { return major; }
    public String getTelNum()
    {
        String strTelNum = '0' + Integer.toString(telNum);
        return strTelNum.substring(0, 3) + '-' + strTelNum.substring(3, 7) + '-' +
                strTelNum.substring(7, 11);
    }

}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_STRUDENT = 3;
        Student[] student = new Student[NUM_STRUDENT];
        for (int i=0; i<NUM_STRUDENT; i++)
        {
            student[i] = new Student();
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            student[i].setStudentId(sc.nextInt());
            student[i].setName(sc.next());
            student[i].setMajor(sc.next());
            student[i].setTelNum(sc.next());

        }
        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");

        for(int i=0; i<NUM_STRUDENT; i++)
        {
            //문제와 약간 다르게 첫번째, 두번째, 세번대 대신 1
            System.out.print(i+1 + "번째 학생: ");
            System.out.print(student[i].getStudentId());
            System.out.print(" " + student[i].getName());
            System.out.print(" " + student[i].getMajor());
            System.out.print(" " + student[i].getTelNum());
            System.out.print("\n");
        }

    }
}
