import com.google.common.base.Charsets;

import java.io.FileReader;
import java.io.FileWriter;

public class fRead {
    public static String readFile(String txt) {
        String result = "";
        try {
            //creating FileReader object.
            FileReader fr =
                    new FileReader(txt);

            int i;
            //read file.
            while((i=fr.read())!=-1){
                result += (char)i;
            }
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
    public static void loadConfig() {
        int pipeIndex = -1;
        String file = fRead.readFile("config.txt");
        String userName = "";
        String password = "";
        String clientID = "";
        String clientSecret = "";
        String appID = "";
        if (file != null) {
            pipeIndex = file.indexOf("|");
        }
        while (pipeIndex != -1) {
            userName = file.substring(0, file.indexOf("|"));
            file = file.substring(pipeIndex + 1, file.length());

            pipeIndex = file.indexOf("|");
            if (pipeIndex == -1) break;
            password = file.substring(0, pipeIndex);
            file = file.substring(pipeIndex + 1, file.length());

            pipeIndex = file.indexOf("|");
            if (pipeIndex == -1) break;
            clientID = file.substring(0, pipeIndex);
            file = file.substring(pipeIndex + 1, file.length());

            pipeIndex = file.indexOf("|");
            if (pipeIndex == -1) break;
            clientSecret = file.substring(0, pipeIndex);
            file = file.substring(pipeIndex + 1, file.length());

            pipeIndex = file.indexOf("|");
            if (pipeIndex == -1) break;
            appID = file.substring(0, pipeIndex);
            file = file.substring(pipeIndex + 1, file.length());

            pipeIndex = file.indexOf("|");
            if (pipeIndex == -1) break;
        }
        if (userName.equals("")) {
            System.out.println("unable to get username");
        } else if (password.equals("")) {
            System.out.println("unable to get password");
        } else if (clientID.equals("")) {
            System.out.println("unable to get clientID");
        } else if (clientSecret.equals("")) {
            System.out.println("unable to get clientSecret");
        } else if (appID.equals("")) {
            System.out.println("unable to get appID");}
         else {
            xmlBuilder.makeWWP(
                    userName,
                    password,
                    clientID,
                    clientSecret,
                    appID);
        }
    }

}
