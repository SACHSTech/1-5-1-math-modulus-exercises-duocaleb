class Hours extends ConsoleProgram {

  /**
  * Description
  * @author:Caleb
  */
  
  public void run() {
    
    // start coding here
    int intHoursIn = readInt("Hours here: ");
    double dblDays = Math.floor(intHoursIn/24);
    int intHoursLeft = intHoursIn%24;
    System.out.println("There are " + dblDays + " days and " + intHoursLeft + " hours in " + intHoursIn + " hours.");
  }
}