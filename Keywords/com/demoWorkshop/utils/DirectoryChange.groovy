package com.demoWorkshop.utils

 
import java.text.SimpleDateFormat 
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
 
 
public class DirectoryChange {
 
	@Keyword
	def pdfDirectoryChange() {
		// Get current date and time
		Date currentDate = new Date()
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd")
		String dateFolder = dateFormat.format(currentDate)
 
		// Define the dynamic download directory
		String downloadDir = "D:\\Download_PDF\\" + dateFolder
 
		//create directory if does not exist
		new File(downloadDir).mkdirs()
 
		//Set Browser Capabilities.
		Map desiredCapabilities = RunConfiguration.getDriverPreferencesProperties("WebUI")

		Map prefs = desiredCapabilities.get("prefs")
		if (prefs == null) {
			prefs = [:]
		}

		prefs.put("download.default_directory", downloadDir)
		prefs.put("download_dir", downloadDir)
		prefs.put("download.prompt_for_download", false)
		RunConfiguration.setWebDriverPreferencesProperty("prefs", prefs)
		//WebUI.openBrowser(URL)
	}
}
 