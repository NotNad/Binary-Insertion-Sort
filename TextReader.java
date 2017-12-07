import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {
    private String file;

    public TextReader(String file) {
        this.file = file;
    }

    public Student[] getStudentArr() {
        int lines = 0;
        try (BufferedReader br1 = new BufferedReader(new FileReader(file))) {
            while (br1.readLine() != null)
                lines++;
            br1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Student[] arr = new Student[lines];
        try (BufferedReader br2 = new BufferedReader(new FileReader(file))) {
            String line;
            for (int i = 0; i < lines; i++) {
                line = br2.readLine();
                String[] info = line.split(",");
                Student stud = new Student(Integer.parseInt(info[0]), info[1], Integer.parseInt(info[2]), Double.parseDouble(info[3]));
                arr[i] = stud;
            }
            br2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }
}