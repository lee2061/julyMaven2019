package logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoggerTest {

		
		static String projectLocation = System.getProperty("user.dir");
			//read properties file in this
		static String configPath = projectLocation + "/log4j.properties";
		
		//initializing the logger class, tell to logger to read property file too
		public static final Logger logger = Logger.getLogger(LoggerTest.class.getName());
		
		@BeforeClass
		public static void getlogger() {
			System.out.println(configPath);
			//reading the property file at this stage
			PropertyConfigurator.configure(configPath);
		}
		
		@Test
		public void testLogger() {
			
logger.info("TestCase passed");
logger.warn("Please check the warning");
logger.error("critical error");
logger.info("test case three passed");

//			logger.info("Chrome browser opened");
//			logger.info("User clicked on login button");
//			logger.error("Button not clickable");
		}
		
	

//		public static void main(String[] args) {
//	// TODO Auto-generated method stub
//			System.out.println(configPath);
//		}
	}

//what is log4j (what kind of login did you do)
//using log4j, did warning log, critical log, customized my log for my framework, and debug it