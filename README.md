# Коллекции List.  

Эту задачу следует выполнять в одном классе - классе Main.

Мы будем писать список покупок. Программа должна будет общаться с пользователем в следующем формате:

В цикле предлагать ему на выбор одну из операций: добавить, показать, удалить.
Пользователь вводит номер операции.  
Программа запрашивает дополнительные данные для совершения операции, эти данные вводятся одной строкой.  
Программа выполняет операцию, выводит информацию на экран и переходит обратно к пункту вывода меню.   
  
Операция добавить:
Операция запрашивает какую покупку добавить в список, добавляет и выводит на экран информацию об итоговом количестве покупок.  
Операция показать:
Операция не запрашивает дополнительных данных и выводит все покупки с их нумерацией. При этом для пользователя мы нумеруем с 1.  
Операция удалить:
Операция выводит на экран все покупки и предлагает ввести либо номер покупки для удаления (для пользователя нумерация с 1!), либо название самой покупки. Формат вывода должен быть такой:
```java

Выберите операцию:
3

Список покупок:
1. Молоко
2. Хлеб
3. Сыр
Какую хотите удалить? Введите номер или название

2

Покупка "Хлеб" удалена, список покупок:
1. Молоко
2. Сыр
```
или по названию:
```java
Выберите операцию:
3

Список покупок:
1. Молоко
2. Хлеб
3. Сыр
Какую хотите удалить? Введите номер или название

Хлеб

Покупка "Хлеб" удалена, список покупок:
1. Молоко
2. Сыр
```
Для реализации этой операции попробуйте сперва распарсить введённые данные как число через Integer.parseInt. Если получится - пользователь ввёл номер для удаления, если нет - название. Для удаления воспользуйтесь методом remove у списка - если передадите туда примитивный int, то он удалит по номеру, если объект - найдёт ячейку в которой будет такой же объект и удалит её.
  
Добавьте операцию поиска покупок по ключевым словам. При этом не должен учитываться регистр букв (т.е. без разницы большая или маленькая). Пример:
```java
Выберите операцию:
4

Введите текст для поиска:
хЛеБ
Найдено:
1. Хлеб
6. Хлебные сушки
7. Бургер "Родной хлебушек"
```
Обратите внимание, что нумерация найденных покупок должна быть такой же, как в списке всех покупок.
