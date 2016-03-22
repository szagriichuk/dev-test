package com.goeuro.test;

import com.goeuro.test.cli.CityCli;
import com.goeuro.test.http.GoEuroApi;
import com.goeuro.test.model.QueryResult;
import com.goolla.http.callback.ResponseCallback;
import com.goolla.http.callback.objects.ResultObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

import static com.goeuro.test.csv.CsvWriter.forName;
import static com.goeuro.test.serializer.Serializer.deserialize;
import static java.util.stream.Stream.of;

/**
 * @author szagriichuk.
 */
public class MainDevTest {
    private static final Logger LOG = LoggerFactory.getLogger(MainDevTest.class);
    private GoEuroApi goEuroApi = new GoEuroApi();

    public static void main(String[] args) {
        new MainDevTest().execute(args);
    }

    private void execute(String[] args) {
        new CityCli(args).readCities().
                stream().
                forEach(name -> goEuroApi.readData(name, new ResponseCallback() {
                    @Override
                    public void onComplete(ResultObject resultObject) {
                        of(resultObject).
                                map(o -> new String(o.getData())).
                                map(o -> deserialize(o, QueryResult[].class)).
                                filter(Optional::isPresent).
                                map(Optional::get).
                                forEach(o -> forName(name).writeData(o));
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        LOG.error(throwable.getMessage(), throwable);
                    }
                }));
    }
}
