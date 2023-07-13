package main

import (
	"fmt"
	"log"
	"net/http"
	"os"

	"github.com/dipankarupd/immigrant-management-system/pkg/route"
	"github.com/gorilla/mux"
)

func main() {
	r := mux.NewRouter()
	route.RegisterNewroute(r)
	http.Handle("/", r)
	fmt.Println("Starting the server")

	port := os.Getenv("PORT")
	if port == "" {
		port = "8080"
	}
	log.Fatal(http.ListenAndServe(":"+port, r))
}
