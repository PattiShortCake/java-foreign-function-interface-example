#ifndef ffi_h
#define ffi_h

// https://en.wikipedia.org/wiki/Name_mangling#Real-world_effects_of_C++_name_mangling
#ifdef __cplusplus
extern "C" {
#endif

    extern int print_hello_world();
    extern int sum(int a, int b);

#ifdef __cplusplus
}
#endif

#endif /* ffi_h */
