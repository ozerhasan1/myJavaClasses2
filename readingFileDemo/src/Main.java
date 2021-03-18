import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        int total=0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Javademos\\readingFileDemo\\src\\sayılar.txt"));
            String line = null;
            while (reader.readLine() != null) {
                total+=Integer.valueOf(line);
            System.out.println("toplam = "+total);
            } catch(Exception) {
                    e.printStackTrace();
}
        } catch (FileNotFoundException e) {
            e.printStackTrace();
    }
        finally {
            try {
                reader.close();
            }catch (Exception exception) {
            }
            }
        }
    }
}
