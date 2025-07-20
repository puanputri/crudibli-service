const API = 'http://localhost:8080/v1/crudiblis';
const listEl = document.getElementById('list');

async function fetchCrudiblis() {
    try {
        const res = await fetch(API);
        if (!res.ok) throw new Error(`HTTP ${res.status}`);
        renderList(await res.json());
    } catch (e) {
        console.error('Load error:', e);
        listEl.textContent = 'Error loading data.';
    }
}

function renderList(items) {
    listEl.innerHTML = '';
    items.forEach(i => {
        const c = document.createElement('div');
        c.className = 'card';
        c.innerHTML = `
      <h2>${i.name}</h2>
      <p><span>Species:</span> ${i.species}</p>
      <p><span>Film:</span> ${i.film}</p>
      <p><span>Magical:</span> ${i.magical ? 'Yes' : 'No'}</p>
      <p><span>Habitat:</span> ${i.habitat}</p>
      <p><span>Power Level:</span> ${i.powerLevel}</p>
    `;
        listEl.appendChild(c);
    });
}

window.addEventListener('DOMContentLoaded', fetchCrudiblis);
