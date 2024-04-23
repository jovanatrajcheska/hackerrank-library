SELECT qu.domain_name, tt.threat_type, COUNT( qu.id ) AS total_occurrences, SUM( qu.users_affected ) AS total_users_affected
FROM threat_types tt
JOIN quarantine_urls qu ON tt.id = qu.threat_id
WHERE qu.status = 'Quarantined'
GROUP BY qu.domain_name, tt.threat_type
ORDER BY total_users_affected DESC, qu.domain_name;