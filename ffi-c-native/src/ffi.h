#ifndef ffi_h
#define ffi_h

struct Number {
 double n;
};

extern void print_hello_world(void);

extern int sum(int a, int b);

extern struct Number sum_numbers(struct Number a, struct Number b);

#endif /* ffi_h */
