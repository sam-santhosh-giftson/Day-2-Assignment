class Program 
{
 
    public static void main(String[] args)
    {
        System.out.println("The input of command line argument is" + args[0]+" " + args[1]);
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int sum  = num1 + num2 ;
        System.out.println("The sum of values is : " + sum);
    }

}
