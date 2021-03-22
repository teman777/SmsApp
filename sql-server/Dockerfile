FROM mysql:latest

ADD init-db.sql /docker-entrypoint-initdb.d/init-db.sql
RUN chmod -R 775 /docker-entrypoint-initdb.d

ENV MYSQL_ROOT_PASSWORD somepassword

