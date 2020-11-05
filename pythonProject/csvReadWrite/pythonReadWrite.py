import csv
#Read a CSV file
with open ('file.csv') as file:
    reader=csv.reader(file,delimiter=',')
    #print(reader)
    #print(list(reader))
    #Name=list(reader)
    Name=[]
    Age=[]
    for row in reader:
        #print(row)
        Name.append(row[0])
        Age.append(row[1])

print(Name)
print(Age)

Index=Name.index('Selvi')
print(Index)
ActualAge=(Age[Index])
print("Selvi age is"+ ActualAge)

#Write a CSV file

with open('file.csv', 'a') as Wfile:
    write=csv.writer(Wfile)
    write.writerow(["Ganesan",60])
