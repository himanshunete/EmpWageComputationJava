public class EmpWageBuilderUC3{

      //Constants  
      public static final int IS_PART_TIME = 1;
      public static final int IS_FULL_TIME = 2;
      public static final int EMP_RATE_PER_HOUR = 20;

      //Static Variables
      public static int empHrs ;
      public static int empWage ;

      public static void CheckingWage(){
         double empCheck = Math.floor(Math.random() * 10) % 3;
         if (empCheck == IS_FULL_TIME)
            empHrs = 8;
         else if (empCheck == IS_PART_TIME)
            empHrs = 4;
         empWage = empHrs * EMP_RATE_PER_HOUR;
         System.out.println("Emp Daily Wage: " + empWage);
      } 
      public static void main(String[] args){
         CheckingWage();
      }         

}
