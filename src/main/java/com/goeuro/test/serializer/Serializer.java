package com.goeuro.test.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Optional;

/**
 * @author szagriichuk.
 */
public class Serializer {
    private static final Logger LOG = LoggerFactory.getLogger(Serializer.class);
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> Optional<T> deserialize(String data, Class<T> tClass) {
        try {
            return Optional.of(objectMapper.readValue(data, tClass));
        } catch (IOException e) {
            LOG.warn(e.getMessage(), e);
            return Optional.empty();
        }
    }
}
