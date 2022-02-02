import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TelaLogin {
    @Test
    public void teste1() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver robozinho = new ChromeDriver();
        robozinho.manage().window().maximize();
        robozinho.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        robozinho.get("https://www.saucedemo.com/");
        robozinho.findElement(By.id("user-name")).sendKeys("standard_user");
        robozinho.findElement(By.id("password")).sendKeys("secret_sauce");
        robozinho.findElement(By.id("login-button")).click();
        System.out.println("react-burger-menu-btn");
    }
    @Test
    public void teste2() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver robozinho = new ChromeDriver();
        robozinho.manage().window().maximize();
        robozinho.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        robozinho.get("https://www.saucedemo.com/");
        robozinho.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        robozinho.findElement(By.id("password")).sendKeys("secret_sauce");
        robozinho.findElement(By.id("login-button")).click();
        System.out.println("react-burger-menu-btn");
    }
    @Test
    public void teste3() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver robozinho = new ChromeDriver();
        robozinho.manage().window().maximize();
        robozinho.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        robozinho.get("https://www.saucedemo.com/");
        robozinho.findElement(By.id("user-name")).sendKeys("problem_user");
        robozinho.findElement(By.id("password")).sendKeys("secret_sauce");
        robozinho.findElement(By.id("login-button")).click();
        System.out.println("react-burger-menu-btn");
    }
    @Test
    public void teste4() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver robozinho = new ChromeDriver();
        robozinho.manage().window().maximize();
        robozinho.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        robozinho.get("https://www.saucedemo.com/");
        robozinho.findElement(By.id("user-name")).sendKeys("loqued_out_user");
        robozinho.findElement(By.id("password")).sendKeys("secret_sauce");
        robozinho.findElement(By.id("login-button")).click();
        System.out.println("error-message-container error");
    }
    @Test
    public void teste5() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver robozinho = new ChromeDriver();
        robozinho.manage().window().maximize();
        robozinho.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        robozinho.get("https://www.saucedemo.com/");
        robozinho.findElement(By.id("user-name")).sendKeys("standard_user");
        robozinho.findElement(By.id("password")).sendKeys("molhosecreto");
        robozinho.findElement(By.id("login-button")).click();
        System.out.println("error-message-container error");
    }
    @Test
    public void teste6() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver robozinho = new ChromeDriver();
        robozinho.manage().window().maximize();
        robozinho.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        robozinho.get("https://www.saucedemo.com/");
        robozinho.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        robozinho.findElement(By.id("password")).sendKeys("molhosecreto");
        robozinho.findElement(By.id("login-button")).click();
        System.out.println("error-message-container error");
    }
    @Test
    public void teste7() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver robozinho = new ChromeDriver();
        robozinho.manage().window().maximize();
        robozinho.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        robozinho.get("https://www.saucedemo.com/");
        robozinho.findElement(By.id("user-name")).sendKeys("loqued_out_user");
        robozinho.findElement(By.id("password")).sendKeys("molhosecreto");
        robozinho.findElement(By.id("login-button")).click();
        System.out.println("error-message-container error");
    }
    @Test
    public void teste8() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver robozinho = new ChromeDriver();
        robozinho.manage().window().maximize();
        robozinho.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        robozinho.get("https://www.saucedemo.com/");
        robozinho.findElement(By.id("user-name")).sendKeys("problem_user");
        robozinho.findElement(By.id("password")).sendKeys("molhosecreto");
        robozinho.findElement(By.id("login-button")).click();
        System.out.println("error-message-container error");
    }
    @Test
    public void teste9() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver robozinho = new ChromeDriver();
        robozinho.manage().window().maximize();
        robozinho.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        robozinho.get("https://www.saucedemo.com/");
        robozinho.findElement(By.id("user-name")).sendKeys("secret_sauce");
        robozinho.findElement(By.id("password")).sendKeys("secret_sauce");
        robozinho.findElement(By.id("login-button")).click();
        System.out.println("error-message-container error");
    }
    @Test
    public void teste10() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver robozinho = new ChromeDriver();
        robozinho.manage().window().maximize();
        robozinho.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        robozinho.get("https://www.saucedemo.com/");
        robozinho.findElement(By.id("user-name")).sendKeys("123456789");
        robozinho.findElement(By.id("password")).sendKeys("secret_sauce");
        robozinho.findElement(By.id("login-button")).click();
        System.out.println("error-message-container error");
    }
    @Test
    public void teste11() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver robozinho = new ChromeDriver();
        robozinho.manage().window().maximize();
        robozinho.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        robozinho.get("https://www.saucedemo.com/");
        robozinho.findElement(By.id("user-name")).sendKeys("abcdef");
        robozinho.findElement(By.id("password")).sendKeys("secret_sauce");
        robozinho.findElement(By.id("login-button")).click();
        System.out.println("error-message-container error");
    }
    @Test
    public void teste12() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver robozinho = new ChromeDriver();
        robozinho.manage().window().maximize();
        robozinho.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        robozinho.get("https://www.saucedemo.com/");
        robozinho.findElement(By.id("user-name")).sendKeys("");
        robozinho.findElement(By.id("password")).sendKeys("secret_sauce");
        robozinho.findElement(By.id("login-button")).click();
        System.out.println("error-message-container error");
    }
    @Test
    public void teste13() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver robozinho = new ChromeDriver();
        robozinho.manage().window().maximize();
        robozinho.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        robozinho.get("https://www.saucedemo.com/");
        robozinho.findElement(By.id("user-name")).sendKeys("standard_user");
        robozinho.findElement(By.id("password")).sendKeys("");
        robozinho.findElement(By.id("login-button")).click();
        System.out.println("error-message-container error");
    }
    @Test
    public void teste14() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver robozinho = new ChromeDriver();
        robozinho.manage().window().maximize();
        robozinho.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        robozinho.get("https://www.saucedemo.com/");
        robozinho.findElement(By.id("user-name")).sendKeys("123456");
        robozinho.findElement(By.id("password")).sendKeys("123456");
        robozinho.findElement(By.id("login-button")).click();
        System.out.println("error-message-container error");
    }
    @Test
    public void teste15() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver robozinho = new ChromeDriver();
        robozinho.manage().window().maximize();
        robozinho.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        robozinho.get("https://www.saucedemo.com/");
        robozinho.findElement(By.id("user-name")).sendKeys("abcdef");
        robozinho.findElement(By.id("password")).sendKeys("abcdef");
        robozinho.findElement(By.id("login-button")).click();
        System.out.println("error-message-container error");
    }
}