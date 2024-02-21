class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author:Caleb
  */
  
  public void run() {
    
    // start coding here
    int intRadius = readInt("Radius: ");
    double dblArea = (intRadius^2)*3.14159;

    System.out.println("The area is " + dblArea);
  }
}