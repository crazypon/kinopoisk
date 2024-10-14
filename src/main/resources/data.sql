insert into movies(title, movie_description, local_rating, imdbrating, rotten_tomatoes, budget, film_director, genre, main_character, image_path)
    values('Avatar', 'Джейк Салли — бывший морской пехотинец, прикованный к инвалидному креслу. Несмотря на немощное тело, Джейк в душе по-прежнему остается воином. Он получает задание совершить путешествие в несколько световых лет к базе землян на планете Пандора, где корпорации добывают редкий минерал, имеющий огромное значение для выхода Земли из энергетического кризиса.', 8, 7, 8, '150 000 000', 'James Cameron', 'FANTASY', 'Biber', 'avatar.jpg');

insert into movies(title, movie_description, local_rating, imdbrating, rotten_tomatoes, budget, film_director, genre, main_character, image_path)
    values('John Wick', 'Джон Уик - на первый взгляд, самый обычный среднестатистический американец, который ведет спокойную мирную жизнь. Однако мало кто знает, что он был наёмным убийцей, причём одним из лучших профессионалов в своём деле. После того как сынок главы бандитской группы со своими приятелями угоняет его любимый «Мустанг» 1969 года выпуска, при этом убив его собаку Дейзи, которая была подарком недавно почившей супруги, Джон вынужден вернуться к своему прошлому. Теперь Уик начинает охоту за теми, кто имел неосторожность перейти ему дорогу, и он готов на всё, чтобы отомстить.', 8, 7, 8, '130 000 000', 'Ilnur Fanisovich', 'ACTION', 'Biber', 'john_wick.jpg');

insert into movies(title, movie_description, local_rating, imdbrating, rotten_tomatoes, budget, film_director, genre, main_character, image_path)
    values('BladeRunner', 'В недалеком будущем мир населен людьми и репликантами, созданными выполнять самую тяжелую работу. Работа офицера полиции Кей; держать репликантов под контролем в условиях нарастающего напряжения; Пока он случайно не становится обладателем секретной информации, которая ставит под угрозу существование всего человечества. Желая найти ключ к разгадке, Кей решает разыскать Рика Декарда, бывшего офицера специального подразделения полиции Лос-Анджелеса, который бесследно исчез много лет назад.', 8, 7, 8, '200 000 000', 'Deni Vilneve', 'FANTASY', 'Biber', 'bladerunner.jpg');

insert into movies(title, movie_description, local_rating, imdbrating, rotten_tomatoes, budget, film_director, genre, main_character, image_path)
    values('Django', 'Шульц — эксцентричный охотник за головами, который выслеживает и отстреливает самых опасных преступников. Он освобождает раба по имени Джанго, поскольку тот может помочь ему в поисках трёх бандитов. Джанго знает этих парней в лицо, ведь у него с ними свои счёты', 8, 7, 8, '215 000 000', 'Kventin Tarantino', 'ACTION', 'Biber', 'django.jpg');


insert into users(username) values('jonny');

insert into comments(movie_id, content) values ( 1, 'Very nice movie, I like it so much!!!');
insert into comments(movie_id, content) values (1, 'sheeeeeesh');