

items=2

if items != 2:
    raise Exception("test is failed")


a=20

try:
    if a > 31:
        print("pass")

except Exception as e:
    print(e)

finally:
    print("test is completed")

try:
    with open('fileDemo') as file:
        lines = file.readlines()


except Exception as e:
    print(e)

finally:
    print("test is completed")