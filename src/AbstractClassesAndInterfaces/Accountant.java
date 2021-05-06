package AbstractClassesAndInterfaces;

public class Accountant extends Employee {

    public Accountant(String name, String department, int id) {
        super(name, department, id);
    }

    public String work() {
        return "TPS Reports have been drafted.";
    } //need to fill in details

    public String morningMeeting() {
        return "Meeting at 8:15am";
    }
}
