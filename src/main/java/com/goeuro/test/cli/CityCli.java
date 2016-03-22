package com.goeuro.test.cli;

import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author szagriichuk.
 */
public class CityCli {
    private static final Logger LOG = LoggerFactory.getLogger(CityCli.class);
    private String[] arguments;
    private CommandLineParser parser = new DefaultParser();


    public CityCli(String[] arguments) {
        this.arguments = arguments;
    }

    public List<String> readCities() {
        try {
            return parser.parse(new Options(), arguments).getArgList();
        } catch (ParseException e) {
            LOG.warn(e.getMessage(), e);
        }
        return new ArrayList<>();
    }
}
