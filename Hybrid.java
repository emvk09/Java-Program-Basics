/* Create a package ‘studpack’ which incorporates Student class and Sports interface. Create a Result class 
that extends Student class and implements a sports interface to display the total marks. The details of the 
classes and interfaces described below. Use appropriate access specifier as per the requirement. (*method, -variable) 
Create a java program Hybrid.java that imports Result class from studpack and display the total for 5 students.*/

/*After saving the package as 'Result.java', compile the package by: 'javac -d . Result.java'
This will create a new folder 'studpack' in the same directory.
NB: while writing the import statment, never use * operator (import studpack.*). Instead mention the required class name.
Now, as usual, compile and run the Hybrid.java file */

import studpack.Result;
class Hybrid
{
    public static void main(String arg[])
    {
        Result st1 = new Result("Gregory", 12, 86.75f, 69, 74);
        Result st2 = new Result("emvk", 9, 79, 90.5f, 78);
        Result st3 = new Result("Samuel", 36, 80, 90.5f, 89);
        Result st4 = new Result("Hazel", 21, 72.5f, 60, 98);
        Result st5 = new Result("Sarah", 19, 90, 80.5f, 83.5f);
        st1.displayTotal();
        st2.displayTotal();
        st3.displayTotal();
        st4.displayTotal();
        st5.displayTotal();
    }
}
