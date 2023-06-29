package pages;

public class GooglePage extends  BasePage{

    private String searchButton = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]";

    private String searchTextField = "//textarea[@id='APjFqb']";
    public GooglePage(){
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
    }

    public void clickGoogleSearch(){
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);
    }
}
