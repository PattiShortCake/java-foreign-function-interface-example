#include <iostream>
#include <string>
#include <stdio.h>

#include "ffi.h"

extern int print_hello_world() {
    std::cout << "Hello from c++ code!" << std::endl;
    fflush(stdout);
    return 0;
}

int sum(int a, int b) {
    return a + b;
}

//struct Number sum_numbers(struct Number a, struct Number b) {
//    struct Number sum = { a.n + b.n };
//    return sum;
//}