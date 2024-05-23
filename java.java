using System;

class Program
{
    // Abstracting the details of a complex operation
    static int Square(int a)
    {
        // Complex logic or implementation details
        return (a * a);
    }

    // Abstracting the details of another operation
    static double Cube(double x)
    {
        // Another complex logic or implementation details
        return (x * x * x);
    }

    static void Main()
    {
        // Using the abstracted functions without knowing their implementations
        int result1 = Square(3);
        double result2 = Cube(4.0);

        // Displaying the results
        Console.WriteLine("Result of square: " + result1);
        Console.WriteLine("Result of cube: " + result2);

        Console.ReadLine(); // To prevent the console from closing immediately
    }
}