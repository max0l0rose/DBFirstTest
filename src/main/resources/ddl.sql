create table order1
(
    id int not null
        primary key,
    column_2 int null
);

create table prod_details
(
    id int auto_increment
        primary key,
    prod_descr varchar(100) null
);

create table product
(
    column_name varchar(255) null,
    user_id int null,
    id int auto_increment
        primary key
);

create table order_product
(
    product_id int not null,
    order_id int not null,
    quantity int default 1 not null,
    primary key (product_id, order_id),
    constraint order___fk
        foreign key (order_id) references order1 (id),
    constraint product___fk
        foreign key (product_id) references product (id)
);

