import java.io.*;

/**
 * Created by KPS on 8/6/2020.
 */
public class Main {
    public static void main(String[] args) {
        File path = new File("d:\\employee.txt");
        String[] strings = new String[10];
        try(FileReader reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line = " ";
            int i = 0 ;
            while ((line =bufferedReader.readLine())!= null){
                strings[i] = line;
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String s : strings){
            System.out.println(s);
        }
    }
}
