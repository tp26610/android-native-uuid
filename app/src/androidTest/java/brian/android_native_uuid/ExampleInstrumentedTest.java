package brian.android_native_uuid;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import jni.NativeUUID;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("brian.android_native_uuid", appContext.getPackageName());
    }

    @Test
    public void testGenUUID() {
        String uuid = NativeUUID.getInstance().generateUUID();

        assertTrue(uuid.length() > 30);
        Log.i("ExampleInstrumentedTest", "testGenUUID >> uuid="+uuid);
    }
}
