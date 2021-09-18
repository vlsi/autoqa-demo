package tests.simpleChecks

import org.testng.annotations.Test
import utils.Logger
import utils.constants.Path
import utils.constants.TextColour

class StubTest {

    @Test(description = "Test", groups = ["ios", "android"])
    fun pathTest() {
        Logger.print("User home is: " + Path.USER_HOME, TextColour.BLUE)
        Logger.print("User dir is: " + Path.USER_DIR, TextColour.BLUE)
    }
}