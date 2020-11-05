import pytest


@pytest.fixture(scope="class")
def fixture():
    print("Before test annotation")
    yield
    print("after test annotation")


@pytest.fixture()
def dataload():
    print("data loaded")
    return ["suresh", "Viyaan"]


@pytest.fixture(params=[("suresh", "1"), ("Yaanvi", "2"), ("Selvi", "3")])
def parameter(request):
    return request.param
