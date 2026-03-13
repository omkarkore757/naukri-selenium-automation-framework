package com.naukri.framework.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.naukri.framework.base.BaseTest;
import com.naukri.framework.pages.LoginPage;
import com.naukri.framework.pages.ProfilePage;
import com.naukri.framework.utils.ConfigReader;
import com.naukri.framework.utils.ExcelUtils;

public class NaukriTest extends BaseTest {

@Test(dataProvider = "loginData")
public void uploadResumeTest(String username, String password) throws Exception {

    LoginPage login = new LoginPage(getDriver());
    ProfilePage profile = new ProfilePage(getDriver());

    login.loginToNaukri(username, password);

    profile.openProfile();

    profile.clickUpdateResume();

    profile.uploadResume(ConfigReader.getResumePath());
}

@DataProvider(name = "loginData")
public Object[][] getData() {

    return ExcelUtils.getExcelData(
            "src/test/resources/testdata/LoginData.xlsx",
            "LoginData"
    );
}

}