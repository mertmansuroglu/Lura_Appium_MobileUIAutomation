package MCP_Steps;

import appiumFramework.baseMCP;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;

import java.io.IOException;

public class MCP_Steps extends baseMCP {
    @Given("I open the mcp application")
    public void iOpenTheMcpApplication() throws IOException {
        AndroidDriver<AndroidElement> driver = capabilities();
//       Runtime.getRuntime().exec("taskkill /F /IM node.exe");
        service = startServer();
    }
}
