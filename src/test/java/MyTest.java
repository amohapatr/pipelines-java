import com.microsoft.demo.Demo;
import org.junit.Test;
//This is a test class and for Azure pipeline test
public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
    }

    @Test
    public void test_method_2() {
        //To Test the pipeline
    }
}
