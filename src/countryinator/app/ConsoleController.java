package countryinator.app;

import countryinator.model.CountryData;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ConsoleController {


    public void startInput(Map<String, CountryData> countryDataMap){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String userInput;
        do {
            writeInputRequestMessage(countryDataMap);
            userInput = scanner.nextLine();
            writeCountryDataToConsole(countryDataMap, userInput.toUpperCase().trim());
        }while(isNotStop(userInput));
    }

    private void writeInputRequestMessage(Map<String, CountryData> countryDataMap){
        Object[] countryCodes = countryDataMap.keySet().toArray();
        System.out.println("Podaj kod kraju którego chcesz zobaczyć informacje lub wpisz stop jeśli chcesz zakończyć");
        System.out.println("Możliwe kody to - " + Arrays.toString(countryCodes));
    }

    private void writeCountryDataToConsole(Map<String, CountryData> countryDataMap, String userInput){
        if(countryDataMap.containsKey(userInput)){
            CountryData countryData = countryDataMap.get(userInput);
            System.out.println(countryData.toString());
        }else{
            if(isNotStop(userInput)) System.out.println("Baza nie posiada podanego kodu.");
        }
    }

    private boolean isNotStop(String userInput){
        return !(userInput.toLowerCase().trim().equals("stop"));
    }

}
