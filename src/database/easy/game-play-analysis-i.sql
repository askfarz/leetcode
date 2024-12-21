SELECT act.player_id, MIN(act.event_date) AS first_login
FROM Activity act
GROUP BY act.player_id;
