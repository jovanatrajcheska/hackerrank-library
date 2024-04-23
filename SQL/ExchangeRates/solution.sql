WITH transactions AS (
SELECT customer_name,
    SUM(CASE WHEN order_type LIKE 'Buy' THEN order_amount ELSE 0 END) buy,
    SUM(CASE WHEN order_type LIKE 'Sell' THEN order_amount ELSE 0 END) sell
FROM customers c
JOIN orders o
ON c.id = o.customer_id
GROUP BY customer_name
)

SELECT customer_name,
    ROUND(buy * 0.001 + sell * 0.0015,2)
                                                
FROM transactions
ORDER BY customer_name