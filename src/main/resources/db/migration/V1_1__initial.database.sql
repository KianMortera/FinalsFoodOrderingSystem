Insert into Customers(Full_name, Username, Password, Gcash_name,Gcash_number,Role) Values ("Ivan Paul Pascual","Ivan","IvanQt123","Ivan Pascual",09242732652,"Student");
Insert into Customers(Full_name, Username, Password, Gcash_name,Gcash_number,Role) Values ("Kian Daniel Mortera","Kian","Kian123","Kian Mortera",09232252892,"Employee");

Insert into Food_menu(Food_name, Price, Food_nutrients) Values ("Adobo",85,"392 Calories, Protein 37g, Fat 23g");
Insert into Food_menu(Food_name, Price, Food_nutrients) Values ("Lechon",85,"242 Calories, Protein 27g, Fat 14g");

Insert into Payment(Customer_name, Reference_number, Cellphone_number) Values ("Ivan Pascual", 2812375232, 09242732652);
Insert into Payment(Customer_name, Reference_number, Cellphone_number) Values ("Kian Morera", 2227546465, 09232252892);

Insert into Orders(Food, Quantity, Price, Food_nutrients) Values ("Adobo", 1, "85", "392 Calories, Protein 37g, Fat 23g");
Insert into Orders(Food, Quantity, Price, Food_nutrients) Values ("Lechon", 1, "85", "242 Calories, Protein 27g, Fat 14g");

Insert into Ordered_food(Quantity, Food, Food_nutrients, Date, Status) Values (1,"Adobo", "392 Calories, Protein 37g, Fat 23g", "June 15, 2023", "Pending");
Insert into Ordered_food(Quantity, Food, Food_nutrients, Date, Status) Values (1,"Lechon", "242 Calories, Protein 27g, Fat 14g", "June 15, 2023", "Pending");