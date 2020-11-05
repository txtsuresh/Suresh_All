import requests
from bs4 import BeautifulSoup

li=[]
data = requests.get("https://www.imdb.com/find?s=ep&q=thriller&ref_=nv_sr_sm")
soup = BeautifulSoup(data.content,'html.parser')
#print(soup.prettify()) #prints the entire page contents
moviesTable = soup.find('table',{'class':'findList'})
#print(moviesTable.prettify())
rows=moviesTable.findAll('tr')
for row in rows:
    rowData=row.findAll('td')
   # print(rowData[1].a.text) # prints all movie name texts
    subUrl=rowData[1].a['href']
    subData=requests.get("https://www.imdb.com/"+subUrl)
    childSoup=BeautifulSoup(subData.content,'html.parser')
    if childSoup.find('div',{'class':'see-more inline canwrap'}): # some moview will not have genre & hence the if condition will make sure to go inside if the value is true
        genre=childSoup.find('div',{'class':'see-more inline canwrap'})
        if genre.a.text == " Documentary": #prints the movie with documentary genre alone.
            print(rowData[1].a.text)
            print(genre.a.text)
            li.append(rowData[1].a.text)

print(li)






