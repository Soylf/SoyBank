async function registerUser() {
        const name = document.getElementById('name').value;

        const response = await fetch('/map/user', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({ name }),
        });

        if (response.ok) {
            alert('User registered successfully!');
            document.getElementById('registerForm').reset();
        } else {
            alert('Failed to register user.');
        }
    }

    async function createCard() {
        const pinKod = document.getElementById('pin').value;
        const textKod = document.getElementById('textCode').value;
        const cardId = document.getElementById('cardId').value;

        const response = await fetch('/map/card', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({ pinKod, textKod, cardId }),
        });

        if (response.ok) {
            alert('Card created successfully!');
            document.getElementById('cardForm').reset();
        } else {
            alert('Failed to create card.');
        }
    }