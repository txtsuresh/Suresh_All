import requests
import json
from pythonAPI.payload import *

#PostRequest

url='http://216.10.245.166'
response = requests.post(url +'/Library/Addbook.php', json=getBody(),)

contents=response.json()
print(type(contents))
print(contents)
ID=contents['ID']
print(ID)
#DeleteRequest

response1= requests.delete(url + '/Library/DeleteBook.php',json={"ID" : ID})
deletecontent=response1.json()
print(deletecontent)


