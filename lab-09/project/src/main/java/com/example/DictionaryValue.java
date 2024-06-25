package com.example;


public class DictionaryValue {
    private int id;
    private int intKey;
    private String stringKey;
    private String value;
    private String enumerationName;
    public DictionaryValue(int id, int intKey, String stringKey, String value, String enumerationName){
        this.id = id;
        this.intKey = intKey;
        this.stringKey = stringKey;
        this.value = value;
        this.enumerationName = enumerationName;

    }
    public int getId(){
        return id;
    }

    public int getIntKey() {
        return intKey;
    }
    public String getStringKey(){
        return stringKey;
    }
    public String getValue(){
        return value;
    }
    public String getEnumerationName(){
        return enumerationName;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setIntKey(int intKey){
        this.intKey = intKey;
    }
    public void setStringKey(String stringKey){
        this.stringKey = stringKey;
    }
    public void setValue(String value){
        this.value = value;
    }
    public void setEnumerationName(String enumerationName){
        this.enumerationName = enumerationName;
    }
}
