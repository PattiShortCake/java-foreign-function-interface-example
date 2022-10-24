# ffi-c-native
## Build C code

### Bootstrapping
```
rm -Rv .deps/ .libs/ autom4te.cache/ config/ m4/ aclocal.m4 config.log config.status configure libtool Makefile Makefile.in
aclocal && autoconf && libtoolize && automake --add-missing
```


### Building
```
./configure && make
jextract --source --output ../ffi-c/build/jextract/classes --target-package com.github.pattyshortcake.ffi.jextract -I . -l ffi src/ffi.h
```

## References
- https://github.com/openjdk/jextract