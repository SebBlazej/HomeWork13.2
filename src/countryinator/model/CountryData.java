package countryinator.model;


import parser.model.Parsable;

public class CountryData implements Parsable {

    private String countryCode;
    private String countryName;
    private int population;

    CountryData(){

    }

    public CountryData(String countryCode, String countryName, int population) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.population = population;
    }

    @Override
    public String toString() {
        return countryName + '(' + countryCode + ')' + " ma " + population + " ludnosci.";
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public void setFields(String[] valuesByColumnsOrder) {
        this.countryCode = valuesByColumnsOrder[0];
        this.countryName = valuesByColumnsOrder[1];
        this.population = Integer.parseInt(valuesByColumnsOrder[2]);
    }

    @Override
    public String[] getFields() {
        String[] fields = new String[3];
        fields[0] = this.countryCode;
        fields[1] = this.countryName;
        fields[2] = String.valueOf(this.population);
        return fields;
    }
}
