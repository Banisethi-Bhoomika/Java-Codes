abstract class Student 
{
    int rollNo;
    int regNo;
    abstract void course();

    void getInput(int rollNo, int regNo) 
    {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }
}
class Kiitian extends Student 
{
    
    void course()
     {
        System.out.println("Course: BTech in Computer Science");
    }
}

public class Student2 
{
    public static void main(String[] args)
     {
       
        Kiitian kiitianObj = new Kiitian();

        kiitianObj.getInput(22053935, 2022001);

        System.out.println("Roll No: " + kiitianObj.rollNo);
        System.out.println("Reg No: " + kiitianObj.regNo);
        
        kiitianObj.course();
    }
}