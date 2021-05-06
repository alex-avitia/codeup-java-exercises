package AbstractClassesAndInterfaces;

public class Company {

    public static void main(String[] args) {

        Employee numberBot = new Accountant("numberBot", "Accounting", 001);
        Employee cleanerBot = new Custodian("cleanerBot", "Maintenance", 002);

        System.out.println("Employee name = " + numberBot.name);
        System.out.println("Employee department = " + numberBot.department);
        System.out.println("Employee morning meeting = " + ((Accountant) numberBot).morningMeeting());
        System.out.println(numberBot.work());
        System.out.println("cleanerBot.name = " + cleanerBot.name);
        System.out.println("cleanerBot.department = " + cleanerBot.department);
        System.out.println(cleanerBot.work());

    }
}
