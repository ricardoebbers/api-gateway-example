FROM openjdk:11
ARG DEPENDENCY=build/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -cp app:app/lib/* br.ufpe.cin.recl.gateway.GatewayApplicationKt"]