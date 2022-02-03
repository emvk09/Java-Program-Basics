import java.io.*;

public class FileCopyReaderWriter
{
    public static void main(String arr[]) throws IOException
    {
        String S;
        try
        {
            FileReader fr= new FileReader("input.txt");  // opens file
            BufferedReader br= new BufferedReader(fr);  // reads the file
            FileWriter fw= new FileWriter("output.txt"); // writes the file 

            while ((S= br.readLine()) != null) // here the text is read as a lines or strings. read() method reads the text as single character
            {
                fw.write(S + "\n"); //writes the String S to the output file
                fw.flush();
            }
            fr.close();
            fw.close();
            br.close();
            System.out.println("File successfully copied.");
        }
        catch (Exception e)
        {
            System.out.println("File not Found.\n" + e);
        }
    }
}
