create table `order`
(
    id int auto_increment
        primary key,
    column_2 int null
);

create table product
(
    id int auto_increment
        primary key,
    new_column varchar(255) null,
    user_id int null
);

create table order_product
(
    product_id int not null,
    order_id int not null,
    primary key (product_id, order_id),
    constraint order___fk
        foreign key (order_id) references `order` (id),
    constraint product___fk
        foreign key (product_id) references product (id)
);


