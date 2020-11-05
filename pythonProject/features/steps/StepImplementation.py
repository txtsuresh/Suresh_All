import requests
from behave import *

from features.utilities.payload import *


@given('API Details for addbook')
def step_impl(context):
    context.url= getUrl()+'/Library/Addbook.php'


@when('Send the post request')
def step_impl(context):
    context.response = requests.post(context.url, json=getAddBody())


@then('Book is added sucesfully')
def step_impl(context):
    contents = context.response.json()
    print(type(contents))
    print(contents)
    context.ID = contents['ID']
    print(context.ID)

