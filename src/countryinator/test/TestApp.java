package countryinator.test;

import countryinator.app.ConsoleController;
import countryinator.app.FileControllerImpl;
import countryinator.app.FileParserImpl;
import countryinator.model.CountryData;
import countryinator.model.CountryDataFactory;
import parser.app.FileController;

import java.io.IOException;
import java.util.Map;

public class TestApp {

    public static void main(String[] args) throws IOException {

        CountryDataFactory countryDataFactory = new CountryDataFactory();
        FileParserImpl fileParserImpl = new FileParserImpl(countryDataFactory, ';', true);
        FileControllerImpl fileController = new FileControllerImpl(fileParserImpl);
        ConsoleController consoleController = new ConsoleController();
        fileController.readFile("countryData.csv");
        Map<String, CountryData> countryDataMap = fileController.getMap();
        consoleController.startInput(countryDataMap);

    }
}
