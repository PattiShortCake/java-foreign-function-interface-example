#include <stdio.h>
#include <string.h>

#include "ffi.h"

void print_hello_world(void) {
    printf("Hello from c-code!\n");
    fflush(stdout);
}

int sum(int a, int b) {
    return a + b;
}

struct Number sum_numbers(struct Number a, struct Number b) {
    struct Number sum = { a.n + b.n };
    return sum;
}