import java.io.*;

public class FileCopyStreams
{
    public static void main(String arr[]) throws IOException
    {
        int s;
        try
        {
            FileInputStream in= new FileInputStream("input1.txt") ; // opens file
            FileOutputStream out= new FileOutputStream("output1.txt"); // writes the file 

            while ((s= in.read()) != -1) // here the text is read as bytes which stored to an integer data type.
            {
                out.write((char)s); // int datatpe is converted to string dtatatype and is then written.
            }
            in.close();
            out.close();
            System.out.println("File successfully copied.");
        }
        catch (Exception e)
        {
            System.out.println("File not Found.\n" + e);
        }
    }
}
