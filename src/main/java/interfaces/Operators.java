package interfaces;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class Operators
{
    static UnaryOperator<Integer> unaryOperator = numero -> numero + numero;
    static DoubleUnaryOperator doubleUnaryOperator = numero -> numero + numero;
    static IntUnaryOperator intUnaryOperator = numero -> numero + numero;
    static LongUnaryOperator longUnaryOperator = numero -> numero + numero;

    static BinaryOperator<Integer> binaryOperator = (
        numero,
        numero2 ) -> numero + numero2;

    static DoubleBinaryOperator doubleBinaryOperator = (
        numero,
        numero2 ) -> numero + numero2;

    static IntBinaryOperator intBinaryOperator = (
        numero,
        numero2 ) -> numero + numero2;

    static LongBinaryOperator longBinaryOperator = (
        numero,
        numero2 ) -> numero + numero2;

}
