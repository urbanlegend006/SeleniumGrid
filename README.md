# SeleniumGrid

Selenium Grid Notes
Selenium Grid is a standalone selenium server, comes in the form of a jar, which allows us to deploy the selenium tests into the Grid of machine nodes. This helps us to run several test cases simultaneously and parallelly with different configurations.

The name “Grid” suggests that there will a master node and several slave nodes. The master node is called ‘Hub’, and the slave nodes are called just ‘Nodes’. We can arrange the Hub and nodes in different manners, such that - Hub and nodes are all in the same machine/server. Hub is deployed to a server and all the nodes to a different server. Hubs and nodes are distributed across several servers/machines/VMs.

The hub will have a distinct URL/server address to which the nodes will be registered. Hence, using this feature we can separate the hub from the nodes. Most of the time we keep the hub in our local machines and deploy the nodes in different VMs, and connect those nodes to the hub using secure connections. Note: The Hub ad Nodes can be in the same network or different network, but these configurations are actually the responsibilities of the DevOps team. We as Automation Engineers/Testers should not dig deep on these. Bu, yes, if someone wants to then they of course learn the processes.

Steps to Set the Hub-Node configurations in the same machine:

As, I do not have access to any VMs, therefore I can not actually note those steps down. Although the primary steps will be the same, we need to check the documentation of those services. Such services are - AWS, Azure, Docker. All these platforms have detailed documentation on how to configure the Hub-Node pairs.

Go to https://selenium.dev and download the selenium standalone server jar file. Configure HUB: Go to the directory where the jar is present. Run the command: java -jar .jar -role hub and hit enter. You will see the URL where the Hub is hosted in your local machine like this: http://192.168.56.1:4444/wd/hub Configure Nodes: The below steps can be followed to create several nodes. Although, the below steps will show for setting up a node with chromeDriver. Run the command - Java -Dwebdriver.chrome.driver= -jar .jar -role node -hub http://:4444/grid/register/ Installing chromedriver in a particular node means that all the chrome instances of that node are initialized and can be used for testing. The other browser instances present in that node, cannot be used, because they do not have the binary of the corresponding WebDriver installed/configured in that node. Hence, If we pass an argument with “Firefox” browserName, then we will get SessionNotCreatedException, as the WebDriver session cannot be created due to missing binaries.

We also can install/configure binaries for all the browsers in a node. But Usually, we separate the nodes based on Browsers to achieve Cross-Browser testing.

Java Code to run Hub-Node pair:

import org.openqa.selenium.Platform; import org.openqa.selenium.WebDriver; import org.openqa.selenium.remote.DesiredCapabilities; import org.openqa.selenium.remote.RemoteWebDriver; import org.testng.annotations.Test;

public class GridTest {

@Test
public void setUp() {
	DesiredCapabilities cap = new DesiredCapabilities();
	
	/*the nodes will be chosen based on the below properties. Eg - the name of the browser, platform type, etc. Usually, each node will have 5 chrome and firefox instances each and one IE instance. Hence there is very high scalability we will achieve by using Selenium Grid*/
	cap.setBrowserName("chrome"); 
	cap.setPlatform(Platform.ANY);

	String hub = "http://192.168.56.1:4444/wd/hub"; // this is the hub URL you will get from the CMD.
	try {
		WebDriver driver = new RemoteWebDriver(new URL(hub), cap); // Need to use RemoteWebDriver class to connect to the hub remotely
		driver.get("google.com");
		System.out.println(driver.getTitle());
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}
}
