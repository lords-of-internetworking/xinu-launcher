# Contains the raw file used for my OS xinu launcher

You will need to change 2 lines in the Java code.

Works best if you add the following to .zshrc or .bashrc:

```
alias xinu="cd ~/<xinudir>/compile
make
cd ~/xinlaunch/
java xinlaunch &"
```
