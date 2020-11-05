import requests
import json

#Get Response from Json
response=requests.get('http://216.10.245.166/Library/GetBook.php',
                       params={'AuthorName':'Suresh'},)
#print(response.text)
#print(type(response.text))
#Method 1
contents=json.loads(response.text)
print(contents)

#Method 2
contents1=response.json()
print(contents1)
print(contents1[1]['isbn'])

assert response.status_code==200
#Extracting using loops
for value in contents1:
      if value['isbn']=="abci":
       print(value['aisle'])
       break
print(value['aisle'])

