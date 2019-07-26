package com.mmt.flights.omnitureAutomation;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import com.mmt.flights.omnitureAutomation.pojo.Entry;
import com.mmt.flights.omnitureAutomation.pojo.QueryString;
import com.mmt.flights.omnitureAutomation.pojo.RequestPojo;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Automation {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        FileInputStream fileInputStream;

        RequestPojo requestPojo = new RequestPojo();
        try {
            fileInputStream = new FileInputStream("omnitureData.json");

            requestPojo = mapper.readValue(fileInputStream, RequestPojo.class);

            fileInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Entry> actualEntries = requestPojo.getLog().getEntries();
        //System.out.println(actualEntries);
        List<Entry> expectedEntries = expectedEntries();
        List<String> missingEvents = new ArrayList<>();
        for (Entry entries : expectedEntries) {
            for (QueryString expectedQuery : entries.getRequest().getQueryString()) {
                if (expectedQuery.getName().equals("prop54")) {
                    boolean found = false;
                    for (Entry actualEntry : actualEntries) {
                        if (actualEntry.getRequest().getUrl().startsWith("https://metrics.makemytrip.com/b/ss/mmtprod/1/JS-2.1.0/")) {
                            for (QueryString actualQuery : actualEntry.getRequest().getQueryString()) {
                                if (actualQuery.getName().equals("c54")) {
                                    if(actualQuery.getValue().equals(expectedQuery.getValue())){
                                        found = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (found) {
                            break;
                        }
                    }
                    if(!found){
                        missingEvents.add(expectedQuery.getValue());
                    }
                }
            }
        }
        System.out.println("Events not fired : \n" + missingEvents);
    }

    public static List<Entry> expectedEntries() {

        ObjectMapper mapper = new ObjectMapper();
        RequestPojo expectedPojo = new RequestPojo();
        FileInputStream fileInputStream1;

        try {
            fileInputStream1 = new FileInputStream("OmnitureExpectedData.json");
            expectedPojo = mapper.readValue(fileInputStream1, RequestPojo.class);
            fileInputStream1.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return expectedPojo.getLog().getEntries();
    }
}
