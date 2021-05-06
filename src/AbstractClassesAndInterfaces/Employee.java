package AbstractClassesAndInterfaces;

abstract class Employee {
    protected String name;
    protected String department;
    protected int id;
    //visibility, type, return type, name
    public abstract String work(); //blank method - our classes will inherit the details

    public Employee(String name, String department, int id) {
        this.name = name;
        this.department = department;
        this.id = id;
    }






    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
