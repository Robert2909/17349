<script>
    // Código JS
    export let texto = "Botón";
    export let color = "blue";
</script>

<!-- Markup html -->
<button style="--btn-color: {color}">
    {texto}
</button>

<style>
    /* Código CSS */
    button {
        color: white;
        background-color: var(--btn-color);
    }
</style>