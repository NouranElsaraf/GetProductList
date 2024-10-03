package Test;

import Utils.QueryParameters;
import base.BestBuyBase;
import io.restassured.response.Response;
import org.testng.Assert;
import utiliTest.CommonMethod;

import java.util.Map;

public class TestApi extends BestBuyBase {
@org.testng.annotations.Test
public void getAPIProductListTest()
{
        Map<String, Object> queryParams = QueryParameters.GetProductsList("eNyJywC9sRLam8uZXItdrUeo","json",10);
        Response response = ((Response) CommonMethod.get("products", queryParams)
                .then().statusCode(200)
                .log().all());
        Assert.assertEquals(response.getStatusCode(), 200, "Status code mismatch!");

}

}
