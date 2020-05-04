package countryinator.model;


import parser.model.ParsableFactory;

public class CountryDataFactory extends ParsableFactory<CountryData> {


    @Override
    protected CountryData createEmptyParsedObject() {
        return new CountryData();
    }
}
