--1.soru
(
SELECT first_name FROM actor	
)
UNION
(
SELECT first_name FROM customer
);

--2.soru
(
SELECT first_name FROM actor	
)
INTERSECT
(
SELECT first_name FROM customer
);

--3.soru
(
SELECT first_name FROM actor	
)
EXCEPT
(
SELECT first_name FROM customer
);

--4.soru
--4.1
(
SELECT first_name FROM actor
ORDER BY first_name
)
UNION ALL
(
SELECT first_name FROM customer
ORDER BY first_name
);

--4.2

(
SELECT first_name FROM actor
ORDER BY first_name
)
INTERSECT ALL
(
SELECT first_name FROM customer 
ORDER BY first_name 
);

--4.3
(
SELECT first_name FROM actor
ORDER BY first_name
)
EXCEPT ALL
(
SELECT first_name FROM customer
ORDER BY first_name 
);

