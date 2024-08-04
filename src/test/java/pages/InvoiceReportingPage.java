package pages;

import utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class InvoiceReportingPage {
    WebDriver driver;

    public InvoiceReportingPage () {

        PageFactory.initElements ( Driver.getDriver (), this );
//                this.driver = Driver.getDriver();
//                PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//li[text()='Sales']")
    public WebElement sales;
    @FindBy(xpath = "//*[@id=\"active\"]")
    public WebElement invoice;

    //Create invoice button
    @FindBy(className = "MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root css-1gkqmgg")
    public WebElement createInvoiceBtn;

    @FindBy(xpath = "//*[@id=\"invoice_title_input_text\"]")
    public WebElement writeInvoiceNameInpt;
    @FindBy(xpath = "//*[@id=\"main\"]/form/header/div/div[1]/div[2]/div")
    public WebElement writeToWhomInpt;

    @FindBy(xpath = "//*[@id=\"main\"]/form/header/div/div[1]/div[3]/div[2]/div/div/div/button/svg")
    public WebElement payUntilDateInpt;
    @FindBy(xpath = "//*[@id=\"main\"]/form/div/div/button")
    public WebElement selectProductBtn;

    @FindBy(xpath = "//*[@id=\"react-select-7-option-1\"]/div")
    public WebElement stringForProduct;

    @FindBy(xpath = "//*[@id=\"main\"]/div/button")
    public WebElement saveBtnInvoice;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[6]/table/tbody/tr/td[9]/div/button")
    public List<WebElement> invoices;
    //accept button for payment//
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[6]/table/tbody/tr[1]/td[9]/div/button")
    public WebElement numberOfInv;


    /////////////////////////Add Payment Option//////////////////////////////////////////////
    @FindBy(xpath = "//*[@id=\"undefined_input_text\"]")
    public WebElement paymentDateInput;

    // payment methods
    @FindBy(xpath = "//*[@id=\"mui-component-select-type_of_pay\"]")
    public WebElement paymentMethodsOption;
    //to which check option
    @FindBy(xpath = "//*[@id=\"mui-component-select-bank_account\"]")
    public WebElement incomeCategoryOption;
    //Sum expense category option
    @FindBy(xpath = "//*[@id=\"amount_of_money_input_text\"]")
    public WebElement expenseCategoryOption;
    //Save option
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/form/div[2]/button[2]")
    public WebElement SaveOption;

    //////selectAllInvoices/////
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[5]/div[1]/span")
    public WebElement AddAllInvoices;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[5]/table/tbody/tr[1]/td[2]/div")
    public WebElement PaidButton;
    @FindBy(xpath = "//*[@id=\"main\"]/form/footer/div/button")
    public WebElement ShowPdfFile;
    @FindBy(xpath = "//*[@id=\"main\"]/div/header/button[1]")
    public WebElement DownloadInvoice;

}




