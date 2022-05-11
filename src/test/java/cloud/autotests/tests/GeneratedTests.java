package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Авторизация")
    void generatedTest() {
        step("Открыть 'https://github.com/login'", () -> {
            step("// todo: just add selenium action");
        });

        step("Ввести логин 'Alex'", () -> {
            step("// todo: just add selenium action");
        });

        step("Ввести пароль '12%#5f'", () -> {
            step("// todo: just add selenium action");
        });

        step("Отправить форму", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить успешную авторизацию под 'Alex'", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://github.com/login'", () ->
            open("https://github.com/login"));

        step("Page title should have text 'Sign in to GitHub · GitHub'", () -> {
            String expectedTitle = "Sign in to GitHub · GitHub";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://github.com/login'", () ->
            open("https://github.com/login"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}