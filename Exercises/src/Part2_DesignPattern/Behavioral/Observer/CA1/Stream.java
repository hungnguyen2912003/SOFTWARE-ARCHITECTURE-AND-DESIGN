package Part2_DesignPattern.Behavioral.Observer.CA1;

import java.util.ArrayList;
import java.util.List;

public class Stream<T> {
    private List<Listener<T>> list = new ArrayList<>();

    public void addEvent(T t) {
        for (Listener<T> listener : list) {
            listener.Update(t);
        }
    }

    public void addListener(Listener<T> l) {
        list.add(l);
    }
}
