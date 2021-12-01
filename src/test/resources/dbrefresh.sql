DELETE FROM customer.customers;
DELETE FROM customer.orders;

INSERT INTO customer.customers (customer.customers.user_name, customer.customers.email)
            VALUES ('dFlannigan','dflannigan@email.com');
