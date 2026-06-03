1) SELECT user_id, user_name, city FROM Users WHERE city = 'Bangalore';
2) SELECT * FROM Pages WHERE category in ('Technology', 'Business');
3) Insert into Users values(9, 'Nikhil', 'Hydrabad', '2024-04-20');
4) SELECT * FROM Users WHERE user_name = 'Tanya';
5) mysql> DELETE FROM Likes WHERE user_id = 8 AND page_id = 105;
6) SELECT u.user_id, u.user_name, l.page_id, p.category FROM Likes l JOIN Users u on l.user_id = u.user_id join Pages p on l.page_id = p.page_id;
7) SELECT u.user_name, COUNT(l.page_id) AS total_pages_liked FROM Users u LEFT JOIN Likes l ON u.user_id = l.user_id   GROUP BY u.user_id, u.user_name;
8)  SELECT p.page_name,(SELECT COUNT(*) FROM Likes l2 WHERE l2.page_id = p.page_id) AS total_likes FROM Pages p WHERE p.page_id IN (SELECT page_id FROM Likes GROUP BY page_id HAVING COUNT(*) > 2);

9) 


