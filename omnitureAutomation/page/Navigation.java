package com.mmt.flights.omnitureAutomation.page;

import org.openqa.selenium.By;

public interface Navigation {

    String homePageUrl = "http://www.makemytrip.com";
    String flightsListingPageUrl = "https://www.makemytrip.com/flight/search?itinerary=DEL-LON-14/08/2019&tripType=O&paxType=A-1_C-1_I-1&intl=true&cabinClass=E";

    By flightDetailsButton = By.xpath("//*[@id=\"fli_list_item0\"]/div[2]/div[2]/div/p");
    By fareSummaryAndCancellation = By.xpath("//*[@id=\"fli_list_item0\"]/div[2]/ul/li[1]/span/span");
    By sortDeparture = By.xpath("//*[@id=\"sorting-togglers\"]/div[2]/span");
    By sortDuration = By.xpath("//*[@id=\"sorting-togglers\"]/div[3]/span");
    By sortArrival = By.xpath("//*[@id=\"sorting-togglers\"]/div[4]/span");
    By sortPrice = By.xpath("//*[@id=\"sorting-togglers\"]/div[5]/span");
    By bookNowButton = By.xpath("//*[@id=\"fli_list_item0\"]/div[1]/div[1]/div/div/div[4]/button");
    By baseFareButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/p/span[1]");
    By fuelSurchargeButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div/p/span[1]");
    By otherServicesButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[3]/div/p/span[1]");
    By discountButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[4]/div[1]/p/span[1]");
    By zeroCancellation = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div/div/div[2]/p[1]/a");
    By cancellationInfo = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[2]/a");
    By continueButtonOnReview = By.xpath("//button[contains(@class,'continue_cta')]");
    By itineraryCheckButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/form/div[2]/div[1]/a");
    By addAdultButton = By.xpath("//*[@id=\"wrapper_ADULT\"]/a");
    By addChildButton = By.xpath("//*[@id=\"wrapper_CHILD\"]/a");
    By addInfantButton = By.xpath("//*[@id=\"wrapper_INFANT\"]/a");
    By gstNumberBox = By.xpath("//*[@id=\"gstDetails\"]/div/p/label/span[1]/span");
    By insuranceSelected = By.xpath("//*[@id=\"insurance-section\"]/div/div[3]/label[1]/input");
    By insuranceRemoved = By.xpath("//*[@id=\"insurance-section\"]/div/div[3]/label[2]/input");
    By couponSelected1 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[3]/div/div/div[1]/label/span");
    By couponRemoved1 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[3]/div/div/div[1]/span");
    By travelServicesTitle = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/form/div[6]/p[1]");
    By forexCheck = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/form/div[6]/div/div[1]");
    By internationalRoamingPackCheck = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/form/div[6]/div/div[2]");
    By travellInsuranceCheck = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/form/div[6]/div/div[3]");
    By removeAllServices = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/form/div[6]/div/a");




}