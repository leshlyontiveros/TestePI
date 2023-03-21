package digitalMoneyHouse.pages;

import digitalMoneyHouse.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    protected static final String btnIniciarSessao = "//*[@id=\"root\"]/header/nav/a[2]"; //xpath
    protected static final String inputnome = "nome"; //id
    protected static final String inputSobrenome = "sobrenome"; //id
    protected static final String inputCpf = "cpf"; //id
    protected static final String inputEmail = "email"; //id
    protected static final String inputPassword = "password"; //id
    protected static final String inputConfirmaPassword = "confirmapassword"; //id
    protected static final String inputTelefone= "telefone"; //id
    protected static final String btnEntrar = "#root > main > div > form > button"; //cssSelector
    protected static final String txtNome = "txt-nombre"; //className

    public void irParaIniciarSessao() throws InterruptedException {
        WebElement botaoIniciarSessao = getWebElement(By.xpath(btnIniciarSessao));
        Thread.sleep(2000);
        botaoIniciarSessao.click();
        Thread.sleep(1000);
    }

    public void inserirDadosLogin(String nome, String sobrenome, String cpf, String email, String password,
                                  String confirmapassword, String telefone ) {
        WebElement campoNome = getWebElement(By.id(inputnome));
        campoNome.clear();
        campoNome.sendKeys(nome);

        WebElement campoSobrenome = getWebElement(By.id(inputSobrenome));
        campoSobrenome.clear();
        campoNome.sendKeys(sobrenome);

        WebElement campoCpf = getWebElement(By.id(inputCpf));
        campoCpf.clear();
        campoCpf.sendKeys(cpf);

        WebElement campoEmail = getWebElement(By.id(inputEmail));
        campoEmail.clear();
        campoEmail.sendKeys(email);

        WebElement campoPassword = getWebElement(By.id(inputPassword));
        campoPassword.clear();
        campoPassword.sendKeys(password);

        WebElement campoConfirmaPassword = getWebElement(By.id(inputConfirmaPassword));
        campoConfirmaPassword.clear();
        campoConfirmaPassword.sendKeys(confirmapassword);

        WebElement campoTelefone = getWebElement(By.id(inputTelefone));
        campoConfirmaPassword.clear();
        campoTelefone.sendKeys(telefone);
    }

    public void fazerLogin() {
        WebElement entrar = getWebElement(By.cssSelector(btnEntrar));
        entrar.click();
    }

    public String getUsuario() {
        WebElement entrar = getWebElement(By.className(txtNome));
        return entrar.getText();
    }
}
