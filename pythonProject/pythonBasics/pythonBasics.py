#Hello
print("hello")

#Integer & String Datatype
a=5
b="suresh"
print(a)
print("name is " + b)

c, d, e=3.2, 10, "suresh"
print(c,d,e)
#print("{} {}".format("value is" + d))

print("value is ", c)

print(type(c))
print(type(d))
print(type(e))

#List Data Type

list = [10, 20.3,"suresh", "viyaan"]
print(list[0])
print(list[-1]) # Prints last index in the list
print(list[0:3]) # Prints values from 0 to 2 in the list

list.insert(3, "Yaanvi") # Inserts value at 3rd index
print(list)

list.append("Selvi") #Adds new variable at last index
print(list)

list[2]=125
del list[4]
print(list)


#Tuple
tuple=(20, 30, "test")
print(tuple)
print(tuple[0])

#tuple.append("test1")
#print(tuple)

#Dictionary
dic={1:3, 2:"dic1",3:"dic2", "num":20.5}
print(dic[1])
print(dic["num"])

#Ading values to dictionary
dic["first name"]="suresh"
dic[8]="ganesan"
print(dic)
