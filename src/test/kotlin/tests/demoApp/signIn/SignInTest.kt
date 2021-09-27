package tests.demoApp.signIn

import org.testng.Assert
import org.testng.annotations.Test
import tests.BaseTest
import utils.Sleep

class SignInTest : BaseTest() {

    @Test(description = "Sign in with correct credentials", groups = ["ios"])
    fun signInWithCorrectCredentialsTest() {

        demoApp.onboarding.logInScreen {
            setUserName("aaa")
            setPassword("xxx")
            tapSignInButton()
        }

        demoApp.home.homeScreen {
            Assert.assertEquals("Test", getTitleText(), "Title text is not correct!")
        }
    }
}