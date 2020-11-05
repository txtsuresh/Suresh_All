from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait

driver=webdriver.Chrome(executable_path="C:\\Users\\Suresh Kumar\\Downloads\\chromedriver_85\\chromedriver.exe")

driver.implicitly_wait(5)
driver.get("https://rahulshettyacademy.com/AutomationPractice/")

wait = WebDriverWait(driver,5)
wait.until(expected_conditions.presence_of_element_located((By.XPATH,"//input[@type='checkbox']")))

checkboxes=driver.find_elements_by_xpath("//input[@type='checkbox']")



print(len(checkboxes))

for i in checkboxes:
    i.click()