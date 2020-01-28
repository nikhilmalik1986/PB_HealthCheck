package testCases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HealthCheckCases {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://termqa.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void firstCase() throws Throwable
	{
		WebElement male = driver.findElement(By.xpath("//label[@class='checkcover male']"));
		male.click();
		
		WebElement name = driver.findElement(By.xpath("//input[@id='nameAdd']"));
		name.sendKeys("Test Name");
		
		WebElement dob = driver.findElement(By.xpath("//input[@type='tel' and @id='dob']"));
		dob.sendKeys("01/12/1986");
		
		WebElement mobile = driver.findElement(By.xpath("//input[@id='mobileNo']"));
		mobile.sendKeys("8667868888");
		
		WebElement viewQuotes = driver.findElement(By.xpath("//span[contains(text(),'View Free Quotes ')]"));
		viewQuotes.click();
		
		//---------------------------------------------------------------------------
		
		WebElement yesButton = driver.findElement(By.xpath("//input[@class='yes btn' and @value='Yes']"));
		yesButton.click();
		
		WebElement fifteenLacs = driver.findElement(By.xpath("//li[@class='ng-tns-c14-2 ng-star-inserted' and contains(text(),'15 Lac + ')]"));
		fifteenLacs.click();
		
		WebElement salaried = driver.findElement(By.xpath("//input[@class='salary btn' and @value='Salaried']"));
		salaried.click();
		
		/*WebElement maharashtraNo = driver.findElement(By.xpath("//input[@class='no btn lang' and @value='No']"));
		maharashtraNo.click();
		
		WebElement language = driver.findElement(By.xpath("//input[@value='English/Hindi']"));
		language.click();*/
		
		//-----------------------------------------------------------------------------------------------------------
		
		WebElement ipru = driver.findElement(By.xpath("//ul[@planid=\"892\"]//button"));
		ipru.click();
		 //----------------------------------------------------
		
		WebElement email = driver.findElement(By.xpath("//input[@id='txtEmail']"));
		email.sendKeys("Test@test.com");
		
		//WebElement clickCity = driver.findElement(By.xpath("//input[@id='txtCity']"));
		//clickCity.click();
		
		driver.findElement(By.xpath("//input[@id='txtCity']")).sendKeys("Delhi");
		Thread.sleep(1000);
		driver.findElement(By.id("txtCity")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("txtCity")).sendKeys(Keys.TAB);
		Thread.sleep(20000);
		
			
		WebElement pincode = driver.findElement(By.xpath("//input[@id='txtPincode']"));
		pincode.sendKeys("110034");
		
		
		Select occupation = new Select(driver.findElement(By.id("ddlOccupation")));
		occupation.selectByVisibleText("Salaried");
		
		WebElement annualIncome = driver.findElement(By.xpath("//input[@id='txtAnnualIncome']"));
		annualIncome.sendKeys("1300000");
		
		Select education = new Select(driver.findElement(By.id("ddlEducation")));
		education.selectByVisibleText("Graduate");
		
		WebElement proceed = driver.findElement(By.xpath("//input[@value='Proceed']"));
		proceed.click();
		
		//-------------------------CheckOut Page------------------------------------------------------------
		
		WebElement placeOrder = driver.findElement(By.xpath("//input[@value='Place Order']"));
		placeOrder.click();
		//----------------------------Card Details--------------------------------------------
		WebElement cardNumber = driver.findElement(By.xpath("//input[@id='creditCardNo']"));
		cardNumber.sendKeys("4012 0010 3714 1112");
		
		WebElement cardName = driver.findElement(By.xpath("//input[@id='creditCardName']"));
		cardName.sendKeys("card Name");
		
		Select mm = new Select(driver.findElement(By.id("creditMonth")));
		mm.selectByVisibleText("May(05)");
		
		Select yy = new Select(driver.findElement(By.id("creditYear")));
		yy.selectByVisibleText("2020");
		
		WebElement cvv = driver.findElement(By.xpath("//input[@id='creditCvv']"));
		cvv.sendKeys("123");
		
		WebElement payButton = driver.findElement(By.xpath("//button[@id='creditpaynow']"));
		payButton.click();
		
		//--------------------- Submit button (may be removed later) ----------------
		WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
		submitButton.click();
		
		//---------------Thank you page Proceed button ---------
		WebElement thankUProceedButton = driver.findElement(By.xpath("//input[@id='MainContent_btnSubmit']"));
		thankUProceedButton.click();
		
		//--------------- Personal Info page --------------------------------
		
		Select maritalStatus = new Select(driver.findElement(By.id("ddlMaritalStatus")));
		maritalStatus.selectByVisibleText("Unmarried");
		
		WebElement fatherName = driver.findElement(By.xpath("//input[@id='txtFatherName']"));
		fatherName.sendKeys("father name");
		
		WebElement motherName = driver.findElement(By.xpath("//input[@id='txtMotherName']"));
		motherName.sendKeys("mother name");
		
		WebElement openEducationSection = driver.findElement(By.xpath("//h4[contains(text(),'Occupation & Education Details')]"));
		openEducationSection.click();
		
		Select sourcesFund = new Select(driver.findElement(By.id("ddlFundsSource")));
		sourcesFund.selectByVisibleText("Salary");
		
		Select orgName = new Select(driver.findElement(By.id("ddlOrganisationName")));
		orgName.selectByVisibleText("3M India Ltd");
		
		Select orgType = new Select(driver.findElement(By.id("ddlOrganisationType")));
		orgType.selectByVisibleText("Pvt Ltd");
		
		Select indusType = new Select(driver.findElement(By.id("ddlIndustryType")));
		indusType.selectByVisibleText("Agriculture");
		
		WebElement totalYears = driver.findElement(By.xpath("//input[@id='txtTotalYearsofService']"));
		totalYears.sendKeys("5");
		
		WebElement openAdddressDetails = driver.findElement(By.xpath("//h4[contains(text(),'Address Details')]"));
		openAdddressDetails.click();
		
		WebElement add1 = driver.findElement(By.xpath("//input[@id='txtMailingAddress']"));
		add1.sendKeys("add 1");
		
		WebElement add3 = driver.findElement(By.xpath("//input[@id='txtMailingAddress3']"));
		add1.sendKeys("add 3");
		
		WebElement landmark = driver.findElement(By.xpath("//input[@id='txtLandMark']"));
		add1.sendKeys("landmark");
		
		WebElement pancard = driver.findElement(By.xpath("//input[@id='txtPanNo']"));
		pancard.sendKeys("bawpm67879v");
		
		WebElement openNomineeInfo = driver.findElement(By.xpath("//h4[contains(text(),'Nominee Info')]"));
		openNomineeInfo.click();
		
		WebElement NomineeFirstName = driver.findElement(By.xpath("//input[@id='txtNomineeFirstName1']"));
		NomineeFirstName.sendKeys("nominee First");
		
		WebElement NomineeLastName = driver.findElement(By.xpath("//input[@id='txtNomineeLastName1']"));
		NomineeLastName.sendKeys("nominee last");
		
		Select gender = new Select(driver.findElement(By.id("ddlNomineeGender1")));
		gender.selectByVisibleText("Male");
		
		Select relationship = new Select(driver.findElement(By.id("ddlRelationship1")));
		relationship.selectByVisibleText("Brother");
		
		
		Select nomineeDD = new Select(driver.findElement(By.id("ddlNomineeDay1")));
		nomineeDD.selectByVisibleText("1");
		
		Select nomineeMM = new Select(driver.findElement(By.id("ddlNomineeMonth1")));
		nomineeMM.selectByVisibleText("Jan");
		
		Select nomineeYY = new Select(driver.findElement(By.id("ddlNomineeYear1")));
		nomineeYY.selectByVisibleText("1990");
		
		WebElement openEinsurance = driver.findElement(By.xpath("//h4[contains(text(),'E-insurance Details of the Life Assured')]"));
		openEinsurance.click();
		
		WebElement eInsuaranceNo = driver.findElement(By.xpath("//input[@id='rdoEinsuranceNo']"));
		eInsuaranceNo.click();
		
		Select repo = new Select(driver.findElement(By.id("ddlRepository")));
		repo.selectByVisibleText("NSDL Database Management Limited");
		
		WebElement PersonalInfoSubmit = driver.findElement(By.xpath("//input[@id='btnSaveAndProceeds']"));
		PersonalInfoSubmit.click();
		
		//--------------------------- Life Style --------------
		
		Select heightFeet = new Select(driver.findElement(By.id("MainContent_UCLifeStyle1_ddlHeightInFeet")));
		heightFeet.selectByVisibleText("6");
		
		Select heightInches = new Select(driver.findElement(By.id("MainContent_UCLifeStyle1_ddlHeightInches")));
		heightInches.selectByVisibleText("6");
		
		WebElement weight = driver.findElement(By.xpath("//input[@id='MainContent_UCLifeStyle1_txtWeight']"));
		weight.sendKeys("55");
		
		WebElement alcoholNO = driver.findElement(By.xpath("//input[@id='MainContent_UCLifeStyle1_rdoAlcoholNo']"));
		alcoholNO.click();
		
		WebElement narcoticsNo = driver.findElement(By.xpath("//input[@id='MainContent_UCLifeStyle1_rdoNarcoticsNo']"));
		narcoticsNo.click();
		
		WebElement adventurousNo = driver.findElement(By.xpath("//input[@id='MainContent_UCLifeStyle1_rdoHazardousSportsNo']"));
		adventurousNo.click();
		
		WebElement insuranceNo = driver.findElement(By.xpath("//input[@id='MainContent_UCLifeStyle1_rdoInsuranceHistoryNo']"));
		insuranceNo.click();
		
		WebElement familyDetailsNo = driver.findElement(By.xpath("//input[@id='MainContent_UCLifeStyle1_rdoFamilyCancerNo']"));
		familyDetailsNo.click();
		
		WebElement LifeStyleProceed = driver.findElement(By.xpath("//input[@id='MainContent_UCLifeStyle1_btnSaveAndProceed']"));
		LifeStyleProceed.click();
		
		//------------------------------Critical Info --------------------
		
		WebElement abnormalityNo = driver.findElement(By.xpath("//input[@id='rdoCongenitalNo']"));
		abnormalityNo.click();
		
		WebElement surgeryNo = driver.findElement(By.xpath("//input[@id='rdoHospitalisedNo']"));
		surgeryNo.click();
		
		WebElement ailmentNo = driver.findElement(By.xpath("//input[@id='rdoAccidentNo']"));
		ailmentNo.click();
		
		WebElement cholesterolNo = driver.findElement(By.xpath("//input[@id='rdoCholesterolNo']"));
		cholesterolNo.click();
		
		WebElement ChestPainNo = driver.findElement(By.xpath("//input[@id='rdoHeartNo']"));
		ChestPainNo.click();
		
		WebElement angioplastyNo = driver.findElement(By.xpath("//input[@id='rdoHeartSurgeryNo']"));
		angioplastyNo.click();
		
		WebElement SugarNo = driver.findElement(By.xpath("//input[@id='rdoDiabetesNo']"));
		SugarNo.click();
		
		WebElement respiratoryNo = driver.findElement(By.xpath("//input[@id='rdoAsthmaNo']"));
		respiratoryNo.click();
		
		WebElement paralysisNo = driver.findElement(By.xpath("//input[@id='rdoNervousNo']"));
		paralysisNo.click();
		
		WebElement GastroNo = driver.findElement(By.xpath("//input[@id='rdoGastroIntestinalNo']"));
		GastroNo.click();
		
		WebElement LiverNo = driver.findElement(By.xpath("//input[@id='rdoHepatitisNo']"));
		LiverNo.click();
		
		WebElement GenitourinaryNo = driver.findElement(By.xpath("//input[@id='rdoGenitourinaryNo']"));
		GenitourinaryNo.click();
		
		WebElement CancerNo = driver.findElement(By.xpath("//input[@id='rdoCancerNo']"));
		CancerNo.click();
		
		WebElement HivNo = driver.findElement(By.xpath("//input[@id='rdoHIVNo']"));
		HivNo.click();
		
		WebElement AnaemeiaNo = driver.findElement(By.xpath("//input[@id='rdoBloodNo']"));
		AnaemeiaNo.click();
		
		WebElement PsychiatricNo = driver.findElement(By.xpath("//input[@id='rdoMentalNo']"));
		PsychiatricNo.click();
		
		WebElement otherdisorderNo = driver.findElement(By.xpath("//input[@id='rdoAnyDisorderNo']"));
		otherdisorderNo.click();
		
		//-------------- OTP Section -----------
		
		WebElement applicationNumber = driver.findElement(By.xpath(""));
		WebElement OTPTextBox = driver.findElement(By.xpath("//input[@id='txtOTP']"));
		String appno = applicationNumber.getText();
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		final String connectionString = "jdbc:sqlserver://10.0.10.43:1433;databaseName=IPruPlatform;user=PlatformUAT;password=platform@UAT123";
		Connection con = DriverManager.getConnection(connectionString);
		// String SQL = "select OTP from IPruPlatform..OTPDetails where LeadId=(select
		// LeadId from IPruPlatform..LeadDetails where ProposalNumber='OP9180780')";

		String SQL = "select OTP from IPruPlatform..OTPDetails where LeadId=(select LeadId from IPruPlatform..LeadDetails where ProposalNumber='"
				+ appno + "')";

		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery(SQL);

		while (rs.next()) {
			String otp = rs.getString("OTP");
			// System.out.println(otp);
			OTPTextBox.sendKeys(otp);
		}
		
		//-------------------------
		
		WebElement OTPSubmit = driver.findElement(By.xpath("//button[@onclick='return VerifyOTP();']"));
		OTPSubmit.click();
		
		
		
		
		
		
		 
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
}
}
