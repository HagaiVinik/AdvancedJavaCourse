import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortedGroup<T extends Comparable<T>>
{
    private ArrayList<T> arrayList;

    public SortedGroup()
    {
        arrayList = new ArrayList<T>();
    }

    public void add(T element)
    {
        arrayList.add(element);
        Collections.sort(arrayList);
    }

    public void remove(T element)
    {
        this.arrayList.removeIf(t -> t.equals(element));
    }

    public Iterator<T> iterator()
    {
        return this.arrayList.iterator();
    }

    @Override
    public String toString()
    {
        return arrayList.toString();
    }
}
