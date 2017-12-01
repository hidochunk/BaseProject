package amaze;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class aaaTest {
    @Test
    public void getType() throws Exception {        aaa zz = new aaa(3,4,5);
        String result = zz.getType();
        Assert.assertEquals("鈍角三角形",result);
    }

}