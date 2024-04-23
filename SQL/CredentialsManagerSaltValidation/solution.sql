SELECT
  mac,
  COUNT( * ) AS salts
  FROM
    encryptions e
      LEFT JOIN accounts a
        ON e.account_id = a.id
  WHERE
    LENGTH( salt ) < 8 AND
    is_active
  GROUP BY
    mac
  ORDER BY
    mac