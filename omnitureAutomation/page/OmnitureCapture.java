package com.mmt.flights.omnitureAutomation.page;


import org.openqa.selenium.JavascriptExecutor;
import com.mmt.flights.omnitureAutomation.BrowserMobSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;
public class OmnitureCapture implements Navigation {

    String FileName = "omnitureData.json";

    BrowserMobSetup browserMobSetup = new BrowserMobSetup();

    @BeforeTest

    public void SetUp(){

        browserMobSetup.setUp("All Page", flightsListingPageUrl);
    }

    @Test(priority = 2)

    public void RefundableClicked() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(fareSummaryAndCancellation));
        WebElement elm = browserMobSetup.driver.findElement(fareSummaryAndCancellation);
        elm.click();
        if(elm.isEnabled()){
            elm.click();
        }

    }

    @Test(priority = 3)

    public void FlightDetailsClicked() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(flightDetailsButton));
        WebElement elm = browserMobSetup.driver.findElement(flightDetailsButton);
        elm.click();

    }

    @Test(priority = 4)

    public void SortClicked(){
        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 15);

        wait.until(ExpectedConditions.presenceOfElementLocated(sortDeparture));
        WebElement elmDeparture = browserMobSetup.driver.findElement(sortDeparture);

        wait.until(ExpectedConditions.presenceOfElementLocated(sortDuration));
        WebElement elmDuration = browserMobSetup.driver.findElement(sortDuration);

        wait.until(ExpectedConditions.presenceOfElementLocated(sortArrival));
        WebElement elmArrival = browserMobSetup.driver.findElement(sortArrival);

        wait.until(ExpectedConditions.presenceOfElementLocated(sortPrice));
        WebElement elmPrice = browserMobSetup.driver.findElement(sortPrice);

        elmDeparture.click();
        if(elmDeparture.isEnabled()){
            elmDeparture.click();
        }
        if (elmDeparture.isEnabled()){
            elmDuration.click();
        }
        if(elmDuration.isEnabled()){
            elmDuration.click();
        }
        if(elmDuration.isEnabled()){
            elmArrival.click();
        }
        if (elmArrival.isEnabled()){
            elmArrival.click();
        }
        if (elmArrival.isEnabled()){
            elmPrice.click();
        }
        if(elmPrice.isEnabled()){
            elmPrice.click();
        }
    }

    @Test(priority = 5)
    public void BookNowButtonOnListing() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(bookNowButton));
        WebElement elm = browserMobSetup.driver.findElement(bookNowButton);
        elm.click();
        for (String handle : browserMobSetup.driver.getWindowHandles()) {
            browserMobSetup.driver.switchTo().window(handle);
        }

        String url = browserMobSetup.driver.getCurrentUrl();
        browserMobSetup.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        browserMobSetup.driver.navigate().to(url);
        System.out.println(url);


    }
    @Test(priority = 6)

    public void BaseFareClicked() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(baseFareButton));
        WebElement elm = browserMobSetup.driver.findElement(baseFareButton);
        elm.click();
        if(elm.isEnabled())
            elm.click();
    }

    @Test(priority = 7)

    public void FuelSurchargeClicked() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(fuelSurchargeButton));
        WebElement elm = browserMobSetup.driver.findElement(fuelSurchargeButton);
        elm.click();
    }

    @Test(priority = 8)

    public void OtherServicesClicked() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(otherServicesButton));
        WebElement elm = browserMobSetup.driver.findElement(otherServicesButton);
        elm.click();
    }

    @Test(priority = 9)

    public void DiscountClicked() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(discountButton));
        WebElement elm = browserMobSetup.driver.findElement(discountButton);
        elm.click();
    }

    /*@Test(priority = 10)

    public void CancellationInfoClicked() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 9);
        wait.until(ExpectedConditions.presenceOfElementLocated(cancellationInfo));
        WebElement elm = browserMobSetup.driver.findElement(cancellationInfo);
        elm.click();
        browserMobSetup.driver.switchTo().frame(0).close();
    }*/

    /*@Test(priority = 11)

    public void CouponSelected() {
        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(couponSelected1));
        WebElement elmCouponSelected = browserMobSetup.driver.findElement(couponSelected1);
        wait.until(ExpectedConditions.presenceOfElementLocated(couponRemoved1));
        WebElement elmCouponRemoved = browserMobSetup.driver.findElement(couponRemoved1);
        if (!elmCouponSelected.isSelected())
            elmCouponSelected.click();
        else {
            elmCouponRemoved.click();
        }
    }*/

    @Test(priority = 12)

    public void InsuranceSelected() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(insuranceSelected));
        WebElement elmSelected = browserMobSetup.driver.findElement(insuranceSelected);
        wait.until(ExpectedConditions.presenceOfElementLocated(insuranceRemoved));
        WebElement elmRemoved = browserMobSetup.driver.findElement(insuranceRemoved);
        if (!elmSelected.isSelected())
            elmSelected.click();
        else {
            elmRemoved.click();
        }

    }

    @Test(priority = 13)

    public void ContinueButtonOnReview() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(continueButtonOnReview));
        WebElement elm = browserMobSetup.driver.findElement(continueButtonOnReview);
        JavascriptExecutor js = (JavascriptExecutor) browserMobSetup.driver;
        js.executeScript("arguments[0].scrollIntoView();", elm);
        elm.click();

        browserMobSetup.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

    }
    @Test(priority = 14)

    public void ItineraryCheckClicked() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(itineraryCheckButton));
        WebElement elm = browserMobSetup.driver.findElement(itineraryCheckButton);
        elm.click();
    }

    @Test(priority = 15)

    public void BaseFareClickedOnTraveller() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(baseFareButton));
        WebElement elm = browserMobSetup.driver.findElement(baseFareButton);
        elm.click();
        if(elm.isEnabled())
            elm.click();
    }
    @Test(priority = 16)

    public void FuelSurchargeClickedOnTraveller() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(fuelSurchargeButton));
        WebElement elm = browserMobSetup.driver.findElement(fuelSurchargeButton);
        elm.click();
    }

    @Test(priority = 17)

    public void OtherServicesClickedOnTraveller() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(otherServicesButton));
        WebElement elm = browserMobSetup.driver.findElement(otherServicesButton);
        elm.click();
    }
    @Test(priority = 18)

    public void DiscountClickedOnTraveller() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(discountButton));
        WebElement elm = browserMobSetup.driver.findElement(discountButton);
        elm.click();
    }

    @Test(priority = 19)

    public void AddAdultClicked() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(addAdultButton));
        WebElement elm = browserMobSetup.driver.findElement(addAdultButton);
        elm.click();
    }

    @Test(priority = 20)

    public void AddChildClicked() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(addChildButton));
        WebElement elm = browserMobSetup.driver.findElement(addChildButton);
        elm.click();
    }

    @Test(priority = 21)

    public void AddInfantClicked() {

        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(addInfantButton));
        WebElement elm = browserMobSetup.driver.findElement(addInfantButton);
        elm.click();
    }

    @Test(priority = 22)
    public void GstNumberSelected(){
        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(gstNumberBox));
        WebElement elm = browserMobSetup.driver.findElement(gstNumberBox);
        elm.click();
        if (elm.isEnabled())
            elm.click();
    }

    @Test(priority = 23)

    public void TravelServicesOnTraveller(){
        WebDriverWait wait = new WebDriverWait(browserMobSetup.driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(travelServicesTitle));
        WebElement servicesTitle = browserMobSetup.driver.findElement(travelServicesTitle);
        wait.until(ExpectedConditions.presenceOfElementLocated(forexCheck));
        WebElement forex = browserMobSetup.driver.findElement(forexCheck);
        wait.until(ExpectedConditions.presenceOfElementLocated(internationalRoamingPackCheck));
        WebElement roamingPack = browserMobSetup.driver.findElement(internationalRoamingPackCheck);
        wait.until(ExpectedConditions.presenceOfElementLocated(travellInsuranceCheck));
        WebElement travellInsurance = browserMobSetup.driver.findElement(travellInsuranceCheck);
        JavascriptExecutor js = (JavascriptExecutor) browserMobSetup.driver;
        js.executeScript("arguments[0].scrollIntoView();", forex);
        if(servicesTitle.isDisplayed()){
            forex.click();
            roamingPack.click();
            travellInsurance.click();
        }
    }
    @AfterTest

    public void ListingTearDown() {
        browserMobSetup.tearDown(FileName);
    }


}


