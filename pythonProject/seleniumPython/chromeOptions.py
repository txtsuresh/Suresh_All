from selenium import webdriver
from selenium.webdriver import ActionChains

chromeOptions=webdriver.ChromeOptions()
chromeOptions.add_argument("headless")
chromeOptions.add_argument("--start maximized")
chromeOptions.add_argument("--ignore-certification-errors")

driver=webdriver.Chrome(executable_path="C:\\Users\\Suresh Kumar\\Downloads\\chromedriver_85\\chromedriver.exe",options=chromeOptions)


driver.implicitly_wait(5)
driver.get("https://rahulshettyacademy.com/AutomationPractice/")

print(driver.title)