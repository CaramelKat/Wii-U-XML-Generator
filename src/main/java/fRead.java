import com.google.common.base.Charsets;

import java.io.FileReader;
import java.io.FileWriter;

public class fRead {
    public static String readFile(String file){
        String result = "";
        try {
            //creating FileReader object.
            FileReader fr = new FileReader(file);
            int i;
            //read file.
            while((i=fr.read())!=-1){
                result += (char)i;
            }return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public static void writeFile(String str, String file){
        try {
            //Creating FileWriter object.
            //It will create a new file before writing if not exist.
            FileWriter fw = new FileWriter(file);
            fw.write(str);
            fw.flush();
            //Close file after write operation.
            fw.close();

            System.out.println("Contents written successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String convertToUTF8(String s) {
        byte bytes[];
        bytes = s.getBytes(Charsets.UTF_8);
        //CharMatcher legal = CharMatcher.javaLetterOrDigit();
        //String out = legal.removeFrom(s);
        return new String (bytes);
    }

}
