package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
   // 3.1.Создайте набор тестов, полностью покрывающих все ветви кода функции fizzBuzz. Эта
    //функция принимает на вход число и возвращает "Fizz", если число делится на 3, "Buzz",
    //если число делится на 5, и "FizzBuzz", если число делится на 15. Если число не делится ни
    //на 3, ни на 5, ни на 15, функция возвращает входное число в виде строки.
//    @Test
//    void multipleThreeNotFiveReturnsFizz(int n) {
//        SomeService someService = new SomeService();
//
//        assertThat(15).isInstanceOf("");
//        // assertEquals...
//    }

    private SomeService someService;

    @BeforeEach
    void setUp(){
        someService = new SomeService();
    }
    @Test
    void testReturnFizz(){
        assertThat(someService.fizzBuzz(3)).isEqualTo("Fizz");
    }
    @Test
    void testReturnBuzz(){
        assertThat(someService.fizzBuzz(5)).isEqualTo("Buzz");
    }
    @Test
    void testReturnFizzBuzz(){
        assertThat(someService.fizzBuzz(15)).isEqualTo("FizzBuzz");
    }
    @Test
    void testReturnEcho(){
        assertThat(someService.fizzBuzz(14)).isEqualTo(""+14);
    }


    @Test
    void checkfirstSixArray(){
        SomeService someService = new SomeService();
        assertThat(someService.firstLast6(new int[] {6,3,1,0})).isTrue();


    }



    @Test
    void checkLastSixArray(){
        SomeService someService = new SomeService();
        assertThat(someService.firstLast6(new int[] {3,1,0,6})).isTrue();
    }

    @Test
    void checkLastAndFirstSixArray(){
        SomeService someService = new SomeService();
        assertThat(someService.firstLast6(new int[] {6,1,0,6})).isTrue();
    }
    @Test
    void checkNotSixArray(){
        SomeService someService = new SomeService();
        assertThat(someService.firstLast6(new int[] {5,1,0,7})).isFalse();
    }

    @Test
    void checkCalculatingDiscount(){
        assertThatThrownBy(() -> someService.calculatingDiscount(-2000, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage( "Сумма покупки не может быть отрицательной");


    }
    @Test
    void persentHighTest() {
        assertThatThrownBy(() -> someService.calculatingDiscount(2000, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage( "Скидка должна быть в диапазоне от 0 до 100%");
    }

    @Test
     void goodTest() {
        assertThat(someService.calculatingDiscount(2000.0, 50)).isEqualTo(1000);
    }

    @Test
    void persentSubZeroTest() {
        assertThatThrownBy(() -> someService.calculatingDiscount(2000, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage( "Скидка должна быть в диапазоне от 0 до 100%");
    }

    @Test
    void luckySum1Test(){
        assertThat(someService.luckySum(13,2,3)).isEqualTo(5);
    }
    @Test
    void luckySum2Test(){
        assertThat(someService.luckySum(2,13,3)).isEqualTo(5);
    }
    @Test
    void luckySum3test(){
        assertThat(someService.luckySum(2,3,13)).isEqualTo(5);
    }
    @Test
    void luckySum4Tset(){
        assertThat(someService.luckySum(1,2,3)).isEqualTo(6);

    }
    @Test
    void luckySumDouble13Test(){
        assertThat(someService.luckySum(13,2,13)).isEqualTo(2);

    }

}