import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.NumberMonthRest;

public class NumberMonthRestTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/NumberMonthRest.csv")
    public void testSempleOne(int expected,int income,int expenses, int threshold) {
        NumberMonthRest service = new NumberMonthRest();

        //int expected = 3;
        int actual = service.calcNumderMonthRest(income, expenses,threshold);
        //System.out.println(expected + "== ? ==" + actual);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testSempleTwo() {
//        NumberMonthRest service = new NumberMonthRest();
//
//        int expected = 2;
//        int actual = service.calcNumderMonthRest(100_000, 60_000, 150_000);
//        //System.out.println(expected + "== ? ==" + actual);
//
//        Assertions.assertEquals(expected, actual);
//    }
}