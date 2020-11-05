from selenium import webdriver
from selenium.webdriver import ActionChains

driver=webdriver.Chrome(executable_path="C:\\Users\\Suresh Kumar\\Downloads\\chromedriver_85\\chromedriver.exe")

driver.implicitly_wait(5)
driver.get("https://rahulshettyacademy.com/AutomationPractice/")

actions = ActionChains(driver)
actions.move_to_element(driver.find_element_by_id("mousehover")).perform()
actions.move_to_element(driver.find_element_by_link_text("Reload")).click().perform()

driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver")
actions.double_click(driver.find_element_by_id("double-click")).perform()