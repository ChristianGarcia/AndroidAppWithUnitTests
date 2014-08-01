package dev.garcia.christian.appwithtests;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Christian on 8/1/14.
 */
@RunWith(RobolectricTestRunner.class)
@Config(emulateSdk = 18)
public class RobolectricTest {

    @Mock
    private Context mMockContext;

    @Test
    public void testMockito() {

        assertThat(Robolectric.application.getPackageName(), equalTo("dev.garcia.christian.appwithtests"));

    }


}
