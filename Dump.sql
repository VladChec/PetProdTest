-- Создание таблицы category

CREATE TABLE category
(
  id SERIAL PRIMARY KEY,
  title VARCHAR(45) NOT NULL,
  completed_count BIGINT DEFAULT 0,
  uncompleted_count BIGINT DEFAULT 0
);


-- Заполнение таблицы category
INSERT INTO category (id, title, completed_count, uncompleted_count)
VALUES
  (167, 'Семья', 1, 2),
  (168, 'Работа', 1, 1),
  (170, 'Отдых', NULL, 3),
  (171, 'Путешествия', 1, 0),
  (179, 'Спорт', 2, 0),
  (180, 'Здоровье', 1, 2),
  (182, 'Новая категория', 0, 0);

-- Создание таблицы priority
CREATE TABLE priority
(
  id BIGINT PRIMARY KEY,
  title VARCHAR(45) NOT NULL,
  color VARCHAR(45) NOT NULL
);

-- Заполнение таблицы priority
INSERT INTO priority (id, title, color)
VALUES
  (56, 'Низкий', '#caffdd'),
  (57, 'Средний', '#883bdc'),
  (58, 'Высокий', '#f05f5f');

-- Создание таблицы stat
CREATE TABLE stat
(
  id BIGSERIAL PRIMARY KEY,
  completed_total BIGINT DEFAULT 0,
  uncompleted_total BIGINT DEFAULT 0
);

-- Заполнение таблицы stat
INSERT INTO stat (id, completed_total, uncompleted_total)
VALUES (1, 7, 11);

-- Создание таблицы task
CREATE TABLE task
(
  id BIGSERIAL PRIMARY KEY,
  title VARCHAR(100) NOT NULL,
  completed INTEGER DEFAULT 0,
  dates TIMESTAMP,
  priority_id BIGINT REFERENCES priority(id) ON DELETE SET NULL ON UPDATE RESTRICT,
  category_id BIGINT REFERENCES category(id) ON DELETE SET NULL ON UPDATE RESTRICT
);

-- Заполнение таблицы task
INSERT INTO task (id, title, completed, dates, priority_id, category_id)
VALUES
  (328, 'Позвонить родителям', 1, '2020-04-29 15:27:11', 58, 167),
  -- Другие записи...
  (358, 'Задача по категории', 0, '2020-05-01 12:01:18', 58, 170);
