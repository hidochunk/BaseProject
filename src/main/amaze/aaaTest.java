package amaze;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class aaaTest {
    @Test
    void getType() {
        aaa zz = new aaa(3,4,5);
        String result = zz.getType();
        Assert.assertEquals("鈍角三角形",result);
    }

}