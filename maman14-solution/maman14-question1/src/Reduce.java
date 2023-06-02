import java.util.Iterator;

public class Reduce
{
    static<T extends Comparable<T>> SortedGroup<T> reduce(SortedGroup<T> group, T element)
    {
        SortedGroup<T> otherGroup = new SortedGroup<T>();
        Iterator<T> iterator = group.iterator();

        while (iterator.hasNext())
        {
            T t = iterator.next();
            if (t.compareTo(element) > 0)
            {
                otherGroup.add(t);
            }
        }

        return otherGroup;
    }
}
