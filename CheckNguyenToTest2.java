import static org.junit.Assert.*;
import org.junit.Test;

public class CheckNguyenToTest2 {

    @Test
    public void testIsPrimeWithPrimeNumber() {
        assertTrue(CheckNguyenTo.isPrime(2));
        assertTrue(CheckNguyenTo.isPrime(3));
        assertTrue(CheckNguyenTo.isPrime(5));
        assertTrue(CheckNguyenTo.isPrime(7));
        assertTrue(CheckNguyenTo.isPrime(11));
        assertTrue(CheckNguyenTo.isPrime(13));
    }

    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        assertFalse(CheckNguyenTo.isPrime(1));
        assertFalse(CheckNguyenTo.isPrime(4));
        assertFalse(CheckNguyenTo.isPrime(6));
        assertFalse(CheckNguyenTo.isPrime(8));
        assertFalse(CheckNguyenTo.isPrime(9));
        assertFalse(CheckNguyenTo.isPrime(10));
    }

    @Test
    public void testIsPrimeWithZero() {
        assertFalse(CheckNguyenTo.isPrime(0));
    }

    @Test
    public void testIsPrimeWithNegativeNumber() {
        assertFalse(CheckNguyenTo.isPrime(-1));
        assertFalse(CheckNguyenTo.isPrime(-5));
        assertFalse(CheckNguyenTo.isPrime(-10));
    }

    @Test
    public void testIsPrimeWithEdgeCases() {
        assertFalse(CheckNguyenTo.isPrime(Integer.MIN_VALUE));
        assertFalse(CheckNguyenTo.isPrime(Integer.MAX_VALUE));
    }
}
