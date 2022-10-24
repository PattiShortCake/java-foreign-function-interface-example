#include <iostream>
#include <string>
#include <stdio.h>

#include "Ffi.h"

int print_hello_world() {
    std::cout << "Hello from c++ code!" << std::endl;
    fflush(stdout);
    return 0;
}

int sum(int a, int b) {
    return a + b;
}


Number::Number() {}

void Number::setValue(double value) {
    _value = value;
}

struct NumberC sum_numbers(struct NumberC a, struct NumberC b) {
    struct NumberC sum = { a.value + b.value };
    return sum;
}