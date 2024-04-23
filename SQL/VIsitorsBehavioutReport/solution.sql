SELECT
  COUNT( * ) AS purchases
  FROM
    events
  WHERE
    type = 'buy' AND
    MONTHNAME( dt ) = 'May' AND
    YEAR( dt ) = 2022