import mysql.connector

conn=mysql.connector.connect(host='localhost',database='viyaan',user='root',password='suresh123')

print(conn.is_connected())

cursor=conn.cursor()
cursor.execute('select * from students')
row=cursor.fetchone()
print(row)
print(row[3])

rowAll=cursor.fetchall()
print(rowAll)#list of tuples

sum=0
#pint sum of ages
for row in rowAll:
    sum=sum+row[1]
print(sum)

query="update students set age= %s where name=%s"
data=("45","suresh")
cursor.execute(query,data)
conn.commit()
conn.close()