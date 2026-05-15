# RBPO Backend

Серверная часть системы лицензий и антивирусных сигнатур (РБПО).

Stack: Java 21, Spring Boot 3, PostgreSQL, MinIO, Gradle.

Это **скелет проекта**. Каждое задание поставляется отдельной веткой:

- `task1-repo-setup-auth-db-ci` — JWT-аутентификация, ролевая модель, HTTPS, PostgreSQL, GitHub Actions pipeline (`test` + `build`).
- `task2-license-module` — модуль лицензий, сущности БД по ER-диаграмме, операции create/activate/check/renew, классы `Ticket` и `TicketResponse`.
- `task3-digital-signature` — модуль ЭЦП (SHA256withRSA + RFC 8785), хранилище ключей, скрипты, подключение к лицензиям.
- `task4-malware-signatures` — антивирусные сигнатуры, 8 операций, history/audit, подпись каждой записи.
- `task5-binary-api` — бинарный API (`multipart/mixed`: `manifest.bin` + `data.bin`), подпись манифеста.
- `task6-files-minio` — загрузка файлов сигнатур, MinIO, presigned URLs, ADMIN-only.

Финальная версия живёт на ветке `task6-files-minio`.

## Локальный запуск

```bash
docker compose up -d              # PostgreSQL (+ pgAdmin)
./gradlew bootRun
```
