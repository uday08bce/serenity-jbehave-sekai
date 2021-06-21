package starter.login;

import org.openqa.selenium.By;

class LoginResultList {
    static By RESULT_TITLES = By.cssSelector(".result__title");
    //static By RESULT_SUMMARY = By.cssSelector(".result__snippet");
    static By RESULT_SUMMARY = By.xpath("*[@id=\"root\"]/section/main/div/div/div[2]/div/div[2]");
}
