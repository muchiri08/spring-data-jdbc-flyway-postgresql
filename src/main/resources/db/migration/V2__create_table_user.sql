CREATE TABLE IF NOT EXISTS person(
    person_id SERIAL PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    email citext UNIQUE
);