package LuyenTap.Candidate.Model;

public class Information {
        private int n;
        private Student[] students;


    public Information() {
          students = new Student[100];
            n = 10;
        }
        public Information(int n ){
            if (n>=0){
                this.n=n;
            }else {
                this.n=0;
            }
            students = new Student[n];
        }

        public void Input1() {
            for (int i = 0; i < n; i++) {
                this.students[i] = new Student();
                this.students[i].Input();
            }
        }

        public void Output1() {
            for (int i = 0; i < n; i++) {
                this.students[i].Output();
            }
        }

    public void pointList() {
        for (int i = 0; i < n; i++) {
            this.students[i].PointList();
        }
    }
}
