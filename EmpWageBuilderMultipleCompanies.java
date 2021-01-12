public class EmpWageBuilderMultipleCompanies{
   //Constants
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;
 
   //Instance Variables
    int EMP_RATE_PER_HOUR ;
    int NUM_OF_WORKING_DAYS;
    int MAX_NUM_OF_HOURS ;

    int totalEmpWage = 0;  ;
    int totalEmpHrs = 0;
    int totalWorkingDays = 0 ;
    int empHrs ;
    int empWage =0 ;
    int empHrsFullTime ;
    int empHrsPartTime ;


   public void CheckingWage(int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int  MAX_NUM_OF_HOURS, int  empHrsFullTime, int empHrsPartTime ){
      System.out.println(" Welcome to Employee Wage Computation Program ") ;

      //Computation
      while ( totalEmpHrs <=  MAX_NUM_OF_HOURS && totalWorkingDays <=  NUM_OF_WORKING_DAYS ){
         int empCheck = (int)Math.floor(Math.random() * 10) % 3;
         totalWorkingDays ++;
         totalEmpHrs ++;
         switch (empCheck) {
            case IS_FULL_TIME :
               empHrs = empHrsFullTime ;
               break;
            case IS_PART_TIME :
               empHrs = empHrsPartTime  ;
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
      EmpWageBuilderUC8 Audi = new EmpWageBuilderUC8() ;
      EmpWageBuilderUC8 BMW = new EmpWageBuilderUC8() ;
      EmpWageBuilderUC8 Ferrari = new EmpWageBuilderUC8() ;
      EmpWageBuilderUC8 HarleyDavidson = new EmpWageBuilderUC8() ;
      EmpWageBuilderUC8 Indian = new EmpWageBuilderUC8() ;
      System.out.println(" Employee of Audi Company ");
      Audi.CheckingWage(20,25,100,8,4);
      System.out.println(" Employee of BMW Company ");
      BMW.CheckingWage(25,20,100,9,2);
      System.out.println(" Employee of Ferrari Company ");
      Ferrari.CheckingWage(30,18,90,7,4);
      System.out.println(" Employee of HarleyDavidson Company ");
      HarleyDavidson.CheckingWage(15,20,80,7,3);
      System.out.println(" Employee of Indian Company ");
      Indian.CheckingWage(15,15,80,8,4);
   }
}

