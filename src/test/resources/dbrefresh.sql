DELETE FROM customer.orders;
DELETE FROM customer.customers;


INSERT INTO customer.customers (customer.customers.user_name, customer.customers.email)
            VALUES ('dFlannigan','dflannigan@email.com');
