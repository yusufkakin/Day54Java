package SchoolManagementSystem;

/**
 * This class is to keep track of the students' information: name, grades and fees paid.
 */
public class Student {

   private int id;
   private String name;
   private int grade;
   private int feesPaid;
   private int feesTotal;

   /**
    * To create a new student by initializing values
    * Tuition is $20,000.
    * Tuition paid initially is 0.
    * @param id id is the unique value
    * @param name name of the student
    * @param grade grade of the student
    */

   public Student(int id, String name, int grade){
      this.feesPaid = 0;
      this.feesTotal = 20000;
      this.id = id;
      this.name = name;
      this.grade = grade;
   }

   /**
    * setter for grade
    * @param grade new grade of the student
    */

   public void setGrade(int grade) {
      this.grade = grade;
   }

   /**
    * Adding the fees to the fees paid
    * @param fees adds to the fees
    */

   public void payFees(int fees) {
     feesPaid+=fees;
     School.updateTotalMoneyEarned(fees);
   }

   /**
    * Return information for the student
    * @return returns the info
    */
   public int getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public int getGrade() {
      return grade;
   }

   public int getFeesPaid() {
      return feesPaid;
   }

   public int getFeesTotal() {
      return feesTotal;
   }

   public int getRemainingFees(){
      return feesTotal - feesPaid;
   }

   @Override
   public String toString() {
      return "Student's name: " + name +
              " Total fees paid so far $" + feesPaid;
   }
}
