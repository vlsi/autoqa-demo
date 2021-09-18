package tests.demoApp.signIn

import org.testng.annotations.Test
import tests.BaseTest
import utils.Sleep

class SignInTest : BaseTest() {

    @Test(description = "Sign in with correct credentials", groups = ["ios"])
    fun signInWithCorrectCredentialsTest() {

        demoApp.onboarding().logInScreen()
            .isLoginScreenLoaded
            .setUserName("aaa")
            .setPassword("xxx")
            .tapSignInButton()

        Sleep.sleep(3000)
    }
}