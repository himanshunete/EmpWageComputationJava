public class EmpWageBuilderUC9{
   //Constants
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;

   private final String company;
   private final int empRatePerHour ;
   private final int numOfWorkingDays;
   private final int maxNumOfHours ;
   private int totalEmpWage ;

   public EmpWageBuilderUC9( String company, int  empRatePerHour , int numOfWorkingDays, int  maxNumOfHours ){
      this.company = company ;
      this.empRatePerHour = empRatePerHour ;
      this.numOfWorkingDays = numOfWorkingDays ;
      this.maxNumOfHours = maxNumOfHours ;
   }


   public void computeEmpWage(){
      System.out.println(" Welcome to Employee Wage Computation Program ") ;

      //Variables
      int totalEmpHrs = 0;
      int totalWorkingDays = 0 ;
      int empHrs = 0 ;
      int empWage =0 ;

      //Computation
      while ( totalEmpHrs <=  maxNumOfHours && totalWorkingDays <= numOfWorkingDays ){
         int empCheck = (int)Math.floor(Math.random() * 10) % 3;
         totalWorkingDays ++;
         totalEmpHrs ++;
         switch (empCheck) {
            case IS_FULL_TIME :
               empHrs = 8 ;
               break;
            case IS_PART_TIME :
               empHrs = 4  ;
               break;
            default :
               empHrs = 0;
         }
         empWage = empHrs * empRatePerHour;
         totalEmpWage += empWage;
         System.out.println(" Emp Wage: " + empWage);
      }

   }      

   public String toString(){
      return "Total Emp Wage for Company: " +company+ " is: " + totalEmpWage;
   }

   public static void main(String[] args){
      EmpWageBuilderUC9 Audi = new EmpWageBuilderUC9("Audi", 20, 2, 10) ;
      EmpWageBuilderUC9 BMW = new EmpWageBuilderUC9("BMW", 10, 4, 20) ;
      EmpWageBuilderUC9 Ferrari = new EmpWageBuilderUC9("Ferrari",20, 6, 30) ;
      Audi.computeEmpWage();
      System.out.println(Audi);
      BMW.computeEmpWage();
      System.out.println(BMW);
      Ferrari.computeEmpWage();
      System.out.println(Ferrari);

   }
}
