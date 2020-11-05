from selenium.webdriver.common.by import By


class CheckOutPage:
    def __init__(self,driver):
        self.driver=driver


    checkOut = (By.XPATH,"//a[@class='nav-link btn btn-primary']")

    def checkOutButton(self):
        return self.driver.find_element(*CheckOutPage.checkOut)