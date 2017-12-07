public class Main {
    public static void main(String[] args) {
        String inputFile = "input.csv";
        String outputFile = "output.csv";
        TextReader input = new TextReader(inputFile);
        Student[] student = input.getStudentArr();
        StudentSort sorter = new StudentSort(student);
        System.out.println("Reading " + inputFile);
        Student[] studentSort = sorter.getSort();
        TextWriter output = new TextWriter(studentSort, outputFile);
        output.print();
        System.out.println("Writing to " + outputFile);
    }
}