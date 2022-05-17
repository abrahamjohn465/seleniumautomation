package Util;

import org.apache.xpath.operations.String;

public class ExcelReader {


    public static ExcelReader INSTANCE=new ExcelReader();
    String testdatafilepath = "src\\test\\resources\\inputdata.xls";

    public String getTestdatafilepath() {
        return testdatafilepath;
    }

    public void setTestdatafilepath(String testdatafilepath) {
        this.testdatafilepath = testdatafilepath ;
    }



    public static ExcelReader getInstance(){
        return INSTANCE;
    }

}
