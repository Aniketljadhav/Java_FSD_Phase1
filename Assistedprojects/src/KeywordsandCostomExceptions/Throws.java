package KeywordsandCostomExceptions;

public class Throws
{
    void Division() throws ArithmeticException
    {
        int a=30,b=0,rs;
rs = a / b;
        System.out.print("\n\t result is : " + rs);
    }
     public static void main(String[] args)
    {
Throws T = new Throws();
         try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        System.out.print("\n\tEnd.");
    }
}
