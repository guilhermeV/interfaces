package interfaces.exercise;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import org.checkerframework.checker.units.qual.A;

// Interface Collector<T,A,R>
// Type Parameters:
// T - the type of input elements to the reduction operation
// A - the mutable accumulation type of the reduction operation (often hidden as
// an implementation detail)
// R - the result type of the reduction operation

// Dada uma lista de sinais(Signal) acumule os resultados em um ArrayList
// Guarde o valor do size original
// Retorne uma List<> (a interface mesmo) contendo no máximo um elemento

public class CollectorsExercise
    implements
        Collector<T,A,R>
{

    private int maxSize;

    @Override
    public Supplier<A> supplier()
    {
        return null;
    }

    @Override
    public BiConsumer<A,T> accumulator()
    {
        return null;
    }

    @Override
    public BinaryOperator<A> combiner()
    {
        return null;
    }

    @Override
    public Function<A,R> finisher()
    {
        return null;
    }

    @Override
    public Set<Characteristics> characteristics()
    {
        return null;
    }

    public Collector<T,A,R> creatingCollector()
    {
        return Collector.of( supplier(), accumulator(), combiner(), finisher() );
    }

    public int getMaxSize()
    {
        return maxSize;
    }

}
