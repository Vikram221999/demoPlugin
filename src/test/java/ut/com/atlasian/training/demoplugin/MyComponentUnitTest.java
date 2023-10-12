package ut.com.atlasian.training.demoplugin;

import org.junit.Test;
import com.atlasian.training.demoplugin.api.MyPluginComponent;
import com.atlasian.training.demoplugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}