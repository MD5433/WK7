public class Business extends Person{
    private long number;

    //constructor

    public Business(String name, String email, long number) {
        super(name, email);
        this.number = number;
    }

    public Business(long number) {
        this.number = number;
    }


    //getters and setters

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    //method

    @Override
    public void display() {
        super.display();
        System.out.println(" and their phone number is " + number);
    }
}
