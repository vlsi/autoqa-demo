package app

import app.providers.demoApp.HomeProvider
import app.providers.demoApp.OnboardingProvider
import io.appium.java_client.AppiumDriver
import org.testng.asserts.SoftAssert

class DemoApp(
    private val driver: AppiumDriver<*>?,
    private val softAssert: SoftAssert
) {

    val onboarding: OnboardingProvider
        get() = OnboardingProvider(driver, softAssert)

    val home: HomeProvider
        get() = HomeProvider(driver, softAssert)

}