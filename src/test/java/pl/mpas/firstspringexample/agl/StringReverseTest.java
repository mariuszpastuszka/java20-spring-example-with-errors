package pl.mpas.firstspringexample.agl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {

    @Test
    public void reverse() {
        Assert.assertEquals("4321", StringReverse.reverse("1234", ""));

    }

    @Test
    public void reserseWithForbidden() {
        Assert.assertEquals("1243", StringReverse.reverse("1234", "12"));
    }
}
