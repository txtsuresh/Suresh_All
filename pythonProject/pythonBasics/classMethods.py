class testing:
    x=10 #Class variables
    y=20
    def __init__(self,c):
        d=4 #instance variables
        self.number=c
        print(self.number,d,self.x,self.y)

    def getData(self,a,b):
        print("method is getData")
        print(a,b)
        print(self.x,self.y)
        return a+b


obj=testing(3)
obj.getData(1,2)
print(obj.x, obj.y)

