from selenium import webdriver
from selenium.webdriver.support.select import Select

driver=webdriver.Chrome(executable_path="C:\\Users\\Suresh Kumar\\Downloads\\chromedriver_85\\chromedriver.exe")

driver.get("https://www.sunlife.ca/en/")

productDropdown= Select(driver.find_element_by_xpath("//select[@id='select-product']"))
productDropdown.select_by_visible_text("Personal Health Insurance")

button=driver.find_element_by_xpath("//div[@id='get-a-quote']/div[2]/form/div[2]/button")
#Javascript
driver.execute_script("arguments[0].scrollIntoView();", button);
#driver.execute_script("arguments[0].click();", button);

pageTitle=driver.title



assert "Personal" in pageTitle


