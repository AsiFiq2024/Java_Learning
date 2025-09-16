public class UsingPrintf {
    public static void main(String[] args) {
        String name = "Asif";
        char grade = 'A';
        int age = 21;
        double height = 60.5;
        boolean isStudent = true;
        double balance = 54830000.69;

        System.out.printf("Hi %s\n",name);
        System.out.printf("Your grade is: %c\n",grade);
        System.out.printf("You are %d years old\n",age);
        System.out.printf("You are %.2f inces tall\n",height);
        System.out.printf("Student: %b\n",isStudent);
        System.out.printf("Balance: %,.02f",balance);

        int id1 = 1;
        int id2 = 12;
        int id3 = 123;
        int id4 = 1234;

        System.out.printf("%4d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);
    }
}
