package starter.login;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import org.openqa.selenium.By;
import starter.login.LoginResultList;

import java.util.List;

public class LoginResult {

        public static Question<List<String>> summaries() {
            return actor -> TextContent.of(LoginResultList.RESULT_SUMMARY).viewedBy(actor).asList();
        }

}
