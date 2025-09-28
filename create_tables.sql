CREATE TABLE IF NOT EXISTS categories (
    id int PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS medicines (
    id int PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(150),
    code VARCHAR(50),
    price double,
    stock int,
    category int,
    FOREIGN KEY (category) REFERENCES categories(id)
);

CREATE TABLE IF NOT EXISTS movements (
    id int PRIMARY KEY AUTO_INCREMENT,
    type VARCHAR(150),
    medicine int,
    quantity int,
    movement_date datetime,
    FOREIGN KEY (medicine) REFERENCES medicines(id)
);
