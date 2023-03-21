import digitalMoneyHouse.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

//@Tag("Smoke Test")
public class LoginTest {

    private static LoginPage page;

    @BeforeEach
    public void setUp() {

        page = new LoginPage();
        page.openApp();

    }

    @Test
    @Tag("SmokeTest")
    public void testeLogin() throws InterruptedException {

        page.irParaIniciarSessao();
        Thread.sleep(2000);
        page.inserirDadosLogin("Leshly", "Ontiveros", "60189809086", "less.onti@gmail.com", "Hola123!", "Hola123!","555198193571");
        Thread.sleep(2000);
        page.fazerLogin();
        Thread.sleep(2000);
        String usuarioLogado = page.getUsuario();

        assertTrue(usuarioLogado.contains("Leshly"));

        System.out.println("Usuario logado:" + usuarioLogado);

    }

    @AfterEach
    public void tearDown(){
        page.quitDriver();
    }
}
