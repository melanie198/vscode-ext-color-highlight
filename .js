/ Abstracting the details of a complex operation
function square(a) {
    // Complex logic or implementation details
    return a * a;
}

// Abstracting the details of another operation
function cube(x) {
    // Another complex logic or implementation details
    return x * x * x;
}

function main() {
    // Using the abstracted functions without knowing their implementations
    const result1 = square(3);
    const result2 = cube(4.0);

    // Displaying the results
    console.log("Result of square:", result1);
    console.log("Result of cube:", result2);
}

// Call the main function
main();