public class EmpWageBuilderUC2{
      //Constants 
      public static final int IS_FULL_TIME = 1;
      public static final int EMP_RATE_PER_HOUR = 20;

      //Static variables  
      public static int empHrs ;
      public static int empWage ;

      public static void CheckingWage(){
         double empCheck = Math.floor(Math.random() * 10) % 2;
         if (empCheck == IS_FULL_TIME)
            empHrs = 8;
         else
            empHrs = 0;
         empWage = empHrs * EMP_RATE_PER_HOUR;
         System.out.println("Emp Daily Wage: " + empWage);
      } 
      public static void main(String[] args){
         CheckingWage();
      }   
}
