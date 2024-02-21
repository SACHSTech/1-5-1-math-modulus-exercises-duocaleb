class FtoC extends ConsoleProgram {

  /**
  * Description
  * @author:Caleb
  */
  
  public void run() {
    
    // start coding here
    int intDegreesF = readInt("Degrees in farenheight: ");
    double doubleDegreesC = ((intDegreesF-32)*5)/9;

    System.out.println("The degrees in Celcius is " + doubleDegreesC);
  }
}