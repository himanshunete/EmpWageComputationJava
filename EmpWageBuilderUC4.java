public class EmpWageBuilderUC4{
   //Constants
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;
   public static final int EMP_RATE_PER_HOUR = 20;
  

   //Static Variables
   public static int empHrs;
   public static int empWage ;
   public static void CheckingWage(){
      int empCheck = (int)Math.floor(Math.random() * 10) % 3;
      switch (empCheck) {
         case IS_FULL_TIME :         
            empHrs = 8;
            break;
         case IS_PART_TIME :
            empHrs = 4;
            break;
         default :
            empHrs = 0;
      } 
      empWage = empHrs * EMP_RATE_PER_HOUR;
      System.out.println("Emp Daily Wage: " + empWage);
   } 
   public static void main(String[] args){
      CheckingWage();
   }
}
