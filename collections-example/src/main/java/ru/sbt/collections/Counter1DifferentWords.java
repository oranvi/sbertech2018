package ru.sbt.collections;


import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

/**
 * Подсчитайте количество различных слов в файле.
 */
public class Counter1DifferentWords {

    public static String getString(String fileName) throws IOException, URISyntaxException {
        InputStream resourceAsStream = Counter1DifferentWords.class.getResourceAsStream(fileName);
        return IOUtils.toString( resourceAsStream, "UTF8" );
        // "/ru/sbt/collections/VeryBigText.txt"
    }

    public static void main( String[] args ) throws IOException, URISyntaxException {

    }
}
