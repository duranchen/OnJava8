package interfaces.interfaceprocessor;

interface StringProcessor extends Processor {
    @Override
    String process(Object input);
    String S = "If she weighs the same as a duck, " + "she's made of wood";

    static void main(String[] args) {
        Applicator.apply(new Upcase(),S);


    }
}

class Upcase implements StringProcessor {

    @Override
    public String process(Object input) {

        return ((String)input).toUpperCase();
    }
}
