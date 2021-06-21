package starter.login;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.login.LoginForm;

public class EnterCred {

    public static Performable cred(String username,String password) {
        return Task.where("{0} enter username as #username and password as #password",
                Clear.field(LoginForm.PHONE_FIELD,LoginForm.PASSWORD_FIELD),
                Enter.theValue(username,password).into(LoginForm.PHONE_FIELD,LoginForm.PASSWORD_FIELD),
                Click.on(LoginForm.LOGIN_BUTTON)
        ).with("username").of(username);
    }
}
