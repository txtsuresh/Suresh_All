from selenium import webdriver

driver=webdriver.Chrome(executable_path="C:\\Users\\Suresh Kumar\\Downloads\\chromedriver_85\\chromedriver.exe")

driver.implicitly_wait(5)
driver.get("https://rahulshettyacademy.com/AutomationPractice/")

driver.find_element_by_xpath("//button[@id='openwindow']").click()

parentWindow=driver.window_handles[0]
childWindow=driver.window_handles[1]
print(driver.title)

driver.switch_to.window(childWindow)
print(driver.title)

driver.switch_to.window(parentWindow)
print(driver.title)