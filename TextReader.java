import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

public class TextReader {
    private String path;

    private static Logger logger = Logger.getLogger(TextReader.class.getName());

    public enum Mark {
         START, END
    };

    private TextReader(String path) {
        this.path = path;
    };

    private void execute() {
        List <Integer> = valueList = new ofjectList<>();
        try (FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader (fr)){
                    String line = null;
            while ((line = br.readLine()) != null) {
                valueList.add(new Integer(line));
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

        for(Integer value : valueList) {
            System.out.plintln(value);
        }
    }

        
        public static void main(String...args)
        {
            logger.info(Mark.START.name());
            new TextReader(args[0].execute());
            logger.info(Mark.END.name());
        }
}