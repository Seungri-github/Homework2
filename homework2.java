import java.util.Scanner;
class Student{
    int number;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    protected String name;

    public String getMajor() {
        return major;
    }
    public void setMajor(String name) {
        this.major = major;
    }
    protected String major;

    int phone_num;
    public int getPhone_num() {
        return phone_num;
    }
    public void setPhone_num(int phone_num) {
        this.phone_num = phone_num;
    }
}
public class homework2 extends Student{
    public String lab;

    public homework2() {
        super.getName();
        super.getNumber();
        super.getMajor();
        super.getPhone_num();
    }

    public static void main(String[] args) {
        System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

        Scanner sc = new Scanner(System.in);
        homework2 obj = new homework2();

        int number = sc.nextInt();
        long phone_num = sc.nextLong();
        String name = sc.nextLine();
        String major = sc.nextLine();

        System.out.println("입력된 학생들의 정보는 다음과 같습니다");
        System.out.printf("첫번째 학생: %d %c %c %l", obj.number, obj.name, obj.major, obj.phone_num);

    }
}