class AreaSin extends ConsoleProgram {

  /**
  * Description
  * @author: Caleb
  */
  
  public void run() {
    
    // start coding here
    int intLength1 = readInt("Side 1 length: ");
    int intLength2 = readInt("Side 2 length: ");
    int intDegrees = readInt("Contained angle length: ");
    Double dblArea = (intLength1*intLength2*Math.sin(Math.toRadians(intDegrees)))/2;
    
    System.out.println("The area is " + dblArea);
  }
}