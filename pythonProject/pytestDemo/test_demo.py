import pytest

@pytest.mark.xfail
def test_firstRun():
    print("test")

@pytest.mark.smoke
def test_fourthRun():
    print("fourth test is printed")



def test_secondRun():
    print("Before test annotation")
    print("after test annotation")