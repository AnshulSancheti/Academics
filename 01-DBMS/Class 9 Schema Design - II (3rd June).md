
# Participation

1) Total Participation - Both aspects need to exist simultaneously like Orders cant exist without Payments
2) Partial Participation - One of the aspects can exisit indivisually like menu items and orders

Participation is weather both the aspects of a relationship can exist indivisually or cannot

# Storing Relationships 

## One to One

- Create a forening key in one table that is the primary key in the other

## Many to One

- Add the One primary key as the foreign key in the Many table 

## Many to Many

- Create a junction table

_____ 

# Normalization Of Data

Normalization is the process of organizing the data to reduce redundancy and eliminate anomalies

## Functional Dependencies
- A functional dependency x --> y exists if every value of x uniquely determines y
- X --> Determinant
- Y --> Dependent attribute

Eg: customer_id --> customer_contact, DOB, customer_name
Here customer_id can be used to uniquely identify all these attributes and they are functionally dependent on the id

Getting to know the functional dependencies helps us reduce the redundancy in the database.

### Trivial Functional Dependencies 

- Dependent attribute is already a part of the determinant

Eg: (customer_name, customer_id) --> customer_name

You should ignore these dependencies because they dont add any new information and whenever we look at the dependancies we must remove all the trivial dependencies

### Non-Trivial Dependencies

- 



___

# Anomalies 

## 1) Update Anomaly

- A single logical update requires changes across multiple places

## 2) Create Anomaly

- When unrelated information is present all at the same place we cannot add something without like a restaurant, or customer without adding unrelated informtion

## 3) Delete Anomaly 

- Deleting one row or table deletes extra unrelated information from the database

