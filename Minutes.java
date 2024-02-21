class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    int intMinsIn = readInt("Mins here: ");
    int intDays = Math.floorDiv(intMinsIn, 1440);
    int intHours = Math.floorDiv(intMinsIn%24, 60);
    int intMinsLeft = intMinsIn % 60;
    
    System.out.println("There are " + intDays + " days, " + intHours + " hours, and " + intMinsLeft + " minutes in " + intMinsIn + " minutes.");
  }
}