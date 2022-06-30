import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class TextFile_Modification{
    public static void text_modification() throws IOException {

        //Read File
        File new_file = new File("C:\\Users\\pa.puja\\Desktop\\gemini.txt");
        FileReader fr = new FileReader(new_file);
        BufferedReader reader = new BufferedReader(fr);
        String str = reader.readLine();
        System.out.println("Text is:" + str);
        reader.close();

        //Write into File
        File write_file = new File("C:\\Users\\pa.puja\\Desktop\\gemini MIS.txt");
        FileWriter fw = new FileWriter(write_file);
        BufferedWriter writer = new BufferedWriter(fw);
        writer.write("New Text Updated");
        System.out.println("Data Entered");
        writer.close();

        //moving a text file
        File source_file = new File("C:\\Users\\pa.puja\\Desktop\\gemini.txt");
        File dest_file = new File("C:\\Users\\pa.puja\\Desktop\\pyt");
        Files.move(source_file.toPath(),dest_file.toPath(), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("file moved");

        //copying a text file
        File original_file = new File("C:\\Users\\pa.puja\\Desktop\\gemini MIS.txt");
        File copy_file = new File("C:\\Users\\pa.puja\\Desktop\\gemini1.txt");
        Files.copy(original_file.toPath(),copy_file.toPath(), StandardCopyOption.REPLACE_EXISTING);

        //last modified file
        File last_modified = new File("C:\\Users\\pa.puja\\Desktop\\dir");
        System.out.println(last_modified.lastModified());
        String s = String.valueOf(Files.getLastModifiedTime(last_modified.toPath()));
        System.out.println(s);

    }
    public static void main(String args[]) throws IOException {
        text_modification();
    }
}

