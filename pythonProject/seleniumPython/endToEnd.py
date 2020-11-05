from selenium import webdriver

driver=webdriver.Chrome(executable_path="C:\\Users\\Suresh Kumar\\Downloads\\chromedriver_85\\chromedriver.exe")

driver.implicitly_wait(5)
driver.get("https://rahulshettyacademy.com/angularpractice/shop")

products=driver.find_elements_by_xpath("//div[@class='card h-100']")

for product in products:
    print(product.find_element_by_xpath("div/h4/a").text)
    if product.find_element_by_xpath("div/h4/a").text== "Blackberry":
        product.find_element_by_xpath("div/button").click()

driver.get_screenshot_as_file("test.png")