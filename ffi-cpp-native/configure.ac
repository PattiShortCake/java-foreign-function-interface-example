# Must init the autoconf setup
# The first parameter is project name
# second is version number
# third is bug report address
AC_INIT([ffi], [1.0])

# Safety checks in case user overwritten --srcdir
#AC_CONFIG_SRCDIR([src])

# Store the auxiliary build tools (e.g., install-sh, config.sub, config.guess)
# in this dir (build-aux)
AC_CONFIG_AUX_DIR([config])

# Init automake, and specify this program use relaxed structures.
# i.e. this program doesn't follow the gnu coding standards, and doesn't have
# ChangeLog, COPYING, AUTHORS, INSTALL, README etc. files.
AM_INIT_AUTOMAKE([-Wall -Werror foreign])

#AC_CONFIG_MACRO_DIRS([m4])

AM_PROG_AR
LT_INIT
AC_ENABLE_SHARED
AC_ENABLE_STATIC

# Check for CXX compiler
AC_PROG_CC
AC_PROG_CXX
# We can add more checks in this section

# Tells automake to create a Makefile
# See https://www.gnu.org/software/automake/manual/html_node/Requirements.html
AC_CONFIG_FILES([
    Makefile
    src/Makefile
])

# Generate the output
AC_OUTPUT