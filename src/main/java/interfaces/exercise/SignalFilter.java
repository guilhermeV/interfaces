package interfaces.exercise;

import java.util.List;

public interface SignalFilter
{

    List<Signal> signalFilter(
        final List<Signal> signals,
        int limitByKey );

}
