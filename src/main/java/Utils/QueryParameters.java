package Utils;

import java.util.HashMap;
import java.util.Map;

public class QueryParameters {
    public static Map<String, Object> GetProductsList(String apiKey,String format,int pageSize)
    {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("apiKey", apiKey);
        queryParams.put("format", format);
        queryParams.put("pageSize",pageSize);
        return queryParams;
    }

}
