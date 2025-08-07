CREATE TABLE t_inventory (
    id BIGINT(20) NOT NULL AUTO_INCREMENT,
    sku_code VARCHAR(64) NOT NULL,
    quantity INT(11) NOT NULL,
    PRIMARY KEY (id)
);