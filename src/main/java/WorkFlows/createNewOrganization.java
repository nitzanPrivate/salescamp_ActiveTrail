package WorkFlows;

import Utilities.commonOps;

public class createNewOrganization extends commonOps {

    public static void createNewOrg(String newCompanyName, int teamSizeIndex, int indusrialIndex) throws InterruptedException {
        regCompany.companyName.sendKeys(newCompanyName);
        regCompany.teamSizeField.click();
        regCompany.teamSizeList.get(teamSizeIndex).click(); //set different team size now
        regCompany.industryField_1.click();
        regCompany.dropListIcons.get(1).click();
        regCompany.industryList.get(indusrialIndex).click();  //choose different value now
        regCompany.nextButton.click();
        Thread.sleep(1000);
        regCompany.nextButton.click();
        Thread.sleep(1000);
        regCompany.getStartedButton.click();
    }
}
