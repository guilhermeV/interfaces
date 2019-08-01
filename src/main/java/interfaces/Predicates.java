package interfaces;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class Predicates
{
    static Predicate<Integer> predicate = numero -> numero > 2;
    static DoublePredicate doublePredicate = numero -> numero > 2;
    static IntPredicate intPredicate = numero -> numero > 2;
    static LongPredicate longPredicate = numero -> numero > 2;
    static BiPredicate<Integer,Double> biPredicate = (
        numero1,
        numero2 ) -> numero1 + numero2 > 2;
}
