import requests


def after_scenario(context, scenario):
    ID=context.ID
    response1 = requests.delete('http://216.10.245.166/Library/DeleteBook.php', json={"ID": ID})
    deletecontent = response1.json()
    print(deletecontent)

