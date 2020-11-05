import requests


url = "https://api.github.com/user"
response=requests.get(url,auth=('user','pass'))
print(response.status_code)



