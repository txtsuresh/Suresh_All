
str="Suresh & Viyaan  "
str2 = "Yaanvi"

print(str[0]) # prints string in 0th index
print(str[0:5]) # prints string from 0 to 4th index
print(str.split("&")) # Splits string with "&"
str1=str.split("&") #['Suresh ', ' Viyaan  ']
print(str1[0]) #Prints string in 0th index of str1
print(str.strip()) #Removes blank spaces before & after the string
print(str.rstrip()) #Removes blank spaces on right side of the string
print(str + str2) # prints string concatenation
