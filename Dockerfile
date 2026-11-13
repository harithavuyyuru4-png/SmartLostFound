
FROM eclipse-temurin:25-jdk

WORKDIR /app

COPY . .

RUN mkdir -p out && javac -cp "lib/*" -d out $(find src -name "*.java")

CMD ["java", "-cp", "/app/out:/app/lib/*", "com.lostfound.LoginTest"]
