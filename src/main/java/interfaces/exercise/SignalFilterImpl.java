package interfaces.exercise;

import java.util.List;
import java.util.stream.Collectors;

public class SignalFilterImpl
    implements
        SignalFilter
{

    @Override
    public List<Signal> signalFilter(
        final List<Signal> signals,
        final int limitByKey )
    {
        signals.stream().collect( Collectors.toList() );
        return null;
    }

}
