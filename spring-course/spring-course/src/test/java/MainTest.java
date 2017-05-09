import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTest {

    @Test
    public void mainTest() throws IOException {
        System.out.println("hello");
//        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
//        String line= buffer.readLine();
        Assert.assertTrue("hello".equals("hello"));
    }
}
