#include <iostream>
using namespace std;

// Abstracting the details of a complex operation
int square(int a) {
    // Complex logic or implementation details
    return (a*a);
}

// Abstracting the details of another operation
double cube(double x) {
    // Another complex logic or implementation details
    return (x*x*x);
}

int main() {
    // Using the abstracted functions without knowing their implementations
    int result1 = square(3);
    double result2 = cube(4.0);

    // Displaying the results
    cout << "Result of square: " << result1 << endl;
    cout << "Result of cube: " << result2 << endl;

    return 0;
}