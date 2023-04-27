package map地圖;

import java.util.HashMap;
import java.util.Objects;

public class ExtraData {
    private HashMap<String, Object> map;
    public ExtraData()
    {
        map=new HashMap();
    }
    public void 設定int資料(String name, int value)
    {
        map.put(name,value);
    }

    public int 取得int資料(String name)
    {
        return (int)map.get(name);
    }

    public void 設定字串資料(String name,CharSequence value)
    {
        map.put(name,value);
    }

    public CharSequence 取得字串資料(String name)
    {
        return (CharSequence) map.get(name);
    }

    public void 設定map資料(String name,Object value)
    {
        map.put(name,value);
    }
    public Object 取得map資料(String name)
    {
     return map.get(name);
    }

}
