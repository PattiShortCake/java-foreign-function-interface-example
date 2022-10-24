#ifndef FFI_H
#define FFI_H

#ifdef __cplusplus
    class Number
    {
     private:
         double _value;

     public:
         Number();

         void setValue(double value);

         double getValue() {
             return _value;
         }
    };
#else
    typedef
        struct Number
            Number;
#endif

#ifdef __cplusplus
extern "C" {
#endif


#if defined(__STDC__) || defined(__cplusplus)
    extern void c_function(Number*);    /* ANSI C prototypes */
    extern Number* cplusplus_callback_function(Number*);
#else
    extern void c_function();           /* K&R style */
    extern Number* cplusplus_callback_function();
#endif

    extern int print_hello_world();
    extern int sum(int a, int b);

#ifdef __cplusplus
}
#endif

#endif /* FFI_H */
