public class EmpWageBuilderUC1{
   //Constant
   public static final int IS_FULL_TIME = 1;
   public static void CheckingAttendance(){   
      double empCheck = Math.floor(Math.random()*10)%2;
      if (empCheck == IS_FULL_TIME)
         System.out.println("Employee is Present");
      else
         System.out.println("Employee is Absent");
   }
   public static void main(String[] args){
     CheckingAttendance(); 
   }      
}
