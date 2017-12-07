public class StudentSort {
    private Student[] student;

    public StudentSort(Student[] student) {
        this.student = student;
    }

    public Student[] getSort() {
        for (int i = 1; i < student.length; i++) {
            Student xx = student[i];
            int x = student[i].getID();
            int j = binarySearch(student, 0, i , x);
            System.arraycopy(student, j, student, j+1, i-j);
            student[j] = xx;
        }
        return student;
    }

    private int binarySearch (Student[] stud, int l, int r, int x) {
        int mid = l + (r - l)/2;
        if (r >= l) {
            if (stud[mid].getID() == x)
                return mid;
            if (stud[mid].getID() > x)
                return binarySearch(stud, l, mid-1, x);
            return binarySearch(stud, mid+1, r, x);
        }
        return mid;
    }
}