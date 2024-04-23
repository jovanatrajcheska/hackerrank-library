SELECT protocol, SUM(traffic_in) AS traffic_in, SUM(traffic_out) AS traffic_out
FROM traffic
GROUP BY protocol
HAVING traffic_in > traffic_out
ORDER BY protocol