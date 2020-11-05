from pythonBasics.classMethods import testing


class inheritance(testing):
    s=20

    def getParentData(self):
        print(self.s + self.x + self.getData(0, 1))
        print(self.s + self.x)



obj1=inheritance(4)
obj1.getParentData()