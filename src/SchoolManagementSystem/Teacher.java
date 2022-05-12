package SchoolManagementSystem;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    /**
     * Create new teacher object
     * @param id Teacher ID
     * @param name Teacher's name
     * @param salary Teacher's starting salary
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @return information to return teacher information
     */

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    /**
     * set the salary
     * @param salary new teacher salary
     */

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Pays to the salary and removes from the budget
     * @param salary add the raise
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    public String toString() {
        return "Name of the Teacher: " + name +
                " Total salary earned so far $" +
                salaryEarned;
    }
}
