package Tests.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataDrivenTesting {

    @Test(dataProvider = "getData")
    public void testSearch(String searchTerm) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://google.com/");

        driver.findElement(By.name("q")).sendKeys(searchTerm,Keys.ENTER);

        Assert.assertTrue(driver.getTitle().contains(searchTerm));

        driver.quit();
    }

    @DataProvider
    public Object[] [] getData(){

        return new Object[][]{
                {"chicken"},
                {"早上好"},
                {"いち"},
                {"กฎหมาย"},
                {"kdlyfpmhlxrxcocajmpdolcqgdbdwyguegvscflrnzjmqqadrxkijmuomnqsntbdpkluvxisgvnuqdmzsfzicmycwspdxlxhpkcptoxlaggwypxutphhdzzrflelzvckzmnqbxajnkukpkifdyopjxmofwxyjrrqmevbgbypknbgwfqheupafaxozstohkwcoyqragdtwkjkyieozdkvdvpllzkbjjnxxkzmyhhghqkueizhreuqzcomoutuxemcgsyug"},
                {"kdlyfpkdlyfpmhlxrxcocajmpdolcqgdbdwyguegvscflrnzjmqqadrxkijmuomnqsntbdpkluvxisgvnuqdmzsfzicmycwspdxlxhpkcptoxlaggwypxutphhdzzrflelzvckzmnqbxajnkukpkifdyopjxmofwxyjrrqmevbgbypknbgwfqheupafaxozstohkwckdlyfpmhlxrxcocajmpdolcqgdbdwyguegvscflrnzjmqqadrxkijmuomnqsntbdpkluvxisgvnuqdmzsfzicmycwspdxlxhpkcptoxlaggwypxutphhdzzrflelzvckzmnqbxajnkukpkifdyopjxmofwxyjrrqmevbgbypknbgwfqheupafaxozstohkwcoyqragdtwkjkyieozdkvdvpllzkbjjnxxkzmyhhghqkueizhreuqzcomoutuxemcgsyugoyqragdtwkjkyieozdkvdvpllzkbjjnxxkzmyhhghqkueizhreuqzcomoutuxemcgsyugmhlxrxcocajmpdolcqgdbdwyguegvscflrnzjmqqadrxkijmuomnqsntbdpkluvxisgvnuqdmzsfzicmycwspdxlxhpkcptoxlaggwypxutphhdzzrflelzvckzmnqbxajnkukpkifdyopjxmofwxyjrrqmevbgbypknbgwfqheupafaxozstohkwcoyqragdtwkjkyieozdkvdvpllzkbjjnxxkzmyhhghqkueizhreuqzcomoutuxemcgsyug"}


        };

    }

}
