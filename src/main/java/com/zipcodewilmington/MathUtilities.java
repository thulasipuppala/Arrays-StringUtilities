public class MathUtilities{
  /**
   * Add two number together
   * @param num1 first number
   * @param num2 second number
   * @return the sum of the two numbers
   */
  public int add(int num1, int num2){
      return num1 + num2;
  }

  /**
   * Add two number together
   * @param num1 first number
   * @param num2 second number
   * @return the sum of the two numbers
   */
  public double add(double num1, double num2){
      return num1 + num2;
  }

  /**
   * Get half the value of the number
   * @param number the number given
   * @return the half of the number in double
   */
  public double half(int number) {
      return (double)number/2;
  }

  /**
   * Determine if the number is odd
   * @param number the number given
   * @return true if the number is odd, false if it is even
   */
  public boolean isOdd(int number){
      if(number%2!=0)
        return true;
      else
        return false ;
  }


  /**
   * Multiply the number by itself
   * @param number the number given
   * @return the result of the number multiply by itself
   */
  public int square(int number) {
      return number*number;
  }

}
