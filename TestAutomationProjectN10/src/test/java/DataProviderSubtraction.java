import org.testng.annotations.*;
import org.testng.Assert;


public class DataProviderSubtraction {

    @DataProvider(name = "subtractionNumbersData")
    public Object[][] sumNumbersData() {

        Object[][] objects = {
                {1, 1, 0},
                {2, 1, 1},
                {1, 1, 0},
                {-1, -1, 0},
                {2, 1, 1},
                {10, 1, 9},

        };
        return objects;
    }

    @Test(dataProvider = "subtractionNumbersData", groups = "testGroupA")
    public void testSubtraction(int a, int b, int expectResult) {
        int actualResult = a-b;

        System.out.println("Actual sum is " + actualResult);
        System.out.println("Expected sum is " + expectResult);
        Assert.assertEquals(actualResult,expectResult, "Actual sum is " + actualResult + "; Expected sum is " + expectResult  );
    }

}
