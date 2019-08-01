package interfaces.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsExerciseSolved
    implements
        CollectorsExerciseInterface
{

    int originalSize;

    @Override
    public Supplier<ArrayList<Signal>> supplier()
    {
        return () -> new ArrayList<Signal>();
        // return ArrayList::new;
    }

    @Override
    public BiConsumer<ArrayList<Signal>,Signal> accumulator()
    {
        return (
            list,
            element ) -> list.add( element );
        // return ArrayList::add;
    }

    @Override
    public BinaryOperator<ArrayList<Signal>> combiner()
    {
        final BinaryOperator<ArrayList<Signal>> addAll = (
            left,
            right ) -> {
            final ArrayList<Signal> newList = new ArrayList<Signal>( left );
            right.stream().forEach( signal -> newList.add( signal ) );
            return newList;
        };

        final BinaryOperator<ArrayList<Signal>> maxBySize = (
            list1,
            list2 ) -> list1.size() > list2.size() ? list1 : list2;

        return addAll;
    }

    @Override
    public Function<ArrayList<Signal>,List<Signal>> finisher()
    {
        return list -> {
            originalSize = list.size();
            return list.stream().limit( 1 ).collect( Collectors.toList() );
        };
    }

    @Override
    public Set<Characteristics> characteristics()
    {
        return Collections.singleton( Characteristics.UNORDERED );
    }

    public Collector<Signal,ArrayList<Signal>,List<Signal>> creatingCollector()
    {
        return Collector.of( supplier(), accumulator(), combiner(), finisher() );
    }

    public static CollectorsExerciseSolved getInstance()
    {
        return new CollectorsExerciseSolved();
    }

    @Override
    public int getOriginalSize()
    {
        return originalSize;
    }

}
