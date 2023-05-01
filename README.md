# job4j_dish
Доставка готовых блюд "Голодный волк".

# Описание
Проект для доставки готовых блюд. Заказчик оставляет заказ через сайт или мобильное приложение. Курьер получает заказ и 
выполняет его. Администратор кафе отслеживает поставку продуктов и прибыль, взаимодействует с кухней, курьерами и клиентами.

# Стек технологий
- Java 17;
- PostgreSQL 14;
- Spring Boot 2;
- Hibernate 5;
- Lombok 1;
- Liquibase 4;

# Требования к окружению
- Java 17;
- Maven 3.8;
- PostgreSQL 14.

# Запуск проекта
1. Создать БД: ```dish```.
2. Запустить приложение из класса Main.
3. Запустить Postman и выполнить запросы.

# Взаимодействие с приложением (в разработке)
1. Клиент регистрирует заказ.
2. Кухня получает заказ и выполняет его. Обновляет статусы готовности заказа и состояния продуктов.
3. Курьер получает заказ, выполняет его, обновляет свое месторасположение.
4. Администратор проверяет статусы работы клиентов, кухни, курьеров, поставки продуктов, прибыль.

# Контакты
mymail@gmail.com.