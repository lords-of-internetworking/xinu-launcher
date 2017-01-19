# XINU Launcher

This contains the raw file used for my OS CS 354 xinu launcher.
You will need to change 2 lines in the Java code to match your setup.
I extracted these to global variables, called XINU_DIRECTORY and XINU_BIN_NAME.

# Shell Command

Works best if you add the following to .zshrc or .bashrc:

```
alias xinu="cd ~/<xinudir>/compile
make
cd ~/xinlaunch/
java xinlaunch &"
```
