// Create a Student class with the properties studentID (int), name (string), degree
// (string), mobile (string). 

// Create a constructor for the Student class to set values for name, degree and mobile
// number. The studentID should be generated by the system making use of a static
// property called max which is initialized to 100 initially to assign a unique value for each
// student id.


public class Student {
    private int studentID;
    private String name;
    private String degree;
    private String mobile;

    static int max = 100;

    public Student() {
        this.studentID = max;
        max++;
    }

    public Student(String name, String degree, String mobile) {
        this.name = name;
        this.degree = degree;
        this.mobile = mobile;
        this.studentID = max++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public void print() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Degree: " + degree);
        System.out.println("Mobile: " + mobile);
    }

    public static int getNextStudentID() {
        return max;
    }
}

