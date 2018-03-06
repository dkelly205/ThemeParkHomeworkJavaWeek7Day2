import org.junit.Before;

public class ThemeParkTest {

    ThemePark themePark;

    @Before
    public void setUp() throws Exception {
        themePark = new ThemePark("M&Ds", 100, 5.00);
    }
}
