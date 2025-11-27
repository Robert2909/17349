<script>
	import Hijo from "./Hijo.svelte"
	export let name;
	let nombre = 'Robert'

	let contador =0;
	function incrementar() {
		contador = contador + 1;
	}

	function restar() {
		contador = contador - 1;
	}

	function saludar() {
		alert(nombre ? nombre: "No hay nombre");
	}
</script>

<main>
	<h1>Contador: {contador}</h1>
	<button on:click={incrementar}>Sumar ++</button>
	<button on:click={restar}>Restar --</button>
	<Hijo texto="Salvar"></Hijo>
	<Hijo texto="Borrar" color="red"></Hijo>
	<input type="text" placeholder="Escribe tu nombre" bind:value={nombre}>
	<button on:click={saludar}>Saludar</button>
</main>

<style>
	main {
		text-align: center;
		padding: 1em;
		max-width: 240px;
		margin: 0 auto;
	}

	h1 {
		color: #ff3e00;
		text-transform: uppercase;
		font-size: 4em;
		font-weight: 100;
	}

	@media (min-width: 640px) {
		main {
			max-width: none;
		}
	}
</style>