package WorkFlows;

import Utilities.commonOps;


public class chooseFromSettingBlock extends commonOps {

    public static void chooseCustomize()
    {
        homepage.moreOptions.click();homepage.settingsButton.click();
        homepage.settingBlocks.get(4).click();

    }

}
