package modohiyaku;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class aaaTest {
    @Test
    public void getType() throws Exception {
        aaa tri = new aaa(5,5,5);
        String result = tri.getType();

        Assert.assertEquals("不是三角形",result);

    }

}
