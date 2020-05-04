package parser.model;

public abstract class ParsableFactory<P extends Parsable> {

    public P createParsedObject(String[] valuesByColumnsOrder) {
         P parsedObject = createEmptyParsedObject();
         parsedObject.setFields(valuesByColumnsOrder);
         return parsedObject;
    }

    protected abstract P createEmptyParsedObject();

}
