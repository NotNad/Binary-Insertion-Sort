import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {
    private Student[] student;
    private String file;

    public TextWriter(Student[] student, String txtFile) {
        this.student = student;
        this.file = txtFile;
    }

    public void print() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            for (int i = 0; i < student.length; i++) {
                fileWriter.append(student[i].getId() + ",");
                fileWriter.append(student[i].getName() + ",");
                fileWriter.append(student[i].getAge() + ",");
                fileWriter.append(student[i].getGPA());
                fileWriter.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}