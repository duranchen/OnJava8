package interfaces.interfaceprocessor;

import interfaces.filters.Filter;
import interfaces.filters.LowPass;
import interfaces.filters.Waveform;

class FilterAdapter implements Processor {

    Filter filter;

    FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}

public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Applicator.apply(new FilterAdapter(new LowPass(1.0)), w);
    }
}
