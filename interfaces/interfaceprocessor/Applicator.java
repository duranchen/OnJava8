package interfaces.interfaceprocessor;

public class Applicator {
    public static void apply(Processor p, Object s) {
         System.out.println(p.process(s));
    }
}
