package interfaces;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

public class Functions
{
    static Function<String,Integer> function = texto -> Integer.parseInt( texto );
    static Function<Integer,String> composeFunction = numero -> numero + "";
    static IntFunction<String> intFunction = numero -> numero + "";
    static DoubleFunction<String> doubleFunction = numero -> numero + "";
    static LongFunction<String> longFunction = numero -> numero + "";
    static ToDoubleFunction<String> toDoubleFunction = texto -> Double.parseDouble( texto );
    static ToIntFunction<String> toIntFunction = texto -> Integer.parseInt( texto );
    static ToLongFunction<String> toLongFunction = texto -> Long.parseLong( texto );

    static IntToDoubleFunction intToDoubleFunction = numero -> numero;
    static IntToLongFunction intToLongFunction = numero -> numero;
    static LongToDoubleFunction longToDoubleFunction = numero -> numero;

    static DoubleToIntFunction doubleToIntFunction = numero -> (int) numero;
    static DoubleToLongFunction doubleToLongFunction = numero -> (long) numero;
    static LongToIntFunction longToIntFunction = numero -> (int) numero;

    static BiFunction<Double,Long,Integer> biFunction = (
        numero1,
        numero2 ) -> numero1.intValue() + numero2.intValue();

    static ToDoubleBiFunction<Integer,Integer> toDoubleBiFunction = (
        numero1,
        numero2 ) -> numero1 + numero2;

    static ToIntBiFunction<Double,Long> toIntBiFunction = (
        numero1,
        numero2 ) -> numero1.intValue() + numero2.intValue();

    static ToLongBiFunction<Integer,Double> toLongBiFunction = (
        numero1,
        numero2 ) -> numero1 + numero2.intValue();

}
