import org.testng.annotations.*;
import org.testng.Assert;


public class DataProviderDivision {

    @DataProvider(name = "divisionNumbersData")
    public Object[][] divisionNumbersData() {

        Object[][] objects = {
                {1, 1, 1},
                {2, 1, 2},
                {0, 1, 0},
                {-1, -1, 1},
                {2, -1, -2},
                {10, 1, 10},

        };
        return objects;
    }

    @Test(dataProvider = "divisionNumbersData", groups = "testGroupA")
    public void testDivision(int a, int b, int expectResult) {
        int actualResult = a/b;

        System.out.println("Actual sum is " + actualResult);
        System.out.println("Expected sum is " + expectResult);
        Assert.assertEquals(actualResult,expectResult, "Actual sum is " + actualResult + "; Expected sum is " + expectResult  );
    }

}
