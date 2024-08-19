import org.testng.annotations.*;
import org.testng.Assert;


public class DataProviderSum {

    @DataProvider(name = "sumNumbersData")
    public Object[][] sumNumbersData() {

        Object[][] objects = {
                {1, 1, 2},
                {2, 1, 3},
                {0, 1, 1},
                {-1, -1, -2},
                {2, -1, 1},
                {10, 1, 11},

        };
        return objects;
    }

    @Test(dataProvider = "sumNumbersData", groups = "testGroupA")
    public void testSum(int a, int b, int expectResult) {
        int actualResult = a+b;

        System.out.println("Actual sum is " + actualResult);
        System.out.println("Expected sum is " + expectResult);
        Assert.assertEquals(actualResult,expectResult, "Actual sum is " + actualResult + "; Expected sum is " + expectResult  );
    }

}
