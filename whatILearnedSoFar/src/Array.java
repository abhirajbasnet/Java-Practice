public class Array {
    //Array are used to store the multiples values in the single variable, instead of the declaring separate variables for each variable
    //To declare an array define the variable type with square brackets

    private String[] studentName;
    private int[] studentRollNumber;

    public Array(String[] studentName, int[] studentRollNumber) {
        //{"Hari Regmi", "Harry Porter", "Christiano Ronaldo", "Lionel Messi"}
        //{1,2,3,4,5,6,7,8}

        this.studentName = studentName;
        this.studentRollNumber = studentRollNumber;
    }

    public String[] getStudentName() {
        return studentName;
    }

    public int[] getStudentRollNumber() {
        return studentRollNumber;
    }

    public void getStudentNameAndRollNumber(){
        System.out.println("The Name of the Student is " + this.studentName + " and the Student Roll Number is " + this.studentRollNumber);
    }
}

