from selenium import webdriver


driver= webdriver.Chrome(executable_path="C:\\Users\\Suresh Kumar\\Downloads\\chromedriver_85\\chromedriver.exe")
#driver=webdriver.Firefox(executable_path="C:\\Users\\Suresh Kumar\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe")

driver.get("https://www.google.ca/")

print(driver.title)
driver.maximize_window()
driver.get("https://www.makemytrip.com/flights/")
driver.back()
print(driver.current_url)
driver.close()
