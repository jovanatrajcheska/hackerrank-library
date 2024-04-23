SELECT email, COUNT( valuation ) AS investments, MIN( valuation )   AS min_valuation, MAX( valuation )   AS max_valuation, ROUND( AVG( valuation ), 2 ) AS avg_valuation
FROM investors AS i
JOIN investments AS iv ON i.id = iv.investor_id
GROUP BY email
HAVING avg_valuation > 100000
ORDER BY email