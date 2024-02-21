class Power extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    int intNum1 = readInt("Number 1: ");
    int intNum2 = readInt("Number 2: ");
    double dblNum3 = intNum1^intNum2;

    System.out.println(intNum1 + "^" + intNum2 + " = " + dblNum3 + ".");
    
  }
}