import time
from selenium import webdriver

driver=webdriver.Chrome(executable_path="C:\\Users\\Suresh Kumar\\Downloads\\chromedriver_85\\chromedriver.exe")

driver.get("https://www.makemytrip.com/")

time.sleep(15)
driver.find_element_by_xpath("//input[@id='fromCity']").click()
driver.find_element_by_xpath("//input[@placeholder='From']").send_keys("beng")
fromCities=driver.find_elements_by_xpath("//div[@class='calc60']/p[1]")

print(len(fromCities))
for fromCity in fromCities:
    print(fromCity.text)
    if fromCity.text=="Bangalore, India":
        fromCity.click()
        break;
