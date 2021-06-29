package summing_up;

public class Student extends Person {
    @Override
    public void talk() {
        super.talk();
        System.out.println("This is a Student");
    }
}
