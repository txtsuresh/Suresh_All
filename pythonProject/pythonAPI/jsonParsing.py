import json


courses = '{"name": "RahulShetty","languages": [ "Java", "Python"]}'
contents=json.loads(courses)
print(type(courses))
print(type(contents))
print(contents)
print(contents['name'])


print(contents['languages'][1])


#open Json file

with open('C:\\Users\\Suresh Kumar\\Desktop\\course.json') as file:
    contents=json.load(file)
    print(contents)
    print(contents['courses'][1]['title'])
    print(contents['dashboard']['website'])
    for course in contents['courses']:
       # print(course)
        if course['title']=="Java":
            print(course['title'])
            assert course['price']== 40
            print(course['price'])
           # break





