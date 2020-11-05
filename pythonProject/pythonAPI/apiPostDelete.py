import requests
import json
#PostRequest
response = requests.post('http://216.10.245.166/Library/Addbook.php', json={

"name":"Learn Appium Automation with Java",
"isbn":"xyz199991112",
"aisle":"227",
"author":"John foe"
})

contents=response.json()
print(type(contents))
print(contents)
ID=contents['ID']
print(ID)
#DeleteRequest

response1= requests.delete('http://216.10.245.166/Library/DeleteBook.php',json={"ID" : "xyz199991112227"})
deletecontent=response1.json()
print(deletecontent)


