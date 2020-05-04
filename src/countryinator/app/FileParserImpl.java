package countryinator.app;

import countryinator.model.CountryData;
import countryinator.model.CountryDataFactory;
import parser.app.FileParser;

public class FileParserImpl extends FileParser<CountryData, CountryDataFactory> {

    public FileParserImpl(CountryDataFactory parsedObjectFactoryImpl, char delimiter, boolean haveHeader) {
        super(parsedObjectFactoryImpl, delimiter, haveHeader);
    }

}
