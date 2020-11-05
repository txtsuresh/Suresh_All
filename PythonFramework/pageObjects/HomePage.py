
from selenium.webdriver.common.by import By


class HomePage:
    def __init__(self,driver):
        self.driver=driver

    products=(By.XPATH,"//div[@class='card h-100']/div/h4/a")

    Add =(By.XPATH,"//div[@class='card h-100']/div/button")

    def shopProducts(self):
        return self.driver.find_elements(*HomePage.products)

    def addButton(self):
        return self.driver.find_element(*HomePage.Add)