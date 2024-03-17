# About hey
# https://github.com/rakyll/hey

hey -z 10s -T 'application/json' -D './book.json' -m POST http://localhost:8090/api/book/v1
hey -z 10s -T 'application/json' -D './book.json' -m POST http://localhost:8090/api/book/v2
hey -z 10s -T 'application/json' -D './book.json' -m POST http://localhost:8090/api/book/v3
