public class EmpWageBuilderUC7{
   //Constants
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;
   public static final int EMP_RATE_PER_HOUR = 20;
   public static final int NUM_OF_WORKING_DAYS = 20;
   public static final int MAX_NUM_OF_HOURS = 100;

   //Static Variables
   public static int totalEmpWage ;
   public static int totalEmpHrs ;
   public static int totalWorkingDays ;
   public static int empHrs ;
   public static int empWage ;

   public static void CheckingWage(){
      System.out.println(" Welcome to Employee Wage Computation Program ") ;

      //Computation
      while ( totalEmpHrs <=  MAX_NUM_OF_HOURS && totalWorkingDays <=  NUM_OF_WORKING_DAYS ){
         int empCheck = (int)Math.floor(Math.random() * 10) % 3;
         totalWorkingDays ++;
         totalEmpHrs ++;
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
         totalEmpWage += empWage;
         System.out.println(" Emp Wage: " + empWage);
      }
      System.out.println("Total Emp Wage: " + totalEmpWage);
   }

   public static void main(String[] args){
      CheckingWage();
   }
}




