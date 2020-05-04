package countryinator.app;

import countryinator.model.CountryData;
import countryinator.model.CountryDataFactory;
import parser.app.FileController;
import parser.app.FileParser;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileControllerImpl extends FileController<CountryData, CountryDataFactory> {

    public FileControllerImpl(FileParser<CountryData, CountryDataFactory> fileParser) throws IOException {
        super(fileParser);
    }

    public Map<String, CountryData> getMap(){
        Map<String, CountryData> map = new HashMap<>();
        for(CountryData countryData: super.parsedObjectsList){
            map.put(countryData.getCountryCode(), countryData);
        }
        return  map;
    }
}
