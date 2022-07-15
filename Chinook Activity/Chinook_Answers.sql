/*
*1) Provide a query showing Customers (just their full names, customer ID and country) who are not in the US.
*2) Provide a query only showing the Customers from Brazil.
*/

--Question 1
--select * from accounts;
--must be in "" because jdbc seems to set everything to lowercase to achieve case insensitivity

select * from "Customer";

select "FirstName" ,"LastName" ,"CustomerId" ,"Country"  from "Customer" ;

select "FirstName" ,"LastName" ,"CustomerId" ,"Country"  from "Customer" where "Country"!='USA';

--Question 2
select * from "Customer" where "Country"='Brazil';
