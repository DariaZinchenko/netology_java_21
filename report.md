# Отчёт о тестировании приложения "MoneyTransfer"

## Краткое описание

Было проведено функциональное тестирование приложения "MoneyTransfer", в ходе тестирования была выявлена ошибка выхода значения за пределы диапазона типа int, при вычислении суммы двух чисел.

## Описание тестов

Было проведено:
1. Позитивное функциональное тестирование
1. Негативное функциональное тестирование

## Результаты

1. 43% тестов пройдены успешно

### Были заведены баг-репорты
1. [Выход значения за пределы диапазона типа int, при вычислении суммы двух чисел в приложении Money Transfer](https://github.com/DariaZinchenko/netology_java_21/issues/1)

## Общие рекомендации

Рекомендую обратить внимание на используемый тип данных т.к. из-за использования типа int для финансовых операций могут возникнуть проблемы с выходом за переделы диапазона.
