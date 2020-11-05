import time

import pytest

from utilities.ExcelData import ExcelData


@pytest.mark.usefixtures("startBrowser")
class TestHomePage(ExcelData):

    def test_formSubmission(self, getData):
        self.driver.find_element_by_xpath("//a[normalize-space()='Home']").click()
        self.driver.find_element_by_xpath("//input[@name='name']").send_keys(getData["name"])
        self.driver.find_element_by_xpath("//input[@name='email']").send_keys(getData["email"])
        self.driver.find_element_by_xpath("//input[@id='exampleInputPassword1']").send_keys(getData["password"])
        time.sleep(4)

    @pytest.fixture(params=ExcelData.getTestData("FUSE"))
    def getData(self, request):
        return request.param


#params=[{"name":"test1", "email": "test2", "password": "test3"}, {"name":"test4", "email": "test5", "password": "test6"}]