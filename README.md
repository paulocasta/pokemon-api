## About
The idea of the project is the call the Pokemon API ( (https://pokeapi.co/) and
generate the schema DB and populate it, so later it can be use using a local DB.
## TECH
Hibernate version 5.6.12.Final is used.

## POPULATE DB ORDER
We only will use pokemon API (https://pokeapi.co/api/v2/pokemon/). In order to
create a pokemon record, other calls has to be done first. This is the order:
1. Language API
2. Pokemon API 
   1. Ability API
      1. Generation API
         1. Region API
            1. Location API
               1. Location Area API
                  1. Encounter Method API
  