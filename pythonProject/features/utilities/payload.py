import configparser

def getAddBody():
    body={

        "name": "Learn Appium Automation with Java",
        "isbn": "xyz1999911120",
        "aisle": "227",
        "author": "John foe"
    }
    return body


def getUrl():
    config= configparser.ConfigParser()
    config.read('features/utilities/globalProperties.ini')
 #   url='http://216.10.245.166'
    url=config['API']['URL']
    return url