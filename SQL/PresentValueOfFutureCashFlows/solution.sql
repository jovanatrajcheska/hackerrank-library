SELECT email, COUNT( expected_flow )                                               AS investment_count,
  ROUND( SUM( expected_flow / POW( 1 + 0.05, cash_flow_period ) ), 2 ) AS total_present_value,
  ROUND( AVG( expected_flow / POW( 1 + 0.05, cash_flow_period ) ), 2 ) AS avg_present_value
FROM investors AS i
JOIN cash_flows AS cf ON i.id = cf.investor_id
GROUP BY email
HAVING total_present_value > 1000000
ORDER BY email