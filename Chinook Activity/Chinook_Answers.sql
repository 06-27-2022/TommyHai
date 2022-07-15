/*
*1) Provide a query showing Customers (just their full names, customer ID and country) who are not in the US.
*2) Provide a query only showing the Customers from Brazil.
*10) Looking at the InvoiceLine table, provide a query that COUNTs the number of line items for each Invoice. HINT: GROUP BY
*/

--Question 1
--select * from accounts;
--must be in "" because jdbc seems to set everything to lowercase to achieve case insensitivity

select * from "Customer";
select "FirstName" ,"LastName" ,"CustomerId" ,"Country"  from "Customer" ;

--answer
select "FirstName" ,"LastName" ,"CustomerId" ,"Country"  from "Customer" where "Country"!='USA';


--Question 2
select * from "Customer" where "Country"='Brazil';


--Question 10
--Looking at the InvoiceLine table, provide a query that COUNTs the number of line items for each Invoice. HINT: GROUP BY

select * from batches;
SELECT "trainer_id", count(associate_id) FROM batches GROUP BY trainer_id 
HAVING trainer_id > 1;

select * from "InvoiceLine";
select "InvoiceId" , count("InvoiceLineId") from "InvoiceLine" group by "InvoiceId" having "InvoiceId"=2;

--answer
select "InvoiceId" , count("InvoiceLineId") from "InvoiceLine" group by "InvoiceId" order by "InvoiceId";


