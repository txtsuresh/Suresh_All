#If Condition
a = "ant"

if a=="ant":
    print("value is true")
else:
    print("false")

#While loop

b=10

while b>5:
    print(b)
    b=b-1
#While with Continue & Break statements
c=10
while c > 4:
#    if c==6:
#        continue
    if c==5:
        break
    print(c)
    c = c - 1

#For loop

s =[1, 2, 3, 4, 5]

for i in s:
    print(i)

#sum of first 5 natural numbers
sum=0
for j in range(1,6):
    sum=j+sum
print(sum)

#print first 5 numbers with diff 4
for k in range(1,10,4):
    print(k)

#prints 0 to 3
for l in range(3):
    print(l)