package Session4;
public class EncapsTest{
    public static void main(String args[]){
         Encapsulation obj = new Encapsulation();
         obj.setEmpName("Elson");
         obj.setEmpAge(1252);
         obj.setEmpSSN(1176767);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpSSN());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}