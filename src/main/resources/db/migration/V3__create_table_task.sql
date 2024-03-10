CREATE TABLE IF NOT EXISTS task(
    task_id SERIAL PRIMARY KEY,
    text TEXT,
    person_id INT REFERENCES person (person_id) ON DELETE CASCADE
);