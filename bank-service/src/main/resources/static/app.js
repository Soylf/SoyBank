// Асинхронная функция для регистрации пользователя
async function registerUser() {
    // Получаем значение поля ввода с id 'name', то есть имя, введённое пользователем
    const name = document.getElementById('name').value;
    // Отправляем POST-запрос на сервер по адресу '/map/user' с телом запроса в формате JSON
    const response = await fetch('/map/user', { // 'await' ожидает завершения запроса
        method: 'POST', // Указываем метод HTTP-запроса — POST (для отправки данных)
        headers: { // Заголовки, сообщающие серверу, что отправляемый контент — это JSON
            'Content-Type': 'application/json' },
        // Тело запроса содержит JSON-строку с именем пользователя
        body: JSON.stringify({ name }), // Преобразуем объект в строку формата JSON
    });
    // Если ответ от сервера положительный (код 200–299), то...
    if (response.ok) {
        // Выводим сообщение об успешной регистрации пользователя
        alert('Вы зарегались');
        // Сбрасываем форму, очищая поле ввода
        document.getElementById('registerForm').reset();
    } else {
        // Если запрос не удался, выводим сообщение об ошибке
        alert('Что-то пошло не так.');
    }
}

async function getCardByCartId() {
    const cardId = document.getElementById("cardId").value;

    const response = await fetch("/map/card", {
        method: "GET",
        headers: {
            'Content-Type': 'application/json',
            'cardId': cardId
        }
    });

    if (response.ok) {
        const cardData = await response.json();  // Получаем данные карты
        const cardIcon = document.getElementById("cardIcon");
        cardIcon.textContent = `Card ID: ${cardData.cardId}, PIN: ${cardData.pin}`;  // Обновляем иконку
    } else {
        alert('Что-то пошло не так.');
    }
}

    async function createCard() {
        const pinKod = document.getElementById('pin').value;
        const textKod = document.getElementById('textCode').value;
        const cardId = document.getElementById('cardId').value;

        const response = await fetch('/map/card', {
            method: 'POST',
            headers: {'Content-Type': 'application/json' },
            body: JSON.stringify({ pinKod, textKod, cardId }),
        });

        if (response.ok) {
            alert('Карта созданна!');
            document.getElementById('cardForm').reset();
        } else {
            alert('Что-то пошло не так.');
        }
}