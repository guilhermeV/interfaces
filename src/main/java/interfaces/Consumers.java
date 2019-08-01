package interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class Consumers
{
    static String lastStringResult;

    static Double lastDoubleResult;

    static Integer lastIntegerResult;

    static Long lastLongResult;

    static Consumer<String> consumer = texto -> lastStringResult = texto;

    static BiConsumer<String,Integer> biConsumer = (
        texto,
        numero ) -> lastStringResult = texto + numero;

    static DoubleConsumer doubleConsumer = numero -> lastDoubleResult = numero;

    static IntConsumer intConsumer = numero -> lastIntegerResult = numero;

    static ObjDoubleConsumer<String> objDoubleConsumer = (
        texto,
        numero ) -> lastStringResult = texto + numero;

    static ObjIntConsumer<String> objIntConsumer = (
        texto,
        numero ) -> lastStringResult = texto + numero;

    static ObjLongConsumer<String> objLongConsumer = (
        texto,
        numero ) -> lastStringResult = texto + numero;

}
