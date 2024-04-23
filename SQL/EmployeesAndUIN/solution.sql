SELECT e.name, eu.uin
FROM employee e
LEFT JOIN employee_uin eu
ON e.id = eu.id