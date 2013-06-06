package com.alin.classloader;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

public class BootstrapClassloaderTest {

    @Test
    public void
    should_return_null_when_asking_for_the_bootstrap_classloader_of_String_class() {
        ClassLoader bootstrap = String.class.getClassLoader();
        assertNull(bootstrap);
    }

    @Test
    public void
    should_return_the_SystemClassloader_when_asking_it_from_this_class() {
        ClassLoader system = this.getClass().getClassLoader();
        assertNotNull(system);
        assertEquals(ClassLoader.getSystemClassLoader(), system);
    }

}
