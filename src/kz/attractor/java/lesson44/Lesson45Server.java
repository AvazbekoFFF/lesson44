package kz.attractor.java.lesson44;
import com.sun.net.httpserver.HttpExchange;
import kz.attractor.java.server.ContentType;
import kz.attractor.java.utils.Utils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

public class Lesson45Server extends Lesson44Server {

    public Lesson45Server(String host, int port) throws IOException {
        super(host, port);
        registerGet("/login", this::loginGet);
        registerPost("/login", this::loginPost);
        registerGet("/unsuccessfulLogged", this::unsuccessfulLogged);
        registerGet("/profile", this::profile);

        registerGet("/unsuccessfulRegister", this::unsuccessfulGet);
        registerGet("/successfulRegister", this::successfulGet);
        registerGet("/register", this::registerGet);
        registerPost("/register", this::registerPost); // вот тут указваю путь в register он в браузере указывает login
    }

    private void registerPost(HttpExchange exchange) {
        String cType = getContentType(exchange);
        String raw = getBody(exchange);
        Map<String, String> parsed = Utils.parseUrlEncoded(raw, "&");
        if (UserSimulation.makeUser(parsed)){
            redirect303(exchange, "/successfulRegister");
        } else{
            redirect303(exchange, "/unsuccessfulRegister");
        }
    }

    private void loginPost(HttpExchange exchange) {
        String cType = getContentType(exchange);
        String raw = getBody(exchange);
        Map<String, String> parsed = Utils.parseUrlEncoded(raw, "&");
        if (UserSimulation.Authorization(parsed)) {
            redirect303(exchange, "/profile");
        } else {
            redirect303(exchange, "/unsuccessfulLogged");
        }
    }

    private void registerGet(HttpExchange exchange) {
        Path path = makeFilePath("register.html");
        sendFile(exchange, path, ContentType.TEXT_HTML);
    }

    private void unsuccessfulGet(HttpExchange exchange) {
        Path path = makeFilePath("unsuccessfulRegister.html");
        sendFile(exchange, path, ContentType.TEXT_HTML);
    }

    private void successfulGet(HttpExchange exchange) {
        Path path = makeFilePath("successfulRegister.ftlh");
        sendFile(exchange, path, ContentType.TEXT_HTML);
    }


    private void loginGet(HttpExchange exchange) {
        Path path = makeFilePath("login.html");
        sendFile(exchange, path, ContentType.TEXT_HTML);
    }
    private void profile(HttpExchange exchange){
        Path path = makeFilePath("profile.ftlh");
        sendFile(exchange, path, ContentType.TEXT_HTML);
    }

    private void unsuccessfulLogged(HttpExchange exchange) {
        Path path = makeFilePath("unsuccessfulLogged.html");
        sendFile(exchange, path, ContentType.TEXT_HTML);
    }
}
