package interfaces;

import java.util.function.Consumer;

public class ConsumerClass implements Consumer<String>
{
    static String lastResult;

    @Override
    public void accept(
        String texto )
    {
        lastResult = texto;
    }
    
    public static ConsumerClass instance() {
        return new ConsumerClass();
    }

}
