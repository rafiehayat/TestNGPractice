package TestNG.TestNG;

import org.testng.annotations.DataProvider;

public class DataProviderDemoAnnotation {
	@DataProvider(name= "searchDataSet")
	public Object [][] searchData(){
		Object[][] SearchKeyword = new Object [3][2];
		SearchKeyword [0][0] = "Bihar";
		SearchKeyword [0][1] = "Patna";
		
		SearchKeyword [1][0] = "Delhi";
		SearchKeyword [1][1] = "New Delhi";
		
		SearchKeyword [2][0] = "Maharashtra";
		SearchKeyword [2][1] = "Mumbai";
		
		return SearchKeyword;
	}

}
