### Hexlet tests and linter status:
[![Actions Status](https://github.com/Kennocke/java-project-78/workflows/hexlet-check/badge.svg)](https://github.com/Kennocke/java-project-78/actions)
[![Maintainability](https://api.codeclimate.com/v1/badges/1f6225730f6ac284dfd7/maintainability)](https://codeclimate.com/github/Kennocke/java-project-78/maintainability)

Проект "Валидатор"

Библиотека помогает проверять корректность данных.

Доступные валидаторы:
* String
  * required – любая непустая строка
  * minLength – строка равна или длиннее указанного числа
  * contains – строка содержит определённую подстроку
* Number
  * required – любое число включая ноль
  * positive – положительное число
  * range – диапазон, в который должны попадать числа включая границы
* Map (Доступна вложенная валидация)
  * required – требуется тип данных Map
  * sizeof – количество пар ключ-значений в объекте Map должно быть равно заданному