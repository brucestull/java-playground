# Print A Thing

// Compile:
// NOTE: Need to add both files if we are using default package (We are not using package declaration `package com.example;`)
// javac .\src\PrintAThing.java .\src\RunIt.java
// Run:
// java -cp .\src RunIt
// java -classpath .\src RunIt


```powershell
PS C:\Users\FlynntKnapp\Programming\java-playground> ls

    Directory: C:\Users\FlynntKnapp\Programming\java-playground

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d----            5/6/2023    17:21                .vscode
d----            5/7/2023    06:08                src
-a---            5/6/2023    15:58            572 .gitignore
-a---            5/6/2023    17:31            133 README.md

PS C:\Users\FlynntKnapp\Programming\java-playground> cd .\src\
PS C:\Users\FlynntKnapp\Programming\java-playground\src> ls

    Directory: C:\Users\FlynntKnapp\Programming\java-playground\src

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d----            5/7/2023    06:10                com
-a---            5/6/2023    17:32            386 AddAThing.java
-a---            5/6/2023    17:40            620 CheckAnArray.java
-a---            5/6/2023    17:21            174 PrintTheThing.java

PS C:\Users\FlynntKnapp\Programming\java-playground\src> Get-ChildItem -D 2 .\com\   

    Directory: C:\Users\FlynntKnapp\Programming\java-playground\src\com

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d----            5/7/2023    06:16                print_a_thing

    Directory: C:\Users\FlynntKnapp\Programming\java-playground\src\com\print_a_thing

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
-a---            5/7/2023    06:11            416 PrintAThing.class
-a---            5/7/2023    06:10            160 PrintAThing.java
-a---            5/7/2023    06:16            277 README.md
-a---            5/7/2023    06:11            430 RunIt.class
-a---            5/7/2023    06:16            340 RunIt.java

PS C:\Users\FlynntKnapp\Programming\java-playground\src> javac .\com\print_a_thing\
error: invalid flag: .\\com\\print_a_thing\\
Usage: javac <options> <source files>
use --help for a list of possible options
PS C:\Users\FlynntKnapp\Programming\java-playground\src> javac .\com\print_a_thing\PrintAThing.java .\com\print_a_thing\RunIt.java
PS C:\Users\FlynntKnapp\Programming\java-playground\src> java com.print_a_thing.RunIt
The Big Ol' Thing!
The Big Ol' Thing!
PS C:\Users\FlynntKnapp\Programming\java-playground\src>
```
