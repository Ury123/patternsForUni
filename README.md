# Система заказа еды

Это простой проект на Java, демонстрирующий использование двух шаблонов проектирования:

1. **Одиночка (Singleton)**: Используется для управления корзиной (глобальная корзина заказа).
2. **Стратегия (Strategy)**: Используется для обработки различных способов оплаты (например, наличными или картой).

## Возможности

- Добавление товаров в корзину.
- Отображение содержимого корзины.
- Очистка корзины после оплаты.
- Выбор способа оплаты (наличными или картой).

## Шаблоны проектирования

### Одиночка (Singleton)
- **Класс**: `Cart`
- **Цель**: Обеспечивает глобальный доступ к корзине и гарантирует, что существует только один её экземпляр.

### Стратегия (Strategy)
- **Интерфейс**: `PaymentStrategy`
- **Конкретные стратегии**: `CashPayment`, `CardPayment`
- **Цель**: Позволяет динамически выбирать способ оплаты.

## Как это работает

1. Товары добавляются в глобальную корзину с использованием класса-одиночки `Cart`.
2. Способ оплаты выбирается путём установки стратегии в классе `PaymentContext`.
3. Выбранный способ оплаты выполняется для имитации процесса оплаты.
4. После оплаты корзина может быть очищена.

## Требования

- Java 8 или выше

## Как запустить

1. Скопируйте исходный код в Java IDE или текстовый редактор.
2. Скомпилируйте и запустите класс `FoodOrderingSystem`.
3. Следуйте инструкциям для имитации добавления товаров и оплаты.
