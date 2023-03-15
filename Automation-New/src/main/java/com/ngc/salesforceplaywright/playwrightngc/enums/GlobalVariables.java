package com.ngc.salesforceplaywright.playwrightngc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum GlobalVariables {
	BASE_URL("https://test.salesforce.com/"),
	START("STARTED"),
	PASS("PASSED"),
	FAIL("FAILED"),
	SKIP("SKIPED"),
	END("ENDED"),
	SCREENSHOT_FOLDER("target/screenshots/"),
	FILE_FORMAT(".png"),
	DOWNLOADS_FOLDER("target/downloads/"),
	VIDEOS_FOLDER("target/videos/");

	@Getter
    private String value;


}
