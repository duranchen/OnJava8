package interfaces;

class Bing implements Operations {
    public void execute(){
        Operations.show("Bing");
    }
}
class Crack implements Operations {
    public void execute(){
        Operations.show("Crack");
    }
}
class Twist implements Operations {
    public void execute(){
        Operations.show("Twist");
    }
}

public class Machine {
    public static void main(String[] args) {
        Operations.runOps(
                new Bing(),new Crack(),new Twist()
        );
    }
}
