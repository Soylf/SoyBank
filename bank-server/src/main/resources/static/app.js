// Асинхронная функция для регистрации пользователя
async function registerUser() {
    const name = document.getElementById('name').value; // Получаем значение поля ввода с id 'name', то есть имя, введённое пользователем
    const response = await fetch('/map/user', { // 'await' ожидает завершения запроса
        method: 'POST', // Указываем метод HTTP-запроса — POST (для отправки данных)
        headers: { // Заголовки, сообщающие серверу, что отправляемый контент — это JSON
            'Content-Type': 'application/json' },
        body: JSON.stringify({ name }), // Преобразуем объект в строку формата JSON
    });
    if (response.ok) {
        alert('Вы зарегались');
        document.getElementById('registerForm').reset(); // Сбрасываем форму, очищая поле ввода
    } else {
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