public class Functions 
{
    //instance variables

    //constructor
    public Functions()
    {

    }

    //methods

    /**
     * Adds first number and second number
     * @param num1
     * @param num2
     * @return result
     */
    public static void add(int num1, int num2)
    {
        int result = num1 + num2;
        System.out.println(result);
    }

    /**
     * Subtracts first number and second number
     * @param num1
     * @param num2
     * @return result
     */
    public static void subtract(int num1, int num2)
    {
        int result = num1 - num2;
        System.out.println(result);
    }

    /**
     * Multiplies first number and second number
     * @param num1
     * @param num2
     * @return result
     */
    public static void multiply(int num1, int num2)
    {
        int result = num1 * num2;
        System.out.println(result);
    }

    /**
     * Divides first number and second number
     * @param num1
     * @param num2
     * @return result
     */
    public static void divide(float num1, float num2)
    {
        float result = num1 / num2;
        System.out.println(result);
    }
}
