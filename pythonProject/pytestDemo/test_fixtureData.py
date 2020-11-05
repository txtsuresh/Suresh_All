import pytest

from pytestDemo.test_loggers import Loggers


def test_firstData(dataload):
    print(dataload[0])


@pytest.mark.usefixtures("dataload")
class TestFixtureData(Loggers):

    def test_seconddata(self,dataload):
        log=self.test_log()
        log.info(dataload)
        log.info(dataload[0])
        print(dataload)






