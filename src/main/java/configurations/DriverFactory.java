package configurations;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;

public class DriverFactory {
    public static Browser browser;

    public static Browser getDriver(String driverName) {
        String os = System.getProperty("os.name");
        String osarch = System.getProperty("os.arch");
        Playwright playwright = Playwright.create();
        if ("Windows 8".equalsIgnoreCase(os) || "Windows 10".equalsIgnoreCase(os) || "Windows 11".equalsIgnoreCase(os)
                && "amd64".equalsIgnoreCase(osarch) && driverName.equalsIgnoreCase(constants.Browser.Chrome.toString())) {
            browser=playwright.chromium().launch();
            return browser;
        } else if ("Windows 8".equalsIgnoreCase(os) || "Windows 10".equalsIgnoreCase(os)
                || "Windows 11".equalsIgnoreCase(os) && "amd64".equalsIgnoreCase(osarch)
                && driverName.equalsIgnoreCase(constants.Browser.Firefox.toString())) {
            browser=playwright.firefox().launch();
            return browser;
        } else if ("Windows 8".equalsIgnoreCase(os) || "Windows 10".equalsIgnoreCase(os)
                || "Windows 11".equalsIgnoreCase(os) && "amd64".equalsIgnoreCase(osarch)
                && driverName.equalsIgnoreCase(constants.Browser.WebKit.toString())) {
            browser=playwright.webkit().launch();
            return browser;
        }

        else {
            System.out.println("Invalid Browser");
            return null;
        }

    }
}
