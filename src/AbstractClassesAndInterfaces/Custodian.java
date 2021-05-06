package AbstractClassesAndInterfaces;

public class Custodian extends Employee {

    public Custodian(String name, String department, int id) {
        super(name, department, id);
    }

    public String work() {
        return "Maintaining the building.";
    } //need to fill in details

    public String morningMeeting() {
        return "Idk sleep bro";
    }
}
