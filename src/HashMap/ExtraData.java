package HashMap;

import java.util.HashMap;
import java.util.Objects;

public class ExtraData
{
    private HashMap<String, Object> map;
    public ExtraData()
    {
        map = new HashMap();
    }

    public void putExtra(String name,int value)
    {
        map.put(name,value);
    }

    public int getIntExtra(String name)
    {
        return (int) map.get(name);
    }

    public void putExtra(String name,CharSequence value)
    {
        map.put(name,value);
    }

    public CharSequence getCharSequenceExtra(String name)
    {
        return (CharSequence) map.get(name);
    }

    public void putExtra(String name,Object value)
    {
        map.put(name,value);
    }

    public Object getObjectExtra(String name)
    {
        return  map.get(name);
    }

}


