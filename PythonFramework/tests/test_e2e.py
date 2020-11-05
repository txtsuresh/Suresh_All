import time

import pytest
from selenium import webdriver

from pageObjects.CheckOutPage import CheckOutPage
from pageObjects.HomePage import HomePage
from utilities.BaseClass import BaseClass


@pytest.mark.usefixtures("startBrowser")
class Test(BaseClass):

    def test_e2eapp(self):
        log=self.test_log()
        log.info("Home page is displayed")
        homePage=HomePage(self.driver)
        products=homePage.shopProducts()
        log.info(products)

        for product in products:

            log.info(product.text)
            if product.text=="Blackberry":
                homePage.addButton().click()

 #           if product.find_element_by_xpath("div/h4/a").text== "Blackberry":

                #product.find_element_by_xpath("div/button").click()

        self.driver.get_screenshot_as_file("test.png")
        log.info("CheckOut page is displayed")
        checkPage=CheckOutPage(self.driver)
        checkPage.checkOutButton().click()

        #self.driver.find_element_by_xpath("//a[@class='nav-link btn btn-primary']").click()
        log.info("Purchase page is displayed")
        self.driver.find_element_by_xpath("//button[normalize-space()='Checkout']").click()
        time.sleep(3)