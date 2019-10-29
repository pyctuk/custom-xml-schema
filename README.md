# custom-xml-schema
Spring custom xml schema example

## Given:
We have 3 modules 

1) Main module. Holds business logic. Has its own context. 
It uses classes from third module.
2) Additional module. Holds some additional logic (for example reports and etc). 
It uses third module classes too.
3) Third module. Holds some common service (for example audit, monitoring, custom logging)

## Task:

Additional module shouldn't declare some beans or dependencies (to exclude potential conflicts), but should declare some contract to use this module.

## Solution:

Use custom xml schema

## Result:

1) Main module creates all needed beans. Excluded any potential bean and dependency conflicts with additional module.
2) Additional module 
 - has't bean declaration
 - has't runtime dependencies. Just provided.
 - has contract (xsd).
 

## Urls

- https://docs.spring.io/spring/docs/3.0.x/spring-framework-reference/html/extensible-xml.html
- https://dzone.com/articles/creating-custom-spring-3-xml
