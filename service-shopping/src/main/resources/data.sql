CREATE TABLE tlb_invoices (id BIGINT AUTO_INCREMENT PRIMARY KEY, number_invoice VARCHAR(250), description VARCHAR(500), customer_id NUMERIC, create_at TIMESTAMP, state VARCHAR);

INSERT INTO tlb_invoices (id, number_invoice, description, customer_id, create_at, state)
VALUES(1, '0001', 'invoice office items', 1, NOW(),'CREATED');

CREATE TABLE tbl_invoce_items (id BIGINT AUTO_INCREMENT, invoice_id NUMERIC , product_id NUMERIC,  quantity NUMERIC, price DOUBLE);

INSERT INTO tbl_invoce_items (id, invoice_id, product_id, quantity, price )
VALUES(1, 1, 1 , 1, 178.89);
INSERT INTO tbl_invoce_items (id, invoice_id, product_id, quantity, price)
VALUES(1, 1, 2 , 2, 12.5);
INSERT INTO tbl_invoce_items (id, invoice_id, product_id, quantity, price)
VALUES(1, 1, 3 , 1, 40.06);








