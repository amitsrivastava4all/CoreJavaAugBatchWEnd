package com.acorp.travel.test;

import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public interface FileUploadBySikuli {
	
	public static void uploadIt(String path) throws FindFailed {
		
		Screen fileOpenDialogBox = new Screen();
		// Specify the Path of Screen Shot File
        Pattern fileNameTxtBox = new Pattern("/Users/amit/Documents/acorpselenium/uploadscreen/dialog.png");
        Pattern openButton = new Pattern("/Users/amit/Documents/acorpselenium/uploadscreen/button.png");
        
        // uploadButton.click();
        fileOpenDialogBox.wait(fileNameTxtBox, 20);
        fileOpenDialogBox.type(fileNameTxtBox, path);
        fileOpenDialogBox.click(openButton);
	}

}
