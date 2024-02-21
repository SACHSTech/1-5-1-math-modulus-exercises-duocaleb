class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * @author:Caleb
  */
  
  public void run() {
    
    // start coding here
    int intLength1 = readInt("Side 1: ");
    int intLength2 = readInt("Side 2: ");
    int intDegrees = readInt("Angle: ");
    double intLength3 = Math.sqrt(Math.pow(intLength1, 2)+Math.pow(intLength2, 2)-2*intLength1*intLength2*(Math.cos(Math.toRadians(intDegrees))));
    System.out.println("The third side is " + intLength3);
  }
}