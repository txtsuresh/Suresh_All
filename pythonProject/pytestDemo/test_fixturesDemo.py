import pytest



@pytest.mark.usefixtures("fixture")
class TestDemoFixtures:
    def test_firstFixture(self):
        print("first fixture")

    def test_secondFixture(self):
        print("second fixture")