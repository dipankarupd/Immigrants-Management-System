package main

import (
	"fmt"
	"log"
	"net/http"
	"os"

	"github.com/dipankarupd/immigrant-management-system/pkg/config"
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

	// Use the MongoDB connection string from the environment variable
	client := config.Client
	log.Printf("MongoDB connection: %v", client)

	log.Fatal(http.ListenAndServe(":"+port, r))
}
