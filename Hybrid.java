/* Create a package ‘studpack’ which incorporates Student class and Sports interface. Create a Result class 
that extends Student class and implements a sports interface to display the total marks. The details of the 
classes and interfaces described below. Use appropriate access specifier as per the requirement. (*method, -variable) 
Create a java program Hybrid.java that imports Result class from studpack and display the total for 5 students.*/

// the package (Result.java), must be saved in a folder which should be present in the same directory of the java file
// the package file name need not to be the package name defined in the package file
// but the folder name must be same as that of the package name defined in the program file
// here it is stored in the folder named studpack

import studpack.*;
class Hybrid
{
    public static void main(String arg[])
    {
        Result st1 = new Result("Abhiram", 9, 86.75f, 69, 74);
        Result st2 = new Result("Ajith", 07, 79, 90.5f, 78);
        Result st3 = new Result("Emil", 33, 80, 90.5f, 89);
        Result st4 = new Result("Dinoy", 21, 72.5f, 60, 98);
        Result st5 = new Result("Jijo", 19, 90, 80.5f, 83.5f);
        st1.displayTotal();
        st2.displayTotal();
        st3.displayTotal();
        st4.displayTotal();
        st5.displayTotal();
    }
}