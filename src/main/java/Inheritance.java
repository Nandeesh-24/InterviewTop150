

class Car{
    public void display(){
        System.out.println("Car executed");
    }

    public void engine(){
        System.out.println("engine working");
    }
}
//single inheritence
class Honda extends Car{

    public void display() {
        System.out.println("Honda executed");
    }

    public void service(){
        System.out.println("car serviced");
    }
}

//multi level inheritence
class City extends Honda{
    @Override
    public void display() {
        System.out.println("Honda city executed");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Honda car1 = new City();
        car1.display();
    }
}
