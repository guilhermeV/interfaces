package interfaces;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

import com.google.common.base.Supplier;

public class Suppliers
{
    static Supplier<String> supplier = () -> "texto";
    static BooleanSupplier booleanSupplier = () -> true;
    static DoubleSupplier doubleSupplier = () -> 2.0;
    static IntSupplier intSupplier = () -> 1;
    static LongSupplier longSupplier = () -> 3l;
}
