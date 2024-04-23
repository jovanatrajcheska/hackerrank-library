SELECT eu.uin, e.name
FROM employee e
JOIN employee_uin eu
ON e.id = eu.id
WHERE e.age < 25
ORDER BY e.name, e.id;