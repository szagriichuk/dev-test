package com.goeuro.test.csv;

import com.goeuro.test.model.QueryResult;
import com.opencsv.CSVWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;

import static java.util.Arrays.stream;

/**
 * @author szagriichuk.
 */
public class CsvWriter {
    private String fileName;
    private static final Logger LOG = LoggerFactory.getLogger(CsvWriter.class);

    private CsvWriter(String fileName) {
        this.fileName = fileName;
    }

    public void writeData(QueryResult[] results) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(fileName), ',')) {
            writeHeaders(writer);
            stream(results).forEach(o -> writer.writeNext(readContentData(o)));
        } catch (IOException e) {
            LOG.warn("Cannot create csv file.", e);
        }
    }

    private String[] readContentData(QueryResult queryResult) {
        return new String[]{String.valueOf(
                queryResult.get_id()),
                queryResult.getName(),
                queryResult.getType(),
                String.valueOf(queryResult.getGeo_position().getLatitude()),
                String.valueOf(queryResult.getGeo_position().getLongitude())
        };
    }

    private void writeHeaders(CSVWriter writer) {
        writer.writeNext(new String[]{"_id", "name", "type", "latitude", "longitude"});
    }

    public static CsvWriter forName(String name) {
        return new CsvWriter(name + ".csv");
    }
}
