package Package1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {

@FindBy(xpath ="//*[@id='block_top_menu']/ul/li[1]/a")
private WebElement Women;
@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
private WebElement Dresses;
@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
private WebElement Tshirts;

@FindBy(xpath="//*[@id='columns'"
		+ "]/div[1]/span[2]")
private WebElement WomenPage;
@FindBy(xpath="//*[@id='categories_block_left']/h2")
private WebElement DressPage;
@FindBy(xpath="//*[@id='layered_block_left']/p")
private WebElement TshirtsPage;
@FindBy(id="newsletter-input")
private WebElement NewsLetter;
@FindBy(name="submitNewsletter")
private WebElement NewsButton;
@FindBy(className="alert alert-success")
private WebElement Alert;

public HomePageObjects()
{
	PageFactory.initElements(driver, this);
	
}
 
 public WebElement Women()
 {
	 return Women;
	 
 }
 
 public WebElement Dresses()
 {
	 return Dresses;
 }
 public WebElement Tshirts()
 {
	 return Tshirts;
 }
 public void womenclick()
 {
	 Women.click();
 }
 public String getWomenHeader()
 {
	 return WomenPage.getText();
	 
 }
 public void Dressclick()
 {
	 Dresses.click(); 
 }
 public String getDressHeader()
 {
	 return DressPage.getText();
	 
 }
 public void Tshirtsclick()
 {
	 Tshirts.click(); 
 }
 public String getTshirtsHeader()
 {
	 return TshirtsPage.getText();
	 
 }
 public void setNewsLetter()
 {
	 NewsLetter.sendKeys("ace@hotmail.com");
 }
public void newsLetterclick()
{
	NewsButton.click();
}
public void newstab()
{
	NewsLetter.click();
}


public String NewsSuccess()
{
	return Alert.getText();
}
}
