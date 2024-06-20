package main

import (
	"fmt"
	"net/http"
)

type Response struct {
	Message string `json:"message"`
}

func main() {
	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {
		// Permite qualquer origem
		w.Header().Set("Access-Control-Allow-Origin", "*")

		// Outros cabeçalhos que você possa precisar permitir
		w.Header().Set("Access-Control-Allow-Headers", "Content-Type")

		// Permite métodos GET, POST, PUT, DELETE
		w.Header().Set("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS")

		// Se a requisição for OPTIONS, retorna apenas os cabeçalhos permitidos
		if r.Method == "OPTIONS" {
			return
		}

		// Seu código de resposta aqui
		fmt.Fprintln(w, "Hello, World")
	})

	fmt.Println("Server is running on port 8080...")
	http.ListenAndServe(":8080", nil)
}
