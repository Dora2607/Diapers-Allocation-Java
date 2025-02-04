# Diaper 

Questo progetto è un'applicazione Java per gestire la distribuzione di pannolini ai bambini. 
Il progetto è stato sviluppato utilizzando Maven come strumento di build.

## Struttura del Progetto

Il progetto è composto da diverse classi, ciascuna con un ruolo specifico:

- `App`: Punto di ingresso principale del programma.
- `Menu`: Classe responsabile della gestione del menu principale e del sottomenu dell'albero malato.
- `Child`: Classe che rappresenta un bambino.
- `Diaper`: Classe che rappresenta un pannolino.
- `DiapersManagement`: Classe che gestisce la distribuzione dei pannolini.
- `Initializer`: Classe che gestisce l'inizializzazione dei bambini e dei pannolini.

## Requisiti

- JDK 8 o superiore
- Maven

## Installazione

1. Clona il repository:
    ```sh
    git clone https://github.com/Dora2607/Diapers-Allocation-Java.git
    ```
2. Naviga nella directory del progetto:
    ```sh
    cd diapers-allocation
    ```
3. Costruisci il progetto utilizzando Maven:
    ```sh
    mvn clean install
    ```

## Utilizzo

Al lancio dell'applicazione, viene visualizzato un menu con le seguenti funzionalità:

1. Inizializza la lista dei bambini che necessitano di pannolini.

2. Inizializza la lista dei pannolini disponibili.

3. Gestione della distribuzione dei pannolini:

    - Ogni bambino riceve una fornitura completa di pannolini se disponibile.

    - Se la fornitura non è completa, i pannolini vengono distribuiti in base alla disponibilità.

4. Esci dall'applicazione.

