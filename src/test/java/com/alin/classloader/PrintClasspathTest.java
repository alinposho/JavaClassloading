package com.alin.classloader;

import org.junit.Test;

import java.net.URL;
import java.net.URLClassLoader;

public class PrintClasspathTest {

    @Test
    public void
    should_print_the_classloader_for_this_test_class(){
        URLClassLoader urlClassloader = (URLClassLoader) this.getClass().getClassLoader();
        System.out.println("*********************The classloader information is: ***********************");
        for(URL url : urlClassloader.getURLs()) {
            System.out.println(url.toString());
        }
        System.out.println();
    }

}
