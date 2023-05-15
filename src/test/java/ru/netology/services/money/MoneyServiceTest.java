package ru.netology.services.money;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.MoneyService;


public class MoneyServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/Resources/Money.csv")
    public void testNocash(int expected, int income, int expenses, int threshold) {
        MoneyService service = new MoneyService();
        //  int expected = 3;
        // int income = 10_000; // доход от работы
        //  int expenses = 3_000; // обязательные месячные траты
        // int threshold = 20_000; // есть возможность отдохнуть
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
    //  @Test
    //  public void testHaveCash() {
    // MoneyService service = new MoneyService();
    // int expected = 2;
    // int income = 100_000; // доход от работы
    // int expenses = 60_000; // обязательные месячные траты
    // int threshold = 150_000; // есть возможность отдохнуть
    // int actual = service.calculate(income, expenses, threshold);

    // Assertions.assertEquals(expected, actual);
}

