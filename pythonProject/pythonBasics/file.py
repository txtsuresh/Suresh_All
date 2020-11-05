# read a file
file = open('fileDemo')

print(file.read())
file.close()

# read a file till 10 characters
file = open('fileDemo')

print(file.read(10))
file.close()

# read a file line using readline
file = open('fileDemo')

print(file.readline())
file.close()

# read all lines in a file using loop -  readline
file = open('fileDemo')
line=file.readline()
while line!="":
    print(line)
    line= file.readline()
file.close()


# read all lines in a file using loop -  readlines
file = open('fileDemo')

for line in file.readlines():#values =[suresh, selvi, viyaan, yaanvi] are stored as list
    print(line)

file.close()

#write a file contents in reverse order

with open('fileDemo') as file:
    lines= file.readlines() #[S, S, V , Yaanvi]
    reversed(lines)  #[Y, V,S, S]
    print(reversed(lines))
    with open('fileDemo', 'w') as file1:
        for line in reversed(lines):
            file1.write(line)




