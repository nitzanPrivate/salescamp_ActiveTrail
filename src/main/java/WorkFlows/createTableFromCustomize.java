package WorkFlows;

import Utilities.commonOps;

public class createTableFromCustomize extends commonOps {


    public static void createNewTable(String tableLabel, String tableName)
    {
        customie.addCollection.click();
        customie.tableLabel.sendKeys(tableLabel);
        customie.tableName.sendKeys(tableName);
        customie.saveButton.click();
    }
}
