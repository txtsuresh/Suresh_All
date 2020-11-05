import requests

url = "https://rahulshettyacademy.com"
cookie= {'visit month':'february'}
response=requests.get(url,cookies=cookie)
print(response.status_code)
print(response.text)