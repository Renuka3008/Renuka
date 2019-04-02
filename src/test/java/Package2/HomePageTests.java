package Package2;

import org.apache.poi.util.SystemOutLogger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Package1.BasePage;
import Package1.HomePageObjects;

public class HomePageTests {
	HomePageObjects HomePage;
	BasePage bp;
	public HomePageTests()
	{
		HomePage = new HomePageObjects();
		bp = new BasePage();
			
	}
	
	@Test
	public void TabsDisplayed()
	{
		Assert.assertTrue(HomePage.Women().isDisplayed());
		Assert.assertTrue(HomePage.Dresses().isDisplayed());
		Assert.assertTrue(HomePage.Tshirts().isDisplayed());
	}
	
	@Test
	public void NavigateWomen()
	{
	  HomePage.womenclick();
	  System.out.println(HomePage.getWomenHeader());
	  Assert.assertTrue(HomePage.getWomenHeader().equals("Women"));
	  	
	}
	
	@Test
	public void NavigateDresses()
	{
	  HomePage.Dressclick();;
	  System.out.println(HomePage.getDressHeader());
	  Assert.assertTrue(HomePage.getDressHeader().equals("DRESSES"));
	  	
	}
	
	@Test
	public void NavigateTshirts()
	{
	  HomePage.Tshirtsclick();
	  System.out.println(HomePage.getTshirtsHeader());
	  Assert.assertTrue(HomePage.getTshirtsHeader().equals("CATALOG"));
	  	
	}
	@Test
	public void Newsletter()
	{
		HomePage.newstab();
		HomePage.setNewsLetter();
		HomePage.newsLetterclick();
		System.out.println(HomePage.NewsSuccess());
		Assert.assertTrue(HomePage.NewsSuccess().equals(" Newsletter : You have successfully subscribed to this newsletter."));
	}
	
	}

