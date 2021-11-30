DELETE FROM customer.customers;
DELETE FROM customer.orders;

INSERT INTO customer.customers (customer.customers.first_name, customer.customers.last_name, customer.customers.email)
            VALUES ('Dave','Flannigan','dflannigan@email.com');
