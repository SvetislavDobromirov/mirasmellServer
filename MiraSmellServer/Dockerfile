FROM openjdk:17
# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем jar файл в контейнер
COPY target/MiraSmellServer-0.0.1-SNAPSHOT-jar-with-dependencies.jar app.jar

# Открываем нужный порт
EXPOSE 8070

# Запускаем приложение
CMD ["java", "-jar", "app.jar"]
