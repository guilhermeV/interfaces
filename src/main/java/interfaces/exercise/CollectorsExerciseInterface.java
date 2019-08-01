package interfaces.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public interface CollectorsExerciseInterface
    extends
        Collector<Signal,ArrayList<Signal>,List<Signal>>
{

    int getOriginalSize();

}
