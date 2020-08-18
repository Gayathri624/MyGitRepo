 
    
   public class Employee {
 
 int empid;
 String name;
 float salary;
 
 public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the empid :: ");
  empid = in.nextInt();
  System.out.print("Enter the name :: ");
  name = in.next();
  System.out.print("Enter the salary :: ");
  salary = in.nextFloat();
 }
   