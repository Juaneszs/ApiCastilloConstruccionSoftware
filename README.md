# Sistema de Coordinación estrategica del Cuerpo de Cazadores – Batalla del Castillo Infinito

## Contexto
Durante la batalla final contra Muzan Kibutsuji, Nakime ha distorsionado el espacio con el Castillo Infinito, aislando a los Pilares en distintas dimensiones. El sistema permite registrar posiciones, almacenar mensajes tácticos y reconstruirlos para coordinar ataques.

## Requisitos Técnicos
- Java 17+
- Spring Boot 3+
- Maven 3.8+
- XAMPP

## Configuración
`src/main/resources/application.properties`:
```
spring.datasource.url=jdbc:mysql://localhost:3306/CastilloApi?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

## ▶ Ejecución
(deben crearse Pilares en la base de datos)
```bash
mvn clean package
mvn spring-boot:run
```

##  Endpoints Implementados

### 1) GET /api/pilares/{id}
**Descripción:** Consulta la información completa de un Pilar por medio del id (de pilares existentes en base de datos)
**Response 200:**
```json
{
  "name": "sanemi shinazugawa",
  "posx": 100.0,
  "posy": -100.0,
  "status": "saludable",
  "id": 2
}
```

### 2) GET /api/inteligencia/triangulacion
**Descripción:** Calcula una proyección aproximada de la ubicación de Muzan.
**Response 200:**
```json
{
  "x": -96.0,
  "y": 52.0,
  "TrustLevel": 0.78,
  "description": "probabilidad alta de presencia demoniaca en las coordenadas"
}

### 3) POST /api/pilares/actualizar-posicion
**Request:**
```json
{
  "Id": 3,
  "posx": -480,
  "posy": -210,
  "status": "Herido"
}

```
**Response 201:**
```json
{
  "mensaje": "Posición actualizada exitosamente",
  "pilar": {
    "name": "mitsuri kanroji",
    "posx": -480.0,
    "posy": -210.0,
    "status": "Herido",
    "id": 3
  }
}`

### 4) POST /api/mensajes
**Request:**
```json
{
  "pilarId": 3,
  "fragmentedContent": "Muz... mov... norte... ata..."
}
```
**Response 201:**
```json
{
  "messageId": 14,
  "pilarId": 3,
  "fragmentedContent": "Muz... mov... norte... ata...",
  "reconstructedContent": null,
  "timestamp": "2025-11-23T21:15:43"
}
```

### 5) PUT /api/mensajes/{id}/reconstruir
**Request:**
```json
{
  "ReconstructedContent": "Muzan se mueve hacia el norte. Preparar ataque."
}
```
**Response 200:**
```json
{
  "messageId": 14,
  "pilarId": 3,
  "fragmentedContent": "Muz... mov... norte... ata...",
  "reconstructedContent": "Muzan se mueve hacia el norte. Preparar ataque.",
  "timestamp": "2025-11-23T21:15:43"
}
```

## Codigos de Respuesta
- 200 OK: Operacion exitosa
- 201 Created: Recurso creado
- 400 Bad Request: Datos invalidos
- 404 Not Found: Recurso no encontrado

## 🏗 Arquitectura
- **domain**: Modelos y puertos.
- **application**: Casos de uso.
- **infrastructure**: Controladores, repositorios JPA, entidades.
